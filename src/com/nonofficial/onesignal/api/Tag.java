/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nonofficial.onesignal.api;

/**
 *
 * @author Leandro
 */
public class Tag {
    private String key;
    private String relation;
    private String value;
    private String operator;

    public Tag() {
        //this.key = "myspecial";
        //this.value = "app";
    }

    public Tag(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public Tag(String key, String relation, String value, String operator) {
        this.key = key;
        this.relation = relation;
        this.value = value;
        this.operator = operator;
    }
    
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
}
