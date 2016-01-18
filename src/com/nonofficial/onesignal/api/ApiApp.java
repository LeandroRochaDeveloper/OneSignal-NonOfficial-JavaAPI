/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nonofficial.onesignal.api;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
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
    
    public Application createApp(Application builder) {
        Application app = null;
        String json = gson.toJson(builder);
        String resp = new ServerBridge(apiKey).post(LOCATION, json);
        System.out.println(resp);
        try {            
            app = gson.fromJson(resp, Application.class);
            System.out.println(app.getName());
            for (Field field : app.getClass().getDeclaredFields()) {
                field.setAccessible(true); // You might want to set modifier to public first.
                Object value = field.get(app); 
                if (value != null) {
                    System.out.println(field.getName() + "=" + value);
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return app;
    }
    
    public Application updateApp(Application builder) {
        Application app = null;
        String json = gson.toJson(builder);
        String resp = new ServerBridge(apiKey).put(LOCATION + "/" + builder.getId(), json);
        System.out.println(resp);
        try {            
            app = gson.fromJson(resp, Application.class);
            System.out.println(app.getName());
            for (Field field : app.getClass().getDeclaredFields()) {
                field.setAccessible(true); // You might want to set modifier to public first.
                Object value = field.get(app); 
                if (value != null) {
                    System.out.println(field.getName() + "=" + value);
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return app;
    }
}
