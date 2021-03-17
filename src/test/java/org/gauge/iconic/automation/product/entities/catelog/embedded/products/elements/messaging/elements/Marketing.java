
package org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.messaging.elements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Marketing {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("short")
    @Expose
    private String _short;
    @SerializedName("medium")
    @Expose
    private String medium;
    @SerializedName("long")
    @Expose
    private String _long;
    @SerializedName("color")
    @Expose
    private String color;
    @SerializedName("url")
    @Expose
    private String url;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Marketing() {
    }

    /**
     * 
     * @param color
     * @param _long
     * @param medium
     * @param type
     * @param _short
     * @param url
     */
    public Marketing(String type, String _short, String medium, String _long, String color, String url) {
        super();
        this.type = type;
        this._short = _short;
        this.medium = medium;
        this._long = _long;
        this.color = color;
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShort() {
        return _short;
    }

    public void setShort(String _short) {
        this._short = _short;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getLong() {
        return _long;
    }

    public void setLong(String _long) {
        this._long = _long;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
