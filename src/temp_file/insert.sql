# �������ݿ�
drop database if exists cn_soft_cup;
create database cn_soft_cup;
use cn_soft_cup;

#��ʱ�������������˱�
drop table if exists proxy_1;
drop table if exists proxy_2;
drop table if exists proxy_3;

#�Ա�һ���ݽ��в���
create table `proxy_1`
(
    `sequenceNo`        int(8) NOT NULL AUTO_INCREMENT COMMENT '����',
    `carrier`           varchar(2) DEFAULT NULL COMMENT '���������',
    `flightNo`          varchar(4) DEFAULT NULL COMMENT '�����',
    `cabin`             varchar(1) DEFAULT NULL COMMENT '��λ',
    `amount`            int(8)     DEFAULT NULL COMMENT 'Ʊ��',
    `departure`         varchar(3) DEFAULT NULL COMMENT '��ɳ���',
    `arrival`           varchar(3) DEFAULT NULL COMMENT '�������',
    `departureDatetime` bigint(12)   DEFAULT NULL COMMENT '���ʱ��',
    `duration`          datetime   DEFAULT NULL COMMENT '·��ʱ��',
    `surcharge`         int(3)     DEFAULT NULL COMMENT '������ðٷֱ�',
    `nextCarrier`       varchar(2) DEFAULT NULL COMMENT '�����νӺ��չ�˾',
    `seatNum`           varchar(1) DEFAULT NULL COMMENT '��λ����',
#     `agencies`             varchar(60)   DEFAULT NULL COMMENT '�����Ʊ�Ĵ����˶���',
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
