/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Listradiologyrequestgroupfile 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 8097030368845147550L;
    private List<String> radiologyRequests;
    private List<RadiologyRequestImageGroup> radiologyRequestImageGroups;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("radiology_requests")
    public List<String> getRadiologyRequests ( ) { 
        return this.radiologyRequests;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("radiology_requests")
    public void setRadiologyRequests (List<String> value) { 
        this.radiologyRequests = value;
        notifyObservers(this.radiologyRequests);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("radiology_request_image_groups")
    public List<RadiologyRequestImageGroup> getRadiologyRequestImageGroups ( ) { 
        return this.radiologyRequestImageGroups;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("radiology_request_image_groups")
    public void setRadiologyRequestImageGroups (List<RadiologyRequestImageGroup> value) { 
        this.radiologyRequestImageGroups = value;
        notifyObservers(this.radiologyRequestImageGroups);
    }
 
}
