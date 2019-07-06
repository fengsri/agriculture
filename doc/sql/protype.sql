/*
Navicat MySQL Data Transfer

Source Server         : pro
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : agriproduct

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-07-05 19:48:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `protype`
-- ----------------------------
DROP TABLE IF EXISTS `protype`;
CREATE TABLE `protype` (
  `proTypeId` int(11) NOT NULL COMMENT '农产品类别编号',
  `proTypeName` varchar(20) NOT NULL COMMENT '农产品类别名称',
  `proTypeDese` varchar(60) DEFAULT NULL COMMENT '农产品类别描述',
  `proTypeCreateTime` datetime NOT NULL COMMENT '农产品类别创建时间',
  `proTypeModifyTime` datetime DEFAULT NULL COMMENT '农产品类别修改时间',
  `id` int(11) NOT NULL,
  PRIMARY KEY (`proTypeId`),
  UNIQUE KEY `proTypeId` (`proTypeId`),
  UNIQUE KEY `proTypeName` (`proTypeName`),
  KEY `id` (`id`),
  CONSTRAINT `protype_ibfk_1` FOREIGN KEY (`id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of protype
-- ----------------------------
