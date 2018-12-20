create table userInfo(
user_id int primary key AUTO_INCREMENT COMMENT '�û����ɣ�',
user_name varchar(20) COMMENT '�û����ǳ�',
user_password varchar(100) NOT NULL COMMENT '�û�����',
user_img varchar(100) NOT NULL COMMENT '�û�ͷ��',
user_value int default 0 COMMENT '�û�����ֵ',
user_punch TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT 'ǩ��ʱ��', 
code_id int DEFAULT 0 COMMENT '�û������Ĵ�������'
)

create table code(
code_id int primary key AUTO_INCREMENT COMMENT '�������',
code_title varchar(40) NOT NULL  COMMENT '��������',
code_content varchar(1000) NOT NULL COMMENT '��������', 
code_zan int DEFAULT 0 COMMENT '��������',
add_img varchar(400) NOT NULL COMMENT '���ͼƬ',
add_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '����ʱ��',
see_sum int DEFAULT 0 COMMENT '�����',
lable_id int COMMENT '��ǩ�����',
lable_talk int COMMENT '���۱����',
user_id int NOT NULL COMMENT '�����������û�'
)
create table lable(
lable_id int primary key AUTO_INCREMENT COMMENT '��ǩid' ,
lable_content varchar(30) NOT NULL COMMENT '��ǩ����',
code_id int  COMMENT '����ID'
)

create table talk(
talk_id int primary key AUTO_INCREMENT COMMENT '���۱�id',
talk_content varchar(1500) NOT NULL COMMENT '��������',
code_id int NOT NULL

)