# Spring Boot H2 Database CRUD example: Building Rest API with Spring Data JPA
#REALIZADO POR MANUEL MARTINEZ
 

 
En este proyecto se estara construyendo una aplicacion en Spring Boot Rest con Maven usando Spring Data JPA para interactuar con una base de datos H2 
Cabe destacar que se implemento Arquitectura Hexagonal y DDD para una adecuacion al negocio.
El codigo se trato de hacer bastante limpio, de modo que las clases solo tengan una responsabilidad unica, dandole al proyecto la posibilidad de escalabilidad a futuro.

Technology
Java 8
Spring Boot 2.7 (with Spring Web MVC, Spring Data JPA)
H2 Database
Maven 3.6.1
```
mvn spring-boot:run
```
Run & Test
Run Spring Boot application with command: mvn spring-boot:run.

Brand and Prices table will be automatically generated in Database.

Let’s open H2 console with url: http://localhost:8080/h2-ui:

– For In-memory database:

ENDPOINT URL:
GET
http://localhost:8080/v1/price

ENDPOINT REQUEST:
{
"product_id" : 35455,
"application_date": "2020-07-14T00:00:00",
"brand_id": 1
}
