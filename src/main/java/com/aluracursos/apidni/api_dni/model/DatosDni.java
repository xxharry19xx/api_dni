package com.aluracursos.apidni.api_dni.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosDni(
        String nombreCompleto,
        String nombres,
        String apellidoPaterno,
        String apellidoMaterno,
        Integer digitoVerificador
) {
}
