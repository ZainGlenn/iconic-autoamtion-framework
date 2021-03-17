
package org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.emebedded.elements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.gauge.iconic.automation.product.entities.catelog.links.Links;

public class Shop {

    @SerializedName("is_default")
    @Expose
    private Boolean isDefault;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("_links")
    @Expose
    private Links links;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Shop() {
    }

    /**
     * 
     * @param isDefault
     * @param name
     * @param links
     */
    public Shop(Boolean isDefault, String name, Links links) {
        super();
        this.isDefault = isDefault;
        this.name = name;
        this.links = links;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
