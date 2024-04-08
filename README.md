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
   
 3. [Building Blocks](#building-blocks)
      - [Spring Boot Initializr](#spring-boot-initializr)
      - [Maven and Gradle Setup](#maven-and-gradle-setup)
      - [Application Properties](#application-properties)
      - [External Configuration](#external-configuration)
      - [Logging with Spring Boot](#logging-with-spring-boot)
      - [Error Handling](#error-handling)
   
 4. [Web Development with Spring Boot](#web-development-with-spring-boot)
      - [Building RESTful APIs](#building-restful-apis)
      - [MVC with Spring Boot](#mvc-with-spring-boot)
      - [Thymeleaf Templates](#thymeleaf-templates)
      - [WebSockets](#websockets)
   
 5. [Data Access](#data-access)
      - [Spring Data JPA](#spring-data-jpa)
      - [Spring Data JDBC](#spring-data-jdbc)
      - [Using QueryDSL](#using-querydsl)
      - [Transaction Management](#transaction-management)
      
 6. [Security](#security)
      - [Authentication and Authorization](#authentication-and-authorization)
      - [Securing REST APIs](#securing-rest-apis)
      - [OAuth2 with Spring Boot](#oauth2-with-spring-boot)
      
 7. [Testing](#testing)
      - [Unit Testing with JUnit and Mockito](#unit-testing-with-junit-and-mockito)
      - [Integration Testing](#integration-testing)
      - [Testing Web Applications](#testing-web-applications)
   
 8. [Advanced Topics](#advanced-topics)
      - [Spring Boot DevTools](#spring-boot-devtools)
      - [Actuator Endpoints](#actuator-endpoints)
      - [Spring Boot Testing Utilities](#spring-boot-testing-utilities)
      - [Deployment Strategies](#deployment-strategies)
      - [Monitoring and Metrics](#monitoring-and-metrics)
   
 9. [Integrations](#integrations)
      - [Database Integration](#database-integration)
      - [Messaging with Spring Boot](#messaging-with-spring-boot)
      - [Integrating with External APIs](#integrating-with-external-apis)
      - [Caching](#caching)
      
 10. [Cloud Deployment](#cloud-deployment)
      - [Deploying to Cloud Platforms (AWS, Azure, Google Cloud)](#deploying-to-cloud-platforms-aws-azure-google-cloud)
      - [Containerization with Docker](#containerization-with-docker)
      - [Kubernetes Integration](#kubernetes-integration)
      - [Serverless Deployment](#serverless-deployment)
   
 11. [Best Practices and Tips](#best-practices-and-tips)
      - [Code Organization](#code-organization)
      - [Performance Optimization](#performance-optimization)
      - [Handling Large-Scale Applications](#handling-large-scale-applications)
      - [Troubleshooting](#troubleshooting)
   
 12. [Case Studies and Examples](#case-studies-and-examples)
      - [Building a Blog Application](#building-a-blog-application)
      - [E-commerce Platform with Spring Boot](#e-commerce-platform-with-spring-boot)
      - [Real-time Chat Application](#real-time-chat-application)
      - [Microservices Architecture](#microservices-architecture)
      
 13. [Resources and Further Learning](#resources-and-further-learning)
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


### Spring Boot : 
  
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



# Core Concepts 
  # Spring Boot Starters
  
Before Spring Boot was introduced, Spring Developers used to spend a lot of time on Dependency management. `Spring Boot` Starters were introduced to solve this problem so that the developers can spend more time on actual code than Dependencies. Spring Boot Starters are dependency descriptors that can be added under the `<dependencies>` section in `pom.xml`. There are around 50+ Spring Boot Starters for different Spring and related technologies. These starters give all the dependencies under a single name.

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

<br /> <br /> <br />


# Spring Boot CLI

`Spring Boot CLI` (Command Line Interface) is a powerful tool for quickly creating Spring Boot applications from the command line. It provides a simple and efficient way to start Spring Boot projects without having to manually configure a project from scratch.


| Feature                  | Command                                         | Description                                                                                     |
|--------------------------|-------------------------------------------------|-------------------------------------------------------------------------------------------------|
| Rapid Project Creation   | `spring init --dependencies=<dependencies>`     | Quickly create Spring Boot projects using simple commands. For example, with `spring init`, you can create a new project with necessary dependencies and basic structure by specifying the project name and desired dependencies.|
| Development Ease         | `spring run <MainClassName>.groovy`             | Easily develop and test Spring Boot applications directly from the command line, speeding up the development and debugging process. You can also use commands like `spring run` to launch your application.|
| Groovy Support           | N/A                                             | Spring Boot CLI is primarily based on Groovy, a dynamic programming language for the Java platform. This allows you to write Groovy scripts to configure and customize your Spring Boot applications in a concise and expressive manner.|
| Maven and Gradle Integration | `spring convert`                             | While Spring Boot CLI is a standalone tool, it seamlessly integrates with Maven and Gradle. You can use Maven or Gradle build configuration files to manage dependencies and packaging of your application, while leveraging the rapid creation features of Spring Boot CLI.|
| Simplified Deployment    | `spring jar <output.jar> <MainClassName>.groovy` | Once your application is developed, Spring Boot CLI offers features to create standalone JAR executables, simplifying the deployment and execution of your applications on any Java-compatible platform.|
