# University Management System (UMS)

The University Management System (UMS) is a Spring Boot application that provides management functionalities for students and events in a university.

## Features

- Manage students: add, update, delete, and retrieve student information.
- Manage events: add, update, delete, and retrieve event information.
- RESTful APIs: Exposes APIs for interacting with the application using HTTP methods (GET, POST, PUT, DELETE).
- Spring Data JPA: Persists data in a relational database using JPA.
- MVC Architecture: Follows the Model-View-Controller architectural pattern.
- Exception Handling: Handles and provides appropriate responses for exceptions.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL (or any other supported relational database)
- RESTful APIs

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 11 or higher
- MySQL or another supported relational database
- Your preferred IDE (e.g., IntelliJ, Eclipse)

### Installation

1. Clone the repository:

git clone https://github.com/your-username/university-management-system.git



2. Import the project into your IDE.

3. Configure the database connection in the `application.properties` file:

spring.datasource.url=jdbc:mysql://localhost:3306/ums_db
spring.datasource.username=db_username
spring.datasource.password=db_password



4. Run the application:

mvn spring-boot:run



5. The application will start running on `http://localhost:8080`.

## API Endpoints

### Student API

- `GET /api/v1/UMS-Student/find-all-students`: Retrieve all students.
- `POST /api/v1/UMS-Student/add-student`: Add a new student.
- `DELETE /api/v1/UMS-Student/Delete-Student/id/{id}`: Delete a student by ID.
- `PUT /api/v1/UMS-Student/update-student/id/{id}`: Update a student by ID.
- `GET /api/v1/UMS-Student/find-student/id/{id}`: Retrieve a student by ID.

### Event API

- `GET /api/v1/UMS-Event/find-all-events`: Retrieve all events.
- `POST /api/v1/UMS-Event/add-Event`: Add a new event.
- `DELETE /api/v1/UMS-Event/Delete-Event/id/{id}`: Delete an event by ID.
- `PUT /api/v1/UMS-Event/update-event/id/{id}`: Update an event by ID.
- `GET /api/v1/UMS-Event/findById/id/{id}`: Retrieve an event by ID.

## Contribution

Contributions to the University Management System project are welcome! If you find any issues or have suggestions for improvements, please open an issue or submit a pull request.
