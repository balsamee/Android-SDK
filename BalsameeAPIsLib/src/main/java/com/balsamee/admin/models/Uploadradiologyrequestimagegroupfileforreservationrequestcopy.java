/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Uploadradiologyrequestimagegroupfileforreservationrequestcopy 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -7910151429912214761L;
    private int id;
    private List<RadiologyRequestImage> radiologyRequestImage;
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
    @JsonGetter("radiology_request_image")
    public List<RadiologyRequestImage> getRadiologyRequestImage ( ) { 
        return this.radiologyRequestImage;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("radiology_request_image")
    public void setRadiologyRequestImage (List<RadiologyRequestImage> value) { 
        this.radiologyRequestImage = value;
        notifyObservers(this.radiologyRequestImage);
    }
 
}