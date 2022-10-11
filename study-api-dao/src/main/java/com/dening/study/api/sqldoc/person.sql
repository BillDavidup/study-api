drop table if exists `test_person`;
CREATE TABLE `test_person`
(
    `id`          bigint(20)  NOT NULL AUTO_INCREMENT COMMENT '自增主健',
    `first_name`  varchar(80) NOT NULL DEFAULT '无名' COMMENT '姓氏',
    `name`        varchar(80) NOT NULL DEFAULT '无氏' COMMENT '名',
    `age`         int(11)     NOT NULL DEFAULT '0' COMMENT '年龄',
    `id_num`      varchar(18) NOT NULL DEFAULT 'AAAAAAAAAABBBBBBBB' COMMENT '身份证唯一编号',
    `carate_time` datetime    NOT NULL DEFAULT '2020-01-01 00:00:00' COMMENT '出生时间',
    `work_status` int(11)     NOT NULL DEFAULT '0' COMMENT '工作状态,0:未入职 1:已入职未入场 2:已入职入场 3:离职',
    `is_del`      int(11)     NOT NULL DEFAULT '0' COMMENT '软删除,0:未删除 1:已删除',
    `create_time` int(11)     NOT NULL DEFAULT '0' COMMENT '更新时间,单位秒',
    `update_time` int(11)     NOT NULL DEFAULT '0' COMMENT '出生时间,单位秒',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT '测试人员表';
alter table `test_person`
    add index idx_first_name (`first_name`, `name`);
alter table `test_person`
    add unique key uk_id_num (`id_num`);
# 初始化测试数据
INSERT INTO `learn_person` (`first_name`, `name`, `age`, `id_num`, `birth_time`, `work_status`, `is_del`, `create_time`, `update_time`) VALUES ('John', 'Snow', 28, '110009899808190012', '2020-01-01 00:00:00', 1, 0, 0, 0);
INSERT INTO `learn_person` (`first_name`, `name`, `age`, `id_num`, `birth_time`, `work_status`, `is_del`, `create_time`, `update_time`) VALUES ('Peter', 'Make', 23, '352224992082129908', '2020-01-01 00:00:00', 0, 0, 0, 0);

