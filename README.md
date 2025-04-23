
# 💳 Capstone Microservices Project (Docker Compose)

This project is a full-stack microservices-based architecture for a finance-related system, consisting of Spring Boot backend services, an Angular frontend, Eureka Discovery Server, and a MySQL database — all containerized using Docker Compose.

---

## 🧱 Project Structure

```
.
├── docker-compose.yml
├── server-api/                 # Eureka Server
├── app-gateway/               # API Gateway
├── angular-app/               # Frontend (Angular)
├── accountinfo-api/          # Microservice
├── emi-api/
├── loan-api/
├── paymentinfo-api/
├── savingpaymenthistory-api/
├── authentication-api/
├── users-api/
└── db/                        # Contains *.sql files to initialize MySQL
```

---

## 🚀 Getting Started

### 1️⃣ Prerequisites

- ✅ Docker installed: [https://docs.docker.com/get-docker/](https://docs.docker.com/get-docker/)
- ✅ Docker Compose installed (comes with Docker Desktop)

### 2️⃣ Clone the repository

```bash
git clone https://github.com/your-username/capstone-docker-compose.git
cd capstone-docker-compose
```

---

## ⚙️ Running the Project

```bash
docker compose up --build
```

📌 This will:

- Build all Spring Boot microservices
- Start Eureka Server on `http://localhost:8761`
- Start Angular frontend on `http://localhost:4200`
- Start MySQL database on port `3307`

---

## 🌐 Accessing the Services

| Service                     | URL                                |
|----------------------------|-------------------------------------|
| Angular Frontend           | http://localhost:4200               |
| Eureka Discovery Server    | http://localhost:8761               |
| App Gateway (entry point)  | http://localhost:8080               |
| MySQL Database             | localhost:3307 (username: `root`)   |

---

## 🗃️ Database Setup

- The MySQL container initializes the `capstone` database using SQL files located in `./db/`.
- On startup, Docker mounts these files into the container using:

```yaml
volumes:
  - ./db:/docker-entrypoint-initdb.d
```

---

## 📦 Notes

- Ensure ports `3307`, `8080`–`8087`, and `4200` are free before running.
- MySQL user `mohan` with password `root` is used by the backend microservices.

---

## 🛑 Stopping the Services

```bash
docker compose down
```

---

## 🧼 Clean Rebuild

If you want to rebuild everything from scratch:

```bash
docker compose down -v --remove-orphans
docker compose up --build
```

---

## 🧪 Troubleshooting

- ❌ **MySQL connection error**:
  - Make sure `MYSQL_DATABASE`, `MYSQL_USER`, and `MYSQL_PASSWORD` are consistent across all microservices.
- 💤 **Containers not responding**:
  - Check logs with `docker compose logs -f service-name`

---

## 📜 License

This project is for educational/demo purposes.
