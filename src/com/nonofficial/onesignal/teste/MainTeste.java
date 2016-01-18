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
import com.nonofficial.onesignal.api.Notification;
import com.nonofficial.onesignal.api.Tag;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Leandro
 */
public class MainTeste {
    
    private final static String USER_AUTH_KEY = "NmMxZTBhNGItNGFmOS00YjVkLWI2NDQtZDk1YzQ2ZDk2MDMx";
    private final static String REST_KEY = "YTRjYzk0NTAtY2ViYi00ZjdjLWFkZjUtNDc3NzQ5N2NkZDZj";
    private final static String APP_ID = "b284ccb3-fed5-4b19-a1af-fc3840482fbc";

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
        
        Notification notification = new Notification()
                .setContents(contents)
                .setTags(tags) 
                .setApp_id(APP_ID)
                .setAndroid(true)
                ;
                
        Application builder = new Application()
                .setApns_env(Ambiente.sandbox)
                .setGcm_key("AIzaSyDljTUNLl7550C2By3NNalLTdGffhh9p5k")
                .setName("Teste de criacao")
                ;
        
        noti.getNotifications(APP_ID, 5, 1);
    }
    
}
