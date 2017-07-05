/*
Navicat MySQL Data Transfer

Source Server         : dp9212
Source Server Version : 50718
Source Host           : localhost:3306
Source Database       : myphotos

Target Server Type    : MYSQL
Target Server Version : 50718
File Encoding         : 65001

Date: 2017-07-05 19:01:58
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_classify
-- ----------------------------
DROP TABLE IF EXISTS `t_classify`;
CREATE TABLE `t_classify` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `classify_name` varchar(20) NOT NULL COMMENT '相册分类名称',
  `classify_describe` varchar(150) DEFAULT NULL COMMENT '描述',
  `classify_coverImg` varchar(100) DEFAULT NULL,
  `classify_createTime` datetime DEFAULT NULL,
  `classify_updateTime` datetime DEFAULT NULL,
  `user_id` int(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_classify
-- ----------------------------
INSERT INTO `t_classify` VALUES ('1', '骑行', '这是一次活动', 'http://or3tpjd0x.bkt.clouddn.com/1498706493214.jpg', '2017-07-03 16:36:32', '2017-07-03 16:36:35', '1');
INSERT INTO `t_classify` VALUES ('2', '郊游', '贴图图突突突图', 'http://or3tpjd0x.bkt.clouddn.com/1498706507400.jpg', '2017-07-03 18:01:09', '2017-07-03 18:01:11', '1');
INSERT INTO `t_classify` VALUES ('3', '旅游', 'djaishdaiosd', 'http://or3tpjd0x.bkt.clouddn.com/1498706493214.jpg', '2017-07-03 18:01:49', '2017-07-03 18:01:51', '1');
INSERT INTO `t_classify` VALUES ('4', '拍照', '照片照片照片', 'http://or3tpjd0x.bkt.clouddn.com/1498706507400.jpg', '2017-07-03 18:03:42', '2017-07-03 18:03:44', '1');
INSERT INTO `t_classify` VALUES ('5', '我自己的相册', '我自己的相册我自己的相册我自己的相册我自己的相册我自己的相册我自己的相册我自己的相册我自己的相册我自己的相册', 'http://or3tpjd0x.bkt.clouddn.com/1498706507400.jpg', '2017-07-05 18:49:03', null, '1');
INSERT INTO `t_classify` VALUES ('7', '我的第二个相册', '我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第二个相册我的第', 'http://or3tpjd0x.bkt.clouddn.com/1498706507400.jpg', '2017-07-05 18:53:23', null, '1');

-- ----------------------------
-- Table structure for t_photo
-- ----------------------------
DROP TABLE IF EXISTS `t_photo`;
CREATE TABLE `t_photo` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `classify_id` int(10) NOT NULL COMMENT '所属分类id',
  `photo_name` varchar(20) DEFAULT NULL,
  `photo_url` varchar(50) DEFAULT NULL,
  `photo_describe` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_photo
-- ----------------------------

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(15) NOT NULL,
  `user_password` varchar(16) NOT NULL,
  `user_tel` varchar(11) DEFAULT NULL,
  `user_address` varchar(50) DEFAULT NULL,
  `user_img` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `user_createTime` datetime DEFAULT NULL,
  `user_updateTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', 'admin', '123456', '13699405203', '成都', null, '2017-06-28 15:39:02', '2017-06-28 15:39:05');
SET FOREIGN_KEY_CHECKS=1;
