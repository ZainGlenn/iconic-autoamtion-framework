
package org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Variants {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("visible")
    @Expose
    private Boolean visible;
    @SerializedName("message")
    @Expose
    private Object message;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Variants() {
    }

    /**
     * 
     * @param visible
     * @param count
     * @param label
     * @param message
     */
    public Variants(Integer count, String label, Boolean visible, Object message) {
        super();
        this.count = count;
        this.label = label;
        this.visible = visible;
        this.message = message;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }

}
