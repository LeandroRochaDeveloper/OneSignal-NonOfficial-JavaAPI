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
public class Application {

    private String name;
    private long players;
    private long messagable_players;
    private String updated_at;
    private String created_at;
    private String gcm_key;
    private String chrome_key;
    private Ambiente apns_env;
    private String id;
    private String apns_certificates;
    private String safari_apns_cetificate;
    private String safari_site_origin;
    private String safari_push_id;
    private String site_name;
    private String basic_auth_key;
    private String apns_p12;
    private String apns_p12_password;
    private String safari_apns_p12;
    private String safari_apns_p12_password;
    
    public Application() {
    }

    public String getName() {
        return name;
    }

    public Application setName(String name) {
        this.name = name;
        return this;
    }

    public long getPlayers() {
        return players;
    }

    public void setPlayers(long players) {
        this.players = players;
    }

    public long getMessagable_players() {
        return messagable_players;
    }

    public void setMessagable_players(long messagable_players) {
        this.messagable_players = messagable_players;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getGcm_key() {
        return gcm_key;
    }

    public Application setGcm_key(String gcm_key) {
        this.gcm_key = gcm_key;
        return this;
    }

    public String getChrome_key() {
        return chrome_key;
    }

    public Application setChrome_key(String chrome_key) {
        this.chrome_key = chrome_key;
        return this;
    }

    public String getApns_env() {
        return apns_env.name();
    }

    public Application setApns_env(Ambiente apns_env) {
        this.apns_env = apns_env;
        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getApns_certificates() {
        return apns_certificates;
    }

    public void setApns_certificates(String apns_certificates) {
        this.apns_certificates = apns_certificates;
    }

    public String getSafari_apns_cetificate() {
        return safari_apns_cetificate;
    }

    public void setSafari_apns_cetificate(String safari_apns_cetificate) {
        this.safari_apns_cetificate = safari_apns_cetificate;
    }

    public String getSafari_site_origin() {
        return safari_site_origin;
    }

    public void setSafari_site_origin(String safari_site_origin) {
        this.safari_site_origin = safari_site_origin;
    }

    public String getSafari_push_id() {
        return safari_push_id;
    }

    public void setSafari_push_id(String safari_push_id) {
        this.safari_push_id = safari_push_id;
    }

    public String getSite_name() {
        return site_name;
    }

    public Application setSite_name(String site_name) {
        this.site_name = site_name;
        return this;
    }

    public String getBasic_auth_key() {
        return basic_auth_key;
    }

    public void setBasic_auth_key(String basic_auth_key) {
        this.basic_auth_key = basic_auth_key;
    }

    public String getApns_p12() {
        return apns_p12;
    }

    public Application setApns_p12(String apns_p12) {
        this.apns_p12 = apns_p12;
        return this;
    }

    public String getApns_p12_password() {
        return apns_p12_password;
    }

    public Application setApns_p12_password(String apns_p12_password) {
        this.apns_p12_password = apns_p12_password;
        return this;
    }

    public String getSafari_apns_p12() {
        return safari_apns_p12;
    }

    public Application setSafari_apns_p12(String safari_apns_p12) {
        this.safari_apns_p12 = safari_apns_p12;
        return this;
    }

    public String getSafari_apns_p12_password() {
        return safari_apns_p12_password;
    }

    public Application setSafari_apns_p12_password(String safari_apns_p12_password) {
        this.safari_apns_p12_password = safari_apns_p12_password;
        return this;
    }
    
    
}
