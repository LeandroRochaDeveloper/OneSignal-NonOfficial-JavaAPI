/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nonofficial.onesignal.api;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Leandro
 *
 * @referencia
 * https://documentation.onesignal.com/docs/notifications-create-notification
 */
public class Notification {

    private String app_id;
    private String[] included_segments;
    private boolean isIos;
    private boolean isAndroid;
    private boolean isWP;
    private boolean isChrome;
    private boolean isChromeWeb;
    private boolean isSafari;
    private boolean isAnyWeb;
    private boolean isAdm; // Teste
    private Map<String, String> data;
    private Map<String, String> contents;// Mensagem
    private Map<String, String> headings;
    private String[] include_player_ids;
    private String[] excluded_segments;
    private String[] include_ios_tokens;
    private String[] include_android_reg_ids;
    private String[] include_wp_uris;
    private String[] include_wp_wns_uris;
    private String[] include_amazon_reg_ids;
    private String[] include_chrome_reg_ids;
    private String[] include_chrome_web_reg_ids;
    private String[] app_ids;
    private Object[] tags;
    private String id;
    private long succesful;
    private long failed;
    private long converted;
    private long remaining;
    private long queued_at;
    private String send_after;
    private boolean canceled;
    private String ios_badgeType;
    private int ios_badgeCount;
    private String ios_sound;
    private String android_sound;
    private String adm_sound;
    private String wp_sound;
    private String wp_wns_sound;
    private Button[] buttons;
    private String small_icon;
    private String large_icon;
    private String big_picture;
    private String adm_small_icon;
    private String adm_large_icon;
    private String adm_big_picture;
    private String chrome_icon;
    private String chrome_big_picture;
    private String chrome_web_icon;
    private String url;
    private String delayed_option;
    private String delivery_time_of_day;
    private String android_led_color;
    private String android_accent_color;
    private int android_visibility;
    private boolean content_available;
    private boolean android_background_data;
    private boolean amazon_background_data;
    private String template_id;
    private String android_group;
    private String adm_group;
    private Map<String, String> adm_group_message;
    private Map<String, String> android_group_message;

    public Notification() {
        contents = new HashMap<>();
        contents.put("en", "Teste de envio de notificação APP");
        contents.put("es", "Spanish Message");
        isAndroid = true;
        //app_id = "b284ccb3-fed5-4b19-a1af-fc3840482fbc";
        tags = new Object[1];// {"key": "level", "relation": ">", "value": "10"
        tags[0] = new Tag("myspecial", "=", "app", null);
    }
    
    public Notification setPlayersId(String[] players) {
        this.include_player_ids = players;
        return this;
    }

    public Notification setContents(Map<String, String> contents) {
        this.contents = contents;
        return this;
    }

    public Notification setContentsItem(String key, String value) {
        this.contents.put(key, value);
        return this;
    }

    public Notification setData(Map<String, String> data) {
        this.data = data;
        return this;
    }

    public Notification setDataItem(String key, String value) {
        this.data.put(key, value);
        return this;
    }

    public String getApp_id() {
        return app_id;
    }

    public Notification setApp_id(String app_id) {
        this.app_id = app_id;
        return this;
    }

    public String[] getIncluded_segments() {
        return included_segments;
    }

    public Notification setIncluded_segments(String[] included_segments) {
        this.included_segments = included_segments;
        return this;
    }

    public boolean isIos() {
        return isIos;
    }

    public Notification setIos(boolean isIos) {
        this.isIos = isIos;
        return this;
    }

    public boolean isAndroid() {
        return isAndroid;
    }

    public Notification setAndroid(boolean isAndroid) {
        this.isAndroid = isAndroid;
        return this;
    }

    public boolean isWP() {
        return isWP;
    }

    public Notification setWP(boolean isWP) {
        this.isWP = isWP;
        return this;
    }

    public boolean isAdm() {
        return isAdm;
    }

    public Notification setAdm(boolean isAdm) {
        this.isAdm = isAdm;
        return this;
    }

    public Map<String, String> getData() {
        return data;
    }

    public Map<String, String> getContents() {
        return contents;
    }

    public Map<String, String> getHeadings() {
        return headings;
    }

    public Notification setHeadings(Map<String, String> headings) {
        this.headings = headings;
        return this;
    }

    public String[] getInclude_player_ids() {
        return include_player_ids;
    }

    public Notification setInclude_player_ids(String[] include_player_ids) {
        this.include_player_ids = include_player_ids;
        return this;
    }

    public String getId() {
        return id;
    }

    public Notification setId(String id) {
        this.id = id;
        return this;
    }

    public long getSuccesful() {
        return succesful;
    }

    public Notification setSuccesful(long succesful) {
        this.succesful = succesful;
        return this;
    }

    public long getFailed() {
        return failed;
    }

