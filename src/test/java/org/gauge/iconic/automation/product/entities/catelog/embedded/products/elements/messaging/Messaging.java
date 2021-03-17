
package org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.messaging;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements.messaging.elements.Marketing;

public class Messaging {

    @SerializedName("marketing")
    @Expose
    private List<Marketing> marketing = null;
    @SerializedName("operational")
    @Expose
    private List<Object> operational = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Messaging() {
    }

    /**
     * 
     * @param marketing
     * @param operational
     */
    public Messaging(List<Marketing> marketing, List<Object> operational) {
        super();
        this.marketing = marketing;
        this.operational = operational;
    }

    public List<Marketing> getMarketing() {
        return marketing;
    }

    public void setMarketing(List<Marketing> marketing) {
        this.marketing = marketing;
    }

    public List<Object> getOperational() {
        return operational;
    }

    public void setOperational(List<Object> operational) {
        this.operational = operational;
    }

}
