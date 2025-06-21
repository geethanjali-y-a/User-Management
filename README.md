🧑‍💼 User Management REST API

📌 Project Overview

This project is a User Management System built as a RESTful API using Spring Boot, Spring Data JPA, and PostgreSQL. It supports full CRUD operations, search functionality, and input validation. The database is auto-initialized using `schema.sql` and `data.sql` for easier setup.


## ✨ Key Features

- ✅ Create, Read, Update, and Delete users
- 🔍 Search users by name or email
- 📥 Input validation using Java Bean Validation (JSR-380)
- 🛢️ Database auto-initialization with `schema.sql` and `data.sql`
- 📦 RESTful API with proper HTTP status codes and JSON responses

---

🛠️ Tech Stack

| Layer       | Technology            |
|-------------|------------------------|
| Language    | Java 17+               |
| Framework   | Spring Boot            |
| Persistence | Spring Data JPA        |
| Database    | PostgreSQL             |
| Build Tool  | Maven                  |
| Validation  | Jakarta Bean Validation (JSR 380) |
| Testing     | JUnit & Postman        |


📁 Folder Structure

user-management-api/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/usermanagement/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── repository/
│   │   │       ├── service/
│   │   │       └── UserManagementApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── schema.sql
│   │       └── data.sql
│   └── test/
├── pom.xml
└── README.md

````

 🔧 API Endpoints

| Method | Endpoint           | Description               |
|--------|--------------------|---------------------------|
| GET    | `/users`           | Get all users             |
| GET    | `/users/{id}`      | Get user by ID            |
| POST   | `/users`           | Create a new user         |
| PUT    | `/users/{id}`      | Update existing user      |
| DELETE | `/users/{id}`      | Delete a user             |
| GET    | `/users/search`    | Search users by name/email|

---

 🧪 Sample Request (POST /users)

```json
{
  "name": "John Doe",
  "email": "john@example.com",
  "status": "ACTIVE"
}
````

---

 🗂️ Database Initialization

* `schema.sql`: Defines the table structure
* `data.sql`: Inserts sample data on startup

---

 🚀 Getting Started

 ✅ Prerequisites

* Java 17+
* Maven
* PostgreSQL installed and running

 🔧 Configuration (application.properties)

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/user_management
spring.datasource.username=your_db_username
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=none
spring.sql.init.mode=always
```

 💻 Run the Application

```bash
mvn spring-boot:run
```

API available at:

```
http://localhost:8080/users
```

---

📈 Future Enhancements

* Pagination and sorting
* JWT-based authentication
* Swagger/OpenAPI documentation
* Role-based access control (RBAC)

---

📃 License

This project is licensed under the MIT License – free for personal and educational use.

Let me know if you'd like help creating:
- `schema.sql` and `data.sql`
- Sample test cases
- Postman collection for API testing

Happy to assist!
```
