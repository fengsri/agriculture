/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : agriculture

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-07-04 22:07:11
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for usertype
-- ----------------------------
DROP TABLE IF EXISTS `usertype`;
CREATE TABLE `usertype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifiedTime` datetime DEFAULT NULL COMMENT '修改时间',
  `deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除： 1：可用  0：删除',
 `userTypeName` varchar(20) NOT NULL DEFAULT '用户' COMMENT '用户类型：用户 农户 管理员',
 `userTypeDesc` varchar(40) DEFAULT NULL  COMMENT '用户描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=gbk;
