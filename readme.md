Account Management Microservice

This is a Spring Boot-based microservice for account management, using Maven for build automation.

## Features

- Spring Boot application
- Remote configuration support via `@EnableRemoteConfig`
- Maven build

## Prerequisites

- Java 17 or higher
- Maven 3.6+
- (Optional) Docker

## Build

```sh
mvn clean package
```
## Run
```sh
GOOGLE_APPLICATION_CREDENTIALS=yourcreds.json \
REMOTE_CONFIG_TYPE=GCS \
REMOTE_CONFIG_BUCKET_OR_HOST=sipankaj-example-bucket \
REMOTE_CONFIG_FILE=config.yml \
mvn spring-boot:run
```
## Invoke APIs
- Create a user
```sh
```curl
curl --location 'http://localhost:8081/users' \
--header 'Content-Type: application/json' \
--data-raw '{
"name" : "pankaj",
"email": "test@gmail.com"
}'
```
- Get a user by ID
```sh
```curl
curl --location 'http://localhost:8081/users/1'
```
- Verify the user
  - Response has name_prefix as configured in the remote config file.

## Configuration
Remote configuration is enabled via the @EnableRemoteConfig annotation. Configure your remote config provider as needed.  

## UML Diagram
![UML Diagram](/docs/uml.png)
