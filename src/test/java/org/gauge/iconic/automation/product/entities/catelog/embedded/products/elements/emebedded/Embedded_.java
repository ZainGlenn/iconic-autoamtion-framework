
package org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.emebedded;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.emebedded.elements.Brand;
import org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.emebedded.elements.Gender;
import org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.emebedded.elements.Image;
import org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.emebedded.elements.Shop;

public class Embedded_ {

    @SerializedName("brand")
    @Expose
    private Brand brand;
    @SerializedName("gender")
    @Expose
    private Gender gender;
    @SerializedName("shops")
    @Expose
    private List<Shop> shops = null;
    @SerializedName("images")
    @Expose
    private List<Image> images = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Embedded_() {
    }

    /**
     * 
     * @param images
     * @param gender
     * @param shops
     * @param brand
     */
    public Embedded_(Brand brand, Gender gender, List<Shop> shops, List<Image> images) {
        super();
        this.brand = brand;
        this.gender = gender;
        this.shops = shops;
        this.images = images;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Shop> getShops() {
        return shops;
    }

    public void setShops(List<Shop> shops) {
        this.shops = shops;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

}
