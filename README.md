# Message Producer

Este proyecto es un microservicio de producción de mensajes que forma parte de un sistema de mensajería basado en RabbitMQ. El servicio está diseñado para enviar mensajes a una cola específica para ser consumidos por otros servicios.

## Requisitos previos

- Docker y Docker Compose instalados en tu máquina.
- RabbitMQ ejecutándose en un contenedor Docker o en otro servidor accesible.
- Java 17 instalado (si necesitas ejecutar el servicio localmente fuera de un contenedor).

## Configuración

El servicio está configurado para ejecutarse en el puerto `8080`. La configuración de RabbitMQ se define en el archivo `application.yml`.

### Archivo `application.yml`

```yaml
server:
  port: 8080
spring:
  rabbitmq:
    host: localhost
    port: 5672
    username: guest
    password: guest
