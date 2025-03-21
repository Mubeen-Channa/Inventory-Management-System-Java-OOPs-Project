-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: mc_ims_db
-- ------------------------------------------------------
-- Server version	8.0.36

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `catogary_table`
--

DROP TABLE IF EXISTS `catogary_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `catogary_table` (
  `S_No` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  PRIMARY KEY (`S_No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `catogary_table`
--

LOCK TABLES `catogary_table` WRITE;
/*!40000 ALTER TABLE `catogary_table` DISABLE KEYS */;
INSERT INTO `catogary_table` VALUES (2,'Mobile'),(3,'Home Alliances'),(4,'Computer');
/*!40000 ALTER TABLE `catogary_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_table`
--

DROP TABLE IF EXISTS `customer_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_table` (
  `S_No` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Location` varchar(45) NOT NULL,
  `Contact` varchar(45) NOT NULL,
  `Company` varchar(45) NOT NULL,
  PRIMARY KEY (`S_No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_table`
--

LOCK TABLES `customer_table` WRITE;
/*!40000 ALTER TABLE `customer_table` DISABLE KEYS */;
INSERT INTO `customer_table` VALUES (1,'Mubeen','Larkana','+923401107142','Suki'),(2,'Younis','Ghotki','+921110570000','YJ'),(3,'Siraj','Larkana','+921763778961','Dujana');
/*!40000 ALTER TABLE `customer_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login_table`
--

DROP TABLE IF EXISTS `login_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `login_table` (
  `serial_no` int NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`serial_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login_table`
--

LOCK TABLES `login_table` WRITE;
/*!40000 ALTER TABLE `login_table` DISABLE KEYS */;
INSERT INTO `login_table` VALUES (1,'admin','admin'),(2,'Younis','Yoyo');
/*!40000 ALTER TABLE `login_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_table`
--

DROP TABLE IF EXISTS `purchase_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `purchase_table` (
  `S_No` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `quantity` varchar(45) NOT NULL,
  `supplier` varchar(45) NOT NULL,
  `catagory` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  `t_price` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  PRIMARY KEY (`S_No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_table`
--

LOCK TABLES `purchase_table` WRITE;
/*!40000 ALTER TABLE `purchase_table` DISABLE KEYS */;
INSERT INTO `purchase_table` VALUES (1,'HP EliteBook G5 830','2','HP','Hardware','80000','160000','04/21/2024');
/*!40000 ALTER TABLE `purchase_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sell_table`
--

DROP TABLE IF EXISTS `sell_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sell_table` (
  `S_No` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Customer` varchar(45) NOT NULL,
  `Quantity` varchar(45) NOT NULL,
  `Price` varchar(45) NOT NULL,
  `T_Price` varchar(45) NOT NULL,
  `Date` varchar(45) NOT NULL,
  `Profit` varchar(45) NOT NULL,
  PRIMARY KEY (`S_No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sell_table`
--

LOCK TABLES `sell_table` WRITE;
/*!40000 ALTER TABLE `sell_table` DISABLE KEYS */;
INSERT INTO `sell_table` VALUES (1,'HP EliteBook G5 830','Mubeen','1','110000','110000','04/21/2024','30000');
/*!40000 ALTER TABLE `sell_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_table`
--

DROP TABLE IF EXISTS `stock_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `stock_table` (
  `S_No` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `supplier` varchar(45) NOT NULL,
  `catagory` varchar(45) NOT NULL,
  `quantity` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  `t_price` varchar(45) NOT NULL,
  PRIMARY KEY (`S_No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_table`
--

LOCK TABLES `stock_table` WRITE;
/*!40000 ALTER TABLE `stock_table` DISABLE KEYS */;
INSERT INTO `stock_table` VALUES (1,'HP EliteBook G5 830','HP','Computer','1','80000','80000'),(2,'a','Mr Channa','Home Alliances','2','5','10');
/*!40000 ALTER TABLE `stock_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers_table`
--

DROP TABLE IF EXISTS `suppliers_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `suppliers_table` (
  `S_No` int NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Location` varchar(45) NOT NULL,
  `Contact` varchar(45) NOT NULL,
  `Company` varchar(45) NOT NULL,
  PRIMARY KEY (`S_No`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers_table`
--

LOCK TABLES `suppliers_table` WRITE;
/*!40000 ALTER TABLE `suppliers_table` DISABLE KEYS */;
INSERT INTO `suppliers_table` VALUES (1,'Mr Channa','Larkana','+923401107142','Suki'),(2,'Mr Younis','Ghotki','+92111050000','YJ'),(3,'Mr Siraj','Larkana','+921763778961','Dujana');
/*!40000 ALTER TABLE `suppliers_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-04-21 14:35:10
