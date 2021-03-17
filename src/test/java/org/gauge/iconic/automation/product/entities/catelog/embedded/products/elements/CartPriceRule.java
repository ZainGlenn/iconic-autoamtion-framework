
package org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CartPriceRule {

    @SerializedName("url_key")
    @Expose
    private String urlKey;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("_locale")
    @Expose
    private String locale;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CartPriceRule() {
    }

    public String getUrlKey() {
        return urlKey;
    }

    public void setUrlKey(String urlKey) {
        this.urlKey = urlKey;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

}
