
-- 使用数据库
use agriculture;


-- 创建测试表
create table if not exists `test`(
    `id` int not null auto_increment comment 'ID',
    `gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
    `gmt_modified` timestamp    null COMMENT '最近修改时间戳',
    `deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除： 1：可用  0：删除',
    `name` varchar(32) not null comment '名称',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8 COMMENT = '测试表';



-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
  `gmt_modified` timestamp    null COMMENT '最近修改时间戳',
  `deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除： 1：可用  0：删除',
  `userName` varchar(25) NOT NULL COMMENT '用户名',
  `userPassword` varchar(32) NOT NULL COMMENT '用户密码',
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
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;


-- ----------------------------
-- Table structure for usertype
-- ----------------------------
DROP TABLE IF EXISTS `usertype`;
CREATE TABLE `usertype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
  `gmt_modified` timestamp   null  COMMENT '最近修改时间戳',
  `deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除： 1：可用  0：删除',
  `userTypeName` varchar(20) NOT NULL DEFAULT '用户' COMMENT '用户类型：用户 农户 管理员',
  `userTypeDesc` varchar(40) DEFAULT NULL  COMMENT '用户描述',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;




-- ----------------------------
-- Table structure for `protype`
-- ----------------------------
DROP TABLE IF EXISTS `protype`;
CREATE TABLE `protype` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '农产品类别编号',
  `gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
  `gmt_modified` timestamp    null COMMENT '最近修改时间戳',
  `deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除： 1：可用  0：删除',
  `proTypeNum` int(11) NOT NULL COMMENT '农产品类别编号',
  `proTypeName` varchar(20) NOT NULL COMMENT '农产品类别名称',
  `proTypeDese` varchar(60) DEFAULT NULL COMMENT '农产品类别描述',
  PRIMARY KEY (`id`),
  UNIQUE KEY `proTypeName` (`proTypeName`)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of protype
-- ----------------------------




-- ----------------------------
-- Table structure for `agriproducts`
-- ----------------------------
DROP TABLE IF EXISTS `agriproducts`;
CREATE TABLE `agriproducts` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '农产品id',
  `gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
  `gmt_modified` timestamp    null COMMENT '最近修改时间戳',
  `deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除： 1：可用  0：删除',
  `proNum` int(11) NOT NULL COMMENT '农产品编号',
  `userId` int(11) NOT NULL COMMENT '农户编号',
  `proTypeId` int(11) NOT NULL COMMENT '农产品类别编号',
  `proName` varchar(40) NOT NULL COMMENT '农产品名称',
  `proSaleAttributes` varchar(20) DEFAULT NULL COMMENT '销售属性',
  `proDiscount` int(11) NOT NULL COMMENT '售卖折扣',
  `proPictureUrl` varchar(100) NOT NULL COMMENT '农产品图片',
  `proSprice` double NOT NULL COMMENT '农产品市场原价',
  `proPprice` double NOT NULL COMMENT '农产品会员价',
  `proStime`  datetime NOT NULL COMMENT '农产品上架时间',
  `proQtime` int(11) NOT NULL COMMENT '农产品保质期',
  `proModifytime` datetime DEFAULT NULL COMMENT '农产品信息修改时间',
  `proAddress` varchar(60) NOT NULL COMMENT '农产品产地',
  `proNumber` int(11) DEFAULT NULL COMMENT '库存数量',
  `proDese` varchar(100) DEFAULT NULL COMMENT '农产品描述、备注',
  `proStatue` int(11) NOT NULL DEFAULT '1' COMMENT '农产品状态（1，上架，2，下架）',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of agriproducts
-- ----------------------------



-- ----------------------------
-- Table structure for `comment`
-- ----------------------------
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '评论id',
  `gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
  `gmt_modified` timestamp    null COMMENT '最近修改时间戳',
  `deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除： 1：可用  0：删除',
  `productId` int NOT NULL COMMENT '商品id',
  `userId` int NOT NULL COMMENT '评价用户的id',
  `comText` varchar(40) NULL COMMENT '评价内容',
  `comDate` timestamp NULL COMMENT '评价时间 ',
  PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;



CREATE TABLE `reply` (
`id` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '回复id',
 `gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
 `gmt_modified` timestamp    null COMMENT '最近修改时间戳',
`deleted` int NULL COMMENT '是否删除 1代表可用 2代表删除',
`comId` int NOT NULL COMMENT '评价id',
`userId` int NOT NULL COMMENT '回复评价的用户id',
`replyTxet` varchar(30) NULL COMMENT '回复内容',
`replyDate` datetime NULL COMMENT '回复时间',
PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;




-- ----------------------------
-- Table structure for `orderitem`
-- ----------------------------
DROP TABLE IF EXISTS `orderitem`;
CREATE TABLE `orderitem` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
  `gmt_modified` timestamp    null COMMENT '最近修改时间戳',
  `delete` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除（1，可用 0，删除）',
  `orderNum` char(15) NOT NULL COMMENT '订单编号',
  `proId` int(11) NOT NULL COMMENT '农产品编号',
  `proName` varchar(40) NOT NULL COMMENT '农产品名称',
  `proNum` int(11) NOT NULL COMMENT '数量',
  `orderItemPrice` double NOT NULL COMMENT '农产品价格',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of orderitem
-- ----------------------------


-- ----------------------------
-- Table structure for `orders`
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
  `gmt_modified` timestamp    null COMMENT '最近修改时间戳',
  `orderNum` char(15) NOT NULL COMMENT '订单编号',
  `deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除（1，可用 0，删除）',
  `userId` int(11) NOT NULL COMMENT '客户编号',
  `orderCreateTime` datetime NOT NULL COMMENT '订单创建时间',
  `orderFinishTime` datetime NOT NULL COMMENT '订单完成时间',
  `orderStatus` int(11) NOT NULL DEFAULT '1' COMMENT '订单状态（1，待发货 2，待收货 3，交易关闭 4，交易完成 5，已删除）',
  `orderSumPrice` double NOT NULL COMMENT '订单总价',
  `orderAddress` varchar(40) NOT NULL COMMENT '订单收货地址',
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------




CREATE TABLE `shoppingCart` (
`id` int NOT NULL AUTO_INCREMENT COMMENT '购物车编号',
`gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
`gmt_modified` timestamp   null  COMMENT '最近修改时间戳',
`deleted` int NULL DEFAULT 1 COMMENT '是否删除 1可用 0删除',
`userId` int NOT NULL COMMENT '用户id',
`proId` int NOT NULL COMMENT '产品id',
`suppierId` int NOT NULL COMMENT '供应商id',
`shoppingCartNum` int NOT NULL DEFAULT 1 COMMENT '购物车数量 默认为1',
`shoppingCartAddTimePrice` double NOT NULL COMMENT '添加购物车时价格',
PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;


CREATE TABLE `preference` (
`id` int NOT NULL COMMENT '偏好id',
`gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
`gmt_modified` timestamp   null  COMMENT '最近修改时间戳',
`deleted` int NULL DEFAULT 1,
`userId` int NOT NULL COMMENT '用户id',
`proTypeId` int NOT NULL COMMENT '商品类型id',
`preferenceValue` int NOT NULL DEFAULT 1 COMMENT '1正常 0不喜欢 2-10代表喜欢等级',
PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;


CREATE TABLE `history` (
`id` int NOT NULL AUTO_INCREMENT COMMENT '历史编号id 自增',
 `gmt_create`   timestamp   DEFAULT CURRENT_TIMESTAMP  COMMENT '创建时间戳',
`gmt_modified` timestamp   null  COMMENT '最近修改时间戳',
`deleted` int(11) NOT NULL DEFAULT '1' COMMENT '是否已经删除： 1：可用  0：删除',
`userId` int NOT NULL COMMENT '用户id',
`proId` int NOT NULL COMMENT '产品id',
PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;
