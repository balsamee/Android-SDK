/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class LabRequestImage 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -5495632796949564044L;
    private String id;
    private String image;
    private int createdAt;
    private int updatedAt;
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
    @JsonGetter("image")
    public String getImage ( ) { 
        return this.image;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("image")
    public void setImage (String value) { 
        this.image = value;
        notifyObservers(this.image);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("created_at")
    public int getCreatedAt ( ) { 
        return this.createdAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("created_at")
    public void setCreatedAt (int value) { 
        this.createdAt = value;
        notifyObservers(this.createdAt);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("updated_at")
    public int getUpdatedAt ( ) { 
        return this.updatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("updated_at")
    public void setUpdatedAt (int value) { 
        this.updatedAt = value;
        notifyObservers(this.updatedAt);
    }
 
}