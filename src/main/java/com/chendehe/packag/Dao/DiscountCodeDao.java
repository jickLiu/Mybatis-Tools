package com.uniprocessing.pointmanage.dao;

import java.io.Serializable;
import java.util.List;

import com.uniprocessing.pointmanage.domain.dataobject.DiscountCodeDo;
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
 * (discount_code).
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@Mapper
public interface DiscountCodeDao  {


    /**
     * 分页查询
     *
     * @param page 分页
     * @return 结果集
     */
    @Select("select * from discount_code limit #{page.currentPage}, #{page.pageSize}")
    List<DiscountCodeDo> listByPage(@Param("page") Page page);

    /**
     * 根据id查询
     *
     * @param id  id
     * @return po
     */
    @Select("select * from discount_code where id = #{id}")
    Optional<DiscountCodeDo> getById(Serializable id);

    /**
     * 单个插入
     *
     * @param po po
     */
    @Insert("insert into discount_code(id, code, discount_code_id_shop, price_rule_id_shop, discount_amount, usage_count, created_at, updated_at) "
        + "values(#{id}, #{code}, #{discountCodeIdShop}, #{priceRuleIdShop}, #{discountAmount}, #{usageCount}, #{createdAt}, #{updatedAt})")
    void save(DiscountCodeDo po);

    /**
     * 批量插入
     *
     * @param list po列表
     */
    @Insert("<script>insert into discount_code(id, code, discount_code_id_shop, price_rule_id_shop, discount_amount, usage_count, created_at, updated_at) values "
        + "<foreach collection='list' index='index' item='n' separator=','> "
        + "(#{n.id}, #{n.code}, #{n.discountCodeIdShop}, #{n.priceRuleIdShop}, #{n.discountAmount}, #{n.usageCount}, #{n.createdAt}, #{n.updatedAt})"
        + "</foreach></script>")
    void saveBatch(@Param("list") List<DiscountCodeDo> list);

    /**
     * 更新
     *
     * @param po po
     */
    @Update("update discount_code set id = #{id}, code = #{code}, discount_code_id_shop = #{discountCodeIdShop}, price_rule_id_shop = #{priceRuleIdShop}, discount_amount = #{discountAmount}, usage_count = #{usageCount}, created_at = #{createdAt}, updated_at = #{updatedAt} where id = #{id}")
    void update(DiscountCodeDo po);

    /**
     * 单个删除
     *
     * @param id id
     */
    @Delete("delete from discount_code where id = #{id}")
    void remove(Serializable id);

    /**
     * 批量删除
     *
     * @param ids id 集合
     */
    @Delete("<script>delete from discount_code where id in "
        + "<foreach collection='ids' index='index' item='id' open='(' separator=',' close=')'>"
        + "#{id}"
        + "</foreach></script>")
    void removeByIds(@Param("ids") Set<Serializable> ids);

    /**
     * 统计
     *
     * @return 数量
     */
    @Select("select count(*) from discount_code")
    int count();
}