/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Individual 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = 1793952151127719560L;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String avatar;
    private int sessionId;
    private String mobileNumber;
    private boolean confirmed;
    private String loginMethod;
    private String activeRequest;
    private String activeRequestDoctorId;
    private String activeRequestDoctorFirstName;
    private String activeRequestDoctorLastName;
    private String activeRequestStatus;
    private String activeRequestPatientLatitude;
    private String activeRequestPatientLongitude;
    private String activeRequestDoctorLatitude;
    private String activeRequestDoctorLongitude;
    private String activeRequestCreatedAt;
    private String activeRequestWillTimeoutAt;
    private int doctorRequestStatus;
    private String authenticationToken;
    private boolean isAvailable;
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
    @JsonGetter("first_name")
    public String getFirstName ( ) { 
        return this.firstName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("first_name")
    public void setFirstName (String value) { 
        this.firstName = value;
        notifyObservers(this.firstName);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("last_name")
    public String getLastName ( ) { 
        return this.lastName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("last_name")
    public void setLastName (String value) { 
        this.lastName = value;
        notifyObservers(this.lastName);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("email")
    public String getEmail ( ) { 
        return this.email;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("email")
    public void setEmail (String value) { 
        this.email = value;
        notifyObservers(this.email);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("avatar")
    public String getAvatar ( ) { 
        return this.avatar;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("avatar")
    public void setAvatar (String value) { 
        this.avatar = value;
        notifyObservers(this.avatar);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("session_id")
    public int getSessionId ( ) { 
        return this.sessionId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("session_id")
    public void setSessionId (int value) { 
        this.sessionId = value;
        notifyObservers(this.sessionId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("mobile_number")
    public String getMobileNumber ( ) { 
        return this.mobileNumber;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("mobile_number")
    public void setMobileNumber (String value) { 
        this.mobileNumber = value;
        notifyObservers(this.mobileNumber);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("confirmed")
    public boolean getConfirmed ( ) { 
        return this.confirmed;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("confirmed")
    public void setConfirmed (boolean value) { 
        this.confirmed = value;
        notifyObservers(this.confirmed);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("login_method")
    public String getLoginMethod ( ) { 
        return this.loginMethod;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("login_method")
    public void setLoginMethod (String value) { 
        this.loginMethod = value;
        notifyObservers(this.loginMethod);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request")
    public String getActiveRequest ( ) { 
        return this.activeRequest;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request")
    public void setActiveRequest (String value) { 
        this.activeRequest = value;
        notifyObservers(this.activeRequest);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request_doctor_id")
    public String getActiveRequestDoctorId ( ) { 
        return this.activeRequestDoctorId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request_doctor_id")
    public void setActiveRequestDoctorId (String value) { 
        this.activeRequestDoctorId = value;
        notifyObservers(this.activeRequestDoctorId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request_doctor_first_name")
    public String getActiveRequestDoctorFirstName ( ) { 
        return this.activeRequestDoctorFirstName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request_doctor_first_name")
    public void setActiveRequestDoctorFirstName (String value) { 
        this.activeRequestDoctorFirstName = value;
        notifyObservers(this.activeRequestDoctorFirstName);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request_doctor_last_name")
    public String getActiveRequestDoctorLastName ( ) { 
        return this.activeRequestDoctorLastName;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request_doctor_last_name")
    public void setActiveRequestDoctorLastName (String value) { 
        this.activeRequestDoctorLastName = value;
        notifyObservers(this.activeRequestDoctorLastName);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request_status")
    public String getActiveRequestStatus ( ) { 
        return this.activeRequestStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request_status")
    public void setActiveRequestStatus (String value) { 
        this.activeRequestStatus = value;
        notifyObservers(this.activeRequestStatus);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request_patient_latitude")
    public String getActiveRequestPatientLatitude ( ) { 
        return this.activeRequestPatientLatitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request_patient_latitude")
    public void setActiveRequestPatientLatitude (String value) { 
        this.activeRequestPatientLatitude = value;
        notifyObservers(this.activeRequestPatientLatitude);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request_patient_longitude")
    public String getActiveRequestPatientLongitude ( ) { 
        return this.activeRequestPatientLongitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request_patient_longitude")
    public void setActiveRequestPatientLongitude (String value) { 
        this.activeRequestPatientLongitude = value;
        notifyObservers(this.activeRequestPatientLongitude);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request_doctor_latitude")
    public String getActiveRequestDoctorLatitude ( ) { 
        return this.activeRequestDoctorLatitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request_doctor_latitude")
    public void setActiveRequestDoctorLatitude (String value) { 
        this.activeRequestDoctorLatitude = value;
        notifyObservers(this.activeRequestDoctorLatitude);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request_doctor_longitude")
    public String getActiveRequestDoctorLongitude ( ) { 
        return this.activeRequestDoctorLongitude;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request_doctor_longitude")
    public void setActiveRequestDoctorLongitude (String value) { 
        this.activeRequestDoctorLongitude = value;
        notifyObservers(this.activeRequestDoctorLongitude);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request_created_at")
    public String getActiveRequestCreatedAt ( ) { 
        return this.activeRequestCreatedAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request_created_at")
    public void setActiveRequestCreatedAt (String value) { 
        this.activeRequestCreatedAt = value;
        notifyObservers(this.activeRequestCreatedAt);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("active_request_will_timeout_at")
    public String getActiveRequestWillTimeoutAt ( ) { 
        return this.activeRequestWillTimeoutAt;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("active_request_will_timeout_at")
    public void setActiveRequestWillTimeoutAt (String value) { 
        this.activeRequestWillTimeoutAt = value;
        notifyObservers(this.activeRequestWillTimeoutAt);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("doctor_request_status")
    public int getDoctorRequestStatus ( ) { 
        return this.doctorRequestStatus;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("doctor_request_status")
    public void setDoctorRequestStatus (int value) { 
        this.doctorRequestStatus = value;
        notifyObservers(this.doctorRequestStatus);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("authentication_token")
    public String getAuthenticationToken ( ) { 
        return this.authenticationToken;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("authentication_token")
    public void setAuthenticationToken (String value) { 
        this.authenticationToken = value;
        notifyObservers(this.authenticationToken);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("is_available")
    public boolean getIsAvailable ( ) { 
        return this.isAvailable;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("is_available")
    public void setIsAvailable (boolean value) { 
        this.isAvailable = value;
        notifyObservers(this.isAvailable);
    }
 
}
