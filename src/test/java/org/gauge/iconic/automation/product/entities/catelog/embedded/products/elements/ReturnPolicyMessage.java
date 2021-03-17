
package org.gauge.iconic.automation.product.entities.catelog.embedded.products.elements;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ReturnPolicyMessage {

    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("bold_substring")
    @Expose
    private String boldSubstring;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReturnPolicyMessage() {
    }

    /**
     * 
     * @param boldSubstring
     * @param message
     */
    public ReturnPolicyMessage(String message, String boldSubstring) {
        super();
        this.message = message;
        this.boldSubstring = boldSubstring;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBoldSubstring() {
        return boldSubstring;
    }

    public void setBoldSubstring(String boldSubstring) {
        this.boldSubstring = boldSubstring;
    }

}
