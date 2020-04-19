CREATE DATABASE ideal_mybatis; -- 创建数据库

CREATE TABLE USER (
    id		INT(11)NOT NULL AUTO_INCREMENT,
    username 	VARCHAR(32) NOT NULL COMMENT '用户名',
    telephone     VARCHAR(11) NOT NULL COMMENT '手机',
    birthday	DATETIME DEFAULT NULL COMMENT '生日',
    gender 	CHAR(1) DEFAULT NULL COMMENT '性别',
    address	VARCHAR(256) DEFAULT NULL COMMENT '地址',
    PRIMARY KEY  (`id`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


INSERT INTO user VALUES(1,'张三','13720363206','1988/05/06','男','广东深圳');
INSERT INTO user VALUES(2,'李四','13503292104','2000/02/02','男','广东广州');
INSERT INTO user VALUES(3,'王五','13703293206','1989/04/02','女','广东河源');