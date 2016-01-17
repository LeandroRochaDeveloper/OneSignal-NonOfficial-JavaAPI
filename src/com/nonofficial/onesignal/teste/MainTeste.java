/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nonofficial.onesignal.teste;

import com.nonofficial.onesignal.api.ApiNotification;
import com.nonofficial.onesignal.api.Notification;
import com.nonofficial.onesignal.api.Response;
import com.nonofficial.onesignal.api.Tag;
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
//        Application a = new ApiApp(USER_AUTH_KEY).getSingleAppInfo(APP_ID);
//        System.out.println(a.getName());
        
        ApiNotification noti = new ApiNotification(REST_KEY);
        
        Map<String, String> contents = new HashMap<>();
        contents.put("en", "Teste de envio de notificação APP");
        contents.put("es", "Spanish Message");
        Tag[] tags = {new Tag("myspecial", "=", "app", null)};
        
        Notification notification = new Notification()
                .setContents(contents)
                .setTags(tags)
                .setApp_id(APP_ID)
                .setAndroid(true);
                
        Response resp = noti.sendNotification(notification);
        if(resp.isSuccess()) {
            System.out.println(resp.getId());
            System.out.println(resp.getRecipients());
            System.out.println(resp.isSuccess());
        }
    }
    
}
