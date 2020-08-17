package com.uniprocessing.pointmanage.dao;

import java.io.Serializable;
import java.util.List;

import com.uniprocessing.pointmanage.domain.dataobject.ProductDo;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

/**
 * (product).
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@Mapper
public interface ProductDao  {


    /**
     * 分页查询
     *
     * @param page 分页
     * @return 结果集
     */
    @Select("select * from product limit #{page.currentPage}, #{page.pageSize}")
    List<ProductDo> listByPage(@Param("page") Page page);

    /**
     * 根据id查询
     *
     * @param id  id
     * @return po
     */
    @Select("select * from product where id = #{id}")
    Optional<ProductDo> getById(Serializable id);

    /**
     * 单个插入
     *
     * @param po po
     */
    @Insert("insert into product(id, product_id_shop, product_name, shop_id, create_at, update_at, product_resources, vendor) "
        + "values(#{id}, #{productIdShop}, #{productName}, #{shopId}, #{createAt}, #{updateAt}, #{productResources}, #{vendor})")
    void save(ProductDo po);

    /**
     * 批量插入
     *
     * @param list po列表
     */
    @Insert("<script>insert into product(id, product_id_shop, product_name, shop_id, create_at, update_at, product_resources, vendor) values "
        + "<foreach collection='list' index='index' item='n' separator=','> "
        + "(#{n.id}, #{n.productIdShop}, #{n.productName}, #{n.shopId}, #{n.createAt}, #{n.updateAt}, #{n.productResources}, #{n.vendor})"
        + "</foreach></script>")
    void saveBatch(@Param("list") List<ProductDo> list);

    /**
     * 更新
     *
     * @param po po
     */
    @Update("update product set id = #{id}, product_id_shop = #{productIdShop}, product_name = #{productName}, shop_id = #{shopId}, create_at = #{createAt}, update_at = #{updateAt}, product_resources = #{productResources}, vendor = #{vendor} where id = #{id}")
    void update(ProductDo po);

    /**
     * 单个删除
     *
     * @param id id
     */
    @Delete("delete from product where id = #{id}")
    void remove(Serializable id);

    /**
     * 批量删除
     *
     * @param ids id 集合
     */
    @Delete("<script>delete from product where id in "
        + "<foreach collection='ids' index='index' item='id' open='(' separator=',' close=')'>"
        + "#{id}"
        + "</foreach></script>")
    void removeByIds(@Param("ids") Set<Serializable> ids);

    /**
     * 统计
     *
     * @return 数量
     */
    @Select("select count(*) from product")
    int count();
}