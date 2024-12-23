-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Dec 09, 2024 at 12:29 PM
-- Server version: 8.4.0
-- PHP Version: 8.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `staffmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `assignedtasks`
--

DROP TABLE IF EXISTS `assignedtasks`;
CREATE TABLE IF NOT EXISTS `assignedtasks` (
  `task_id` int NOT NULL AUTO_INCREMENT,
  `staff_id` int DEFAULT NULL,
  `task_description` varchar(255) DEFAULT NULL,
  `task_status` enum('Pending','In Progress','Completed') DEFAULT 'Pending',
  PRIMARY KEY (`task_id`),
  KEY `staff_id` (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `assignedtasks`
--

INSERT INTO `assignedtasks` (`task_id`, `staff_id`, `task_description`, `task_status`) VALUES
(16, 30, 'Prepare monthly sales report', 'Pending'),
(17, 33, 'Update inventory records', 'In Progress'),
(18, 32, 'Supervise the construction site', 'Completed'),
(19, 31, 'Organize client meeting schedule', 'Pending'),
(20, 33, 'Review company policies', 'In Progress'),
(21, 33, 'Deliver items to new store', 'Pending'),
(22, 33, 'Create staff report', 'Pending'),
(23, 32, 'Create engineering report', 'Pending');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
CREATE TABLE IF NOT EXISTS `attendance` (
  `attendance_ID` int NOT NULL AUTO_INCREMENT,
  `staff_ID` int DEFAULT NULL,
  `checkin_time` datetime DEFAULT NULL,
  `checkout_time` datetime DEFAULT NULL,
  `date` date DEFAULT NULL,
  PRIMARY KEY (`attendance_ID`),
  KEY `staff_ID` (`staff_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`attendance_ID`, `staff_ID`, `checkin_time`, `checkout_time`, `date`) VALUES
(31, 30, '2024-11-26 08:00:00', '2024-11-26 16:00:00', '2024-11-26'),
(32, 32, '2024-11-26 09:00:00', '2024-11-26 17:00:00', '2024-11-26'),
(33, 31, '2024-11-26 08:30:00', '2024-11-26 15:30:00', '2024-11-26'),
(34, 30, '2024-11-27 08:15:00', '2024-11-27 16:15:00', '2024-11-27'),
(35, 33, '2024-11-27 09:00:00', '2024-11-27 17:30:00', '2024-11-27');

-- --------------------------------------------------------

--
-- Table structure for table `leaverequests`
--

DROP TABLE IF EXISTS `leaverequests`;
CREATE TABLE IF NOT EXISTS `leaverequests` (
  `leave_request_ID` int NOT NULL AUTO_INCREMENT,
  `staff_ID` int NOT NULL,
  `date_submitted` date NOT NULL,
  `leave_start_date` date NOT NULL,
  `leave_end_date` date NOT NULL,
  `leave_reason` text,
  `leave_status` enum('Pending','Approved','Rejected') DEFAULT 'Pending',
  PRIMARY KEY (`leave_request_ID`),
  KEY `staff_ID` (`staff_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
CREATE TABLE IF NOT EXISTS `staff` (
  `staff_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `phone` varchar(15) DEFAULT NULL,
  `job_position` varchar(50) DEFAULT NULL,
  `monthly_salary` decimal(10,2) DEFAULT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`staff_id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`staff_id`, `first_name`, `last_name`, `address`, `phone`, `job_position`, `monthly_salary`, `username`, `password`) VALUES
(30, 'John', 'Doe', '123 Elm Street, Springfield', '1234567890', 'Administrator', 5000.00, 'jdoe', 'password123'),
(31, 'Jane', 'Smith', '456 Oak Avenue, Metropolis', '9876543210', 'Staff', 3000.00, 'jsmith', 'password456'),
(32, 'Alice', 'Brown', '789 Pine Road, Gotham', '4567891230', 'Staff', 3200.00, 'abrown', 'password789'),
(33, 'Bob', 'Samuel', '31 Maple Blvd, Star City', '7891234560', 'Administrator', 4500.00, 'bwilliams', 'password321'),
(37, 'Bob', 'Sam', '31 Maple Blvd, Star City', '7891234560', 'Administrator', 4500.00, 'bwilliams', 'password321');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `assignedtasks`
--
ALTER TABLE `assignedtasks`
  ADD CONSTRAINT `assignedtasks_ibfk_1` FOREIGN KEY (`staff_id`) REFERENCES `staff` (`staff_id`);

--
-- Constraints for table `attendance`
--
ALTER TABLE `attendance`
  ADD CONSTRAINT `attendance_ibfk_1` FOREIGN KEY (`staff_ID`) REFERENCES `staff` (`staff_id`);

--
-- Constraints for table `leaverequests`
--
ALTER TABLE `leaverequests`
  ADD CONSTRAINT `leaverequests_ibfk_1` FOREIGN KEY (`staff_ID`) REFERENCES `staff` (`staff_id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
