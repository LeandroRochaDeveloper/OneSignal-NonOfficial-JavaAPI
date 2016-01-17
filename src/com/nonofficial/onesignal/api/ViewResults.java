/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nonofficial.onesignal.api;

import java.util.List;

/**
 *
 * @author Leandro
 * 
 * https://documentation.onesignal.com/docs/players-view-devices
 */
public class ViewResults {
    private int total_count;
    private int offset;
    private int limit;
    private List<Device> players;
    private List<Notification> notifications;

    public ViewResults() {
    }

    public int getTotal_count() {
        return total_count;
    }

    public void setTotal_count(int total_count) {
        this.total_count = total_count;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<Device> getPlayers() {
        return players;
    }

    public void setPlayers(List<Device> players) {
        this.players = players;
    }    

    public List<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<Notification> notifications) {
        this.notifications = notifications;
    }
    
}
