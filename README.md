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

## Leveraging OpenAPI for Code Generation

This template harnesses the OpenAPI Generator to automatically generate models and controllers based on the openapi.yaml specification. This approach not only accelerates the development process but also ensures consistency between your API documentation and the codebase.

### Modifying the openapi.yaml Specification

#### Adapting the OpenAPI Specification

To adapt the API to your needs, follow these steps:

1️⃣ **Locate the File**: Find the `openapi.yaml` located at `src/main/resources/static` within your project structure.

2️⃣ **Edit the Specification**: 
- **Manual Editing**: Open `openapi.yaml` in your preferred text editor or IDE. Modify the specification to define your API's paths, operations (GET, POST, etc.), parameters, and models according to the OpenAPI Specification (OAS). For comprehensive guidance on the OAS, visit the [OpenAPI Specification Documentation](https://swagger.io/specification/).
- **Using Apicurio Studio**: Alternatively, for a more visual and user-friendly editing experience, use [Apicurio Studio](https://studio.apicur.io/). It offers an intuitive interface for creating and updating your API specification. Simply import your `openapi.yaml` file into Apicurio Studio, make your changes, and export the updated file.

3️⃣ **Save Your Changes**: 
- **Manual Save**: After editing the file in your text editor or IDE, save your changes.
- **Apicurio Studio**: If using Apicurio Studio, after you finish your edits, export the updated `openapi.yaml` and save it back to `src/main/resources/static`.

These modifications will serve as the blueprint for generating code. Using Apicurio Studio can simplify this process by providing an interactive GUI that makes editing, validating, and exporting your OpenAPI specification straightforward and efficient.

### Generating Controllers and Models

This project utilizes the OpenAPI Generator Maven Plugin to automate the creation of models and controllers based on your `openapi.yaml`. Here's how the generation process works:

#### Building the Project

⚠️ **Warning**: During the build, the OpenAPI Generator Maven Plugin reads your modified `openapi.yaml` and automatically generates models and controllers, overwriting any existing files in the specified package locations. 

If there are certain files you have manually edited and do not want to be overwritten, add their paths to the `.openapi-generator-ignore` file. This file acts as a safeguard, preventing the listed files from being regenerated and potentially losing your custom changes.

- **Generate Code**: To generate code, simply build your project. If you're using Maven, run the following command from the root of your project:
   ```sh
   mvn clean install

#### Viewing the Generated Code

- **Explore Generated Code**: After the build, navigate to the `fr.dlesaout.springbootstartertemplate.controller` and `fr.dlesaout.springbootstartertemplate.model` packages in your project. You'll find the Java classes for models and controllers generated according to your `openapi.yaml` specifications.

#### Continuous Integration

Leveraging the OpenAPI Generator in this manner not only accelerates development but also promotes a design-first approach to API development. It ensures that your API documentation is always the single source of truth for what your API does and how it behaves.




## Contributing
Contributions are welcome! Please feel free to submit a pull request or open an issue for any improvements or suggestions.

Thank you for considering the Spring Boot Starter Template for your next project!
