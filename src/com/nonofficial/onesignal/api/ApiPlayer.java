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
public class ApiPlayer {
    
    private final String apiKey;
    private final Gson gson;
    private final String LOCATION = "players";

    /**
     *
     * @param apiKey
     */
    public ApiPlayer(String apiKey) {
        this.apiKey = apiKey;
        gson = new Gson();
    }
    
    /**
     *
     * @param device_id
     * @return
     */
    public Device getPlayerDevice(String device_id) {
        String resp = new ServerBridge(apiKey).get(LOCATION + "/" + device_id);
        Device device = null;
        try {            
            device = gson.fromJson(resp, Device.class);
        } catch (Exception e) {
            System.err.println(resp);
        }
        return device;
    }
    
    /**
     *
     * @param app_id
     * @param limit
     * @param offset
     * @return
     */
    public ViewResults getPlayersDevices(String app_id, int limit, int offset) {
        String parameters = "?app_id=" + app_id + "";
        parameters += (limit > 0 && limit < 50) ? "&limit=" + limit : "";
        parameters += (offset > 0) ? "&offset=" + offset : "";
        String resp = new ServerBridge(apiKey).get(LOCATION + parameters);
        ViewResults view = null;            
        try {            
            view = gson.fromJson(resp, ViewResults.class);
        } catch (Exception e) {
            System.err.println(resp);
        }
        return view;
    }
    
    /**
     * This method can be used to generate a CSV export of all of your current user data. It is a much faster alternative than retrieving this data using the ./players API endpoint.
     * You can test if it is complete by making a GET request to the csv_file_url value. If the file is not ready, a 404 error will be returned. Otherwise the file itself will be returned.
     * The file may take several minutes to generate depending on the number of users in your app.
     * 
     * @param app_id The app ID that you want to export devices from
    */
    public String getCSVLocation(String app_id) {
        String resp = new ServerBridge(apiKey).post(LOCATION + "/csv_export?app_id=" + app_id, null);
        System.out.println(resp);
        Response response = null;
        try {
            response = gson.fromJson(resp, Response.class);
            if (response.getCsv_file_url() != null) {
                return response.getCsv_file_url();
            } else {
                for (String i : response.getErrors()) {
                    System.err.println(i);
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    public void getCSVFile(String url, String location) {
        if(!new ServerBridge(apiKey).download(url, location)){
            System.out.println("Erro no Download");
        }
    }
    
    /**
     * Increment the device's total session length
     * 
     * (Working)
     * 
     */
    public void onFocus(String id, int active_time) {
        // https://onesignal.com/api/v1/players/:id/on_focus
        String json = "{'state': 'ping','active_time': " + 1 + "}";
        String resp = new ServerBridge(apiKey).post(LOCATION + "/" + id + "/on_focus", json);
        System.err.println(resp);
    }
    
    /**
     * Call on new device session in your app
     * 
     * 
     */
    public Response onSession(Device device) {
        // https://onesignal.com/api/v1/players/:id/on_session
        String json = gson.toJson(device);        
        System.out.println(json);
        String resp = new ServerBridge(apiKey).post(LOCATION + "/" + device.getAd_id() + "/on_session", json);
        Response response = null;
        try {
            response = gson.fromJson(resp, Response.class);
            if (response.isSuccess()) {
                return response;
            } else {
                for (String i : response.getErrors()) {
                    System.err.println(i);
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;
    }
}
