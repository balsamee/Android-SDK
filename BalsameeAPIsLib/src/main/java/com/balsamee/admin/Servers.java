/*
 * BalsameeAPIsLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package com.balsamee.admin;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public enum Servers {
    SERVER1, //TODO: Write general description for this element
    SERVER2; //TODO: Write general description for this element

    private static TreeMap<String, Servers> valueMap = new TreeMap<String, Servers>();
    private String value;

    static {
        SERVER1.value = "server1";
        SERVER2.value = "server2";

        valueMap.put("server1", SERVER1);
        valueMap.put("server2", SERVER2);
    }

    /**
     * Returns the enum member associated with the given string value
     * @return The enum member against the given string value */
    @com.fasterxml.jackson.annotation.JsonCreator
    public static Servers fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member
     * @return The string value against enum member */
    @com.fasterxml.jackson.annotation.JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of Servers values to list of string values
     * @param toConvert The list of Servers values to convert
     * @return List of representative string values */
    public static List<String> toValue(List<Servers> toConvert) {
        if(toConvert == null)
            return null;
        List<String> convertedValues = new ArrayList<String>();
        for (Servers enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 