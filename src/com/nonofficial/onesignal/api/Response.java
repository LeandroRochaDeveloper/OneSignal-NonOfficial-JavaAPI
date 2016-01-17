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
public class Response {
    private String id;
    private int recipients;
    private boolean success;
    public String csv_file_url;
    private String[] errors;

    public Response() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRecipients() {
        return recipients;
    }

    public void setRecipients(int recipients) {
        this.recipients = recipients;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getCsv_file_url() {
        return csv_file_url;
    }

    public void setCsv_file_url(String csv_file_url) {
        this.csv_file_url = csv_file_url;
    }    

    public String[] getErrors() {
        return errors;
    }

    public void setErrors(String[] errors) {
        this.errors = errors;
    }
}
