
package org.gauge.iconic.automation.product.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.gauge.iconic.automation.product.entities.catelog.embedded.Embedded;
import org.gauge.iconic.automation.product.entities.catelog.links.Links;

public class CatalogSchema {

    @SerializedName("_links")
    @Expose
    private Links links;
    @SerializedName("_embedded")
    @Expose
    private Embedded embedded;
    @SerializedName("page_count")
    @Expose
    private Integer pageCount;
    @SerializedName("page_size")
    @Expose
    private Integer pageSize;
    @SerializedName("total_items")
    @Expose
    private Integer totalItems;
    @SerializedName("page")
    @Expose
    private Integer page;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CatalogSchema() {
    }

    /**
     * 
     * @param pageCount
     * @param totalItems
     * @param pageSize
     * @param links
     * @param page
     * @param embedded
     */
    public CatalogSchema(Links links, Embedded embedded, Integer pageCount, Integer pageSize, Integer totalItems, Integer page) {
        super();
        this.links = links;
        this.embedded = embedded;
        this.pageCount = pageCount;
        this.pageSize = pageSize;
        this.totalItems = totalItems;
        this.page = page;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Embedded getEmbedded() {
        return embedded;
    }

    public void setEmbedded(Embedded embedded) {
        this.embedded = embedded;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

}
