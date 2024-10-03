<h1 align="center">Spring Boot CRUD API - Kafka Integration</h1>

<p align="center">
  <img src="https://img.shields.io/badge/SpringBoot-2.5.4-brightgreen" alt="Spring Boot Version" />
  <img src="https://img.shields.io/badge/Kafka-Integrated-blue" alt="Kafka Integration" />
  <img src="https://img.shields.io/badge/PostgreSQL-Database-blue" alt="PostgreSQL Integration" />
</p>

<p align="center">
  <img src="https://skillicons.dev/icons?i=spring,postgres,kafka" alt="Tech Stack Icons" />
</p>

## Overview

This is a **CRUD API** built with **Spring Boot** that integrates **Kafka** for asynchronous messaging and **PostgreSQL** as the primary database. The API allows creating, reading, updating, and deleting records while leveraging Kafka for event-driven communication between services. Kafka is used to ensure reliable, scalable, and real-time message delivery.

## Features

- CRUD Operations with Kafka for asynchronous messaging capabilities
- Integration with **Kafka** for reliable data communication
- RESTful API design with clean architecture
- **Spring Kafka** for message handling and event processing
- Input validation and error handling
- **Swagger UI** for API documentation and testing

## Tech Stack

- **Spring Boot 2.5.4**
- **Kafka** for event-driven architecture
- **Spring Kafka** for Kafka integration
- **PostgreSQL** as the primary database
- **Lombok** for reducing boilerplate code
- **Swagger** for API documentation

## Project Structure

```bash
api-springboot-kafka/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/springboot_kafka/    # Source code and main application
│   ├── resources/
│   │   ├── application.properties       # Configuration for PostgreSQL, Kafka
│   └── test/
│       └── java/                        # Unit tests for services and controllers
└── pom.xml                              # Project dependencies

```
## Setup & Installation

---

-   **Clone the repository**

    ```bash
    git clone https://github.com/mochrks/api-springboot-kafka.git
    cd api-springboot-kafka
    ```

-   **Install dependencies**

    ```bash
    mvn clean install
    ```

-   **Set up Kafka and PostgreSQL**

    -   Ensure **Kafka** and **PostgreSQL** are running locally or provide your connection details in `application.properties`.
    -   Update the following properties in `src/main/resources/application.properties`:

    ```properties
    spring.kafka.bootstrap-servers=localhost:9092
    spring.datasource.url=jdbc:postgresql://localhost:5432/your_database
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```

-   **Run the application**

    ```bash
    mvn spring-boot:run
    ```

-   The application will be running on `http://localhost:8080`.


## Connect with me:
[![GitHub](https://img.shields.io/badge/GitHub-333?style=for-the-badge&logo=github&logoColor=white)](https://github.com/mochrks)
[![YouTube](https://img.shields.io/badge/YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white)](https://youtube.com/@Gdvisuel)
[![Instagram](https://img.shields.io/badge/Instagram-E4405F?style=for-the-badge&logo=instagram&logoColor=white)](https://instagram.com/mochrks)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://linkedin.com/in/mochrks)
[![Behance](https://img.shields.io/badge/Behance-1769FF?style=for-the-badge&logo=behance&logoColor=white)](https://behance.net/mochrks)
[![Dribbble](https://img.shields.io/badge/Dribbble-EA4C89?style=for-the-badge&logo=dribbble&logoColor=white)](https://dribbble.com/mochrks)
