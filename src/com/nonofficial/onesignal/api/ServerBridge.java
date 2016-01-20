/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nonofficial.onesignal.api;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

/**
 *
 * @author Leandro
 */
public class ServerBridge {

    public static final String DEFAULT_BASE_URL = "https://onesignal.com/api/v1/";
    public static final int BUFFER_SIZE = 4096;
    private String apiKey;

    public ServerBridge(String apiKey) {
        this.apiKey = apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
    
    /**
     * Perform a POST request on the API with a given path
     *
     * @param path Path to append to the base URL.
     * @param json String no formato JSON com as informacoes a serem enviadas
     * para o servidor
     * @return Response from the API. The API sends back data encoded in JSON.
     * In the event of an error, will return null.
     */
    protected String post(String path, String json) {
        String jsonRespone = "";// Resposta REST
        try {
            URL url = new URL(DEFAULT_BASE_URL + path);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setUseCaches(false);
            con.setDoOutput(true);
            con.setDoInput(true);

            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setRequestProperty("Authorization", "Basic " + apiKey);
            con.setRequestMethod("POST");

            if (json != null) {
                byte[] sendBytes = json.getBytes("UTF-8");
                con.setFixedLengthStreamingMode(sendBytes.length);

                OutputStream outputStream = con.getOutputStream();
                outputStream.write(sendBytes);
            }

            int httpResponse = con.getResponseCode();

            if (httpResponse >= HttpURLConnection.HTTP_OK
                    && httpResponse < HttpURLConnection.HTTP_BAD_REQUEST) {
                Scanner scanner = new Scanner(con.getInputStream(), "UTF-8");
                jsonRespone = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                scanner.close();
            } else {
                Scanner scanner = new Scanner(con.getErrorStream(), "UTF-8");
                jsonRespone = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                scanner.close();
            }
        } catch (Throwable t) {
            return t.getMessage();
        }
        return jsonRespone;
    }

    /**
     * Perform a GET request on the API with a given path
     *
     * @param path String no formato JSON com as informacoes a serem enviadas
     * para o servidor
     * @return Response from the API. The API sends back data encoded in JSON.
     * In the event of an error, will return null.
     */
    protected String get(String path) {
        String jsonRespone = "";// Resposta REST
        try {

            URL url = new URL(DEFAULT_BASE_URL + path);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setRequestProperty("Authorization", "Basic " + apiKey);
            con.setRequestMethod("GET");

            int httpResponse = con.getResponseCode();

            if (httpResponse >= HttpURLConnection.HTTP_OK
                    && httpResponse < HttpURLConnection.HTTP_BAD_REQUEST) {
                Scanner scanner = new Scanner(con.getInputStream(), "UTF-8");
                jsonRespone = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                scanner.close();
            } else {
                Scanner scanner = new Scanner(con.getErrorStream(), "UTF-8");
                jsonRespone = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                scanner.close();
            }

        } catch (Throwable t) {
            return t.getMessage();
        }
        return jsonRespone;
    }

    protected String put(String path, String json) {
        String jsonRespone = "";// Resposta REST
        try {

            URL url = new URL(DEFAULT_BASE_URL + path);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            
            con.setDoOutput(true);

            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setRequestProperty("Authorization", "Basic " + apiKey);
            con.setRequestMethod("PUT");
            
            if (json != null) {
                byte[] sendBytes = json.getBytes("UTF-8");
                con.setFixedLengthStreamingMode(sendBytes.length);

                OutputStream outputStream = con.getOutputStream();
                outputStream.write(sendBytes);
            }

            int httpResponse = con.getResponseCode();

            if (httpResponse >= HttpURLConnection.HTTP_OK
                    && httpResponse < HttpURLConnection.HTTP_BAD_REQUEST) {
                Scanner scanner = new Scanner(con.getInputStream(), "UTF-8");
                jsonRespone = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                scanner.close();
            } else {
                Scanner scanner = new Scanner(con.getErrorStream(), "UTF-8");
                jsonRespone = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                scanner.close();
            }

        } catch (Throwable t) {
            return t.getMessage();
        }
        return jsonRespone;
    }

    protected String delete(String path) {
        String jsonRespone = "";// Resposta REST
        try {
            URL url = new URL(DEFAULT_BASE_URL + path);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();

            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setRequestProperty("Authorization", "Basic " + apiKey);
            con.setRequestMethod("DELETE");

            int httpResponse = con.getResponseCode();

            if (httpResponse >= HttpURLConnection.HTTP_OK
                    && httpResponse < HttpURLConnection.HTTP_BAD_REQUEST) {
                Scanner scanner = new Scanner(con.getInputStream(), "UTF-8");
                jsonRespone = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                scanner.close();
            } else {
                Scanner scanner = new Scanner(con.getErrorStream(), "UTF-8");
                jsonRespone = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                scanner.close();
            }

        } catch (Throwable t) {
            return t.getMessage();
        }
        return jsonRespone;
    }
    
    
    protected boolean download(String path, String folder) {
        String jsonRespone = "";// Resposta REST
        try {
            URL url = new URL(path);
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            con.setRequestMethod("GET");
            int httpResponse = con.getResponseCode();
            if (httpResponse >= HttpURLConnection.HTTP_OK) {
                // opens input stream from the HTTP connection
                InputStream inputStream = con.getInputStream();                
                // opens an output stream to save into file
                FileOutputStream outputStream = new FileOutputStream(folder);
                int bytesRead = -1;
                byte[] buffer = new byte[BUFFER_SIZE];
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }                
                outputStream.close();
                inputStream.close();
                System.out.println("Download completed!");
                return true;
            } else {
                Scanner scanner = new Scanner(con.getErrorStream(), "UTF-8");
                jsonRespone = scanner.useDelimiter("\\A").hasNext() ? scanner.next() : "";
                scanner.close();
                System.err.println(jsonRespone);
                return false;
            }
        } catch (Exception t) {
            System.err.println(t.getMessage());
        }
        return false;
    }
}
