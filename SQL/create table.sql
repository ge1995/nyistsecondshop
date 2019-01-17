CREATE TABLE collect_table
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    good_id int(11),
    good_name varchar(255),
    user_id int(11)
);

CREATE TABLE first_type_table
(
    id int(11) PRIMARY KEY NOT NULL,
    name varchar(50)
);


CREATE TABLE good_table
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar(255),
    photo_url varchar(200),
    first_type_id int(11),
    second_type_id int(11),
    `describe` varchar(500),
    upload_date datetime DEFAULT CURRENT_TIMESTAMP,
    prise float,
    status_id int(11),
    user_id int(11),
    `update` datetime DEFAULT CURRENT_TIMESTAMP
);
    

CREATE TABLE image_table
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    good_id int(11),
    name varchar(100),
    url varchar(500)
);

CREATE TABLE order_table
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    good_name varchar(200),
    seller varchar(50),
    seller_id int(11),
    customer varchar(50),
    customer_id int(11),
    good_id int(11),
    money int(11),
    submit_date datetime DEFAULT CURRENT_TIMESTAMP,
    end_date datetime,
    status_id int(11)
);


CREATE TABLE reply_table
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    review_id int(11),
    from_user varchar(255),
    from_user_id int(11),
    to_user varchar(255),
    to_user_id int(11),
    text varchar(255),
    upload_date datetime,
    status int(11) COMMENT '消息状态表；0：表示未读；1：表示已读。'
);

CREATE TABLE review_table
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    good_id int(11),
    from_user_id int(11),
    from_user varchar(255),
    to_user_id int(11),
    to_user varchar(255),
    text varchar(255),
    upload_date datetime,
    status int(11) COMMENT '消息状态；0：表示未读；1：表示已读。'
);

CREATE TABLE role_table
(
    id int(11) PRIMARY KEY NOT NULL,
    code varchar(20) NOT NULL,
    role varchar(20) NOT NULL
);

CREATE TABLE second_type_table
(
    id int(11) PRIMARY KEY NOT NULL,
    first_type_id int(11),
    name varchar(50)
);

CREATE TABLE status_table
(
    id int(11) PRIMARY KEY NOT NULL,
    name varchar(20) NOT NULL
);

CREATE TABLE user_table
(
    id int(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
    name varchar(50),
    mobile varchar(20),
    email varchar(255),
    password varchar(255),
    code varchar(20),
    photo_url varchar(255),
    role_id int(11),
    gender varchar(10),
    register_date datetime DEFAULT CURRENT_TIMESTAMP,
    status_id int(11)
);




