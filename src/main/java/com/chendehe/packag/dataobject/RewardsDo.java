package com.uniprocessing.pointmanage.domain.dataobject;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * (rewards#)
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@EqualsAndHashCode
@ToString
@ApiModel
public class RewardsDo implements Serializable {

    private static final long serialVersionUID = 1L;

   /**  (Not Null) */
    @ApiModelProperty(" (Not Null)")
   private String id;
   /** 奖励名称 */
    @ApiModelProperty("奖励名称")
   private String name;
   /** 兑换该奖励所需要的积分 */
    @ApiModelProperty("兑换该奖励所需要的积分")
   private Integer points;
   /** 优惠方式 */
    @ApiModelProperty("优惠方式")
   private String rewardType;
   /** 优惠金额（百分比和金额两种） */
    @ApiModelProperty("优惠金额（百分比和金额两种）")
   private BigDecimal rewardValue;
   /** 折扣范围类型 */
    @ApiModelProperty("折扣范围类型")
   private String discountsScope;
   /** 最小订单额度 */
    @ApiModelProperty("最小订单额度")
   private BigDecimal miniAmount;
   /** 商品id（shopify提供） */
    @ApiModelProperty("商品id（shopify提供）")
   private String productIdShop;
   /** 商品集合id（shopify提供） */
    @ApiModelProperty("商品集合id（shopify提供）")
   private String collectIdShop;
   /** 折扣码前缀 */
    @ApiModelProperty("折扣码前缀")
   private String discountCodePrefix;
   /** 会员等级 */
    @ApiModelProperty("会员等级")
   private String memberLevelId;
   /** 启用规则 */
    @ApiModelProperty("启用规则")
   private String enabled;
   /** 店铺id */
    @ApiModelProperty("店铺id")
   private String shopId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public String getRewardType() {
        return rewardType;
    }

    public void setRewardType(String rewardType) {
        this.rewardType = rewardType == null ? null : rewardType.trim();
    }

    public BigDecimal getRewardValue() {
        return rewardValue;
    }

    public void setRewardValue(BigDecimal rewardValue) {
        this.rewardValue = rewardValue;
    }

    public String getDiscountsScope() {
        return discountsScope;
    }

    public void setDiscountsScope(String discountsScope) {
        this.discountsScope = discountsScope == null ? null : discountsScope.trim();
    }

    public BigDecimal getMiniAmount() {
        return miniAmount;
    }

    public void setMiniAmount(BigDecimal miniAmount) {
        this.miniAmount = miniAmount;
    }

    public String getProductIdShop() {
        return productIdShop;
    }

    public void setProductIdShop(String productIdShop) {
        this.productIdShop = productIdShop == null ? null : productIdShop.trim();
    }

    public String getCollectIdShop() {
        return collectIdShop;
    }

    public void setCollectIdShop(String collectIdShop) {
        this.collectIdShop = collectIdShop == null ? null : collectIdShop.trim();
    }

    public String getDiscountCodePrefix() {
        return discountCodePrefix;
    }

    public void setDiscountCodePrefix(String discountCodePrefix) {
        this.discountCodePrefix = discountCodePrefix == null ? null : discountCodePrefix.trim();
    }

    public String getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(String memberLevelId) {
        this.memberLevelId = memberLevelId == null ? null : memberLevelId.trim();
    }

    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled == null ? null : enabled.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
    }


}