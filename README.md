Project Title: Tour Management System

Description:
This repository contains a Spring Boot project designed to manage tours through a RESTful API. The system allows users to add new tours, view all available tours, and retrieve tours based on their types. The project leverages Spring Data JPA for data persistence, and it includes a simple H2 database configuration for quick setup.

Key Features:

Add Tour: Submit details for a new tour, including type, location, cost, and duration in days.
View All Tours: Retrieve a list of all available tours stored in the system.
View Tours by Type: Filter tours based on their types for better organization.
Technologies Used:

Spring Boot
Spring Data JPA
H2 Database

Getting Started:

Clone the repository: git clone https://github.com/your-username/tour-management-system.git
Navigate to the project directory: cd tour-management-system
Build and run the project using your preferred IDE or with Maven: mvn spring-boot:run
Access the API endpoints to interact with the tour management system.
API Endpoints:

POST /api/tours: Add a new tour (provide JSON payload with tour details).
GET /api/tours: View all tours in the system.
GET /api/tours/type/{tourType}: View tours based on a specific type.
