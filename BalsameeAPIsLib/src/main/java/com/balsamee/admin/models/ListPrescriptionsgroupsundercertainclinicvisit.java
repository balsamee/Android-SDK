/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ListPrescriptionsgroupsundercertainclinicvisit 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 6310019137842071598L;
    private List<String> prescriptions;
    private List<PrescriptionImagesGroup> prescriptionImagesGroups;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("prescriptions")
    public List<String> getPrescriptions ( ) { 
        return this.prescriptions;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("prescriptions")
    public void setPrescriptions (List<String> value) { 
        this.prescriptions = value;
        notifyObservers(this.prescriptions);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("prescription_images_groups")
    public List<PrescriptionImagesGroup> getPrescriptionImagesGroups ( ) { 
        return this.prescriptionImagesGroups;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("prescription_images_groups")
    public void setPrescriptionImagesGroups (List<PrescriptionImagesGroup> value) { 
        this.prescriptionImagesGroups = value;
        notifyObservers(this.prescriptionImagesGroups);
    }
 
}
