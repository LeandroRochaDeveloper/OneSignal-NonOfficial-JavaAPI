/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nonofficial.onesignal.api;

import com.google.gson.Gson;

/**
 *
 * @author Leandro
 */
public class ApiNotification {

    private final String apiKey;
    private final Gson gson;
    private final String LOCATION = "notifications";

    /**
     *
     * @param apiKey
     */
    public ApiNotification(String apiKey) {
        this.apiKey = apiKey;
        this.gson = new Gson();
    }

    /**
     * This method can be used to send push notifications to programmatically
     * send notifications to users of your app. At least one targeting
     * parameters must be specified. Some targeting parameters are not
     * compatible with each other. Here are the groups of possible targeting
     * parameters. If a targeting parameter from one group is used, then
     * targeting parameters from other groups must not be used
     *
     * @param notification
     * @return
     */
    public Response sendNotification(Notification notification) {
        String json = gson.toJson(notification);
        Response response = null;
        System.out.println(json);
        String resp = new ServerBridge(apiKey).post(LOCATION, json);
        System.out.println(resp);
        try {
            response = gson.fromJson(resp, Response.class);
            if (response.getId() != null) {
                response.setSuccess(true);
            } else {
                response.setSuccess(false);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return response;
    }

    public Notification getNotification(String id) {
        String resp = new ServerBridge(apiKey).get(LOCATION + id);
        Notification notification = null;
        try {
            notification = gson.fromJson(resp, Notification.class);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return notification;
    }

    /**
     *
     * @param app_id
     * @param limit
     * @param offset
     * @return
     */
    public ViewResults getNotifications(String app_id, int limit, int offset) {
        String parameters = "?app_id=" + app_id + "&limit=" + limit + "&offset=" + offset;
        String resp = new ServerBridge(apiKey).get(LOCATION + parameters);
        ViewResults view = null;
        try {
            view = gson.fromJson(resp, ViewResults.class);
        } catch (Exception e) {
            System.err.println(resp);
        }
        return view;
    }

    public boolean setOpenned(String id) {
        String resp = new ServerBridge(apiKey).put(LOCATION + "/" + id + "?opened=true");
        Response response = gson.fromJson(resp, Response.class);
        if (response.isSuccess()) {
            return true;
        } else {
            for (String i : response.getErrors()) {
                System.err.println(i);
            }
        }
        return false;
    }

    public boolean deleteNotification(String id, String app_id) {
        if(id == null || app_id == null) {
            System.out.println("Can't be null");
            return false;
        }
        String resp = new ServerBridge(apiKey).delete(LOCATION + "/" + id + "?app_id=" + app_id);
        Response response = null;
        try {
            response = gson.fromJson(resp, Response.class);
            if (response.isSuccess()) {
                return true;
            } else {
                for (String i : response.getErrors()) {
                    System.err.println(i);
                }
            }
        } catch (Exception e) {
            System.err.println(resp);
        }
        return false;
    }
}
