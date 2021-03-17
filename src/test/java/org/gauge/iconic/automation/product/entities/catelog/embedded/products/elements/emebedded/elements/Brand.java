
package org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.emebedded.elements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.gauge.iconic.automation.product.entities.catelog.links.Links;

public class Brand {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url_key")
    @Expose
    private String urlKey;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("banner_url")
    @Expose
    private Object bannerUrl;
    @SerializedName("_links")
    @Expose
    private Links links;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Brand() {
    }

    /**
     * 
     * @param imageUrl
     * @param name
     * @param bannerUrl
     * @param links
     * @param id
     * @param urlKey
     */
    public Brand(Integer id, String name, String urlKey, String imageUrl, Object bannerUrl, Links links) {
        super();
        this.id = id;
        this.name = name;
        this.urlKey = urlKey;
        this.imageUrl = imageUrl;
        this.bannerUrl = bannerUrl;
        this.links = links;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Object getBannerUrl() {
        return bannerUrl;
    }

    public void setBannerUrl(Object bannerUrl) {
        this.bannerUrl = bannerUrl;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
