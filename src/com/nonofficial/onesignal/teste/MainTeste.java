/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nonofficial.onesignal.teste;

import com.nonofficial.onesignal.api.Ambiente;
import com.nonofficial.onesignal.api.ApiApp;
import com.nonofficial.onesignal.api.ApiNotification;
import com.nonofficial.onesignal.api.ApiPlayer;
import com.nonofficial.onesignal.api.Application;
import com.nonofficial.onesignal.api.Device;
import com.nonofficial.onesignal.api.Notification;
import com.nonofficial.onesignal.api.Tag;
import com.nonofficial.onesignal.api.ViewResults;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Leandro
 */
public class MainTeste {
    
    private final static String USER_AUTH_KEY = "X";
    private final static String REST_KEY = "Y";
    private final static String APP_ID = "Z";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ApiNotification noti = new ApiNotification(REST_KEY);
        ApiApp app = new ApiApp(USER_AUTH_KEY);
        ApiPlayer player = new ApiPlayer(REST_KEY);
                
        Map<String, String> contents = new HashMap<>();
        contents.put("en", "Teste de envio de notificação APP");
        contents.put("es", "Spanish Message");
        Tag[] tags = {new Tag("myspecial", "=", "app", null)};
        
        ViewResults view = player.getPlayersDevices(APP_ID, 30, 0);
        Device dev = view.getPlayers().get(1);
        System.err.println(dev.getAd_id());
        dev.setApp_id(APP_ID);
        
        Notification notification = new Notification()
                .setContents(contents)
                .setTags(tags) 
                .setApp_id(APP_ID)
                .setAndroid(true)
                ;
        // noti.sendNotification(notification);
                
        Application builder = new Application()
                .setApns_env(Ambiente.sandbox)
                .setName("Teste de criacao")
                ;
        
    }
    
}
