# About

- This is a Quiz Application developed using Java and Spring Boot.
- The application provides a platform to create, retrieve, and delete quiz questions from Redis .
# Technologies Used
- Java 21
- Spring Boot 3.2.5
- Maven
- PostgreSQL 
- Redis
# Dependencies used:
 - Spring web
 - JDBC API
 - Spring cache
 - Spring Data Redis
 - Spring Data API
 - PostgresSQL Driver
# Project Structure
  - The project is structured into three main packages:  
1. Model: Contains the Question entity class which maps to the question table in the database. Each question has an id, title, four options, a correct answer, a difficulty level, and a category.  
2. Controller: Contains the QuizController class which exposes endpoints to interact with the application. The following endpoints are available:  
    - GET /category/{category}: Fetches all questions in a specific category.
    - POST /addQuestion: Adds a new question to the database.
    - DELETE /deleteQuestion/{id}: Deletes a question with a specific id from the database.
3. Service: Contains the QuizService class which handles the business logic of the application. It interacts with the QuestionRepo to perform CRUD operations on the question table.
# Database
The application uses PostgreSQL as the primary database to store the questions. Redis is used as a caching layer to improve the performance of read operations. 
# installation
1. Clone Repository and open project in IDE
2. Set up database
3. set up redis 
4. Run application
# API 
1. Create operation
2. Read  operation
3. Update operation
4. Delete operation

