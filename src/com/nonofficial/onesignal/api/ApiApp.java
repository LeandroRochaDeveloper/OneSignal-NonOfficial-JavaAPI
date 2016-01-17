/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nonofficial.onesignal.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leandro
 */
public class ApiApp {
    
    private final String apiKey;
    private final Gson gson;
    private final String LOCATION = "apps/";

    /**
     *
     * @param apiKey
     */
    public ApiApp(String apiKey) {
        this.apiKey = apiKey;
        gson = new Gson();
    }
        
    /**
     *
     * @return
     */
    public List<Application> getApps() {
        String resp = new ServerBridge(apiKey).get(LOCATION);
        java.lang.reflect.Type listType = new TypeToken<ArrayList<Application>>() {
        }.getType();
        List<Application> apps = gson.fromJson(resp, listType);
        return apps;
    }
    
    /**
     *
     * @param id
     * @return
     */
    public Application getSingleAppInfo(String id) {
        String resp = new ServerBridge(apiKey).get(LOCATION + id);
        Application app = null;
        try {
            app = gson.fromJson(resp, Application.class);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return app;
    }
    
    public Application createApp(ApplicationBuilder builder) {
        Application app = null;
        String json = gson.toJson(builder);
        String resp = new ServerBridge(apiKey).post(LOCATION, json);
        try {
            app = gson.fromJson(resp, Application.class);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return app;
    }
    
    /**
     * This method can be used to update the name, APNS certificate, and GCM auth key of an existing OneSignal app.
     * 
     * @param app 
     * @return 
     */
    public Application createApp(Application app) {
        String parameters = "?";
        parameters += (app.getName() != null) ? "name=" + app.getName() : "";
        parameters += (app.getApns_p12() != null) ? "apns_p12=" + app.getApns_p12() : "";
        parameters += (app.getApns_env() != null) ? "apns_env=" + app.getApns_env() : "";
        parameters += (app.getGcm_key() != null) ? "gcm_key=" + app.getGcm_key() : "";
        String resp = new ServerBridge(apiKey).put(LOCATION + parameters);
        try {
            app = gson.fromJson(resp, Application.class);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return app;
    }
}
