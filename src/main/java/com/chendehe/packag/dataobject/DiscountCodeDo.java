package com.uniprocessing.pointmanage.domain.dataobject;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * (discount_code#)
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@EqualsAndHashCode
@ToString
@ApiModel
public class DiscountCodeDo implements Serializable {

    private static final long serialVersionUID = 1L;

   /**  (Not Null) */
    @ApiModelProperty(" (Not Null)")
   private String id;
   /** 折扣编码 */
    @ApiModelProperty("折扣编码")
   private String code;
   /** 折扣码id（平台提供） */
    @ApiModelProperty("折扣码id（平台提供）")
   private String discountCodeIdShop;
   /** 价格规则id（平台提供） */
    @ApiModelProperty("价格规则id（平台提供）")
   private String priceRuleIdShop;
   /** 折扣金额（%，金额，免费） */
    @ApiModelProperty("折扣金额（%，金额，免费）")
   private String discountAmount;
   /** 已使用次数 */
    @ApiModelProperty("已使用次数")
   private Integer usageCount;
   /** 创建时间 */
    @ApiModelProperty("创建时间")
   private Date createdAt;
   /** 更新时间 */
    @ApiModelProperty("更新时间")
   private Date updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getDiscountCodeIdShop() {
        return discountCodeIdShop;
    }

    public void setDiscountCodeIdShop(String discountCodeIdShop) {
        this.discountCodeIdShop = discountCodeIdShop == null ? null : discountCodeIdShop.trim();
    }

    public String getPriceRuleIdShop() {
        return priceRuleIdShop;
    }

    public void setPriceRuleIdShop(String priceRuleIdShop) {
        this.priceRuleIdShop = priceRuleIdShop == null ? null : priceRuleIdShop.trim();
    }

    public String getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        this.discountAmount = discountAmount == null ? null : discountAmount.trim();
    }

    public Integer getUsageCount() {
        return usageCount;
    }

    public void setUsageCount(Integer usageCount) {
        this.usageCount = usageCount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }


}