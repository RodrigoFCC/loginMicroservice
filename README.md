
# Login Microservice

This is a Spring Boot microservice that allows you to create and find users in a PostgreSQL database. It has two endpoints:

- POST /User: This endpoint creates a new user in the database by receiving a JSON object with the user’s name, email and password. It validates the input and returns a success or error message.
- GET /User: This endpoint finds all the users in the database and returns them as a JSON array.
## Technologies

- [Spring Boot](https://spring.io/projects/spring-boot)
- [PostgreSQL](https://www.postgresql.org/docs/15/tutorial-start.html)

#### Spring Boot
This is a framework that simplifies the development of Java web applications by providing features such as dependency injection, web MVC, security, data access and more.
#### PostgreSQL
 This is a relational database system that stores and manages the user data.
