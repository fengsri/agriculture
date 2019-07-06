/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : agriculture

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-07-05 11:25:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orderId` char(15) NOT NULL COMMENT '订单编号',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifiedTime` datetime DEFAULT NULL COMMENT '修改时间',
  `deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除（1，可用 0，删除）',
  `userId` int(11) NOT NULL COMMENT '客户编号',
  `orderCreateTime` datetime NOT NULL COMMENT '订单创建时间',
  `orderFinishTime` datetime NOT NULL COMMENT '订单完成时间',
  `orderStatus` int(11) NOT NULL DEFAULT '1' COMMENT '订单状态（1，待发货 2，待收货 3，交易关闭 4，交易完成 5，已删除）',
  `orderSumPrice` double NOT NULL COMMENT '订单总价',
  `orderAddress` varchar(40) NOT NULL COMMENT '订单收货地址',
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
