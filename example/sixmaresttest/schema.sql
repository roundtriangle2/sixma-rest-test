create table if not exists PEOPLE(
id char (36) primary key not null,
name varchar(50),
last_name varchar(50),
middle_name varchar(50),
second_last_name varchar(50),
suffix varchar(20),
sex varchar(20),
ssn char(9),

prefix varchar(5),
is_df_custodian boolean,
custody_type varchar(10),

is_american_citizen boolean,
birthdate date,
visa_type varchar(15),
visa_number char(8),
birth_country varchar(30),
city varchar(100),
state varchar(100),
birth_place varchar(100),
date_of_death date,

adfan_has_bcert_cpy boolean,
hair_color varchar(30),
eye_color varchar(30),
height int,
weight int,
particular_markers varchar(100),

is_puerto_rico_resident boolean,
main_language varchar(20),
religion varchar(20),
needs_interpreter boolean,
civil_status varchar(30),
second_language varchar(10),
deceased boolean

);