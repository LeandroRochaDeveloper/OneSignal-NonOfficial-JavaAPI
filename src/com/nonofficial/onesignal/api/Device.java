/*
 https://documentation.onesignal.com/docs/players-view-devices
 */
package com.nonofficial.onesignal.api;

import java.util.Map;

public class Device {

    private String identifier;
    private int session_count;
    private String language;
    private int timezone;
    private String game_version;
    private String device_os;
    private String device_type;
    private String device_model;
    private String ad_id;
    private Map<String, String> tags;
    private long last_active;
    private String amount_spent;
    private long created_at;
    private boolean invalid_identifier;
    private int badge_count;
    // Create
    // https://documentation.onesignal.com/docs/players-add-a-device
    private String app_id;
    private String sdk;
    private int test_type;
    // Edit
    // https://documentation.onesignal.com/docs/playersid-1
    private String notification_types;
    private long playtime;
    
    /*
     {
     "identifier":"ce777617da7f548fe7a9ab6febb56cf39fba6d382000c0395666288d961ee566",
     "session_count":1,
     "language":"en",
     "timezone":-28800,
     "game_version":"1.0",
     "device_os":"7.0.4",
     "device_type":0,
     "device_model":"iPhone",
     "ad_id":null,
     "tags":{"a":"1","foo":"bar"},
     "last_active":1395096859,
     "amount_spent":"0",
     "created_at":1395096859,
     "invalid_identifier":false,
     "badge_count": 0
     }
     */

    public String getIdentifier() {
        return identifier;
    }

    public Device setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    public int getSession_count() {
        return session_count;
    }

    public Device setSession_count(int session_count) {
        this.session_count = session_count;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public Device setLanguage(String language) {
        this.language = language;
        return this;
    }

    public int getTimezone() {
        return timezone;
    }

    public Device setTimezone(int timezone) {
        this.timezone = timezone;
        return this;
    }

    public String getGame_version() {
        return game_version;
    }

    public Device setGame_version(String game_version) {
        this.game_version = game_version;
        return this;
    }

    public String getDevice_os() {
        return device_os;
    }

    public Device setDevice_os(String device_os) {
        this.device_os = device_os;
        return this;
    }

    public String getDevice_type() {
        return device_type;
    }

    public Device setDevice_type(String device_type) {
        this.device_type = device_type;
        return this;
    }

    public String getDevice_model() {
        return device_model;
    }

    public Device setDevice_model(String device_model) {
        this.device_model = device_model;
        return this;
    }

    public String getAd_id() {
        return ad_id;
    }

    public Device setAd_id(String ad_id) {
        this.ad_id = ad_id;
        return this;
    }

    public Map<String, String> getTags() {
        return tags;
    }

    public Device setTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    public long getLast_active() {
        return last_active;
    }

    public Device setLast_active(long last_active) {
        this.last_active = last_active;
        return this;
    }

    public String getAmount_spent() {
        return amount_spent;
    }

    public Device setAmount_spent(String amount_spent) {
        this.amount_spent = amount_spent;
        return this;
    }

    public long getCreated_at() {
        return created_at;
    }

    public Device setCreated_at(long created_at) {
        this.created_at = created_at;
        return this;
    }

    public boolean isInvalid_identifier() {
        return invalid_identifier;
    }

    public Device setInvalid_identifier(boolean invalid_identifier) {
        this.invalid_identifier = invalid_identifier;
        return this;
    }

    public int getBadge_count() {
        return badge_count;
    }

    public Device setBadge_count(int badge_count) {
        this.badge_count = badge_count;
        return this;
    }

    public String getApp_id() {
        return app_id;
    }

    public Device setApp_id(String app_id) {
        this.app_id = app_id;
        return this;
    }

    public String getSdk() {
        return sdk;
    }

    public Device setSdk(String sdk) {
        this.sdk = sdk;
        return this;
    }

    public int getTest_type() {
        return test_type;
    }

    public Device setTest_type(int test_type) {
        this.test_type = test_type;
        return this;
    }

    public String getNotification_types() {
        return notification_types;
    }

    public Device setNotification_types(String notification_types) {
        this.notification_types = notification_types;
        return this;
    }

    public long getPlaytime() {
        return playtime;
    }

    public Device setPlaytime(long playtime) {
        this.playtime = playtime;
        return this;
    }    
    
}
