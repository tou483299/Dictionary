create table userInfo(
user_id int primary key AUTO_INCREMENT COMMENT '用户名ＩＤ',
user_name varchar(20) COMMENT '用户名昵称',
user_password varchar(100) NOT NULL COMMENT '用户密码',
user_img varchar(100) NOT NULL COMMENT '用户头像',
user_value int default 0 COMMENT '用户贡献值',
user_punch TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '签到时间', 
code_id int DEFAULT 0 COMMENT '用户发布的词条集合'
)

create table code(
code_id int primary key AUTO_INCREMENT COMMENT '词条ｉｄ',
code_title varchar(40) NOT NULL  COMMENT '词条标题',
code_content varchar(1000) NOT NULL COMMENT '词条内容', 
code_zan int DEFAULT 0 COMMENT '点赞数量',
add_img varchar(400) NOT NULL COMMENT '添加图片',
add_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '发表时间',
see_sum int DEFAULT 0 COMMENT '浏览量',
lable_id int COMMENT '标签表外键',
lable_talk int COMMENT '评论表外键',
user_id int NOT NULL COMMENT '创建词条的用户'
)
create table lable(
lable_id int primary key AUTO_INCREMENT COMMENT '标签id' ,
lable_content varchar(30) NOT NULL COMMENT '标签内容',
code_id int  COMMENT '词条ID'
)

create table talk(
talk_id int primary key AUTO_INCREMENT COMMENT '评论表id',
talk_content varchar(1500) NOT NULL COMMENT '评论内容',
code_id int NOT NULL

)