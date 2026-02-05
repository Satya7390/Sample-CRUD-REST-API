# Sample CRUD REST API (Spring Boot)

This project is a simple Spring Boot REST API that implements basic CRUD operations using in-memory data storage.
No database, JPA, or repository layer is used. Data is managed using a Java ArrayList.

The application is deployed on Render and can be accessed online.

---

## Live Application URL

https://sample-crud-rest-api.onrender.com/

(Note: On Render free tier, the first request may take some time if the service is idle.)

---

## Features

- Add an item
- Get item by ID
- Get all items
- Update item details
- Delete item by ID
- In-memory storage (data resets on restart)

---

## Technology Stack

- Java
- Spring Boot
- Maven
- REST API

---

## Project Structure

src/main/java  
├── com  
│ └── ItemApiApplication.java  
├── com.controller  
│ └── ItemController.java  
├── com.entity  
│ └── Item.java  
└── com.service  
 └── ItemService.java

---

## API Endpoints

Add Item  
POST /additem  
Request Body:
{
"id": 102,
"name": "Laptop",
"price": 55000,
"description": "Gaming Laptop"
}

Find Item by ID  
GET /findbyid?id=101

Find All Items  
GET /findall

# Ex : https://sample-crud-rest-api.onrender.com/findall (This will help to see all items)

Update Item  
PUT /update?id=102  
Request Body:
{
"id": 102,
"name": "Updated Item",
"price": 18000,
"description": "Gaming Laptop"
}

Delete Item  
DELETE /deletebyid?id=101

---

## How to Run Locally

1. Clone the repository
2. Open the project in any IDE
3. Run the Spring Boot application
4. Server will start on:
   http://localhost:8080

---

## Important Notes

- No database is used
- Data is stored in memory using ArrayList
- Data will be lost when the application restarts
- Designed for learning and demonstration purposes

---

## Author

Satyanand Gupta
