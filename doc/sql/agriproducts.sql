/*
Navicat MySQL Data Transfer

Source Server         : pro
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : agriproduct

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-07-05 19:48:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `agriproducts`
-- ----------------------------
DROP TABLE IF EXISTS `agriproducts`;
CREATE TABLE `agriproducts` (
  `proId` int(11) NOT NULL COMMENT '农产品编号',
  `proName` varchar(40) NOT NULL COMMENT '农产品名称',
  `proTypeId` int(11) NOT NULL COMMENT '农产品类别编号',
  `id` int(11) NOT NULL COMMENT '农户编号',
  `proSaleAttributes` varchar(20) DEFAULT NULL COMMENT '销售属性',
  `proDiscount` int(11) NOT NULL COMMENT '售卖折扣',
  `proPictureUrl` varchar(100) NOT NULL COMMENT '农产品图片',
  `proSprice` double NOT NULL COMMENT '农产品市场原价',
  `proPprice` double NOT NULL COMMENT '农产品会员价',
  `proStime` datetime NOT NULL COMMENT '农产品上架时间',
  `proQtime` int(11) NOT NULL COMMENT '农产品保质期',
  `proModifytime` datetime DEFAULT NULL COMMENT '农产品信息修改时间',
  `proAddress` varchar(60) NOT NULL COMMENT '农产品产地',
  `proNumber` int(11) DEFAULT NULL COMMENT '库存数量',
  `proDese` varchar(100) DEFAULT NULL COMMENT '农产品描述、备注',
  `proStatue` int(11) NOT NULL DEFAULT '1' COMMENT '农产品状态（1，上架，2，下架）',
  PRIMARY KEY (`proId`),
  UNIQUE KEY `proId` (`proId`) USING BTREE,
  KEY `proTypeId` (`proTypeId`) USING BTREE,
  KEY `id` (`id`) USING BTREE,
  CONSTRAINT `agriproducts_ibfk_1` FOREIGN KEY (`proTypeId`) REFERENCES `protype` (`proTypeId`),
  CONSTRAINT `agriproducts_ibfk_2` FOREIGN KEY (`id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

-- ----------------------------
-- Records of agriproducts
-- ----------------------------
