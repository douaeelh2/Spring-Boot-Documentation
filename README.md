# Spring-Boot-Documentation

<div style="text-align:center;">
  <img src="https://github.com/douaeelh2/Spring-Boot-Documentation/assets/127549220/a497c756-fa84-40b6-8d50-e4e813fb4015" style="width:100%">
</div> <br /> <br />

This documentation serves as a comprehensive guide to understanding and using Spring Boot effectively, covering everything from getting started to advanced topics and best practices.

# Table of Contents

 1. [Introduction to Spring Boot](#introduction-to-spring-boot)
      - [What is Spring Boot?](#what-is-spring-boot)
      - [Features of Spring Boot](#features-of-spring-boot)
      - [Difference Between Spring and Spring Boot](#difference-between-spring-and-spring-boot)
      - [Spring Boot Architecture](#spring-boot-architecture)
   
 2. [Core Concepts](#core-concepts)
      - [Spring Boot Starters](#spring-boot-starters)
      - [Spring Boot Auto-Configuration](#spring-boot-auto-configuration)
      - [Spring Boot Actuator](#spring-boot-actuator)
      - [Spring Boot CLI](#spring-boot-cli)
      - [Spring Boot Profiles](#spring-boot-profiles)
        
 3. [Get Started With Spring Boot](#get-started-with-spring-boot)
      - [Spring Boot Project Structure](#spring-boot-project-structure)
      - [Creating the First Spring Boot Project](#creating-the-first-spring-boot-project)
   
 4. [Web Development with Spring Boot](#web-development-with-spring-boot)
      - [Introduction to RESTful Web Services](#introduction-to-RESTful-web-services)
      - [Spring MVC Web Annotations](#spring-MVC-web-annotations)
      - [Thymeleaf Templates](#thymeleaf-templates)
      - [Building RESTful APIs](#building-restful-apis)
      - [WebSockets](#websockets)
   
 5. [Spring Data](#spring-data)
      - [What is Spring Data ?](#what-is-spring-data)
      - [Spring Data JPA & Hibernate](#spring-data-jpa-&-hibernate)
      - [Spring Data REST](#spring-data-rest)
      - [Spring Data MongoDB](#spring-data-jdbc-mongoDB)
      - [Spring Data JDBC](#spring-data-jdbc)
      - [Using QueryDSL](#using-querydsl)
      - [Transaction Management](#transaction-management)
        
 8. [Security](#security)
      - [Authentication and Authorization](#authentication-and-authorization)
      - [Securing REST APIs](#securing-rest-apis)
      - [OAuth2 with Spring Boot](#oauth2-with-spring-boot)
      
 9. [Testing](#testing)
      - [Unit Testing with JUnit and Mockito](#unit-testing-with-junit-and-mockito)
      - [Integration Testing](#integration-testing)
      - [Testing Web Applications](#testing-web-applications)
   
 10. [Advanced Topics](#advanced-topics)
      - [Spring Boot DevTools](#spring-boot-devtools)
      - [Actuator Endpoints](#actuator-endpoints)
      - [Spring Boot Testing Utilities](#spring-boot-testing-utilities)
      - [Deployment Strategies](#deployment-strategies)
      - [Monitoring and Metrics](#monitoring-and-metrics)
   
 11. [Integrations](#integrations)
      - [Database Integration](#database-integration)
      - [Messaging with Spring Boot](#messaging-with-spring-boot)
      - [Integrating with External APIs](#integrating-with-external-apis)
      - [Caching](#caching)
      
 12. [Cloud Deployment](#cloud-deployment)
      - [Deploying to Cloud Platforms (AWS, Azure, Google Cloud)](#deploying-to-cloud-platforms-aws-azure-google-cloud)
      - [Containerization with Docker](#containerization-with-docker)
      - [Kubernetes Integration](#kubernetes-integration)
      - [Serverless Deployment](#serverless-deployment)
   
 13. [Best Practices and Tips](#best-practices-and-tips)
      - [Code Organization](#code-organization)
      - [Performance Optimization](#performance-optimization)
      - [Handling Large-Scale Applications](#handling-large-scale-applications)
      - [Troubleshooting](#troubleshooting)
   
 14. [Case Studies and Examples](#case-studies-and-examples)
      - [Building a Blog Application](#building-a-blog-application)
      - [E-commerce Platform with Spring Boot](#e-commerce-platform-with-spring-boot)
      - [Real-time Chat Application](#real-time-chat-application)
      - [Microservices Architecture](#microservices-architecture)
      
 15. [Resources and Further Learning](#resources-and-further-learning)
      - [Official Spring Boot Documentation](#official-spring-boot-documentation)
      - [Online Tutorials and Courses](#online-tutorials-and-courses)
      - [Community Forums and Support](#community-forums-and-support)
      - [Books and References](#books-and-references)




# 1. Introduction to Spring Boot 

  # What is Spring Boot ?
  
  Spring is widely used for creating scalable applications. For web applications Spring provides
  Spring MVC which is a widely used module of spring which is used to create scalable web applications.
  But main disadvantage of spring projects is that configuration is really time-consuming and can be a bit overwhelming for the new developers. Making the application production-ready takes some time if you are new to the spring.
  
  Solution to this is `Spring Boot`. Spring Boot is built on the top of the spring and contains all the features of spring. And is becoming favourite of developer’s these days because of it’s a rapid production-ready environment which enables the developers to directly focus on the logic instead of struggling with the configuration and set up.


# Features of Spring Boot

Spring Boot is built on the top of the conventional spring framework. So, it provides all the features of spring and is yet easier to use than spring.

 - ### It allows to avoid heavy configuration of XML which is present in spring:
    Unlike the Spring MVC Project, in spring boot everything is auto-configured. We just need to use proper configuration for utilizing a particular functionality.
    For example: If we want to use hibernate(ORM) then we can just add @Table annotation above model/entity class(discussed later) and add @Column annotation to map it to 
    table and columns in the database
   
 - ### It provides easy maintenance and creation of REST end points:
    Creating a REST API is very easy in Spring Boot. Just the annotation @RestController and @RequestMapping(/endPoint) over the controller class does the work.
   
 - ### It includes embedded Tomcat-server:
    Unlike Spring MVC project where we have to manually add and install the tomcat server, Spring Boot comes with an embedded Tomcat server, so that the applications can be     hosted on it.

 - ### Deployment is very easy, war and jar file can be easily deployed in the tomcat server:
   war or jar files can be directly deployed on the Tomcat Server and Spring Boot provides the facility to convert our project into war or jar files. Also, the instance of     Tomcat can be run on the cloud as well.
   
 - ### Microservice Based Architecture:
   Microservice, as the name suggests is the name given to a module/service which focuses on a single type of feature, exposing an API(application peripheral interface).
   
   Let us consider an example of a hospital management system.
    - In case of monolithic systems, there will be a single code containing all the features which are very tough to maintain on a huge scale.
    - But in the microservice-based system, each feature can be divided into smaller subsystems like service to handle patient registration, service to handle database management, service to handle billing etc.
    Microservice based system can be easily migrated as only some services need to be altered which also makes debugging and deployment easy. Also, each service can be integrated and can be made in different technologies suited to them.


# Difference Between Spring and Spring Boot

| Spring                                             | Spring Boot                                     |
|----------------------------------------------------|-------------------------------------------------|
| Spring is an open-source lightweight framework widely used to develop enterprise applications. | Spring Boot is built on top of the conventional spring framework, widely used to develop REST APIs. |
| The most important feature of the Spring Framework is dependency injection. | The most important feature of Spring Boot is Autoconfiguration. |
| It helps to create a loosely coupled application. | It helps to create a stand-alone application. |
| To run the Spring application, we need to set the server explicitly. | Spring Boot provides embedded servers such as Tomcat and Jetty etc. |
| To run the Spring application, a deployment descriptor is required. | There is no requirement for a deployment descriptor. |
| To create a Spring application, the developers write lots of code. | It reduces the lines of code. |
| It doesn’t provide support for the in-memory database. | It provides support for the in-memory database such as H2. |
| Developers need to write boilerplate code for smaller tasks. | In Spring Boot, there is reduction in boilerplate code. |
| Developers have to define dependencies manually in the pom.xml file. | pom.xml file internally handles the required dependencies. |

### Example 1 : Configuration for Spring MVC

### Spring Framework : 
  
  ```java
      package com.example.controller;
  
      import org.springframework.stereotype.Controller;
      import org.springframework.web.bind.annotation.RequestMapping;
      import org.springframework.web.bind.annotation.RequestMethod;
      import org.springframework.web.bind.annotation.ResponseBody;
      
      @Controller
      public class HelloController {
      
          @RequestMapping(value = "/hello", method = RequestMethod.GET)
          @ResponseBody
          public String hello() {
              return "Hello, World!";
          }
      }
  
  ```
 - `Xml Configuration`
  
  ```xml
      <!-- applicationContext.xml -->
      <beans xmlns="http://www.springframework.org/schema/beans"
          xmlns:mvc="http://www.springframework.org/schema/mvc"
          xmlns:context="http://www.springframework.org/schema/context"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="
              http://www.springframework.org/schema/beans
              http://www.springframework.org/schema/beans/spring-beans.xsd
              http://www.springframework.org/schema/mvc
              http://www.springframework.org/schema/mvc/spring-mvc.xsd
              http://www.springframework.org/schema/context
              http://www.springframework.org/schema/context/spring-context.xsd">
      
          <context:component-scan base-package="com.example.controller" />
          <mvc:annotation-driven />
      
      </beans>
  ```
 - `Annotation Configuration`
   
  ```java
      package com.example.config;
      
      import org.springframework.context.annotation.ComponentScan;
      import org.springframework.context.annotation.Configuration;
      import org.springframework.web.servlet.config.annotation.EnableWebMvc;
      
      @Configuration
      @EnableWebMvc
      @ComponentScan(basePackages = "com.example.controller")
      public class AppConfig {
      
      }
  ```

### Spring Boot : 
  

  ```java
     package com.example.controller;

      import org.springframework.stereotype.Controller;
      import org.springframework.web.bind.annotation.RequestMapping;
      import org.springframework.web.bind.annotation.RequestMethod;
      import org.springframework.web.bind.annotation.ResponseBody;
      
      @Controller
      public class HelloController {
      
          @RequestMapping(value = "/hello", method = RequestMethod.GET)
          @ResponseBody
          public String hello() {
              return "Hello, World!";
          }
      }
  
  ```

  ```java
    package com.example.springbootdemo;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;
    
    @SpringBootApplication
    public class SpringBootDemoApplication {
    
        public static void main(String[] args) {
            SpringApplication.run(SpringBootDemoApplication.class, args);
        }
    }

  ```

Spring Framework : 
- With standard Spring configuration, you explicitly define your application configuration using annotations like `@Configuration`, `@ComponentScan`, and `@EnableWebMvc`.
- You have to specify the basic Spring MVC configuration using` @EnableWebMvc`.
- You need to scan packages to find Spring components such as controllers using `@ComponentScan`.
- You need to manage your project dependencies, including dependency versions.
  
Spring Boot:
- Spring Boot simplifies configuration by providing smart `default configurations`.
- You don't need to explicitly specify the `Spring MVC` configuration basics or `scan packages` for Spring components like controllers.
- Spring Boot automatically configures these features based on intelligent conventions and included `dependencies`.
  
### Example 2 : Hibernate Configuration

### Spring Framwork : 
  
  ```xml
   <!-- applicationContext.xml -->
    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:context="http://www.springframework.org/schema/context"
        xmlns:tx="http://www.springframework.org/schema/tx"
        xmlns:jpa="http://www.springframework.org/schema/data/jpa"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="
            http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans.xsd
            http://www.springframework.org/schema/context
            http://www.springframework.org/schema/context/spring-context.xsd
            http://www.springframework.org/schema/tx
            http://www.springframework.org/schema/tx/spring-tx.xsd
            http://www.springframework.org/schema/data/jpa
            http://www.springframework.org/schema/data/jpa/spring-jpa.xsd">
    
        <context:component-scan base-package="com.example" />
    
        <bean id="entityManagerFactory"
            class="org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean">
            <property name="dataSource" ref="dataSource" />
            <property name="packagesToScan" value="com.example.model" />
            <property name="jpaVendorAdapter">
                <bean class="org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter" />
            </property>
        </bean>
    
        <bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
            <property name="driverClassName" value="com.mysql.jdbc.Driver" />
            <property name="url" value="jdbc:mysql://localhost:3306/library" />
            <property name="username" value="root" />
            <property name="password" value="password" />
        </bean>
    
        <tx:annotation-driven />
    
        <bean id="transactionManager" class="org.springframework.orm.jpa.JpaTransactionManager">
            <property name="entityManagerFactory" ref="entityManagerFactory" />
        </bean>
    </beans>

  ```

  ### Spring Boot
  
  ```yml
     # application.yml
      spring:
        datasource:
          url: jdbc:mysql://localhost:3306/library
          username: root
          password: password
        jpa:
          hibernate:
            ddl-auto: update
          show-sql: true 
  ```

# Spring Boot Architecture

The architecture of Spring Boot is designed to simplify the development and deployment of Spring applications by providing a set of conventions, defaults, and infrastructure support. Here's an overview of the architecture:

<div style="text-align:center;">
  <img src="https://github.com/douaeelh2/Spring-Boot-Documentation/assets/127549220/b62c6992-c928-4055-bc50-5b251f30c304" style="width:100%">
</div> <br /> <br />


 - ### Auto-Configuration:
Spring Boot's auto-configuration feature automatically configures the Spring application based on the dependencies present in the classpath. It scans the classpath and configures beans and components based on certain conditions and default settings. This eliminates the need for manual configuration, reducing boilerplate code and improving developer productivity.

 - ### Starter Dependencies:
Spring Boot provides a set of starter dependencies, which are pre-packaged dependencies containing all the necessary libraries and configurations for specific functionalities such as web development, data access, security, etc. These starter dependencies allow developers to quickly bootstrap their applications by including only the dependencies they need, without worrying about version compatibility or configuration.

 - ### Embedded Servers:
Spring Boot allows embedding servlet containers like Tomcat, Jetty, or Undertow directly into the application. This means that the application can be run as a standalone executable JAR file without requiring an external application server. Embedded servers simplify deployment and make it easier to build self-contained, portable applications.

 - ### Spring Boot Actuator:
Spring Boot Actuator provides production-ready features to monitor and manage the application. It exposes various endpoints that provide information about the application's health, metrics, environment, etc. Actuator endpoints can be used for monitoring, auditing, and troubleshooting purposes, making it easier to manage applications in production environments.

 - ### Externalized Configuration:
Spring Boot allows externalizing configuration properties from the application code to external configuration files such as YAML or properties files. This allows configuration properties to be easily modified without requiring code changes, making the application more configurable and easier to manage across different environments.

 - ### Spring Boot CLI:
Spring Boot CLI (Command Line Interface) allows developers to quickly prototype and develop Spring Boot applications using a command-line interface. It provides features such as auto-restarting, dependency resolution, and script execution, making it easier to develop and test Spring Boot applications without requiring a full-fledged IDE.

 - ### Production-Ready Features:
Spring Boot provides several production-ready features such as metrics, health checks, and security configurations out-of-the-box. These features help developers build robust, scalable, and secure applications with minimal effort.

Overall, the architecture of Spring Boot is designed to simplify and streamline the development and deployment process of Spring applications, allowing developers to focus more on writing business logic and less on boilerplate code and configuration.



# 2. Core Concepts 
  # Spring Boot Starters
  
- Before Spring Boot was introduced, Spring Developers used to spend a lot of time on Dependency management. `Spring Boot` Starters were introduced to solve this problem so that the developers can spend more time on actual code than Dependencies. Spring Boot Starters are dependency descriptors that can be added under the `<dependencies>` section in `pom.xml`. There are around 50+ Spring Boot Starters for different Spring and related technologies. These starters give all the dependencies under a single name.

- Instead of having to individually specify each dependency needed in your Maven or Gradle configuration file, you can simply include a single starter corresponding to your use case, and Spring Boot will automatically manage the dependencies for you.

- This greatly simplifies the process of setting up and bootstrapping a Spring Boot application, as you don't have to worry about compatible versions or manually configuring dependencies. You can focus on developing your application, leveraging the features provided by Spring Boot starters.

For example, if you want to use Spring Data JPA for database access, you can include `spring-boot-starter-data-jpa` dependency. 

| Starter                               | Description                                                                                                    |
|---------------------------------------|----------------------------------------------------------------------------------------------------------------|
| `spring-boot-starter-web`      | Includes dependencies required for building web applications with Spring MVC.                                         |
| `spring-boot-starter-data-jpa` | Contains dependencies for using Spring Data JPA for data access.                                                      |
| `spring-boot-starter-security` | Provides dependencies for securing Spring applications using Spring Security.                                         |
| `spring-boot-starter-test`     | Includes dependencies for testing Spring Boot applications.                                                           |
| `spring-boot-starter-websocket`       | Includes dependencies for building WebSocket-based applications.                                               |
| `spring-boot-starter-oauth2-client`   | Provides dependencies for OAuth 2.0 client support.                                                            |
| `spring-boot-starter-oauth2-resource-server` | Contains dependencies for OAuth 2.0 resource server support.                                            |
| `spring-boot-starter-thymeleaf`       | Includes dependencies for using Thymeleaf as the template engine in Spring MVC applications.                   |
| `spring-boot-starter-actuator`        | Includes dependencies for monitoring and managing Spring Boot applications.                                    |


  # Spring Boot Auto-Configuration

  Spring annotations are present in the org.springframework.boot.autoconfigure and org.springframework.boot.autoconfigure.condition packages are commonly known as Spring Boot annotations.

In Spring Boot, configuration annotations are special directives that allow configuring various aspects of your application. These annotations facilitate configuration and management of application components, reducing the need for explicit XML configuration.

 - `@SpringBootApplication`
 - `@SpringBootConfiguration`
 - `@EnableAutoConfiguration`
 - `@ComponentScan`

  
-  `@SpringBootApplication` Annotation
This annotation is used to mark the main class of the Spring Boot application. It combines three annotations: `@Configuration`, `@EnableAutoConfiguration`, and `@ComponentScan`. It specifies that the class is a Spring Boot configuration and automatically activates configuration based on project `dependencies`.


![SpringBoot-Annotation](https://github.com/douaeelh2/Spring-Boot-Documentation/assets/127549220/44c7fe8e-9c31-4299-82bc-1242bb2625cf)


   ```java
       import org.springframework.boot.SpringApplication;
       import org.springframework.boot.autoconfigure.SpringBootApplication;
      
      @SpringBootApplication
      public class MyApplication {
      
          public static void main(String[] args) {
              SpringApplication.run(MyApplication.class, args);
          }
      }

  ```

 - `@Configuration:` This annotation indicates that the class is a source of bean definitions for the application context. It is often used in conjunction with @Bean to define beans.
 
  ```java
     import org.springframework.context.annotation.Bean;
     import org.springframework.context.annotation.Configuration;
    
    @Configuration
    public class MyConfiguration {
    
        @Bean
        public Service myService() {
            return new MyServiceImpl();
        }
    }

  ```

- `@ComponentScan:`  annotation is used to specify the base packages to scan for Spring-managed components such as beans, controllers, services, and repositories. When Spring Boot starts up, it automatically detects and registers beans for dependency injection. However, for Spring to find these components, it needs to know where to look. That's where @ComponentScan comes in.

  ```java
    import org.springframework.context.annotation.ComponentScan;
    import org.springframework.context.annotation.Configuration;
    
    @Configuration
    @ComponentScan(basePackages = "com.example")
    public class MyConfiguration {
        // Other configurations here
    }

  ```
  - In this example, Spring will scan the com.example package and discover MyController, MyService, and MyRepository because they are annotated with appropriate stereotype annotations (`@Controller`, `@Service`, `@Repository`).
  - This way, `@ComponentScan` helps Spring to find and register components within your specified packages, making them available for use within your Spring Boot application.
  - If you do not specify a package with `@ComponentScan`, Spring Boot will scan the package of the class that contains the @SpringBootApplication annotation and its sub-packages.
  - By default, when you annotate your main class with `@SpringBootApplication`, it is often located in the root package of your application. Spring Boot automatically scans the package of this main class and its sub-packages for components to register.



- `@EnableAutoConfiguration:` This annotation is a powerful feature of Spring Boot that automatically configures the Spring application based on the jars available on the classpath and other factors such as properties files. It's what enables Spring Boot's magic of "convention over configuration".
  

 ```java
   import org.springframework.boot.SpringApplication;
   import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
   import org.springframework.context.annotation.Configuration;
  
  @Configuration
  @EnableAutoConfiguration
  public class MyConfiguration {
      // Other configurations here
      public static void main(String[] args) {
          SpringApplication.run(MyConfiguration.class, args);
      }
  }

  ```

  # Spring Boot Actuator

  - `Spring Boot Actuator` is a Spring Boot `module` that provides functionality for monitoring and managing Spring Boot applications. It provides ready-to-use RESTful endpoints that can be used to monitor different aspects of the running application, as well as interact with it to obtain information about its status, health, metrics, etc.

![WorkingoftheSpringsActuator](https://github.com/douaeelh2/Spring-Boot-Documentation/assets/127549220/35838162-d993-461c-807a-bd23873633d0)


| Feature           | Endpoint               | Description                                                                                   |
|-------------------|------------------------|-----------------------------------------------------------------------------------------------|
| Health            | `/actuator/health`     | Provides the health status of the application, indicating if it's running correctly or not.  |
| Info              | `/actuator/info`       | Provides general information about the application, such as its version and description.      |
| Metrics           | `/actuator/metrics`    | Provides metrics on different aspects of the application, such as HTTP requests.              |
| Audit             | `/actuator/auditevents`| Provides information on the audit events of the application.                                  |
| HTTP Traces       | `/actuator/httptrace`  | Provides detailed information on incoming HTTP requests.                                      |
| Beans             | `/actuator/beans`      | Provides information about the beans managed by the application.                               |
| Environment       | `/actuator/env`        | Provides information about the application's environment.                                      |

<br /> <br />

# Spring Boot CLI

`Spring Boot CLI` (Command Line Interface) is a powerful tool for quickly creating Spring Boot applications from the command line. It provides a simple and efficient way to start Spring Boot projects without having to manually configure a project from scratch.


| Feature                  | Command                                         | Description                                                                                     |
|--------------------------|-------------------------------------------------|-------------------------------------------------------------------------------------------------|
| Rapid Project Creation   | `spring init --dependencies=<dependencies>`     | Quickly create Spring Boot projects using simple commands. For example, with `spring init`, you can create a new project with necessary dependencies and basic structure by specifying the project name and desired dependencies.|
| Development Ease         | `spring run <MainClassName>.groovy`             | Easily develop and test Spring Boot applications directly from the command line, speeding up the development and debugging process. You can also use commands like `spring run` to launch your application.|
| Groovy Support           | N/A                                             | Spring Boot CLI is primarily based on Groovy, a dynamic programming language for the Java platform. This allows you to write Groovy scripts to configure and customize your Spring Boot applications in a concise and expressive manner.|
| Maven and Gradle Integration | `spring convert`                             | While Spring Boot CLI is a standalone tool, it seamlessly integrates with Maven and Gradle. You can use Maven or Gradle build configuration files to manage dependencies and packaging of your application, while leveraging the rapid creation features of Spring Boot CLI.|
| Simplified Deployment    | `spring jar <output.jar> <MainClassName>.groovy` | Once your application is developed, Spring Boot CLI offers features to create standalone JAR executables, simplifying the deployment and execution of your applications on any Java-compatible platform.|



# 3. Get Started With Spring Boot
  # Spring Boot Project Structure

  ```
   my-spring-boot-project
      │
      ├── src
      │   ├── main
      │   │   ├── java
      │   │   │   └── com
      │   │   │       └── example
      │   │   │           └── myproject
      │   │   │               ├── controller      # Controllers (handling HTTP requests)
      │   │   │               ├── model           # POJOs (Plain Old Java Objects)
      │   │   │               ├── repository      # Data access layer (for interacting with the database)
      │   │   │               ├── service         # Business logic layer
      │   │   │               └── MyProjectApplication.java # Main class, starting point of the application
      │   │   │
      │   │   ├── resources
      │   │   │   ├── static       # Static resources (HTML, CSS, JavaScript)
      │   │   │   ├── templates    # Templates (Thymeleaf, FreeMarker, etc.)
      │   │   │   └── application.properties  # Configuration properties
      │   │   │
      │   │   └── webapp
      │   │       └── WEB-INF      # Web application configuration
      │   │
      │   └── test
      │       └── java
      │           └── com
      │               └── example
      │                   └── myproject
      │                       ├── controller      # Test classes for controllers
      │                       ├── service         # Test classes for services
      │                       └── MyProjectApplicationTests.java  # Integration tests
      │
      ├── mvnw            # Maven wrapper script for Unix-based systems
      ├── mvnw.cmd        # Maven wrapper script for Windows systems
      ├── pom.xml         # Maven Project Object Model file
      └── README.md       # Project documentation

  ```

- `src/main/java:` This folder contains the main Java source code for your application. It typically follows the package structure of your project. Here's the role of each subfolder:

    - `com/example/myproject/controller:` This is where you'll place your controller classes. Controllers handle incoming HTTP requests, process them, and return appropriate responses.
    
    - `com/example/myproject/model:` This folder contains your POJOs (Plain Old Java Objects). These are typically your domain objects or data transfer objects (DTOs) that represent the data structure of your application.
    
    - `com/example/myproject/repository:` This folder holds your data access layer classes. These classes interact with the database or any other data source to perform CRUD (Create, Read, Update, Delete) operations.
    
    - `com/example/myproject/service:` This folder contains your service layer classes. Service classes contain the business logic of your application. They orchestrate interactions between controllers and repositories and implement the application's use cases.
    
    - `com/example/myproject/MyProjectApplication.java:` This is the main class of your Spring Boot application. It contains the main method and is responsible for bootstrapping and starting your application.

- `src/main/resources:` This folder contains non-Java resources used by your application. Here's the role of each subfolder:
  
    - `static:` This folder holds static resources such as HTML, CSS, JavaScript files, images, etc.
    
    - `templates:` This folder is used to store template files if you are using a templating engine like Thymeleaf or FreeMarker.
    
    - `application.properties:` This is the main configuration file for your Spring Boot application. You can configure various properties related to your application here, such as database configuration, server port, logging configuration, etc.
    
 
- `src/main/webapp/WEB-INF:` This folder is used for web application configuration in traditional Servlet-based web applications. In most Spring Boot applications, you may not use this folder directly, as Spring Boot handles web application configuration internally.

- `src/test/java:` This folder contains test source code for your application. It mirrors the structure of the src/main/java folder and includes tests for controllers, services, and other components of your application.

- `mvnw and mvnw.cmd:` These are Maven wrapper scripts. They allow you to build and run your Maven project without needing to install Maven separately on your system. This ensures that everyone working on the project uses the same version of Maven.

- `pom.xml:` This is the Project Object Model (POM) file for your Maven project. It contains project configuration and dependencies. Maven uses this file to build the project, manage dependencies, and perform various other tasks.

- `README.md:` This is typically a Markdown file containing project documentation, instructions for developers, setup guides, etc. It helps onboard new developers to the project and provides important information about the project's structure and usage.


# Creating the First Spring Boot Project

### 1. Access Spring Initializer: 
Go to Spring Initializer in your web browser.The best thing about Spring initializer is user friendly GUI

![spring-initializer](https://github.com/douaeelh2/Spring-Boot-Documentation/assets/127549220/c6d47ed9-3b24-4971-a264-e0bc89240424)

### 1. Let’s Configure Your Project:
- Choose the build tool (Maven or Gradle).
- Select the programming language (Java is recommended).
- Set the project metadata (group, artifact, name, description, package).
- Select packaging (JAR is commonly used).
- Choose your Java version.

### 2. Add Dependencies:

- Add essential dependencies like Spring Web.
- Rest is up to you. Select the one that suits your need.

### 3. Generate and Download: 
- Click “Generate” to create the project structure and download it as a ZIP file.

### 4. Import Project: 
- Extract the ZIP file, open your IDE, and import the project as a Maven or Gradle project.

### 5. Go to Main Class : 
- The main class will look like below

```java

  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  
  @SpringBootApplication
  public class MySpringBootApplication {
  
      public static void main(String[] args) {
          SpringApplication.run(MySpringBootApplication.class, args);
      }
  }
```

- `@SpringBootApplication` annotation tells Spring Boot that this is the entry point for your application.

### 6. Write Your First Controller: 
- Create a simple controller class that handles HTTP requests. Use annotations like @RestController and @RequestMapping to define your endpoints and methods.Your main class will look like this now.

```java

  import org.springframework.boot.SpringApplication;
  import org.springframework.boot.autoconfigure.SpringBootApplication;
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.RestController;
  
  @SpringBootApplication
  @RestController
  public class MySpringBootApplication {
  
      public static void main(String[] args) {
          SpringApplication.run(MySpringBootApplication.class, args);
      }
      @GetMapping("/hello")
      public String sayHello() {
          return "Hello, Spring Boot!";
      }
  }

```

### 7. Run Your Application: 
- Run the main class (typically named Application) in your IDE or use terminal commands (./mvnw spring-boot:run for Maven, ./gradlew bootRun for Gradle).In STS right-click on your project select run as spring boot app.

### 8. Access Your App: 
- Open a web browser and go to http://localhost:8080/hello to see your Spring Boot application in action and you will get “Hello, Spring Boot!”.

  ![SpringBootFirstApp](https://github.com/douaeelh2/Spring-Boot-Documentation/assets/127549220/aec0ff59-7642-4b31-8f5c-dfb2bb43e1e9)



# 4. Web Development with Spring Boot

  # Introduction to RESful Web Services

  - RESTful Web Services REST stands for REpresentational State Transfer. It was developed by Roy Thomas Fielding, one of the principal authors of the web protocol HTTP. Consequently, REST was an architectural approach designed to make the optimum use of HTTP protocol. It uses the concepts and verbs already present in HTTP to develop web services. This made REST incredibly easy to use and consume, so much so that it is the go-to standard for building web services today.

- A resource can be anything, it can be accessed through a URI (Uniform Resource Identifier). Unlike SOAP, REST does not have a standard messaging format. We can build REST web services using many representations, including both XML and JSON, although JSON is the more popular option. An important thing to consider is that REST is not a standard but a style whose purpose is to constrain our architecture to a client-server architecture and is designed to use stateless communication protocols like HTTP.

### Important Methods of HTTP
The main methods of HTTP we build web services for are:

GET: Reads an existing data.
PUT: Updates existing data.
POST: Creates new data.
DELETE: Deletes the data.

### 1. GET
The default request method for HTTP. We don’t have any request body with this method, but we can define multiple request parameters or path variables in the URL. This method is used for getting obtaining some resources. Depending on the presence of an ID parameter, either we can fetch a specific resource or fetch a collection of resources in the absence of the parameter. 

### 2. POST
The POST method of HTTP is used to create a resource. We have a request body in this method and can also define multiple request parameters or path variables in the URL.

### 3. PUT
The PUT method of HTTP is used to update an existing resource. We have a request body in this method and can also define multiple request parameters or path variables in the URL.

### 4. DELETE
The DELETE method of HTTP is used to remove a resource. We don’t have a request body in this method but can define multiple request parameters or path variables in the URL. We can delete multiple or single records, usually based on whether we have an ID parameter or not. We can delete multiple or single records, usually based on whether we have an ID parameter or not.

REST web services use the Status-Line part of an HTTP response message to inform clients of their request’s ultimate result.

### HTTP Standard Status Codes
The status codes defined in HTTP are the following:

- `200`: Success
- `201`: Created
- `401`: Unauthorized
- `404`: Resource Not Found
- `500`: Server Error


  # Spring MVC Web Annotations

   Spring MVC provides annotations to simplify the configuration and implementation of web controllers. These annotations are used to define request mappings, handle request parameters, specify response types, and more. Here are some commonly used Spring MVC web annotations along with examples:

### 1. @Controller: 
- This annotation is simply a specialization of the `@Component` class and allows implementation classes to be autodetected through the classpath scanning.
- It is used in Spring MVC to mark a class as a controller component. It acts as a request handler and handles incoming HTTP requests, performing the necessary processing and returning a response.

Controllers in Spring MVC are responsible for processing user requests, interacting with business logic or services, and returning a view or response to the client.

  ```java
     import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.RequestMapping;
    
    @Controller
    public class MyController {
        @RequestMapping("/hello")
        public String hello() {
            return "helloPage";
        }
    }
  
  ```




### 3. @RequestMapping:
This annotation is used to map web requests to specific handler methods. It can be applied at the class level and/or method level. You can specify request paths, HTTP methods, request parameters, headers, etc.

   - `Class level:`  When you use the `@RequestMapping` annotation at the class level of a controller, it means that all methods within that controller will be mapped to the base URL specified in the class-level annotation. This essentially sets a prefix for all URLs defined in the methods of the controller.
   - `URL Mapping:` You specify the URL that the method will respond to. For example, if you put `@RequestMapping("/products")` above a method, that method will respond to all requests with the URL "/products".
      
   ```java
       @Controller
      @RequestMapping("/products")
      public class ProductController {
      
          @RequestMapping(method = RequestMethod.GET)
          public String getAllProducts() {
              // Logic to get all products
              return "products_list";
          }
      }
  ```
  - `HTTP Methods:` You can specify which HTTP methods the method will respond to. For example, if you put `@RequestMapping(value = "/product", method = RequestMethod.GET)` above a method, that method will only respond to GET requests.

  ```java
     @Controller
    @RequestMapping("/products")
    public class ProductController {
    
        @RequestMapping(value = "/{id}", method = RequestMethod.GET)
        public String getProductById(@PathVariable("id") Long id) {
            // Logic to get product by ID
            return "product_details";
        }
    }
  
  ```
    
  - `Query Parameters:` You can filter queries based on the parameters they contain. For example, if you put `@RequestMapping(value = "/product", params = "id")` above a method, that method will only respond to requests that contain an "id" parameter.

  ```java
     @Controller
    @RequestMapping("/products")
    public class ProductController {
    
        @RequestMapping(value = "/search", method = RequestMethod.POST, params = "name")
        public String searchProductByName(@RequestParam("name") String name) {
            // Logic to search product by name
            return "search_results";
        }
    }
  
  ```
    
  - `Headers:` You can filter requests based on the HTTP headers they contain. For example, if you put `@RequestMapping(value = "/product", headers = "Accept=application/json")` above a method, that method will only respond to requests that accept responses in `JSON` format.

   ```java
       @Controller
      @RequestMapping("/products")
      public class ProductController {
      
          @RequestMapping(value = "/update", method = RequestMethod.PUT, headers = "Content-Type=application/json")
          public String updateProduct(@RequestBody Product product) {
              // Logic to update a product
              return "product_updated";
          }
      }
  
  ```
  - `Content type:` You can specify the type of content that the method can consume or produce. For example, if you put `@RequestMapping(value = "/product", consumes = "application/json", produces = "application/json")` above a method, it means that the method will only process requests containing JSON data and will produce responses also in `JSON`.

  ```java
      @Controller
    @RequestMapping("/products")
    public class ProductController {
    
        @RequestMapping(value = "/new", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
        public ResponseEntity<String> createProduct(@RequestBody Product product) {
            // Logic to create a new product
            return new ResponseEntity<>("Product created successfully", HttpStatus.CREATED);
        }
    }
  
  ```



### 4. @GetMapping, @PostMapping, @PutMapping, @DeleteMapping: 
These annotations are shortcuts for @RequestMapping with specific HTTP methods (GET, POST, PUT, DELETE).

```java
  import org.springframework.web.bind.annotation.GetMapping;
  import org.springframework.web.bind.annotation.PostMapping;
  
   @Controller
  @RequestMapping("/products")
  public class ProductController {
  
      @GetMapping("/{id}")
      public String getProductById(@PathVariable("id") Long id) {
          // Logic to retrieve a product by its ID
      }
  
      @PostMapping
      public String createProduct(@RequestBody Product product) {
          // Logic to create a new product
      }
  }

```



 ### 5. @RequestParam: 
 This annotation binds request parameters to method parameters.
 - Used to extract request parameters from the URL.
 - Parameters are typically in the form `?param=value` in the URL.
 - These parameters are `optional` by default unless you specify required=true.
 - For example, in the URL `/product?id=123`, id is a request parameter.

  ```java
   @GetMapping("/product")
    public String getProductById(@RequestParam("id") Long id) {
        // Implementation to get product by ID
    }
```



### 6. @ResponseBody:
This annotation indicates that the return value of the method should be serialized directly to the HTTP response body.
- When you use the `@ResponseBody` annotation on a method, Spring converts the return value and writes it to the HTTP response automatically. Each method in the Controller class must be annotated with `@ResponseBody`.
  
- The `@ResponseBody` annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.

  ```java
       import org.springframework.stereotype.Controller;
      import org.springframework.web.bind.annotation.*;
      
      @Controller
      @RequestMapping("/books")
      public class BookController {
      
          @GetMapping("/{id}")
          @ResponseBody
          public Book getBookById(@PathVariable Long id) {
              // Assume we retrieve the book from a database
              Book book = new Book();
              book.setId(id);
              book.setTitle("Spring in Action");
              book.setAuthor("Craig Walls");
      
              return book;
          }
      
          @PostMapping("/")
          @ResponseBody
          public String createBook(@RequestBody Book book) {
              // Assume we save the book to a database
              return "Book created successfully: " + book.getTitle();
          }
      }

   ```
- `getBookById()` method retrieves a book by its ID from a database (in this case, it just creates a dummy book object for demonstration purposes) and returns it. With `@ResponseBody`, Spring will serialize the Book `object` to `JSON (or XML if configured)` and write it to the response body.

- `createBook()` method accepts a `JSON (or XML)` representation of a Book `object` in the request body using the `@RequestBody` annotation. It then processes this request (in this case, just printing a success message) and returns a response.

  ```java
       @ResponseBody
      @RequestMapping("/hello")
      String hello() {
          return "Hello World!";
      }
  
  ```

### 7. @RestController:  
- is a specific annotation in Spring MVC that combines the functionality of `@Controller` and `@ResponseBody`. It's used to annotate controller classes that handle HTTP requests in RESTful applications. In other words, `@RestController` is essentially a simplified version of @Controller intended to be used in the context of building RESTful APIs.
- When a class is annotated with `@RestController`, each method in that class is automatically annotated with `@ResponseBody`. This means that each method in the controller class directly returns the result as an HTTP response, without going through view resolution.

   ```java
        import org.springframework.web.bind.annotation.*;
   
        @RestController
        @RequestMapping("/api/products")
        public class ProductController {
        
            @GetMapping("/{id}")
            public Product getProductById(@PathVariable("id") Long id) {
                // Logic to fetch a product by its ID
                return productService.getProductById(id);
            }
        
            @PostMapping("/create")
            public String createProduct(@RequestBody Product product) {
                // Logic to create a new product
                productService.createProduct(product);
                return "Product created successfully";
            }
        }

   ```

  
### 8. @RequestBody:  
is used to map the body of an HTTP request to a Java object in a controller method.
This annotation is used when the HTTP request data is sent as JSON, XML, or another format and needs to be deserialized into a Java object.

   ```java
        @RestController
        @RequestMapping("/api/products")
        public class ProductController {
        
            @PostMapping("/create")
            public String createProduct(@RequestBody Product product) {
                productService.createProduct(product);
                return "Product created successfully";
            }
        }

   ```
- In this example, the `createProduct` method takes a `Product object` as a parameter, annotated with `@RequestBody`. When an HTTP POST request is sent to the "/api/products/create" endpoint with the product details in the request body `(in JSON, for example)`, Spring automatically `deserializes` the JSON into a `Product object` and passes it to the createProduct method.


### 9. @ExceptionHandler
is an annotation used in Spring Framework for handling exceptions in Spring MVC controllers. When an exception is thrown during the processing of a request, Spring MVC looks for methods annotated with @ExceptionHandler within the same controller or any global exception handler defined in the application context.

  ```java
     import org.springframework.web.bind.annotation.*;
  
        @RestController
        @RequestMapping("/api/products")
        public class ProductController {
        
            @GetMapping("/{id}")
            public Product getProductById(@PathVariable("id") Long id) {
                // Logic to fetch a product by its ID
                Product product = productService.getProductById(id);
                if (product == null) {
                    throw new ProductNotFoundException("Product with id " + id + " not found");
                }
                return product;
            }
        
            @ExceptionHandler(ProductNotFoundException.class)
            @ResponseStatus(HttpStatus.NOT_FOUND)
            public String handleProductNotFoundException(ProductNotFoundException ex) {
                return ex.getMessage();
            }
        }
   ```


### 9. @ResponseStatus 
- This annotation in Spring MVC is used to specify the HTTP `status` code that should be returned by a controller method when it completes its execution. It allows you to customize the HTTP status code of the response without explicitly returning a `ResponseEntity` object.

    ```java
       import org.springframework.web.bind.annotation.*;
       import org.springframework.http.*;
      
      @RestController
      @RequestMapping("/api/products")
      public class ProductController {
      
          @GetMapping("/{id}")
          @ResponseStatus(HttpStatus.OK)
          public Product getProductById(@PathVariable("id") Long id) {
              // Logic to fetch a product by its ID
              return productService.getProductById(id);
          }
      
          @PostMapping("/create")
          @ResponseStatus(HttpStatus.CREATED)
          public String createProduct(@RequestBody Product product) {
              // Logic to create a new product
              productService.createProduct(product);
              return "Product created successfully";
          }
      
          @DeleteMapping("/{id}")
          @ResponseStatus(HttpStatus.NO_CONTENT)
          public void deleteProduct(@PathVariable("id") Long id) {
              // Logic to delete a product by its ID
              productService.deleteProduct(id);
          }
      
          @PutMapping("/{id}")
          @ResponseStatus(HttpStatus.ACCEPTED)
          public String updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
              // Logic to update a product by its ID
              productService.updateProduct(id, product);
              return "Product updated successfully";
          }
      
          @ExceptionHandler(ProductNotFoundException.class)
          @ResponseStatus(HttpStatus.NOT_FOUND)
          public String handleProductNotFoundException(ProductNotFoundException ex) {
              return ex.getMessage();
          }
      }

   ```

  - `HttpStatus.OK:` Indicates that the request has succeeded `(HTTP status code 200)`.
  - `HttpStatus.CREATED:` Indicates that the request has been fulfilled and a new resource has been created `(HTTP status code 201)`.
  - `HttpStatus.NO_CONTENT:` Indicates that the request has been successfully processed, but there is no content to return `(HTTP status code 204)`.
  - `HttpStatus.ACCEPTED:` Indicates that the request has been accepted for processing, but the processing has not been completed yet `(HTTP status code 202)`.
  - `HttpStatus.NOT_FOUND:` Indicates that the requested resource could not be found `(HTTP status code 404)`.
  - Additionally, an exception handler method (handleProductNotFoundException) is annotated with @ExceptionHandler and `@ResponseStatus(HttpStatus.NOT_FOUND)` to handle ProductNotFoundException. This method returns a custom message with HTTP status code `404` (Not Found) when the exception occurs.

### 10. @ModelAttribute
is an annotation in Spring MVC framework used to bind a method parameter or method return value to a named model attribute and expose it to the view layer. It's commonly used in Spring MVC controllers to prepare data before rendering a view.

Let's say you have a Spring MVC application where you want to display information about a user. You have a User class with attributes such as name, email, and age. Now, you want to populate this user object and pass it to your view for rendering.

  ```java
      import org.springframework.stereotype.Controller;
      import org.springframework.web.bind.annotation.ModelAttribute;
      import org.springframework.web.bind.annotation.RequestMapping;
      import org.springframework.web.servlet.ModelAndView;
      
      @Controller
      public class UserController {
      
          @RequestMapping("/user")
          public ModelAndView getUser() {
              // Assume user details are fetched from a database or some service
              User user = userService.getUserDetails();
              return new ModelAndView("userView", "user", user);
          }
      
          @ModelAttribute("user")
          public User populateUser() {
              // This method will be called before any handler method in this controller
              // It prepares the user object and adds it to the model
              User user = new User();
              user.setName("John Doe");
              user.setEmail("john@example.com");
              user.setAge(30);
              return user;
          }
      }

   ```

- `@ModelAttribute("user")` annotation on the `populateUser()` method ensures that the returned User object is added to the model with the name "user".
- When the `getUser()` method is invoked, it retrieves the user details (from a database or some service) and adds it to the ModelAndView with the name "userView".
- The view (e.g., userView.jsp or userView.html) can access the user object using the name "user" and render its attributes like name, email, and age.

# 5. Spring Data  

  # What is Spring Data ?
  
  - `Spring Data` is a part of the larger Spring Framework ecosystem, providing a unified and easy way to access various kinds of datastores, both `relational` and `non-relational`, in a consistent manner. It aims to simplify data access in Spring applications by abstracting away the complexities of dealing with different data access technologies and providing common `patterns` and `APIs` for working with databases.
  
  Spring Data offers support for a wide range of datastores including relational databases like `MySQL`, `PostgreSQL`, and `Oracle`, as well as NoSQL databases like `MongoDB`, `Redis`, `Cassandra`, and more.
  
  ## 1. Key features of Spring Data
  
  - `Repository abstraction:` Spring Data provides a repository abstraction that greatly reduces the amount of boilerplate code needed for data access. Developers define interfaces for repositories, and Spring Data automatically generates implementations for these interfaces at runtime.
    
  - `Query methods:` Spring Data allows developers to define query methods in repository interfaces by simply declaring method signatures following a naming convention. These query methods are automatically implemented by Spring Data based on the method names, saving developers from writing SQL or other query languages.
    
  - `QueryDSL support:` For more complex queries, Spring Data supports integration with QueryDSL, a framework for building type-safe queries in Java.
    
  - `Pagination and sorting:` Spring Data provides built-in support for pagination and sorting of query results, making it easy to handle large datasets.
    
  - `Auditing:` Spring Data can automatically track and manage auditing information such as creation time, modification time, and the user who made the changes.
    
  - `Integration with other Spring projects:` Spring Data integrates seamlessly with other Spring projects such as Spring MVC, Spring Boot, and Spring Security, making it easy to build end-to-end Spring applications.
  
  ## 2. Spring Data Modules
  
  ![spring-data](https://github.com/douaeelh2/Spring-Boot-Documentation/assets/127549220/e47327ba-6487-406d-998c-591f043c9a95)
  
  - ### Spring Data JPA:
    This module provides support for working with `relational databases` using `JPA (Java Persistence API)`. It simplifies data access by offering features like repository interfaces, which allow you to define query methods by simply declaring their method signatures. Spring Data JPA also supports `pagination`, `sorting`, and criteria-based `queries`.
    
  - ### Spring Data MongoDB:
    MongoDB is a popular `NoSQL database` that stores data in a flexible, `JSON-like` format. Spring Data MongoDB provides integration with MongoDB in - Spring applications. It allows you to work with `MongoDB documents` using familiar Spring idioms and provides support for `querying`, `indexing`, and `mapping` between Java objects and MongoDB documents.
    
  - ### Spring Data Redis:
    Redis is an `in-memory` data store that can be used as a `cache`, `message broker`, or as a database for storing `key-value` pairs, lists, sets, and other data structures. Spring Data Redis simplifies working with Redis in Spring applications by providing abstractions for working with Redis data structures, transactions, and Pub/Sub messaging.
    
  - ### Spring Data JDBC:
    While Spring Data JPA focuses on `ORM (Object-Relational Mapping)` with `JPA`, Spring Data JDBC offers a more lightweight approach for working with `relational` databases using plain `SQL queries`. It provides support for mapping query results to Java objects and simplifies `CRUD (Create, Read, Update, Delete)` operations without requiring the use of an ORM framework.
    
  - ### Spring Data Couchbase:
    Couchbase is a `distributed NoSQL` database that supports flexible JSON documents and offers features like high availability, scalability, and full-text search. Spring Data Couchbase allows you to integrate Couchbase with Spring applications and provides support for querying, indexing, and managing Couchbase documents.
    
  - ### Spring Data Elasticsearch:
    Elasticsearch is a `distributed search` and analytics engine that is commonly used for full-text search, log analysis, and data visualization. Spring Data Elasticsearch simplifies working with Elasticsearch in Spring applications by providing abstractions for indexing, querying, and mapping between Java objects and Elasticsearch documents.
  
  - ### Spring Data Neo4j:
    Neo4j is a popular `graph database` that represents data as `nodes`, `relationships`, and `properties`. Spring Data Neo4j allows you to integrate Neo4j with Spring applications and provides support for modeling, querying, and traversing graph data using domain objects and annotations.
  
  - ### Spring Data REST:
    This module enables developers to expose Spring Data repositories as `RESTful APIs` automatically. It allows clients to perform CRUD operations on data entities using `HTTP methods` and supports features like pagination, sorting, and filtering out-of-the-box.  
    
  - ### Spring Data Graph:
    Spring Data Graph is a module for working with `graph databases`, such as `Neo4j`, in Spring applications. It provides support for defining and querying graph structures using domain objects and annotations, as well as integrating with other Spring Data modules for relational or NoSQL data access.
  
  - ### Embedded databases:
    Spring Boot, a popular companion to Spring Data, offers embedded database support out-of-the-box. You can easily configure embedded databases like `H2`, `HSQLDB`, and `Derby` for development and testing purposes without requiring a separate database server.
  
  
  # Spring Data JPA & Hibernate
   ## Spring Data JPA 
   
  - Spring Data JPA is a part of the Spring Data project, which aims to simplify data access in Java applications by providing a higher-level abstraction over data persistence technologies. Specifically, Spring Data JPA provides a way to work with `JPA (Java Persistence API)` in a Spring application more easily.

 - JPA is a Java specification for `mapping` Java objects to relational database tables and vice versa. It provides a set of interfaces and annotations for defining `entities`, `relationships` between entities, and `querying data` from the database using `object-oriented` criteria.

 ## What is the Hibernate Framework ?
   
- Hibernate is a `Java-based ORM` tool that provides a framework for mapping application domain `objects` to `relational database tables` and vice versa.

  <div style="text-align:center;">
  <img src="https://github.com/douaeelh2/Spring-Boot-Documentation/assets/127549220/a15beb11-dbb2-48de-9615-3aec17f23552" style="width:100%">
 </div> <br /> <br />


- Hibernate is the most popular `JPA implementation` and one of the most popular Java ORM frameworks. Hibernate is an `additional layer` on top of JDBC and enables you to implement a database-independent persistence layer. It provides an `object-relational` mapping implementation that maps your `database records` to `Java objects` and generates the required `SQL statements` to replicate all operations to the database.

- <div style="text-align:center;">
  <img src="https://github.com/douaeelh2/Spring-Boot-Documentation/assets/127549220/93700c96-475c-4e9f-993b-3bc4c4c2d81b" style="width:100%">
</div> <br /> <br />
