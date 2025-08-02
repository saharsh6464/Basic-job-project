# 🧰 Spring Boot Job Portal Backend

A simple backend API for a **Job Portal** built using **Spring Boot**, featuring **CRUD operations** and secured with **Basic Authentication** using **Spring Security**.

## ✨ Features

- 🔐 Basic Authentication with Spring Security
- 📄 CRUD operations for job postings
- 📦 RESTful API design
- 🧹 Clean, modular, and easily extendable codebase
- ✅ Uses `@ModelAttribute`-friendly structure for Spring MVC compatibility

## 📦 Tech Stack

- Java 17+
- Spring Boot
- Spring Web
- Spring Security
- Spring Data JPA
- H2 (or other RDBMS)
- Maven

---

## 📁 Project Structure
```
spring_boot_rest/
├── controller/
│ └── JobRestController.java
├── model/
│ └── JobPost.java
├── repository/
│ └── JobRepo.java
├── service/
│ └── JobService.java
├── SpringBootRestApplication.java
└── application.properties
```

---

## 🔐 Basic Auth Credentials

Set in `application.properties`:

```properties
spring.security.user.name=admin
spring.security.user.password=admin123
```

## 🧪 Sample API Endpoints

| Method | Endpoint               | Description                       | Auth Required |
|--------|------------------------|-----------------------------------|----------------|
| GET    | `/jobPosts`            | Get all job posts                 | ✅ Yes |
| GET    | `/jobPosts/{postid}`   | Get a specific job post by ID     | ✅ Yes |
| POST   | `/addPost`             | Add a new job post                | ✅ Yes |
| PUT    | `/addPost`             | Update an existing job post       | ✅ Yes |
| DELETE | `/delete/{id}`         | Delete a job post by ID           | ✅ Yes |
| GET    | `/load`                | Load initial dummy job posts      | ✅ Yes |


## 🔧 Setup & Run

### Prerequisites

- Java 17 or higher
- Maven

### Steps

```bash
git clone https://github.com/saharsh6464/Basic-job-project.git
cd SpringSec
mvn spring-boot:run
## 👨‍💻 Author
```
**Saharsh Patil**  
[🔗 LinkedIn](https://www.linkedin.com/in/saharsh-patil-254981293)
