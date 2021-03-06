/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class MreComment 
        extends java.util.Observable
        implements java.io.Serializable {
    private static final long serialVersionUID = -6061321065929044028L;
    private int commentId;
    private String body;
    private int createdAt;
    private int updatedAt;
    private Individual3 individual;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("comment_id")
    public int getCommentId ( ) { 
        return this.commentId;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("comment_id")
    public void setCommentId (int value) { 
        this.commentId = value;
        notifyObservers(this.commentId);
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("body")
    public String getBody ( ) { 
        return this.body;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("body")
    public void setBody (String value) { 
        this.body = value;
        notifyObservers(this.body);
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
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("individual")
    public Individual3 getIndividual ( ) { 
        return this.individual;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("individual")
    public void setIndividual (Individual3 value) { 
        this.individual = value;
        notifyObservers(this.individual);
    }
 
}
