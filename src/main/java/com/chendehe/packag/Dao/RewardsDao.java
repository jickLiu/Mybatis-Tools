package com.uniprocessing.pointmanage.dao;

import java.io.Serializable;
import java.util.List;

import com.uniprocessing.pointmanage.domain.dataobject.RewardsDo;
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
 * (rewards).
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@Mapper
public interface RewardsDao  {


    /**
     * 分页查询
     *
     * @param page 分页
     * @return 结果集
     */
    @Select("select * from rewards limit #{page.currentPage}, #{page.pageSize}")
    List<RewardsDo> listByPage(@Param("page") Page page);

    /**
     * 根据id查询
     *
     * @param id  id
     * @return po
     */
    @Select("select * from rewards where id = #{id}")
    Optional<RewardsDo> getById(Serializable id);

    /**
     * 单个插入
     *
     * @param po po
     */
    @Insert("insert into rewards(id, name, points, reward_type, reward_value, discounts_scope, mini_amount, product_id_shop, collect_id_shop, discount_code_prefix, member_level_id, enabled, shop_id) "
        + "values(#{id}, #{name}, #{points}, #{rewardType}, #{rewardValue}, #{discountsScope}, #{miniAmount}, #{productIdShop}, #{collectIdShop}, #{discountCodePrefix}, #{memberLevelId}, #{enabled}, #{shopId})")
    void save(RewardsDo po);

    /**
     * 批量插入
     *
     * @param list po列表
     */
    @Insert("<script>insert into rewards(id, name, points, reward_type, reward_value, discounts_scope, mini_amount, product_id_shop, collect_id_shop, discount_code_prefix, member_level_id, enabled, shop_id) values "
        + "<foreach collection='list' index='index' item='n' separator=','> "
        + "(#{n.id}, #{n.name}, #{n.points}, #{n.rewardType}, #{n.rewardValue}, #{n.discountsScope}, #{n.miniAmount}, #{n.productIdShop}, #{n.collectIdShop}, #{n.discountCodePrefix}, #{n.memberLevelId}, #{n.enabled}, #{n.shopId})"
        + "</foreach></script>")
    void saveBatch(@Param("list") List<RewardsDo> list);

    /**
     * 更新
     *
     * @param po po
     */
    @Update("update rewards set id = #{id}, name = #{name}, points = #{points}, reward_type = #{rewardType}, reward_value = #{rewardValue}, discounts_scope = #{discountsScope}, mini_amount = #{miniAmount}, product_id_shop = #{productIdShop}, collect_id_shop = #{collectIdShop}, discount_code_prefix = #{discountCodePrefix}, member_level_id = #{memberLevelId}, enabled = #{enabled}, shop_id = #{shopId} where id = #{id}")
    void update(RewardsDo po);

    /**
     * 单个删除
     *
     * @param id id
     */
    @Delete("delete from rewards where id = #{id}")
    void remove(Serializable id);

    /**
     * 批量删除
     *
     * @param ids id 集合
     */
    @Delete("<script>delete from rewards where id in "
        + "<foreach collection='ids' index='index' item='id' open='(' separator=',' close=')'>"
        + "#{id}"
        + "</foreach></script>")
    void removeByIds(@Param("ids") Set<Serializable> ids);

    /**
     * 统计
     *
     * @return 数量
     */
    @Select("select count(*) from rewards")
    int count();
}