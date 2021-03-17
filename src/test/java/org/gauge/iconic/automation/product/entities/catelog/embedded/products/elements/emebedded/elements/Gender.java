
package org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.emebedded.elements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.gauge.iconic.automation.product.entities.catelog.links.Links;

public class Gender {

    @SerializedName("id")
    @Expose
    private Integer id;
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
    public Gender() {
    }

    /**
     * 
     * @param name
     * @param links
     * @param id
     */
    public Gender(Integer id, String name, Links links) {
        super();
        this.id = id;
        this.name = name;
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

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

}
