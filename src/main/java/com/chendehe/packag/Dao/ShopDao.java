package com.uniprocessing.pointmanage.dao;

import java.io.Serializable;
import java.util.List;

import com.uniprocessing.pointmanage.domain.dataobject.ShopDo;
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
 * (shop).
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@Mapper
public interface ShopDao  {


    /**
     * 分页查询
     *
     * @param page 分页
     * @return 结果集
     */
    @Select("select * from shop limit #{page.currentPage}, #{page.pageSize}")
    List<ShopDo> listByPage(@Param("page") Page page);

    /**
     * 根据id查询
     *
     * @param id  id
     * @return po
     */
    @Select("select * from shop where id = #{id}")
    Optional<ShopDo> getById(Serializable id);

    /**
     * 单个插入
     *
     * @param po po
     */
    @Insert("insert into shop(id, name, email, domain, province, country, address1, address2, city, phone, myshopify_domain, zip, created_at, updated_at, shop_id_shopify, shop_resource, timezone, access_token, app_version, uninstalled, currency) "
        + "values(#{id}, #{name}, #{email}, #{domain}, #{province}, #{country}, #{address1}, #{address2}, #{city}, #{phone}, #{myshopifyDomain}, #{zip}, #{createdAt}, #{updatedAt}, #{shopIdShopify}, #{shopResource}, #{timezone}, #{accessToken}, #{appVersion}, #{uninstalled}, #{currency})")
    void save(ShopDo po);

    /**
     * 批量插入
     *
     * @param list po列表
     */
    @Insert("<script>insert into shop(id, name, email, domain, province, country, address1, address2, city, phone, myshopify_domain, zip, created_at, updated_at, shop_id_shopify, shop_resource, timezone, access_token, app_version, uninstalled, currency) values "
        + "<foreach collection='list' index='index' item='n' separator=','> "
        + "(#{n.id}, #{n.name}, #{n.email}, #{n.domain}, #{n.province}, #{n.country}, #{n.address1}, #{n.address2}, #{n.city}, #{n.phone}, #{n.myshopifyDomain}, #{n.zip}, #{n.createdAt}, #{n.updatedAt}, #{n.shopIdShopify}, #{n.shopResource}, #{n.timezone}, #{n.accessToken}, #{n.appVersion}, #{n.uninstalled}, #{n.currency})"
        + "</foreach></script>")
    void saveBatch(@Param("list") List<ShopDo> list);

    /**
     * 更新
     *
     * @param po po
     */
    @Update("update shop set id = #{id}, name = #{name}, email = #{email}, domain = #{domain}, province = #{province}, country = #{country}, address1 = #{address1}, address2 = #{address2}, city = #{city}, phone = #{phone}, myshopify_domain = #{myshopifyDomain}, zip = #{zip}, created_at = #{createdAt}, updated_at = #{updatedAt}, shop_id_shopify = #{shopIdShopify}, shop_resource = #{shopResource}, timezone = #{timezone}, access_token = #{accessToken}, app_version = #{appVersion}, uninstalled = #{uninstalled}, currency = #{currency} where id = #{id}")
    void update(ShopDo po);

    /**
     * 单个删除
     *
     * @param id id
     */
    @Delete("delete from shop where id = #{id}")
    void remove(Serializable id);

    /**
     * 批量删除
     *
     * @param ids id 集合
     */
    @Delete("<script>delete from shop where id in "
        + "<foreach collection='ids' index='index' item='id' open='(' separator=',' close=')'>"
        + "#{id}"
        + "</foreach></script>")
    void removeByIds(@Param("ids") Set<Serializable> ids);

    /**
     * 统计
     *
     * @return 数量
     */
    @Select("select count(*) from shop")
    int count();
}