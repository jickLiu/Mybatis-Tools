package com.uniprocessing.pointmanage.domain.dataobject;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * (customer#)
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@EqualsAndHashCode
@ToString
@ApiModel
public class CustomerDo implements Serializable {

    private static final long serialVersionUID = 1L;

   /**  (Not Null) */
    @ApiModelProperty(" (Not Null)")
   private String id;
   /** 所属商店 */
    @ApiModelProperty("所属商店")
   private String shopId;
   /** 客户是否已同意通过电子邮件接收营销材料 */
    @ApiModelProperty("客户是否已同意通过电子邮件接收营销材料")
   private boolean acceptsMarketing;
   /** 客户同意或反对通过电子邮件接收营销材料的日期和时间 */
    @ApiModelProperty("客户同意或反对通过电子邮件接收营销材料的日期和时间")
   private Date acceptsMarketingUpdatedAt;
   /** 客户使用的货币 */
    @ApiModelProperty("客户使用的货币")
   private String currency;
   /** 客户创建时间 */
    @ApiModelProperty("客户创建时间")
   private Date createdAt;
   /** 电子邮件 */
    @ApiModelProperty("电子邮件")
   private String email;
   /** 名字 */
    @ApiModelProperty("名字")
   private String firstName;
   /** shopify提供的客户id */
    @ApiModelProperty("shopify提供的客户id")
   private String customerIdShop;
   /** 姓 */
    @ApiModelProperty("姓")
   private String lastName;
   /** 订单数量 */
    @ApiModelProperty("订单数量")
   private Integer ordersCount;
   /** 客户支付总金额 */
    @ApiModelProperty("客户支付总金额")
   private BigDecimal totalSpent;
   /** 客户信息更新时间 */
    @ApiModelProperty("客户信息更新时间")
   private Date updatedAt;
   /** 积分 */
    @ApiModelProperty("积分")
   private Integer intergral;
   /** vip等级 */
    @ApiModelProperty("vip等级")
   private String memberLevelId;

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

    public boolean isAcceptsMarketing() {
        return acceptsMarketing;
    }

    public void setAcceptsMarketing(boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
    }

    public Date getAcceptsMarketingUpdatedAt() {
        return acceptsMarketingUpdatedAt;
    }

    public void setAcceptsMarketingUpdatedAt(Date acceptsMarketingUpdatedAt) {
        this.acceptsMarketingUpdatedAt = acceptsMarketingUpdatedAt;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public String getCustomerIdShop() {
        return customerIdShop;
    }

    public void setCustomerIdShop(String customerIdShop) {
        this.customerIdShop = customerIdShop == null ? null : customerIdShop.trim();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    public Integer getOrdersCount() {
        return ordersCount;
    }

    public void setOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
    }

    public BigDecimal getTotalSpent() {
        return totalSpent;
    }

    public void setTotalSpent(BigDecimal totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getIntergral() {
        return intergral;
    }

    public void setIntergral(Integer intergral) {
        this.intergral = intergral;
    }

    public String getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(String memberLevelId) {
        this.memberLevelId = memberLevelId == null ? null : memberLevelId.trim();
    }


}