package com.shakkib.crypto.utils;

import com.shakkib.crypto.CryptoConstant.CryptoConstant;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

import java.util.Collections;

public class HttpUtils {

    public static HttpEntity<String> getHttpEntity() {
        System.out.println("apiHost: " + CryptoConstant.apiHost);
        System.out.println("apiKey: " + CryptoConstant.apiKey);
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("X-RapidAPI-Host", CryptoConstant.apiHost);
        headers.set("X-RapidAPI-Key", CryptoConstant.apiKey);
        return new HttpEntity<>(null, headers);
    }
}
