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
-- Table structure for table `user_forword`
--

DROP TABLE IF EXISTS `user_forword`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_forword` (
  `weibowriter` text,
  `weibocontent` text,
  `forword_num` text
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_forword`
--

LOCK TABLES `user_forword` WRITE;
/*!40000 ALTER TABLE `user_forword` DISABLE KEYS */;
INSERT INTO `user_forword` VALUES ('超级農農','妳们都为我努力着，我真的很感激我们一起加油吧！就是今天！#NINEPERCENT# ​​​​','1537386'),('范丞丞Adam0616','第一次正式登台就被表白，怎么办？ 在线等 ​​​​','1376462'),('NINEPERCENT官博','#NINEPERCENT#今晚，是启航。少年并肩，与梦同行谢谢上海！THX with LOVE 感谢粉丝见面会...展开全文c','910648'),('薛之谦','70年代 成功源于规矩 80年代 成功源于勤奋90年代 成功源于勇敢 00年代 成功源于细节10年代 成功源于别致 但万变不离其中的是匠心...  今晚 20:30北京卫视 #跨界歌王# 匠心出品 ​​​​','602570'),('王子异','‭我爱你们晚安 ​​​​','350117'),('Dear-迪丽热巴','不辜负美食，也不忘保持身体的轻盈！来，接住这瓶雪碧纤维＋，酷爽不变，轻盈有加！我先开动啦～L迪丽热巴轻盈小秘密 ​​​​','218764'),('佟丽娅','转发十万要抖的糗事来了～感谢 @岳云鹏 @李光洁 @杨迪 @刘昊然turbo @苏伦_Solon 起哄架秧子@雷佳音 送你上热搜 L佟丽娅的秒拍视频 ​​​​','202735'),('章小跳','转发这条微博，昵称后边会加上小木马！#我要过六一# ​​​​','178111'),('TFBOYS-王源','最近吃的太好了  脸真的胖了  急  怎么减！！！在线等！！ ​​​​','103302');
/*!40000 ALTER TABLE `user_forword` ENABLE KEYS */;
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
