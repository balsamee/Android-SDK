/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PrescriptionImagesGroup 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 4990712562091978038L;
    private String id;
    private List<PrescriptionImage> prescriptionImages;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("id")
    public String getId ( ) { 
        return this.id;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("id")
    public void setId (String value) { 
        this.id = value;
        notifyObservers(this.id);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("prescription_images")
    public List<PrescriptionImage> getPrescriptionImages ( ) { 
        return this.prescriptionImages;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("prescription_images")
    public void setPrescriptionImages (List<PrescriptionImage> value) { 
        this.prescriptionImages = value;
        notifyObservers(this.prescriptionImages);
    }
 
}
