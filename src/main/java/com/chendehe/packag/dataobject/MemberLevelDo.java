package com.uniprocessing.pointmanage.domain.dataobject;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * (member_level#)
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@EqualsAndHashCode
@ToString
@ApiModel
public class MemberLevelDo implements Serializable {

    private static final long serialVersionUID = 1L;

   /**  (Not Null) */
    @ApiModelProperty(" (Not Null)")
   private String id;
   /** 商店id */
    @ApiModelProperty("商店id")
   private String shopId;
   /** 积分上限 */
    @ApiModelProperty("积分上限")
   private Integer integralUp;
   /** 积分下限 */
    @ApiModelProperty("积分下限")
   private Integer integralFloor;
   /** 积分等级 */
    @ApiModelProperty("积分等级")
   private Integer integralLevel;
   /** 等级名称 */
    @ApiModelProperty("等级名称")
   private String levelName;
   /** 创建时间 (Not Null) */
    @ApiModelProperty("创建时间 (Not Null)")
   private Date createAt;
   /** 更新时间 */
    @ApiModelProperty("更新时间")
   private Date updateAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }

    public Integer getIntegralUp() {
        return integralUp;
    }

    public void setIntegralUp(Integer integralUp) {
        this.integralUp = integralUp;
    }

    public Integer getIntegralFloor() {
        return integralFloor;
    }

    public void setIntegralFloor(Integer integralFloor) {
        this.integralFloor = integralFloor;
    }

    public Integer getIntegralLevel() {
        return integralLevel;
    }

    public void setIntegralLevel(Integer integralLevel) {
        this.integralLevel = integralLevel;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }


}