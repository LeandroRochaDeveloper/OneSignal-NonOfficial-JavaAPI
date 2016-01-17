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
public class ApplicationBuilder {
    /*
     * @param apns_env Either "sandbox" or "production"
     * @param apns_p12 Your apple push notification p12 certificate file, converted to a string and Base64 encoded.
     * @param apns_p12_password Password for the apns_p12 file
     * @param gcm_key Your Google Push Messaging Auth Key
     * @param chrome_key Your Google Push Messaging Auth Key for Chrome Push
     * @param safari_apns_p12 Your apple push notification p12 certificate file for Safari Push Notifications, converted to a string and Base64 encoded.
     * @param safari_apns_p12_password Password for safari_apns_p12 file
     * @param site_name The URL to your website for Safari Web Push
     * @param safari_site_origin The hostname to your website including http(s)://
     * @return
     */
    private String apns_env;
    private String apns_p12;
    private String apns_p12_password;
    private String gcm_key;
    private String chrome_key;
    private String safari_apns_p12;
    private String safari_apns_p12_password;
    private String site_name;
    private String safari_site_origin;
    
    public ApplicationBuilder() {
    }

    public String getApns_env() {
        return apns_env;
    }

    public ApplicationBuilder setApns_env(String apns_env) {
        this.apns_env = apns_env;
        return this;
    }

    public String getApns_p12() {
        return apns_p12;
    }

    public ApplicationBuilder setApns_p12(String apns_p12) {
        this.apns_p12 = apns_p12;
        return this;
    }

    public String getApns_p12_password() {
        return apns_p12_password;
    }

    public ApplicationBuilder setApns_p12_password(String apns_p12_password) {
        this.apns_p12_password = apns_p12_password;
        return this;
    }

    public String getGcm_key() {
        return gcm_key;
    }

    public ApplicationBuilder setGcm_key(String gcm_key) {
        this.gcm_key = gcm_key;
        return this;
    }

    public String getChrome_key() {
        return chrome_key;
    }

    public ApplicationBuilder setChrome_key(String chrome_key) {
        this.chrome_key = chrome_key;
        return this;
    }

    public String getSafari_apns_p12() {
        return safari_apns_p12;
    }

    public ApplicationBuilder setSafari_apns_p12(String safari_apns_p12) {
        this.safari_apns_p12 = safari_apns_p12;
        return this;
    }

    public String getSafari_apns_p12_password() {
        return safari_apns_p12_password;
    }

    public ApplicationBuilder setSafari_apns_p12_password(String safari_apns_p12_password) {
        this.safari_apns_p12_password = safari_apns_p12_password;
        return this;
    }

    public String getSite_name() {
        return site_name;
    }

    public ApplicationBuilder setSite_name(String site_name) {
        this.site_name = site_name;
        return this;
    }

    public String getSafari_site_origin() {
        return safari_site_origin;
    }

    public ApplicationBuilder setSafari_site_origin(String safari_site_origin) {
        this.safari_site_origin = safari_site_origin;
        return this;
    }
}
