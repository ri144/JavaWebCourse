use myNewDB;
drop table if exists Person;
drop table if exists Exper;
drop table if exists Edu;
drop table if exists Skills;
create table Person(
	personid int not null auto_increment,
	firstname varchar(25),
    lastname varchar(25),
    midinit varchar(3),
    email varchar(25),
    primary key(personid)
);

create table Edu(
	eduid int not null auto_increment,
	degreelevel varchar(10),
    major varchar(25),
    school varchar(25),
    year int,
	personid int,
    primary key(eduid)
);

create table Exper(
	position varchar(25),
    company varchar(25),
    startmonth varchar(15),
    startyear int,
    endmonth varchar(15),
    endyear int,
    duty1 varchar(50),
    duty2 varchar(50),
    personid int,
    expid int not null auto_increment,
    primary key (expid)
);

create table Skills(
	skill varchar(25),
    proficiency varchar(25),
    personid int,
    skid int not null auto_increment,
    primary key(skid)
);
/*
insert into Person (firstname, lastname, midinit) Values ('Jim' , 'John' , 'J');
insert into Edu (degreelevel, major, school, year, personid) Values ('BS', 'ECE', 'RU', 2017, 1);
insert into Edu (degreelevel, major, school, year, personid) Values ('Phd', 'CSE', 'OSU', 2020, 1);
select * from Person;
select * from Edu;
select * from Edu where personid = 12;
delete from Person;
delete from Edu;
select personid from Person p where p.firstname = 'Bobby';
select degreelevel from Edu e where e.personid = 1 and e.eduid =1;
select degreelevel from Edu p where p.eduid = 1 and p.personid = 5;
select max(personid) from Edu;
select degreelevel from Edu p where p.eduid = 18 and p.personid = 14;*/