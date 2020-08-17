package com.uniprocessing.pointmanage.dao;

import java.io.Serializable;
import java.util.List;

import com.uniprocessing.pointmanage.domain.dataobject.MemberLevelDo;
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
 * (member_level).
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@Mapper
public interface MemberLevelDao  {


    /**
     * 分页查询
     *
     * @param page 分页
     * @return 结果集
     */
    @Select("select * from member_level limit #{page.currentPage}, #{page.pageSize}")
    List<MemberLevelDo> listByPage(@Param("page") Page page);

    /**
     * 根据id查询
     *
     * @param id  id
     * @return po
     */
    @Select("select * from member_level where id = #{id}")
    Optional<MemberLevelDo> getById(Serializable id);

    /**
     * 单个插入
     *
     * @param po po
     */
    @Insert("insert into member_level(id, shop_id, integral_up, integral_floor, integral_level, level_name, create_at, update_at) "
        + "values(#{id}, #{shopId}, #{integralUp}, #{integralFloor}, #{integralLevel}, #{levelName}, #{createAt}, #{updateAt})")
    void save(MemberLevelDo po);

    /**
     * 批量插入
     *
     * @param list po列表
     */
    @Insert("<script>insert into member_level(id, shop_id, integral_up, integral_floor, integral_level, level_name, create_at, update_at) values "
        + "<foreach collection='list' index='index' item='n' separator=','> "
        + "(#{n.id}, #{n.shopId}, #{n.integralUp}, #{n.integralFloor}, #{n.integralLevel}, #{n.levelName}, #{n.createAt}, #{n.updateAt})"
        + "</foreach></script>")
    void saveBatch(@Param("list") List<MemberLevelDo> list);

    /**
     * 更新
     *
     * @param po po
     */
    @Update("update member_level set id = #{id}, shop_id = #{shopId}, integral_up = #{integralUp}, integral_floor = #{integralFloor}, integral_level = #{integralLevel}, level_name = #{levelName}, create_at = #{createAt}, update_at = #{updateAt} where id = #{id}")
    void update(MemberLevelDo po);

    /**
     * 单个删除
     *
     * @param id id
     */
    @Delete("delete from member_level where id = #{id}")
    void remove(Serializable id);

    /**
     * 批量删除
     *
     * @param ids id 集合
     */
    @Delete("<script>delete from member_level where id in "
        + "<foreach collection='ids' index='index' item='id' open='(' separator=',' close=')'>"
        + "#{id}"
        + "</foreach></script>")
    void removeByIds(@Param("ids") Set<Serializable> ids);

    /**
     * 统计
     *
     * @return 数量
     */
    @Select("select count(*) from member_level")
    int count();
}