
package org.gauge.iconic.automation.product.entities.catelog.embedded;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.gauge.iconic.automation.product.entities.catelog.embedded.products.Product;

public class Embedded {

    @SerializedName("product")
    @Expose
    private List<Product> product = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Embedded() {
    }

    /**
     * 
     * @param product
     */
    public Embedded(List<Product> product) {
        super();
        this.product = product;
    }

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
    }

}
