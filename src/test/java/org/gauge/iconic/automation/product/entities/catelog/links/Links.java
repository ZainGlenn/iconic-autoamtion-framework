
package org.gauge.iconic.automation.product.entities.catelog.links;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Links {

    @SerializedName("self")
    @Expose
    private LinkType self;
    @SerializedName("first")
    @Expose
    private LinkType first;
    @SerializedName("last")
    @Expose
    private LinkType last;
    @SerializedName("next")
    @Expose
    private LinkType next;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links() {
    }

    public LinkType getSelf() {
        return self;
    }

    public void setSelf(LinkType self) {
        this.self = self;
    }

    public LinkType getFirst() {
        return first;
    }

    public void setFirst(LinkType first) {
        this.first = first;
    }

    public LinkType getLast() {
        return last;
    }

    public void setLast(LinkType last) {
        this.last = last;
    }

    public LinkType getNext() {
        return next;
    }

    public void setNext(LinkType next) {
        this.next = next;
    }

}