    public Notification setFailed(long failed) {
        this.failed = failed;
        return this;
    }

    public long getConverted() {
        return converted;
    }

    public Notification setConverted(long converted) {
        this.converted = converted;
        return this;
    }

    public long getRemaining() {
        return remaining;
    }

    public Notification setRemaining(long remaining) {
        this.remaining = remaining;
        return this;
    }

    public long getQueued_at() {
        return queued_at;
    }

    public Notification setQueued_at(long queued_at) {
        this.queued_at = queued_at;
        return this;
    }

    public String getSend_after() {
        return send_after;
    }

    public Notification setSend_after(String send_after) {
        this.send_after = send_after;
        return this;
    }

    public boolean isCanceled() {
        return canceled;
    }

    public Notification setCanceled(boolean canceled) {
        this.canceled = canceled;
        return this;
    }

    public boolean isChrome() {
        return isChrome;
    }

    public Notification setChrome(boolean isChrome) {
        this.isChrome = isChrome;
        return this;
    }

    public boolean isChromeWeb() {
        return isChromeWeb;
    }

    public Notification setChromeWeb(boolean isChromeWeb) {
        this.isChromeWeb = isChromeWeb;
        return this;
    }

    public boolean isSafari() {
        return isSafari;
    }

    public Notification setSafari(boolean isSafari) {
        this.isSafari = isSafari;
        return this;
    }

    public boolean isAnyWeb() {
        return isAnyWeb;
    }

    public Notification setAnyWeb(boolean isAnyWeb) {
        this.isAnyWeb = isAnyWeb;
        return this;
    }

    public String[] getExcluded_segments() {
        return excluded_segments;
    }

    public Notification setExcluded_segments(String[] excluded_segments) {
        this.excluded_segments = excluded_segments;
        return this;
    }

    public String[] getInclude_ios_tokens() {
        return include_ios_tokens;
    }

    public Notification setInclude_ios_tokens(String[] include_ios_tokens) {
        this.include_ios_tokens = include_ios_tokens;
        return this;
    }

    public String[] getInclude_android_reg_ids() {
        return include_android_reg_ids;
    }

    public Notification setInclude_android_reg_ids(String[] include_android_reg_ids) {
        this.include_android_reg_ids = include_android_reg_ids;
        return this;
    }

    public String[] getInclude_wp_uris() {
        return include_wp_uris;
    }

    public Notification setInclude_wp_uris(String[] include_wp_uris) {
        this.include_wp_uris = include_wp_uris;
        return this;
    }

    public String[] getInclude_wp_wns_uris() {
        return include_wp_wns_uris;
    }

    public Notification setInclude_wp_wns_uris(String[] include_wp_wns_uris) {
        this.include_wp_wns_uris = include_wp_wns_uris;
        return this;
    }

    public String[] getInclude_amazon_reg_ids() {
        return include_amazon_reg_ids;
    }

    public Notification setInclude_amazon_reg_ids(String[] include_amazon_reg_ids) {
        this.include_amazon_reg_ids = include_amazon_reg_ids;
        return this;
    }

    public String[] getInclude_chrome_reg_ids() {
        return include_chrome_reg_ids;
    }

    public Notification setInclude_chrome_reg_ids(String[] include_chrome_reg_ids) {
        this.include_chrome_reg_ids = include_chrome_reg_ids;
        return this;
    }

    public String[] getInclude_chrome_web_reg_ids() {
        return include_chrome_web_reg_ids;
    }

    public Notification setInclude_chrome_web_reg_ids(String[] include_chrome_web_reg_ids) {
        this.include_chrome_web_reg_ids = include_chrome_web_reg_ids;
        return this;
    }

    public String[] getApp_ids() {
        return app_ids;
    }

    public Notification setApp_ids(String[] app_ids) {
        this.app_ids = app_ids;
        return this;
    }

    public String getIos_badgeType() {
        return ios_badgeType;
    }

    public Notification setIos_badgeType(String ios_badgeType) {
        this.ios_badgeType = ios_badgeType;
        return this;
    }

    public int getIos_badgeCount() {
        return ios_badgeCount;
    }

    public Notification setIos_badgeCount(int ios_badgeCount) {
        this.ios_badgeCount = ios_badgeCount;
        return this;
    }

    public String getIos_sound() {
        return ios_sound;
    }

    public Notification setIos_sound(String ios_sound) {
        this.ios_sound = ios_sound;
        return this;
    }

    public String getAndroid_sound() {
        return android_sound;
    }

    public Notification setAndroid_sound(String android_sound) {
        this.android_sound = android_sound;
        return this;
    }

    public String getAdm_sound() {
        return adm_sound;
    }

    public Notification setAdm_sound(String adm_sound) {
        this.adm_sound = adm_sound;
        return this;
    }

    public String getWp_sound() {
        return wp_sound;
    }

