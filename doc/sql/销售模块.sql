CREATE TABLE `shoppingCart` (
`id` int NOT NULL AUTO_INCREMENT COMMENT '购物车编号',
`userId` int NOT NULL COMMENT '用户编号',
`proId` int NOT NULL COMMENT '产品编号',
`suppierId` int NOT NULL COMMENT '供应商编号',
`shoppingCartNum` int NOT NULL DEFAULT 1 COMMENT '购物车数量 默认为1',
`shoppingCartAddTimePrice` double NOT NULL COMMENT '添加购物车时价格',
`createTime` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据创立时间',
`modifiedTime` datetime NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '数据修改时间',
`deleted` int NULL DEFAULT 1 COMMENT '是否删除 1可用 0删除',
PRIMARY KEY (`id`)
);
CREATE TABLE `preference` (
`id` int NOT NULL COMMENT '偏好id',
`userId` int NOT NULL COMMENT '用户编号',
`proTypeId` int NOT NULL COMMENT '商品类型编号',
`preferenceValue` int NOT NULL DEFAULT 1 COMMENT '1正常 0不喜欢 2-10代表喜欢等级',
`createTime` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP,
`modifiedTime` datetime NULL ON UPDATE CURRENT_TIMESTAMP,
`deleted` int NULL DEFAULT 1,
PRIMARY KEY (`id`)
);
CREATE TABLE `history` (
`id` int NOT NULL AUTO_INCREMENT COMMENT '历史编号id 自增',
`userId` int NOT NULL,
`proId` int NOT NULL COMMENT '产品编号',
`createTime` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
`modifiedTime` datetime NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
`deleted` int NOT NULL DEFAULT 1 COMMENT '1可用 0删除',
PRIMARY KEY (`id`)
);
