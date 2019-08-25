/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 8.0.14 : Database - ssm-demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm-demo` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm-demo`;

/*Table structure for table `tb_admin_user` */

DROP TABLE IF EXISTS `tb_admin_user`;

CREATE TABLE `tb_admin_user` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_name` varchar(20) NOT NULL DEFAULT '' COMMENT '用户名',
  `password_md5` varchar(50) NOT NULL DEFAULT '' COMMENT '密码',
  `user_token` varchar(50) NOT NULL DEFAULT '' COMMENT 'token值',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否已删除 0未删除 1已删除',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=68 DEFAULT CHARSET=utf8;

/*Data for the table `tb_admin_user` */

insert  into `tb_admin_user`(`id`,`user_name`,`password_md5`,`user_token`,`is_deleted`,`create_time`) values 
(1,'admin','e10adc3949ba59abbe56e057f20f883e','3fd4edc35538b01ba9cbfc3d3eb1cb1c',0,'2019-08-06 15:24:10'),
(2,'test2','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:28'),
(3,'test3','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),
(4,'test4','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),
(5,'test5','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:33'),
(6,'test6','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:34'),
(7,'test7','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),
(8,'test8','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),
(9,'test9','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:36'),
(10,'test10','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:37'),
(11,'test11','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),
(12,'test12','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),
(13,'test13','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:39'),
(14,'test14','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),
(15,'test15','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),
(16,'test16','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),
(17,'test17','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),
(18,'test18','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:42'),
(19,'test19','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:46'),
(20,'admin2','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:28'),
(21,'admin3','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),
(22,'admin4','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),
(23,'admin5','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:33'),
(24,'admin6','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:34'),
(25,'admin7','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),
(26,'admin8','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),
(27,'admin9','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:36'),
(28,'admin10','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:37'),
(29,'admin11','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),
(30,'admin12','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),
(31,'admin13','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:39'),
(32,'admin14','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),
(33,'admin15','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),
(34,'admin16','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),
(35,'admin17','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),
(36,'admin18','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:42'),
(37,'admin19','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:46'),
(38,'admin011','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),
(39,'admin02','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:28'),
(40,'admin03','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),
(41,'admin04','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),
(42,'admin05','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:33'),
(43,'admin06','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:34'),
(44,'admin07','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),
(45,'admin08','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),
(46,'admin09','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:36'),
(47,'admin010','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:37'),
(48,'admin011','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),
(49,'admin012','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),
(50,'admin013','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:39'),
(51,'admin014','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),
(52,'admin015','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),
(53,'admin016','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),
(54,'admin017','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),
(55,'admin018','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:42'),
(57,'chaoshenzhe','e10adc3949ba59abbe56e057f20f883e','',0,'2019-08-15 16:55:56');

/*Table structure for table `tb_ssm_article` */

DROP TABLE IF EXISTS `tb_ssm_article`;

CREATE TABLE `tb_ssm_article` (
  `id` int(4) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `article_title` varchar(200) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '标题',
  `article_content` text CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '内容',
  `add_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '' COMMENT '添加人',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否已删除 0未删除 1已删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `tb_ssm_article` */

insert  into `tb_ssm_article`(`id`,`article_title`,`article_content`,`add_name`,`create_time`,`update_time`,`is_deleted`) values 
(1,'第一次测试','看看第一次能不能成功，这个界面显示我感觉是有点问题的。','Leiah','2019-08-23 17:06:16','2019-08-23 17:06:16',0),
(2,'第四次测试','二三次测试均保存失败。','Leiah','2019-08-23 17:26:08','2019-08-23 17:26:08',0),
(3,'第五次修改','<h2>\n	稍微修改了一下这个界面。现在的问题是无法显示已插入的文章。\n</h2>','Leiah','2019-08-23 19:09:09','2019-08-23 19:09:09',0),
(4,'第六次测试','这次使用的是下载下来的源码，似乎也不能显示记录。','Leiah','2019-08-23 19:30:36','2019-08-23 19:30:36',0),
(5,'第七次测试','成功显示记录，下载了下一节课的源码。','Leiah','2019-08-23 19:48:33','2019-08-23 19:48:33',0),
(6,'第八次测试','<p>\n	终于发现问题了，原来是jgGrid中datatype的t大写了，改成小写就好了。<img src=\"http://localhost:8080/plugins/kindeditor-4.1.10/plugins/emoticons/images/11.gif\" border=\"0\" alt=\"\" />\n</p>','Leiah','2019-08-23 20:41:49','2019-08-23 20:41:49',0);

/*Table structure for table `tb_ssm_picture` */

DROP TABLE IF EXISTS `tb_ssm_picture`;

CREATE TABLE `tb_ssm_picture` (
  `id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `path` varchar(50) NOT NULL DEFAULT '' COMMENT '图片路径',
  `remark` varchar(200) NOT NULL DEFAULT '' COMMENT '备注',
  `is_deleted` tinyint(4) NOT NULL DEFAULT '0' COMMENT '是否已删除 0未删除 1已删除',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

/*Data for the table `tb_ssm_picture` */

insert  into `tb_ssm_picture`(`id`,`path`,`remark`,`is_deleted`,`create_time`) values 
(21,'/upload/20190818_22141661.jpg','女人背影',0,'2019-08-18 22:14:29'),
(22,'http://localhost:8080/upload/20190823_21163632.jpg','粉色老鼠',0,'2019-08-23 21:16:45');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