    public Notification setWp_sound(String wp_sound) {
        this.wp_sound = wp_sound;
        return this;
    }

    public String getWp_wns_sound() {
        return wp_wns_sound;
    }

    public Notification setWp_wns_sound(String wp_wns_sound) {
        this.wp_wns_sound = wp_wns_sound;
        return this;
    }

    public String getSmall_icon() {
        return small_icon;
    }

    public Notification setSmall_icon(String small_icon) {
        this.small_icon = small_icon;
        return this;
    }

    public String getLarge_icon() {
        return large_icon;
    }

    public Notification setLarge_icon(String large_icon) {
        this.large_icon = large_icon;
        return this;
    }

    public String getBig_picture() {
        return big_picture;
    }

    public Notification setBig_picture(String big_picture) {
        this.big_picture = big_picture;
        return this;
    }

    public String getAdm_small_icon() {
        return adm_small_icon;
    }

    public Notification setAdm_small_icon(String adm_small_icon) {
        this.adm_small_icon = adm_small_icon;
        return this;
    }

    public String getAdm_large_icon() {
        return adm_large_icon;
    }

    public Notification setAdm_large_icon(String adm_large_icon) {
        this.adm_large_icon = adm_large_icon;
        return this;
    }

    public String getAdm_big_picture() {
        return adm_big_picture;
    }

    public Notification setAdm_big_picture(String adm_big_picture) {
        this.adm_big_picture = adm_big_picture;
        return this;
    }

    public String getChrome_icon() {
        return chrome_icon;
    }

    public Notification setChrome_icon(String chrome_icon) {
        this.chrome_icon = chrome_icon;
        return this;
    }

    public String getChrome_big_picture() {
        return chrome_big_picture;
    }

    public Notification setChrome_big_picture(String chrome_big_picture) {
        this.chrome_big_picture = chrome_big_picture;
        return this;
    }

    public String getChrome_web_icon() {
        return chrome_web_icon;
    }

    public Notification setChrome_web_icon(String chrome_web_icon) {
        this.chrome_web_icon = chrome_web_icon;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Notification setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getDelayed_option() {
        return delayed_option;
    }

    public Notification setDelayed_option(String delayed_option) {
        this.delayed_option = delayed_option;
        return this;
    }

    public String getDelivery_time_of_day() {
        return delivery_time_of_day;
    }

    public Notification setDelivery_time_of_day(String delivery_time_of_day) {
        this.delivery_time_of_day = delivery_time_of_day;
        return this;
    }

    public String getAndroid_led_color() {
        return android_led_color;
    }

    public Notification setAndroid_led_color(String android_led_color) {
        this.android_led_color = android_led_color;
        return this;
    }

    public String getAndroid_accent_color() {
        return android_accent_color;
    }

    public Notification setAndroid_accent_color(String android_accent_color) {
        this.android_accent_color = android_accent_color;
        return this;
    }

    public int getAndroid_visibility() {
        return android_visibility;
    }

    public Notification setAndroid_visibility(int android_visibility) {
        this.android_visibility = android_visibility;
        return this;
    }

    public boolean isContent_available() {
        return content_available;
    }

    public Notification setContent_available(boolean content_available) {
        this.content_available = content_available;
        return this;
    }

    public boolean isAndroid_background_data() {
        return android_background_data;
    }

    public Notification setAndroid_background_data(boolean android_background_data) {
        this.android_background_data = android_background_data;
        return this;
    }

    public boolean isAmazon_background_data() {
        return amazon_background_data;
    }

    public Notification setAmazon_background_data(boolean amazon_background_data) {
        this.amazon_background_data = amazon_background_data;
        return this;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public Notification setTemplate_id(String template_id) {
        this.template_id = template_id;
        return this;
    }

    public String getAndroid_group() {
        return android_group;
    }

    public Notification setAndroid_group(String android_group) {
        this.android_group = android_group;
        return this;
    }

    public String getAdm_group() {
        return adm_group;
    }

    public Notification setAdm_group(String adm_group) {
        this.adm_group = adm_group;
        return this;
    }

    public Object[] getTags() {
        return tags;
    }

    public Notification setTags(Object[] tags) {
        this.tags = tags;
        return this;
    }

    public Button[] getButtons() {
        return buttons;
    }

    public Notification setButtons(Button[] buttons) {
        this.buttons = buttons;
        return this;
    }

    public Map<String, String> getAdm_group_message() {
        return adm_group_message;
    }

    public Notification setAdm_group_message(Map<String, String> adm_group_message) {
        this.adm_group_message = adm_group_message;
        return this;
    }

    public Map<String, String> getAndroid_group_message() {
        return android_group_message;
    }

    public Notification setAndroid_group_message(Map<String, String> android_group_message) {
        this.android_group_message = android_group_message;
        return this;
    }

}
