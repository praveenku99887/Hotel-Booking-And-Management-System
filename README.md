# Hotel-Booking-And-Management-System

![image alt](https://github.com/praveenku99887/Hotel-Booking-And-Management-System/blob/52db6612fa93aa8f2604024d1420910d5b6bbb62/homePage.png)

## 📌 Overview

This is the full-stack application for **Hotel-Booking-And-Management-System** and a **Spring Boot backend** for user authentication, room management, and booking functionalities. The backend includes secure authentication, user management, room availability tracking, and booking processing, while the frontend provides an intuitive UI for users to interact with the system.

## 🚀 Technologies Used

### **Backend:**
- **Java Spring Boot** (Backend Framework)
- **MySQL** (Database)
- **JWT** (Authentication)
- **AWS S3** (For Image Uploads)
- **Postman** (API Testing)
- **Maven** (Dependency Management)
- **Spring Security** (Authentication & Authorization)
- **Hibernate** (ORM Framework)
- **Lombok** (Boilerplate Code Reduction)
- **Swagger** (API Documentation)

### **Frontend:**
- **React.js** (Frontend Library)
- **Redux Toolkit** (State Management)
- **Axios** (API Requests)
- **Tailwind CSS** (Styling)
- **React Router** (Routing)
- **JWT Decode** (Authentication Handling)
- **Material UI / Shadcn UI** (UI Components)

## 🔧 Setup Instructions

### **1️⃣ Clone the Repository**

```sh
git clone https://github.com/praveenku99887/Hotel-Booking-And-Management-System.git
cd Hotel-Booking-And-Management-System
```

### **2️⃣ Backend Setup**

```sh
cd Backend
```

#### **Configure Database**
- Update `src/main/resources/application.properties` with MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/hotel_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect
```

#### **Install Dependencies & Build**
```sh
mvn clean install
```

#### **Run the Application**
```sh
mvn spring-boot:run
```

### **3️⃣ Frontend Setup**

```sh
cd ../frontend
```

#### **Install Dependencies**
```sh
npm install
```

#### **Run the React Application**
```sh
npm start
```

## 🔑 Authentication

### **Register User**

- **Endpoint:** `POST /auth/register`
- **Request:**

```json
{
  "name": "John Doe",
  "email": "john.doe@example.com",
  "password": "password123"
}
```

### **Login**

- **Endpoint:** `POST /auth/login`
- **Response:** Returns JWT token

```json
{
  "token": "your-jwt-token"
}
```

- Use this token in the **Authorization** header for protected routes:
  ```sh
  Authorization: Bearer your-jwt-token
  ```

## 🏨 Room Management

### **Add a Room**

- **Endpoint:** `POST /rooms/add`
- **Form-Data:**
  - `photo` (File Upload)
  - `roomType` (Standard, Deluxe, etc.)
  - `roomPrice` (e.g., 4000)
  - `roomDescription`

### **Get All Rooms**

- **Endpoint:** `GET /rooms/all`

### **Manage Rooms in Frontend**
- **Users can view available rooms, filter by type, and book rooms using the React UI.**

## 📅 Booking Management

### **Book a Room**

- **Endpoint:** `POST /bookings/book`
- **Request:**
  ```json
  {
    "userId": 1,
    "roomId": 5,
    "checkInDate": "2024-06-01",
    "checkOutDate": "2024-06-05"
  }
  ```

### **Manage Bookings in Frontend**
- **Users can view booking history, cancel bookings, and see booking confirmations from the UI.**

## 🖥️ Frontend UI Features

- **🏠 Home Page** - Browse and book available rooms easily.
  ![image alt](https://github.com/praveenku99887/Hotel-Booking-And-Management-System/blob/52db6612fa93aa8f2604024d1420910d5b6bbb62/homePage.png)
  
- **🛏️ Rooms Page** - View room details, pricing, and availability.
  ![image alt](https://github.com/praveenku99887/Hotel-Booking-And-Management-System/blob/278eb714f5d54d500ee5c2d9872c20a7dd77433f/allRoom.png)
  
- **🔍 Find My Booking** - Look up existing bookings.
  ![image alt](https://github.com/praveenku99887/Hotel-Booking-And-Management-System/blob/278eb714f5d54d500ee5c2d9872c20a7dd77433f/findBooking.png)
  
- **🔑 Login & Signup** - Secure user authentication and registration.
 ![image alt](https://github.com/praveenku99887/Hotel-Booking-And-Management-System/blob/278eb714f5d54d500ee5c2d9872c20a7dd77433f/login.png)
![image alt](https://github.com/praveenku99887/Hotel-Booking-And-Management-System/blob/278eb714f5d54d500ee5c2d9872c20a7dd77433f/registration.png)

- **🕐 Check-in & Check-out** - Manage check-in and check-out processes.
- **🛎️ Services Page** - View hotel services and amenities.
   ![image alt](https://github.com/praveenku99887/Hotel-Booking-And-Management-System/blob/278eb714f5d54d500ee5c2d9872c20a7dd77433f/services.png)
  
- **🏨 Room Types** - Filter and explore different types of rooms.
- **👨‍💼 Admin Panel** - Admin dashboard for managing users, rooms, and bookings.
- **🛠 Manage Room** - Add, update, or delete room details.
- **📋 Manage Booking** - Oversee and handle all reservations.
  ![image alt](https://github.com/praveenku99887/Hotel-Booking-And-Management-System/blob/278eb714f5d54d500ee5c2d9872c20a7dd77433f/adminPage.png)
  
## 🔐 Security

- Uses **JWT Authentication** for protected routes.
- API requests must include a `Bearer Token` in headers.
- Spring Security ensures proper role-based access control (RBAC).

## 📜 API Documentation

- Swagger UI is available at:
  ```sh
  http://localhost:8080/swagger-ui.html
  ```

## 📬 API Testing in Postman

You can import the **Postman Collection** and test API endpoints.

## 📜 License

This project is licensed under **MIT License**.

---

🎉 **Happy Coding!** 🚀

