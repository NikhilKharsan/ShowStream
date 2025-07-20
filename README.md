# ShowStream 🎟️  
**A Smart Ticketing & Event Booking Platform**

ShowStream is a robust backend application designed to handle high-concurrency ticket booking for movies, concerts, sports, and theater events. Inspired by real-world challenges, it focuses on system design, scalability, and fault-tolerance.

---

## 🔧 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Security (JWT-based Auth)**
- **MySQL/PostgreSQL**
- **Redis (for seat-locking and caching)**
- **RabbitMQ/Kafka (optional for notifications)**
- **Docker**

---

## 🚀 Features

- 🔐 **Authentication & Authorization** (JWT-based)
- 🪑 **Real-time seat locking** with race-condition prevention
- ⏱️ **Seat reservation timeout** mechanism (auto-release)
- 📈 **Dynamic pricing engine** based on demand
- 🏟️ **Multi-venue, multi-event support**
- 📬 **Email/SMS notifications** for booking confirmations (future scope)
- 📊 **Admin dashboard APIs** for venue management and analytics
- 💬 **Well-documented REST APIs**

---

## ⚙️ System Design Highlights

- Custom seat-locking strategy using **Redis**
- Booking status lifecycle: `PENDING → CONFIRMED → EXPIRED`
- Load-tested for **1000+ concurrent users**
- Caching frequently accessed events using **Redis**
- Modular microservice-ready architecture

---

## 📁 Project Structure

- `/auth-service`: handles login/signup and JWT token generation
- `/booking-service`: seat selection, payment, seat lock
- `/event-service`: manage shows, movies, venues
- `/common`: reusable DTOs, configs, and utils

---

## 🔮 Future Enhancements

- AI-based recommendation system
- Event popularity forecasting
- Real-time booking visualization dashboard

---

## 👤 Author

**Nikhil Singh**  
Java Backend Engineer | Scaler-certified | 1 YOE at Amdocs_

---


