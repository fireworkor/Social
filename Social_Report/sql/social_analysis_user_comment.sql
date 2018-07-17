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
-- Table structure for table `user_comment`
--

DROP TABLE IF EXISTS `user_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user_comment` (
  `weibocontent` text,
  `comment_num` text,
  `weibowriter` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_comment`
--

LOCK TABLES `user_comment` WRITE;
/*!40000 ALTER TABLE `user_comment` DISABLE KEYS */;
INSERT INTO `user_comment` VALUES ('把你相册最好看的一张自拍留在评论里。感觉不错的就聊聊吧！ ​ ​​​ ​​​​','135484',''),('妳们都为我努力着，我真的很感激我们一起加油吧！就是今天！#NINEPERCENT# ​​​​','124331',''),('第一次正式登台就被表白，怎么办？ 在线等 ​​​​','112043',''),('最近吃的太好了  脸真的胖了  急  怎么减！！！在线等！！ ​​​​','44638',''),('#NINEPERCENT#今晚，是启航。少年并肩，与梦同行谢谢上海！THX with LOVE 感谢粉丝见面会...展开全文c','43821',''),('King!!! ​​​​','36760',''),('‭我爱你们晚安 ​​​​','33958',''),('70年代 成功源于规矩 80年代 成功源于勤奋90年代 成功源于勇敢 00年代 成功源于细节10年代 成功源于别致 但万变不离其中的是匠心...  今晚 20:30北京卫视 #跨界歌王# 匠心出品 ​​​​','30226',''),('【9岁女孩阻止插队被打 插队者丈夫：女孩先辱骂和踢打孕妻】近日，湖南9岁女孩在游乐项目前排队时，因阻止一对母子插队被打。警方：打人者拒绝见面调解。打人者丈夫：妻子有身孕，当时只是想和女孩协调排队，女孩先辱骂和踢打了妻子。如不撤销恶意报道，不会去接受调解。L新京报我们视频的秒拍视频 ​​​​','27169','');
/*!40000 ALTER TABLE `user_comment` ENABLE KEYS */;
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
