DROP TABLE IF EXISTS test;
create table test
(
    name  varchar(120) not null comment '调度名称',
    age   varchar(200) not null comment '任务名称'
) engine=innodb comment = '任务详细信息表';

insert into test (name,age) values ('test1','test1');
insert into test (name,age) values ('test1','test1');
insert into test (name,age) values ('test1','test1');
