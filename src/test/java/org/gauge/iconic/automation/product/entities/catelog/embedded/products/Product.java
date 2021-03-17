
package org.gauge.iconic.automation.product.entities.catelog.embedded.products;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.*;
import org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.emebedded.Embedded_;
import org.gauge.iconic.automation.product.entities.catelog.links.Links;
import org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.messaging.Messaging;

public class Product {

    @SerializedName("video_count")
    @Expose
    private Float videoCount;
    @SerializedName("price")
    @Expose
    private Float price;
    @SerializedName("markdown_price")
    @Expose
    private Float markdownPrice;
    @SerializedName("special_price")
    @Expose
    private Float specialPrice;
    @SerializedName("returnable")
    @Expose
    private Boolean returnable;
    @SerializedName("final_sale")
    @Expose
    private Boolean finalSale;
    @SerializedName("stock_update")
    @Expose
    private Object stockUpdate;
    @SerializedName("final_price")
    @Expose
    private Float finalPrice;
    @SerializedName("sku")
    @Expose
    private String sku;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("ribbon")
    @Expose
    private String ribbon;
    @SerializedName("messaging")
    @Expose
    private Messaging messaging;
    @SerializedName("color_name_brand")
    @Expose
    private String colorNameBrand;
    @SerializedName("short_description")
    @Expose
    private String shortDescription;
    @SerializedName("shipment_type")
    @Expose
    private String shipmentType;
    @SerializedName("color_name")
    @Expose
    private String colorName;
    @SerializedName("color_hex")
    @Expose
    private String colorHex;
    @SerializedName("cart_price_rules")
    @Expose
    private List<CartPriceRule> cartPriceRules = null;
    @SerializedName("attributes")
    @Expose
    private Object attributes;
    @SerializedName("simples")
    @Expose
    private Object simples;
    @SerializedName("sustainability")
    @Expose
    private Object sustainability;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("activated_at")
    @Expose
    private String activatedAt;
    @SerializedName("return_policy_message")
    @Expose
    private ReturnPolicyMessage returnPolicyMessage;
    @SerializedName("categories_translated")
    @Expose
    private String categoriesTranslated;
    @SerializedName("category_path")
    @Expose
    private Object categoryPath;
    @SerializedName("category_ids")
    @Expose
    private Object categoryIds;
    @SerializedName("related_products")
    @Expose
    private Object relatedProducts;
    @SerializedName("image_products")
    @Expose
    private Object imageProducts;
    @SerializedName("attribute_set_identifier")
    @Expose
    private String attributeSetIdentifier;
    @SerializedName("supplier")
    @Expose
    private String supplier;
    @SerializedName("wannaby_id")
    @Expose
    private Object wannabyId;
    @SerializedName("citrus_ad_id")
    @Expose
    private Object citrusAdId;
    @SerializedName("associated_skus")
    @Expose
    private String associatedSkus;
    @SerializedName("size_guide_url")
    @Expose
    private String sizeGuideUrl;
    @SerializedName("related")
    @Expose
    private Related related;
    @SerializedName("variants")
    @Expose
    private Variants variants;
    @SerializedName("campaign_details")
    @Expose
    private Object campaignDetails;
    @SerializedName("_embedded")
    @Expose
    private Embedded_ embedded;
    @SerializedName("_links")
    @Expose
    private Links links;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Product() {
    }

    public Float getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(Float videoCount) {
        this.videoCount = videoCount;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getMarkdownPrice() {
        return markdownPrice;
    }

    public void setMarkdownPrice(Float markdownPrice) {
        this.markdownPrice = markdownPrice;
    }

    public Float getSpecialPrice() {
        return specialPrice;
    }

    public void setSpecialPrice(Float specialPrice) {
        this.specialPrice = specialPrice;
    }

    public Boolean getReturnable() {
        return returnable;
    }

    public void setReturnable(Boolean returnable) {
        this.returnable = returnable;
    }

    public Boolean getFinalSale() {
        return finalSale;
    }

    public void setFinalSale(Boolean finalSale) {
        this.finalSale = finalSale;
    }

    public Object getStockUpdate() {
        return stockUpdate;
    }

    public void setStockUpdate(Object stockUpdate) {
        this.stockUpdate = stockUpdate;
    }

    public Float getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Float finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }

