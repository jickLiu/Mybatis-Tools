package com.uniprocessing.pointmanage.domain.dataobject;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * (product#)
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@EqualsAndHashCode
@ToString
@ApiModel
public class ProductDo implements Serializable {

    private static final long serialVersionUID = 1L;

   /**  (Not Null) */
    @ApiModelProperty(" (Not Null)")
   private String id;
   /** 商品编号(平台提供) */
    @ApiModelProperty("商品编号(平台提供)")
   private String productIdShop;
   /** 商品名称 */
    @ApiModelProperty("商品名称")
   private String productName;
   /** 商家id */
    @ApiModelProperty("商家id")
   private String shopId;
   /** 创建时间 */
    @ApiModelProperty("创建时间")
   private Date createAt;
   /** 更新时间 */
    @ApiModelProperty("更新时间")
   private Date updateAt;
   /** 商品来源 */
    @ApiModelProperty("商品来源")
   private String productResources;
   /** 商品品牌 */
    @ApiModelProperty("商品品牌")
   private String vendor;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductIdShop() {
        return productIdShop;
    }

    public void setProductIdShop(String productIdShop) {
        this.productIdShop = productIdShop == null ? null : productIdShop.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId == null ? null : shopId.trim();
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

    public String getProductResources() {
        return productResources;
    }

    public void setProductResources(String productResources) {
        this.productResources = productResources == null ? null : productResources.trim();
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor == null ? null : vendor.trim();
    }


}