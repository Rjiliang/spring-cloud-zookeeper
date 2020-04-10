/*
SQLyog Ultimate v11.25 (64 bit)
MySQL - 8.0.13 : Database - ums
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ums` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ums`;

/*Table structure for table `broker_node` */

DROP TABLE IF EXISTS `broker_node`;

CREATE TABLE `broker_node` (
  `brokerId` bigint(20) NOT NULL AUTO_INCREMENT,
  `brokerName` varchar(20) DEFAULT NULL,
  `topic` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`brokerId`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `broker_node` */

insert  into `broker_node`(`brokerId`,`brokerName`,`topic`) values (1,'server_1','test'),(2,'server_2','test');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
