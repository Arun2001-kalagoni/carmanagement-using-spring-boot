The Car Management System is a CRUD-based (Create, Read, Update, Delete) web application developed using Spring Boot, Java, Postman, and MySQL. This system allows users to efficiently manage car records, including adding, updating, retrieving, and deleting car details.

🛠️ Technologies Used
Spring Boot – Backend framework for building RESTful APIs.

Java – Core programming language.

Postman – API testing and interaction.

MySQL – Database for storing car details.

Spring Data JPA – Simplifies database interactions.

Spring Boot REST API – Exposes endpoints for CRUD operations.

🚀 Features

1.Add new cars with details like model, brand, year, price, etc.

2.Retrieve car details using unique identifiers.

3. Update existing car information as needed.

4. Delete car records from the system.

5. RESTful API endpoints for seamless integration.

6. Exception handling and validation for secure operations.




## 🔄 API Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| **POST** | `/api/saveCar` | Add a new car |
| **GET** | `/api/getCars` | Get all cars |
| **GET** | `/api/getCar/{id}` | Get a car by ID |
| **PUT** | `/api/editCar` | Update car details |
| **DELETE** | `/api/deleteCar` | Delete a car |
