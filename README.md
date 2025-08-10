# Student Management API

A simple **Spring Boot** REST API for managing students.  
Includes **CRUD operations**, **H2 in-memory database**, and **Swagger API documentation**.

---

## 🚀 Features
- Create, Read, Update, and Delete students.
- RESTful endpoints using **Spring Boot**.
- In-memory database (**H2**) for easy testing.
- Swagger UI for API documentation.
- Spring Data JPA for database interaction.

---

## 📂 Project Structure
src/main/java/com/shubham/SMA
│
├── controller # REST controllers
├── model # Entity classes
├── repository # Spring Data JPA repositories
└── service # Business logic services

---

## ⚙️ Technologies Used
- Java 17+
- Spring Boot 3+
- Spring Data JPA
- H2 Database
- Swagger (springdoc-openapi)

---

## 📦 Dependencies
Key dependencies in `pom.xml`:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-web</artifactId>
</dependency>

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>

<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.1.0</version>
</dependency>
🛠 Installation & Run
Clone the repo

bash
Copy
Edit
git clone https://github.com/yourusername/student-management-api.git
cd student-management-api
Build & run

bash
Copy
Edit
mvn spring-boot:run
Access the application

API Base URL: http://localhost:8080

Swagger UI: http://localhost:8080/swagger-ui.html

H2 Console: http://localhost:8080/h2-console
(JDBC URL: jdbc:h2:mem:testdb, username: sa, no password)

If you want to configure your DB then uncomment properties from "application.properties" for MySql and also uncomment MySql 
dependancy in "pom.xml". Then comment properties for H2 DB and start application.  

📌 API Endpoints
Method	Endpoint	Description

GET	/api/students	Get all students

GET	/api/students/{id}	Get student by ID

POST	/api/addStudent	Add new student

PUT	/api/updateStudent	Update student

DELETE	/api/deleteStudent/{id}	Delete student
