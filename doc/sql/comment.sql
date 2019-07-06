CREATE TABLE `comment` (
`comId` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '评价id',
`productId` int NOT NULL COMMENT '商品id',
`userId` int NOT NULL COMMENT '评价用户的id',
`comText` varchar(40) NULL COMMENT '评价内容',
`comDate` datetime(12) NULL COMMENT '评价时间 ',
`deleted` int NULL COMMENT '是否已经删除 1代表可用 2代表删除',
`createTime` datetime NULL,
`modifiedTime` datetime NULL COMMENT '修改时间',
PRIMARY KEY (`comId`) 
);

CREATE TABLE `reply` (
`replyId` int UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '回复id',
`comId` int NOT NULL COMMENT '评价id',
`userId` int NOT NULL COMMENT '回复评价的用户id',
`replyTxet` varchar(30) NULL COMMENT '回复内容',
`replyDate` datetime NULL COMMENT '回复时间',
`createTime` datetime NULL COMMENT '创建时间',
`modifiedTime` datetime NULL COMMENT '修改时间',
`deleted` int NULL COMMENT '是否删除 1代表可用 2代表删除',
PRIMARY KEY (`replyId`) 
);


ALTER TABLE `reply` ADD CONSTRAINT `fk_reply_comment_1` FOREIGN KEY (`comId`) REFERENCES `comment` (`comId`);

