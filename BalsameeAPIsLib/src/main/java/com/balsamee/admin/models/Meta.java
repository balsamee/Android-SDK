/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Meta 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -127456154528476690L;
    private int totalPages;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("total_pages")
    public int getTotalPages ( ) { 
        return this.totalPages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("total_pages")
    public void setTotalPages (int value) { 
        this.totalPages = value;
        notifyObservers(this.totalPages);
    }
 
}
