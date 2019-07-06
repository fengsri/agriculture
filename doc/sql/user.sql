/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : agriculture

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-07-04 23:36:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifiedTime` datetime DEFAULT NULL COMMENT '修改时间',
  `deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除： 1：可用  0：删除',
  `userName` varchar(25) NOT NULL COMMENT '用户名',
  `userPassword` varchar(40) NOT NULL COMMENT '用户密码',
  `userPhone` bigint(15) NOT NULL COMMENT '用户电话号码',
  `userIdcard` varchar(20) NOT NULL COMMENT '身份证号码',
  `userBirthday` date DEFAULT NULL COMMENT '用户生日',
  `userEmail` varchar(20) NOT NULL COMMENT '用户邮箱',
  `userHeaderPic` varchar(40) DEFAULT NULL COMMENT '用户头像',
  `userDescription` varchar(50) DEFAULT NULL COMMENT '用户描述',
  `userAddress` varchar(50) DEFAULT NULL COMMENT '用户地址',
  `userStatue` int(10) NOT NULL DEFAULT '1' COMMENT '用户状态：1；表示可用  2：表示不可用',
  `userTypeId` int(11) NOT NULL DEFAULT '1' COMMENT '用户类型：1：用户 2：农户 3：超级管理员',
  `userGrander` int(11) NOT NULL DEFAULT '1' COMMENT '性别：1男 2女 3未知',
  PRIMARY KEY (`id`),
  UNIQUE KEY `un` (`userName`) USING BTREE,
  UNIQUE KEY `up` (`userPhone`) USING BTREE,
  UNIQUE KEY `ui` (`userIdcard`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
