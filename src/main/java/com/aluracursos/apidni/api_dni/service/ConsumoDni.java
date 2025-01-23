package com.aluracursos.apidni.api_dni.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoDni {
    //consulta para obtener datos de la api
    public String obtenerDatosDni(String url) {
        String token = "apis-token-12786.MC4NQfb15LKVy6y2AvHfuTRWcf9QwVGe";
        //comienzo del httprequest
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .header("Authorization", "Bearer" + token)
                .header("Referer", "https://apis.net.pe/consulta-dni-api")
                .build();
        //fin del httprequest

        //comienzo del httpresponse
        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        //fin del httpresponse
        String json = response.body();
        return json;
    }
}