# Inventory Management System Java (OOPs) Project

A **Java-based Inventory Management System** built using **Object-Oriented Programming (OOPs)** principles and MySQL as the database. This project helps businesses manage stock, track sales, and handle customers and suppliers efficiently.

<br>

## 📌 Features
- 🔑 **User Authentication** - Login & Sign-up system with MySQL
- 📊 **Dashboard** - View total stock, sales, and purchases
- 📦 **Stock Management** - Add, update, and delete stock items
- 🛒 **Sales Management** - Record sales transactions
- 📂 **Database Integration** - Uses **MySQL & JDBC** for storing data
- 🖥️ **User-Friendly GUI** - Built with **Java Swing**

<br>

## 🛠️ Technologies Used
- **Java (Swing, OOPs)**
- **MySQL Database**
- **JDBC (Java Database Connectivity)**
- **NetBeans IDE**
- **GitHub for Version Control**

<br>

## 🚀 Installation & Setup

### 📌 Prerequisites
Make sure you have the following installed on your system:
1. **Java JDK** - [Download Java](https://www.oracle.com/java/technologies/javase-downloads.html)
2. **NetBeans IDE** - [Download NetBeans](https://netbeans.apache.org/)
3. **MySQL Server** - [Download MySQL](https://dev.mysql.com/downloads/)

<br>

### 🗃️ Database Setup
1. Open **MySQL** and create a database:
   ```sql
   CREATE DATABASE mc_ims_db;
2. Import the database dump file (Dump20240421.sql) into MySQL:
   ```sql
   mysql -u root -p mc_ims_db < Dump20240421.sql
3. Update database credentials in Login_Frame.java and SignUp_Frame.java
   ```sql
   String db_url = "jdbc:mysql://localhost:3306/mc_ims_db";
   String db_username = "root";
   String db_password = "yourpassword";
<br>

## ▶️ Running the Project
1. **Clone this repository**:  
   ```sh
   git clone https://github.com/yourusername/Inventory-Management-System-Java-OOPs.git
2. Open the project in NetBeans IDE.
3. Run Login_Frame.java to start the application.

<br>

## 👤 Authors & Team
- **[Mubeen Channa](https://github.com/Mubeen-Channa)** - Developer & Maintainer  
- **[Younis](https://github.com/YounisJ)** - Co-Team Worker  


<br>

## 📜 License
This project is open-source and free to use under the MIT License.

<br>

## 🎯 Contributions
Feel free to contribute by forking the repository and submitting a pull request.

<br>

## 🌟 Stay Connected  
Follow my journey and feel free to explore my progress. Feedback and collaboration are always welcome!

**Fork & Contribute** – Improve or add to the content! 

Happy Coding! 💻🚀
