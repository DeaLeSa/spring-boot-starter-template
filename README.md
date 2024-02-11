# 🚀 Spring Boot Starter Template
Welcome to the Spring Boot Starter Template! This repository is designed to offer a quick and easy starting point for building Spring Boot applications. Whether you're new to Spring Boot or looking for a solid foundation for your next project, this template has got you covered.

## Features

- **Spring Boot 3.2.2**: Leverage the latest Spring Boot version for rapid application development.
- **Java 17 Support**: Utilize the modern capabilities of Java 17 for efficient programming.
- **Database Connectivity**: Integrated support for PostgreSQL with Spring Data JPA for robust database operations.
- **RESTful Service Development**: With Spring Web, developing RESTful services is straightforward and efficient.
- **Development Efficiency**: Spring Boot Devtools for a smoother development experience with automatic restarts and live reloading.
- **Code Reduction**: Lombok integration to minimize boilerplate code.
- **Testing Framework**: Comprehensive testing support with Spring Boot Starter Test.
- **OpenAPI-Driven**: Utilize OpenAPI for automatic generation of models and controllers, streamlining the API development process.

## Getting Started

1. Clone the repository:
   ```sh
   git clone https://github.com/DeaLeSa/spring-boot-starter-template.git

2. Set up the database configuration:
   ```properties
   spring.datasource.url=jdbc:postgresql://localhost:5432/petstore
   spring.datasource.username=your_username
   spring.datasource.password=your_password

Replace your_username and your_password with the credentials of your PostgreSQL user. It's important to note that while this project assumes a database named petstore, you must create this database if it does not already exist in your PostgreSQL instance.

:information_source: Automatic Table Creation
This project is configured to automatically create the necessary tables in your database. The property `spring.jpa.hibernate.ddl-auto=update` in the application.properties file takes care of this. It will update the schema to reflect the entities' states in your project without the need to manually create any table.

## Leveraging OpenAPI for Code Generation

This template harnesses the OpenAPI Generator to automatically generate models and controllers based on the openapi.yaml specification. This approach not only accelerates the development process but also ensures consistency between your API documentation and the codebase.

### Modifying the openapi.yaml Specification

➡️ Adapting the OpenAPI Specification

To adapt the API to your needs, follow these steps:

1. **Locate the File**: Find the `openapi.yaml` located at `src/main/resources/static` within your project structure.

2. **Edit the Specification**: 
- **Manual Editing**: Open `openapi.yaml` in your preferred text editor or IDE. Modify the specification to define your API's paths, operations (GET, POST, etc.), parameters, and models according to the OpenAPI Specification (OAS). For comprehensive guidance on the OAS, visit the [OpenAPI Specification Documentation](https://swagger.io/specification/).
- **Using Apicurio Studio**: Alternatively, for a more visual and user-friendly editing experience, use [Apicurio Studio](https://studio.apicur.io/). It offers an intuitive interface for creating and updating your API specification. Simply import your `openapi.yaml` file into Apicurio Studio, make your changes, and export the updated file.

3. **Save Your Changes**: 
- **Manual Save**: After editing the file in your text editor or IDE, save your changes.
- **Apicurio Studio**: If using Apicurio Studio, after you finish your edits, export the updated `openapi.yaml` and save it back to `src/main/resources/static`.

These modifications will serve as the blueprint for generating code. Using Apicurio Studio can simplify this process by providing an interactive GUI that makes editing, validating, and exporting your OpenAPI specification straightforward and efficient.

### Generating Controllers and Models

This project utilizes the OpenAPI Generator Maven Plugin to automate the creation of models and controllers based on your `openapi.yaml`. Here's how the generation process works:

➡️ Building the Project

⚠️ **Warning**: During the build, the OpenAPI Generator Maven Plugin reads your modified `openapi.yaml` and automatically generates models and controllers, overwriting any existing files in the specified package locations. 

If there are certain files you have manually edited and do not want to be overwritten, add their paths to the `.openapi-generator-ignore` file. This file acts as a safeguard, preventing the listed files from being regenerated and potentially losing your custom changes.

- **Generate Code**: To generate code, simply build your project. If you're using Maven, run the following command from the root of your project:
   ```sh
   mvn clean install

➡️ Viewing the Generated Code

- **Explore Generated Code**: After the build, navigate to the `fr.dlesaout.springbootstartertemplate.controller` and `fr.dlesaout.springbootstartertemplate.model` packages in your project. You'll find the Java classes for models and controllers generated according to your `openapi.yaml` specifications.

➡️ Continuous Integration

Leveraging the OpenAPI Generator in this manner not only accelerates development but also promotes a design-first approach to API development. It ensures that your API documentation is always the single source of truth for what your API does and how it behaves.

## Running the project

This project is ready to be launched. To start the application, navigate to the root directory and use the Maven Spring Boot run command `mvn spring-boot:run`.

By default, the application is configured to run on port 8090. After starting the application, you can access the API at:

http://localhost:8090

Make sure that port 8090 is available on your machine or update the application.properties file to specify a different port.

## Contributing 🤝

We're thrilled that you're interested in contributing to the Spring Boot Starter Template! Whether it's big or small, your contributions are valued and welcome.

Here's how you can contribute:

- **Submit Pull Requests**: Have a new feature, a bug fix, or an improvement? Feel free to fork the repository, make your changes, and submit a pull request. Please provide a brief description of your changes and why you think they belong in the project.
- **Report Issues**: Encountered a bug or have a suggestion for how we can improve? Open an issue and tell us about it. Be as detailed as possible to help us understand your feedback or the problem you're facing.
- **Spread the Word**: Enjoying the Spring Boot Starter Template? Share it with others! Blog about your experience, share it on social media, or talk about it in developer forums. Your support helps our project grow.

### Getting Started

Not sure where to start? Look at our open issues for areas where you can contribute. Even updating documentation, fixing typos, or clarifying instructions are significant contributions that help make the project better.

### Questions?

Have any questions or need guidance? Feel free to reach out to the project maintainers or open an issue for discussion. We're here to help and make sure your contributing experience is smooth and enjoyable.

Thank you for being a part of this journey. Your contributions not only help improve the project but also make the tech community a better place. Let's build something amazing together!

