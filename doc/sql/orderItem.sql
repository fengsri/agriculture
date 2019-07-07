/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : agriculture

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-07-05 19:48:45
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `orderitem`
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `modifiedTime` datetime DEFAULT NULL COMMENT '修改时间',
  `delete` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除（1，可用 0，删除）',
  `orderId` char(15) NOT NULL COMMENT '订单编号',
  `proId` int(11) NOT NULL COMMENT '农产品编号',
  `proName` varchar(40) NOT NULL COMMENT '农产品名称',
  `proNum` int(11) NOT NULL COMMENT '数量',
  `orderItemPrice` double NOT NULL COMMENT '农产品价格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------
