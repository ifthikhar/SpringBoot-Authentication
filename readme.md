# Todo Web Application using Spring Boot and H2 In memory database

Run SpringBootFirstWebApplication as a Java Application.

Runs on default port of Spring Boot - 8080 

## Can be run as a Jar or a WAR

`mvn clean install` generate a war which can deployed to your favorite web server.

We will deploy to Cloud as a WAR

## Web Application

- http://localhost:8080/login with in28minutes/dummy as credentials
- You can add, delete and update your todos
- Spring Security is used to secure the application
- `SecurityConfiguration` contains the in memory security credential configuration.

## H2 Console

- http://localhost:8080/h2-console
- Use `jdbc:h2:mem:testdb` as JDBC URL 

## manifest.mf

```
applications:
- name: todo-web-application-h2
  disk_quota: 1G
  instances: 1
  memory: 1G
  path: target/todo-web-application-h2.war
  timeout: 120
  routes:
  - route: todo-web-application-h2-ranga-101.cfapps.io
  buildpacks:
  - https://github.com/cloudfoundry/java-buildpack.git
  stack: cflinuxfs3
 ```
