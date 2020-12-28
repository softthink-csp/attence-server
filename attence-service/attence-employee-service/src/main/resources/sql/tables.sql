create table user (
    id varchar(10) primary key,
    username varchar(40) not null,
    password varchar(100) not null,
    enable bit default 1
);
insert into user values(1, "admin", "admin", 1);
create table role (
    id int AUTO_INCREMENT primary key,
    role varchar(32) not null,
    name varchar(64) not null
);
insert into role (role, name) values("ROLE_manager", '系统管理员');
create table userToRole(
    id int auto_increment primary key,
    roleId int not null,
    userId varchar(10) not null
);

insert into userToRole (roleId, userId) values(1, 1);
create table menu(
    id int auto_increment primary key,
    path varchar(64),
    name varchar(64),
    component varchar(64),
    showInNavi bit,
    parentId int,
    enable bit default 1
);
delete from menu;
insert into menu(id, path, name, component, showInNavi,  parentId) values
(1, "/attence", "", "home", 0, null),
(2, "/attence/main", "部门", "main", 1, 1),
(3, "/attence/department", "部门", null, 1, 1),
(4, "/attence/department/List", "部门一览", "departmentList", 1, 3),
(5, "/attence/department/Create", "部门登陆", "departmentCreate", 1, 3),
(6, "/attence/department/Select", "部门明细", "departmentSelect", 0, 3),
(7, "/attence/department/Update", "部门修改", "departmentUpdate", 0, 3),
(8, "/attence/employee", "部门", null, 1, 1),
(9, "/attence/employee/List", "员工一览", "employeeList", 1, 8),
(10, "/attence/employee/Create", "员工登陆", "employeeCreate", 1, 8),
(11, "/attence/employee/Select", "员工明细", "employeeSelect", 0, 8),
(12, "/attence/employee/Update", "员工修改", "employeeUpdate", 0, 8);


create table menuToRole(
    id int auto_increment primary key,
    menuId int not null,
    roleId int not null
);
delete from menuToRole;
insert into menuToRole values(1, 1, 1);
insert into menuToRole values(2, 2, 1);
insert into menuToRole values(3, 3, 1);
insert into menuToRole values(4, 4, 1);
insert into menuToRole values(5, 5, 1);
insert into menuToRole values(6, 6, 1);
insert into menuToRole values(7, 7, 1);
insert into menuToRole values(8, 8, 1);
insert into menuToRole values(9, 9, 1);
insert into menuToRole values(10, 10, 1);
insert into menuToRole values(11, 11, 1);
insert into menuToRole values(12, 12, 1);

create table department(
    id varchar(5) primary key,
    name varchar(64) not null,
    parentId varchar(5),
    mail1 varchar(64),
    mail2 varchar(64),
    phone1 varchar(16),
    phone2 varchar(16),
    content varchar(200)
);

insert into department values('00001', '财务部', null, '123456789', null, '123456@163.com', null, null);

drop table employee;
create table employee(
    id varchar(10) primary key,
    name varchar(64) not null,
    birthday varchar(10),
    sex enum('1', '0'),
    age tinyint,
    mail1 varchar(64),
    mail2 varchar(64),
    phone1 varchar(16),
    phone2 varchar(16),
    postId int,
	departmentId int,
    startDate varchar(10),
    endDate varchar(10),
    content varchar(200)
);

insert into employee values('0000000001', 'admin', '1990-05-17', '1', '18', '123456@sina.com', null, '123456789', null, 1, 1,'2020-12-12', null, null);

create table post(
    id int auto_increment primary key,
    name varchar(16)
);

insert into post values(1, '经理');
insert into post values(2, '储备干部');
