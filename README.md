# Student Management System

This project is a simple Student Management System built using Spring Boot and Hibernate. It provides RESTful APIs to perform CRUD operations on a `Student` entity.

## Features

- **Create a Student**: Add a new student to the system.
- **Read a Student**: Retrieve a single student's information using their ID.
- **Read All Students**: Retrieve a list of all students.
- **Update a Student**: Update an existing student's information.
- **Delete a Student**: Remove a student from the system using their ID.

## Technologies Used

- **Java 17**
- **Spring Boot**
- **Hibernate**
- **RESTful APIs**
- **Jackson for JSON processing**

## API Endpoints

### Add a Student

- **URL**: `/students`
- **Method**: `POST`
- **Request Body**: JSON representation of a `Student` object.
- **Response**: A success message indicating that the student has been saved.

```json
  {
    "id": 1,
    "name": "John Doe",
    "email": "john.doe@example.com",
    "course": "Computer Science"
  }
```

### Get a Student by ID
- **URL**: `/students/{studentId}`
- **Method**: `GET`
- **Path Variable**: `studentId` - The ID of the student to retrieve.
- **Response**: JSON representation of the `Student` object.

### Get All Students
- **URL**: `/students`
- **Method**: `GET`
- **Response**: JSON array of all `Student` objects.

### Update a Student
- **URL**: `/students`
- **Method**: `PUT`
- **Request Body**: JSON representation of the updated `Student` object.
- **Response**: A success message indicating that the student has been updated.

### Delete a Student by ID
- **URL**: `/students/{studentId}`
- **Method**: `DELETE`
- **Path Variable**: `studentId` - The ID of the student to delete.
- **Response**: A success message indicating that the student has been deleted.

## Setup and Running the Application
- Java 8 or higher
- Maven
- A database (e.g., MySQL, PostgreSQL)

### Steps

#### Clone the Repository:

```bash
  git clone [https://github.com/AnushkaHere/HibernateStudentCrud]
```
```bash
  cd HibernateStudentCrud
```

#### Configure the Database:

Update the application.properties file with your database configuration.

```bash
  spring.datasource.url=jdbc:mysql://localhost:3306/student_db
  spring.datasource.username=root
  spring.datasource.password=root
  spring.jpa.hibernate.ddl-auto=update
```

#### Build the Application:

```bash
  mvn clean install
```

#### Run the Application:

```bash
  mvn spring-boot:run
```

#### Access the APIs:
Use tools like Postman or Curl to interact with the provided endpoints.
