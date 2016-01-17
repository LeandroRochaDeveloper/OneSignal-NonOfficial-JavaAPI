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
public class Button {
    // {"id": "id1", "text": "button1"
    private String id;
    private String text;
    private String icon;

    public Button(String id, String text, String icon) {
        this.id = id;
        this.text = text;
        this.icon = icon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
}
