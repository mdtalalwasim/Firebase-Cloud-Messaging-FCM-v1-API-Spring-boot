## Firebase Cloud Messaging (FCM) v1 API with Spring Boot Project
# Firebase-Cloud-Messaging-(FCM)-v1-API-Spring-Boot
This project demonstrates how to integrate Firebase Cloud Messaging (FCM) with a Spring Boot application using the Firebase HTTP v1 API. It includes the ability to send push notifications to specific device tokens or to topics, offering a clean and scalable solution for notifications.

## Features
- Integration of Firebase Cloud Messaging (FCM) HTTP v1 API with Spring Boot
- Send push notifications to device tokens or topics
- REST API endpoints to send FCM messages from the server
- Supports sending custom data along with FCM notifications
- Example use case for both topic-based and device token-based messaging

## Technologies Used
- **Java 17**: The application runs on Java 17.
- **Spring Boot**: For building REST APIs quickly and easily.
- **Firebase Admin SDK**: To send messages using Firebase Cloud Messaging.
- **Maven**: For project management and dependency management.

## For Testing Application
## Step 01: Run the Application
Run this Spring Boot application by executing the main class.
## Step 02: Send a POST Request : Test With Topic
Use Postman or cURL to send a request to the endpoint.

- URL: POST http://localhost:8080/api/notification/topic
- Content-Type: application/json
```bash
POST http://localhost:8080/api/notification/topic
Content-Type: application/json

```
- Body:
```bash
{
  "title": "Test Notification",
  "message": "This is a test message",
  "topic": "test-topic"
}

```
## Before Request:
![image](https://github.com/user-attachments/assets/30b13a65-983d-44d3-9d12-49c9192b1055)
## After Request:
![image](https://github.com/user-attachments/assets/8203b6c2-344e-4c53-a280-0f892bf018db)


## Test Send Notification To Specific Device:
Use Postman or cURL to send a request to the endpoint.

- URL: POST http://localhost:8080/api/notification/device?deviceToken=YOUR_DEVICE_TOKEN
- Content-Type: application/json
```bash
POST http://localhost:8080/api/notification/device?deviceToken=YOUR_DEVICE_TOKEN
Content-Type: application/json

```
- Body:
```bash
{
  "title": "Test Notification",
  "message": "This is a test message",
  "topic": "test-topic"
}

```
![image](https://github.com/user-attachments/assets/024074c8-6434-47ba-99f9-8d320f587807)

## Getting Started

### Prerequisites
1. **Firebase Project**: You need to set up a Firebase project. Follow these steps:
    - Go to [Firebase Console](https://console.firebase.google.com/).
    - Create a project or use an existing one.
    - Go to **Project Settings** -> **Service Accounts** -> **Generate a new private key**.
    - Download the generated `serviceAccountKey.json` file.
    - Place this file in the `src/main/resources` folder of your Spring Boot application.
   
2. **Java and Maven Installed**: Ensure you have Java 17 and Maven installed on your machine.

3. **Firebase Admin SDK**: Add the Firebase Admin SDK dependency to your `pom.xml` file:
    ```xml
    <dependency>
        <groupId>com.google.firebase</groupId>
        <artifactId>firebase-admin</artifactId>
        <version>9.2.0</version>
    </dependency>
    ```

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/mdtalalwasim/Firebase-Cloud-Messaging-FCM-v1-API-Spring-boot.git


## Keywords
#Firebase 
#FCM 
#Spring-Boot 
#Firebase-FCM-API 
#FCM-Push-Notifications 
#Spring-Boot-Firebase-Integration 
#FCM-HTTP-v1-API
#firebase-integration-spring-boot
#Firebase-FCM-v1-Spring-Boot-API
#Spring-Boot-Firebase-FCM-v1
#Firebase-SpringBoot-FCM-Integration
#spring-fcm-notifications
#firebase-fcm-spring-boot
#firebase cloud messaging (FCM) with spring boot integration






