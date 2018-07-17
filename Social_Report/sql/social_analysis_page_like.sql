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
-- Table structure for table `page_like`
--

DROP TABLE IF EXISTS `page_like`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `page_like` (
  `weibowriter` text,
  `weibocontent` text,
  `like_num` text
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `page_like`
--

LOCK TABLES `page_like` WRITE;
/*!40000 ALTER TABLE `page_like` DISABLE KEYS */;
INSERT INTO `page_like` VALUES ('谢娜','你们许愿的时间都很短吗 感恩感恩，爱你们 以后的日子我们一起快乐 ​​​​','390920'),('张杰','这位C位出道的小姐姐，不撅嘴也是又瘦又美的，期待今晚快乐家族合体！ ​​​​','343796'),('周冬雨','@张一山 长大了一岁 希望成熟点 不要再蹭我热度了 ​​​​','321546'),('何炅','村里的小何偷偷翻出手机来祝我娜娜生日快乐！这一岁好不一样，你有了全新的身份，全新的世界，真好！也许有更多的人在呼唤你需要你，但是你知道，你一回头，我会在听。娜娜！生日快乐！@谢娜 ​​​​','305065'),('范丞丞Adam0616','第一次正式登台就被表白，怎么办？ 在线等 ​​​​','278362'),('超级農農','妳们都为我努力着，我真的很感激我们一起加油吧！就是今天！#NINEPERCENT# ​​​​','263166'),('李易峰','King!!! ​​​​','250823'),('薛之谦','70年代 成功源于规矩 80年代 成功源于勤奋90年代 成功源于勇敢 00年代 成功源于细节10年代 成功源于别致 但万变不离其中的是匠心...  今晚 20:30北京卫视 #跨界歌王# 匠心出品 ​​​​','205456');
/*!40000 ALTER TABLE `page_like` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-07-17  8:24:26
