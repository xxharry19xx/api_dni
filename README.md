# Proyecto Java: Consulta de DNI con API REST y Spring

Este proyecto es una aplicación desarrollada en **Java 17** que permite consultar información del DNI utilizando la API de **Reniec** (Registro Nacional de Identificación y Estado Civil). La aplicación aprovecha la potencia de **Spring Boot** para garantizar modularidad, escalabilidad y eficiencia, integrando una API REST para gestionar las solicitudes de manera segura y efectiva.

---

## 🚀 Funcionalidades principales

- Consulta de información de DNI a través de la API REST de Reniec.
- Autenticación mediante Bearer Token para asegurar las solicitudes.
- Manejo y procesamiento eficiente de datos JSON utilizando Jackson.
- Arquitectura escalable y mantenible gracias a Spring Boot.

---

## 💡 Tecnologías utilizadas

- **Java 17**: Lenguaje base para el desarrollo.
- **Spring Boot**: Framework para crear y gestionar la aplicación de forma modular y eficiente.
- **Jackson**: Librería para procesar y mapear datos JSON.
- **API REST de Reniec**: Para obtener información directa y actualizada del DNI.
- **Autenticación Bearer Token**: Garantiza la seguridad en la comunicación con la API.

---

## 🛠️ Requisitos

- Java 17 o superior instalado en tu máquina.
- Maven para gestionar dependencias.
- Credenciales válidas para la API de Reniec (Bearer Token).
- Configuración del archivo `application.properties` con las claves necesarias:

```properties
api.reniec.base-url=https://api.reniec.gob.pe
api.reniec.token=YOUR_BEARER_TOKEN