    public Messaging getMessaging() {
        return messaging;
    }

    public void setMessaging(Messaging messaging) {
        this.messaging = messaging;
    }

    public String getColorNameBrand() {
        return colorNameBrand;
    }

    public void setColorNameBrand(String colorNameBrand) {
        this.colorNameBrand = colorNameBrand;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getShipmentType() {
        return shipmentType;
    }

    public void setShipmentType(String shipmentType) {
        this.shipmentType = shipmentType;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }

    public List<CartPriceRule> getCartPriceRules() {
        return cartPriceRules;
    }

    public void setCartPriceRules(List<CartPriceRule> cartPriceRules) {
        this.cartPriceRules = cartPriceRules;
    }

    public Object getAttributes() {
        return attributes;
    }

    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public Object getSimples() {
        return simples;
    }

    public void setSimples(Object simples) {
        this.simples = simples;
    }

    public Object getSustainability() {
        return sustainability;
    }

    public void setSustainability(Object sustainability) {
        this.sustainability = sustainability;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getActivatedAt() {
        return activatedAt;
    }

    public void setActivatedAt(String activatedAt) {
        this.activatedAt = activatedAt;
    }

    public ReturnPolicyMessage getReturnPolicyMessage() {
        return returnPolicyMessage;
    }

    public void setReturnPolicyMessage(ReturnPolicyMessage returnPolicyMessage) {
        this.returnPolicyMessage = returnPolicyMessage;
    }

    public String getCategoriesTranslated() {
        return categoriesTranslated;
    }

    public void setCategoriesTranslated(String categoriesTranslated) {
        this.categoriesTranslated = categoriesTranslated;
    }

    public Object getCategoryPath() {
        return categoryPath;
    }

    public void setCategoryPath(Object categoryPath) {
        this.categoryPath = categoryPath;
    }

    public Object getCategoryIds() {
        return categoryIds;
    }

    public void setCategoryIds(Object categoryIds) {
        this.categoryIds = categoryIds;
    }

    public Object getRelatedProducts() {
        return relatedProducts;
    }

    public void setRelatedProducts(Object relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    public Object getImageProducts() {
        return imageProducts;
    }

    public void setImageProducts(Object imageProducts) {
        this.imageProducts = imageProducts;
    }

    public String getAttributeSetIdentifier() {
        return attributeSetIdentifier;
    }

    public void setAttributeSetIdentifier(String attributeSetIdentifier) {
        this.attributeSetIdentifier = attributeSetIdentifier;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Object getWannabyId() {
        return wannabyId;
    }

    public void setWannabyId(Object wannabyId) {
        this.wannabyId = wannabyId;
    }

    public Object getCitrusAdId() {
        return citrusAdId;
    }

    public void setCitrusAdId(Object citrusAdId) {
        this.citrusAdId = citrusAdId;
    }

    public String getAssociatedSkus() {
        return associatedSkus;
    }

    public void setAssociatedSkus(String associatedSkus) {
        this.associatedSkus = associatedSkus;
    }

    public String getSizeGuideUrl() {
        return sizeGuideUrl;
    }

    public void setSizeGuideUrl(String sizeGuideUrl) {
        this.sizeGuideUrl = sizeGuideUrl;
    }

    public Related getRelated() {
        return related;
    }

    public void setRelated(Related related) {
        this.related = related;
    }

    public Variants getVariants() {
        return variants;
    }

    public void setVariants(Variants variants) {
        this.variants = variants;
    }

    public Object getCampaignDetails() {
        return campaignDetails;
    }

    public void setCampaignDetails(Object campaignDetails) {
        this.campaignDetails = campaignDetails;
    }

    public Embedded_ getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded_ embedded) {
        this.embedded = embedded;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
