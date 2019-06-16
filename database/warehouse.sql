/*
SQLyog Enterprise - MySQL GUI v8.02 RC
MySQL - 5.5.0-m2-community : Database - warehouse
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`warehouse` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `warehouse`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `admin` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `contact` decimal(19,0) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert  into `admin`(`admin`,`address`,`contact`,`email`,`password`) values ('admin','dadabari','123456789','admin@gmail.com','admin');

/*Table structure for table `deposit` */

DROP TABLE IF EXISTS `deposit`;

CREATE TABLE `deposit` (
  `name` varchar(100) NOT NULL,
  `type` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `qty` decimal(3,0) DEFAULT NULL,
  `date` varchar(100) DEFAULT NULL,
  `remark` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `deposit` */

insert  into `deposit`(`name`,`type`,`description`,`qty`,`date`,`remark`) values ('hari','w46','this is white wheat','12','12-mar-2018','no remarks');

/*Table structure for table `employeedata` */

DROP TABLE IF EXISTS `employeedata`;

CREATE TABLE `employeedata` (
  `name` varchar(100) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `contact` varchar(100) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `employeedata` */

/*Table structure for table `grain_data` */

DROP TABLE IF EXISTS `grain_data`;

CREATE TABLE `grain_data` (
  `name` varchar(100) NOT NULL,
  `type` varchar(100) DEFAULT NULL,
  `description` varchar(100) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `grain_data` */

insert  into `grain_data`(`name`,`type`,`description`,`qty`) values ('bhusa','r12','Basmati rice',5),('hari','w46','this is very good wheat',0);

/*Table structure for table `logindata` */

DROP TABLE IF EXISTS `logindata`;

CREATE TABLE `logindata` (
  `email` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  `usertype` char(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `logindata` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
