/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Allergy2 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -1019690838924679673L;
    private int id;
    private String allergen;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public int getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (int value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("allergen")
    public String getAllergen ( ) { 
        return this.allergen;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("allergen")
    public void setAllergen (String value) { 
        this.allergen = value;
        notifyObservers(this.allergen);
    }
 
}
