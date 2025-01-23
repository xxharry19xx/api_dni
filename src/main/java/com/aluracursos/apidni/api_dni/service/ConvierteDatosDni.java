package com.aluracursos.apidni.api_dni.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvierteDatosDni implements IConvierteDatosDni{
    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public <T> T ontenerDatosDni(String json, Class<T> clase) {
        try {
            return objectMapper.readValue(json,clase);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
