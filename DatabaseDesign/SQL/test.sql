drop database test;
create database if not exists test;

USE test;

/*
Order of tables:
Partner
Location
Role
Position
User
Employment
Course
Enrollment
Hour

*/



create table Partners (
	ID int NOT NULL auto_increment
	,CompanyName varchar(150)
    ,FirstName varchar(60)
    ,LastName varchar(60)
    ,Phone varchar(10)    
    
    ,primary key (ID)
    );
    
create table Locations (
	ID int not null auto_increment
    ,City varchar(30) not null
    ,State varchar(30) not null
    ,AddressLine1 varchar(100) not null
    ,AddressLine2 varchar(100) not null
    ,Country varchar(30) not null
    ,Zipcode varchar(20) not null
    ,isPrimary boolean

	,primary key (ID)
);

create table Buckets (
	ID int not null
    ,Description varchar(50) not null
    ,primary key (ID)
);

create table Roles (
	ID int not null auto_increment
    ,Description varchar(50) not null
	,primary key (ID)
);

create table Positions (
	ID int not null auto_increment
    ,Title varchar(255) not null
    ,Description varchar(255) 
    ,LocationID int
    ,PartnerID int
    
	,primary key (ID)
	,FOREIGN KEY (LocationID) REFERENCES Locations(ID)
    ,FOREIGN KEY (PartnerID) REFERENCES Partners(ID)
    
);

create table Users (
	ID int not null auto_increment
    ,FirstName varchar(60)
    ,LastName varchar(60)
    ,RoleID int not null
    ,Email varchar(100) not null
    ,Password varchar(30) not null
    
	,primary key (ID)
    ,foreign key (RoleID) REFERENCES Roles(ID)
);

create table Employments (
	ID int not null auto_increment
    ,EmploymentStartDate DateTime not null
    ,EmploymentEndDate DateTime
    ,StudentId int
    ,PartnerId int
    
    ,primary key (ID)
    ,foreign key (StudentId) references Users(ID)
    ,foreign key (PartnerId) references Partners(ID)


);


create table Courses (
	ID int not null auto_increment
    , ProfessorId int
    , Description varchar (255)
    , DateCreated DateTime not null
	, CRN int
	,primary key (ID)
    ,foreign key (ProfessorId) references Users(ID)

);

create table Enrollments (
	ID int not null auto_increment
    , EnrollmentStartDate DateTime
    , EnrollmentEndDAte DateTime
    , StudentId int
    , CourseId int
    
    ,primary key (ID)
    ,foreign key (StudentId) references Users(ID)
    ,foreign key (CourseId) references Courses(ID)
);

create table Hours (
	ID int not null auto_increment
    , InTime DateTime not null
    , OutTime DateTime not null
    , Hours Float(4,2) 
    , StudentId int
    , PositionId int
    , PartnerId int
    , ProfessorId int
    , CourseId int
    , Responses varchar(255)
    , LocationId int

	,primary key (ID)
    ,foreign key (StudentId) references Users(ID)
    ,foreign key (CourseId) references Courses(ID)
    ,foreign key (ProfessorId) references Users(ID)
    ,foreign key (PositionId) references Positions(ID)
    ,foreign key (PartnerId) references Partners(ID)
    ,foreign key (LocationId) references Locations(ID)
);



