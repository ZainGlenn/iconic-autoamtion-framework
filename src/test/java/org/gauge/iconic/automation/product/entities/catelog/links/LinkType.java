package org.gauge.iconic.automation.product.entities.catelog.links;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LinkType {
    @SerializedName("href")
    @Expose
    private String href;

    /**
     * No args constructor for use in serialization
     *
     */
    public LinkType() {
    }

    /**
     *
     * @param href
     */
    public LinkType(String href) {
        super();
        this.href = href;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }
}
