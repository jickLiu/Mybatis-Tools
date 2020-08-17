package com.uniprocessing.pointmanage.dao;

import java.io.Serializable;
import java.util.List;

import com.uniprocessing.pointmanage.domain.dataobject.CustomerDo;
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
 * (customer).
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@Mapper
public interface CustomerDao  {


    /**
     * 分页查询
     *
     * @param page 分页
     * @return 结果集
     */
    @Select("select * from customer limit #{page.currentPage}, #{page.pageSize}")
    List<CustomerDo> listByPage(@Param("page") Page page);

    /**
     * 根据id查询
     *
     * @param id  id
     * @return po
     */
    @Select("select * from customer where id = #{id}")
    Optional<CustomerDo> getById(Serializable id);

    /**
     * 单个插入
     *
     * @param po po
     */
    @Insert("insert into customer(id, shop_id, accepts_marketing, accepts_marketing_updated_at, currency, created_at, email, first_name, customer_id_shop, last_name, orders_count, total_spent, updated_at, intergral, member_level_id) "
        + "values(#{id}, #{shopId}, #{acceptsMarketing}, #{acceptsMarketingUpdatedAt}, #{currency}, #{createdAt}, #{email}, #{firstName}, #{customerIdShop}, #{lastName}, #{ordersCount}, #{totalSpent}, #{updatedAt}, #{intergral}, #{memberLevelId})")
    void save(CustomerDo po);

    /**
     * 批量插入
     *
     * @param list po列表
     */
    @Insert("<script>insert into customer(id, shop_id, accepts_marketing, accepts_marketing_updated_at, currency, created_at, email, first_name, customer_id_shop, last_name, orders_count, total_spent, updated_at, intergral, member_level_id) values "
        + "<foreach collection='list' index='index' item='n' separator=','> "
        + "(#{n.id}, #{n.shopId}, #{n.acceptsMarketing}, #{n.acceptsMarketingUpdatedAt}, #{n.currency}, #{n.createdAt}, #{n.email}, #{n.firstName}, #{n.customerIdShop}, #{n.lastName}, #{n.ordersCount}, #{n.totalSpent}, #{n.updatedAt}, #{n.intergral}, #{n.memberLevelId})"
        + "</foreach></script>")
    void saveBatch(@Param("list") List<CustomerDo> list);

    /**
     * 更新
     *
     * @param po po
     */
    @Update("update customer set id = #{id}, shop_id = #{shopId}, accepts_marketing = #{acceptsMarketing}, accepts_marketing_updated_at = #{acceptsMarketingUpdatedAt}, currency = #{currency}, created_at = #{createdAt}, email = #{email}, first_name = #{firstName}, customer_id_shop = #{customerIdShop}, last_name = #{lastName}, orders_count = #{ordersCount}, total_spent = #{totalSpent}, updated_at = #{updatedAt}, intergral = #{intergral}, member_level_id = #{memberLevelId} where id = #{id}")
    void update(CustomerDo po);

    /**
     * 单个删除
     *
     * @param id id
     */
    @Delete("delete from customer where id = #{id}")
    void remove(Serializable id);

    /**
     * 批量删除
     *
     * @param ids id 集合
     */
    @Delete("<script>delete from customer where id in "
        + "<foreach collection='ids' index='index' item='id' open='(' separator=',' close=')'>"
        + "#{id}"
        + "</foreach></script>")
    void removeByIds(@Param("ids") Set<Serializable> ids);

    /**
     * 统计
     *
     * @return 数量
     */
    @Select("select count(*) from customer")
    int count();
}