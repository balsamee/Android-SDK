/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Surgery 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 7951247969460639L;
    private String surgery;
    private String operatedOn;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("surgery")
    public String getSurgery ( ) { 
        return this.surgery;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("surgery")
    public void setSurgery (String value) { 
        this.surgery = value;
        notifyObservers(this.surgery);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("operated_on")
    public String getOperatedOn ( ) { 
        return this.operatedOn;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("operated_on")
    public void setOperatedOn (String value) { 
        this.operatedOn = value;
        notifyObservers(this.operatedOn);
    }
 
}