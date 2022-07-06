# 创建数据库
drop database if exists cn_soft_cup;
create database cn_soft_cup;
use cn_soft_cup;

#暂时创建三个代理人表
drop table if exists proxy_1;
drop table if exists proxy_2;
drop table if exists proxy_3;

#对表一内容进行插入
create table `proxy_1`
(
    `sequenceNo`        int(8) NOT NULL AUTO_INCREMENT COMMENT '主键',
    `carrier`           varchar(2) DEFAULT NULL COMMENT '航班承运人',
    `flightNo`          varchar(4) DEFAULT NULL COMMENT '航班号',
    `cabin`             varchar(1) DEFAULT NULL COMMENT '舱位',
    `amount`            int(8)     DEFAULT NULL COMMENT '票价',
    `departure`         varchar(3) DEFAULT NULL COMMENT '起飞城市',
    `arrival`           varchar(3) DEFAULT NULL COMMENT '到达城市',
    `departureDatetime` bigint(12)   DEFAULT NULL COMMENT '起飞时间',
    `duration`          datetime   DEFAULT NULL COMMENT '路程时间',
    `surcharge`         int(3)     DEFAULT NULL COMMENT '额外费用百分比',
    `nextCarrier`       varchar(2) DEFAULT NULL COMMENT '后序衔接航空公司',
    `seatNum`           varchar(1) DEFAULT NULL COMMENT '舱位余座',
#     `agencies`             varchar(60)   DEFAULT NULL COMMENT '允许出票的代理人队列',
    PRIMARY KEY (`sequenceNo`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8
  COLLATE = utf8_bin;
INSERT INTO `proxy_1`
VALUES (null, 'CA', '0100', 'F', 1000, 'BJS', 'SHA', '202207091914', '1133', 30, 'F', 1);
INSERT INTO `proxy_1`
VALUES (null, 'CA', '0100', 'F', 1000, 'BJS', 'SHA', '202207091914', '1133', 30, 'F', 2);
INSERT INTO `proxy_1`
VALUES (null, 'CA', '0100', 'F', 1000, 'BJS', 'SHA', '202207091914', '1133', 30, 'F', 2);
