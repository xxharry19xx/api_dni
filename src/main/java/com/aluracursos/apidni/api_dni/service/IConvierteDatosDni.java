package com.aluracursos.apidni.api_dni.service;

public interface IConvierteDatosDni {
    //crearemos datos genericos
    <T> T ontenerDatosDni (String json, Class<T> clase);
}
