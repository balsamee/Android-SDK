/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UpdateallergyRequest 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -56777395739829413L;
    private Allergy allergy;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("allergy")
    public Allergy getAllergy ( ) { 
        return this.allergy;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("allergy")
    public void setAllergy (Allergy value) { 
        this.allergy = value;
        notifyObservers(this.allergy);
    }
 
}