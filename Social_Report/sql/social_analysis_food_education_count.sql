-- MySQL dump 10.13  Distrib 5.7.22, for Linux (x86_64)
--
-- Host: localhost    Database: social_analysis
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.34-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `food_education_count`
--

DROP TABLE IF EXISTS `food_education_count`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `food_education_count` (
  `education` text,
  `num` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `food_education_count`
--

LOCK TABLES `food_education_count` WRITE;
/*!40000 ALTER TABLE `food_education_count` DISABLE KEYS */;
INSERT INTO `food_education_count` VALUES ('北京大学',4),('南京大学',3),('复旦大学',2),('北京工业大学',2),('深圳大学',2),('广州大学',2),('北京电影学院',1),('辽宁大学',1),('厦门理工学院',1),('北京科技大学',1),('东方学院',1),('广州大学/江门市实验小学/河南初级中学/新会冈州中学/广东省科技干部学院',1),('浙江树人大学',1),('广东财经大学',1),('四川大学',1),('上海交通大学/北京二十四中',1),('Korea/University',1),('香港中文大學',1),('福州大学/福建医科大学/福建信息职业技术学院/福建师范大学/福建工程学院/福建农林大学/福建华南女子职业学院/福州二中/福州一中/福州第三中学/福州四中/福州八中/福州实验小学/福州高级中学/福州屏东中学...',1),('中国农业大学',1),('北京民族大学',1),('中国人民大学',1),('上海商学院',1),('漳州职业技术学院/财贸学校',1),('佛山广播电视大学/汾江中学/佛山四中/佛山市元甲学校',1),('湖南工业大学',1),('湖南大学',1),('山东大学',1),('中南大学/湖南大学/长沙市一中/长沙理工大学/湖南商学院/湖南农业大学/长沙学院/中南林业科技大学/雅礼中学/湖南师范大学/长郡中学',1),('集美大学/厦门外国语学校',1),('南昌大学/江西科技师范大学/江西师范大学/江西农业大学/江西广播电视大学/江西科技学院/江西科技学院/江西财经大学/江西中医药大学',1),('东方美食学院',1),('杭州传媒大学',1),('广东外语外贸大学/广东外语外贸大学',1),('北京影视学院/北京三中',1),('北京师范大学',1),('山东大学/北京理工大学珠海学院',1),('北京农业大学',1),('澳门大学',1),('湖南商学院',1),('天津外国语大学',1),('浙江师范大学/浙江师范大学',1),('复旦大学/上海交通大学',1),('北京大学/中国人民大学附属中学分校/十一学校',1);
/*!40000 ALTER TABLE `food_education_count` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-17  8:24:25
