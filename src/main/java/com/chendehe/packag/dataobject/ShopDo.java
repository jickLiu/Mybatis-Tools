package com.uniprocessing.pointmanage.domain.dataobject;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.ToString;


/**
 * (shop#)
 *
 * @author DELL
 * @since 2020/08/17 17:04:31
 */
@EqualsAndHashCode
@ToString
@ApiModel
public class ShopDo implements Serializable {

    private static final long serialVersionUID = 1L;

   /**  (Not Null) */
    @ApiModelProperty(" (Not Null)")
   private String id;
   /** 店铺名称 */
    @ApiModelProperty("店铺名称")
   private String name;
   /** 邮箱 */
    @ApiModelProperty("邮箱")
   private String email;
   /** 店铺域名 */
    @ApiModelProperty("店铺域名")
   private String domain;
   /** 州（省） */
    @ApiModelProperty("州（省）")
   private String province;
   /** 国家（缩写） */
    @ApiModelProperty("国家（缩写）")
   private String country;
   /** 街道地址 */
    @ApiModelProperty("街道地址")
   private String address1;
   /** 备用街道地址 */
    @ApiModelProperty("备用街道地址")
   private String address2;
   /** 城市 */
    @ApiModelProperty("城市")
   private String city;
   /** 联系方式 */
    @ApiModelProperty("联系方式")
   private String phone;
   /** shopify域名 */
    @ApiModelProperty("shopify域名")
   private String myshopifyDomain;
   /** 邮编 */
    @ApiModelProperty("邮编")
   private String zip;
   /** 店铺创建时间 */
    @ApiModelProperty("店铺创建时间")
   private Date createdAt;
   /** 店铺修改时间 */
    @ApiModelProperty("店铺修改时间")
   private Date updatedAt;
   /** 店铺id */
    @ApiModelProperty("店铺id")
   private String shopIdShopify;
   /** 店铺来源 */
    @ApiModelProperty("店铺来源")
   private String shopResource;
   /** 时区 */
    @ApiModelProperty("时区")
   private String timezone;
   /** 令牌 */
    @ApiModelProperty("令牌")
   private String accessToken;
   /** 客户使用app版本 */
    @ApiModelProperty("客户使用app版本")
   private String appVersion;
   /** 客户是否已卸载本应用 */
    @ApiModelProperty("客户是否已卸载本应用")
   private boolean uninstalled;
   /** 商店所使用货币 */
    @ApiModelProperty("商店所使用货币")
   private String currency;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1 == null ? null : address1.trim();
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2 == null ? null : address2.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMyshopifyDomain() {
        return myshopifyDomain;
    }

    public void setMyshopifyDomain(String myshopifyDomain) {
        this.myshopifyDomain = myshopifyDomain == null ? null : myshopifyDomain.trim();
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
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

    public String getShopIdShopify() {
        return shopIdShopify;
    }

    public void setShopIdShopify(String shopIdShopify) {
        this.shopIdShopify = shopIdShopify == null ? null : shopIdShopify.trim();
    }

    public String getShopResource() {
        return shopResource;
    }

    public void setShopResource(String shopResource) {
        this.shopResource = shopResource == null ? null : shopResource.trim();
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone == null ? null : timezone.trim();
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion == null ? null : appVersion.trim();
    }

    public boolean isUninstalled() {
        return uninstalled;
    }

    public void setUninstalled(boolean uninstalled) {
        this.uninstalled = uninstalled;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }


}