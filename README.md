---

# gRPC Hello World – Java (POC)

A simple **Proof of Concept (POC)** project demonstrating how to build a basic **gRPC client and server** using **Java**.
This project helps beginners understand how gRPC works — from defining `.proto` files to implementing server & client logic.

---

## 🚀 Features

* Simple **gRPC server** that responds with “Hello <name>”
* **Client implementation** to send requests
* Uses **Protocol Buffers (protobuf)** for message structure
* Maven-based project structure
* Easy to run and extend

---

## 📁 Project Structure

```
grpc-hello-world-poc/
 ├── src/main/proto       # .proto file
 ├── src/main/java        # Server and Client implementation
 ├── pom.xml              # Dependencies (gRPC, Protobuf)
 └── README.md
```

---

## 🛠️ Technologies Used

* Java
* gRPC
* Protocol Buffers (protobuf)
* Maven

---

## ▶️ How to Run

### 1. Generate gRPC Stubs

```
mvn clean install
```

### 2. Start the Server

Run:

```
HelloWorldServer.java
```

### 3. Run the Client

Run:

```
HelloWorldClient.java
```

You should see the greeting response in the console.

---

## 📌 Next Steps

* Add streaming RPC (server, client, bidirectional)
* Add authentication (JWT/OAuth)
* Implement advanced gRPC features: deadlines, interceptors, metadata
* Dockerize the service

---
