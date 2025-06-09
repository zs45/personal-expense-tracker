# 💰 Personal Expense Tracker API

A backend REST API built with **Java + Spring Boot + MySQL** that allows users to track, filter, and categorize their personal expenses. This project is designed for learning and can be extended into a full-stack application.

---

## 🛠️ Tech Stack

- **Java 17**
- **Spring Boot 3**
- **Spring Web**
- **Spring Data JPA**
- **MySQL**
- **Lombok** (optional)
- **Swagger UI** for API docs (optional)

---

## 📦 Features

- ✅ Add new expenses
- ✅ View all expenses
- ✅ Filter expenses by category or date range
- ✅ Delete expenses
- ✅ Backend-layered architecture using Service, Controller, Repository patterns
- 🔜 Future enhancements:
  - Authentication (JWT)
  - Monthly summaries
  - Export reports (CSV/PDF)
  - Frontend client (React, Angular, etc.)

---

## 📁 Project Structure

src/main/java/com/zachschrock/expensetracker/
├── controller # REST controllers (API endpoints)
├── service # Business logic
├── model # Entity classes
├── repository # JPA interfaces
└── ExpenseTrackerApplication.java # Main Spring Boot entry point


---

## 🧪 Example JSON for POST

```json
{
  "title": "Groceries",
  "amount": 85.50,
  "date": "2024-05-15",
  "category": "Food"
}
```

| Method | URL                  | Description          |
| ------ | -------------------- | -------------------- |
| POST   | `/api/expenses`      | Create a new expense |
| GET    | `/api/expenses`      | Get all expenses     |
| DELETE | `/api/expenses/{id}` | Delete an expense    |


🚀 Getting Started
🧱 Prerequisites
Java 17+

Maven

MySQL running locally

🔧 Configuration
Edit src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

Then, create the database in MySQL:

```
CREATE DATABASE expense_tracker;
```

▶️ Run the App
In terminal:

./mvnw spring-boot:run


📜 License
MIT — feel free to use, modify, and build on top of this project.

🙌 Acknowledgments
This project was built to practice backend development using Java and Spring Boot while transitioning from .NET technologies.

