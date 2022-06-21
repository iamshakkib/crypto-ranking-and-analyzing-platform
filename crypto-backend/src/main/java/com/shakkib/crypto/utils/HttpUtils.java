package com.shakkib.crypto.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Collections;

public class HttpUtils {
    private static String apiHost = "coinranking1.p.rapidapi.com";
    private static String apiKey = "88ccb36550mshd9637b8b7221a61p1863ddjsn0beb5b24d6bf";

    public static HttpEntity<String> getHttpEntity() {
        System.out.println("apiHost: " + apiHost);
        System.out.println("apiKey: " + apiKey);
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("X-RapidAPI-Host", apiHost);
        headers.set("X-RapidAPI-Key", apiKey);
        return new HttpEntity<>(null, headers);
    }
}
