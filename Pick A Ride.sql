Create Database PickARide;
Use PickARide;


CREATE TABLE USERLOGIN
(
	SerialNo int PRIMARY KEY,
	UserName varchar(20) NOT NULL,
	Password varchar (20) NOT NULL
)

INSERT INTO USERLOGIN
VALUES (1,'Piku','database'),
	   (2,'Mumu','database'),
	   (3,'Hasib','database'),
	   (4,'Fuad','database')


SELECT* FROM USERLOGIN

CREATE TABLE CUSTOMER
(
	CustomerId varchar(20) PRIMARY KEY,
	CustomerName varchar(50) NOT NULL,
	PresentAddress varchar(300) NOT NULL,
	PermanentAddress varchar(300) NOT NULL,
	C_NID_No varchar(20) NOT NULL,
	C_EmailAddress varchar(40) NOT NULL,
	C_PassportNo varchar(20)  NULL  DEFAULT  'Null',
	C_Phone varchar(11) NOT NULL
)



INSERT INTO CUSTOMER 
VALUES('C01','Sabrina Mumu','Chittagong',
'Dhaka','2884756338956','sabrinamumu6789@gmail.com', 
'31195855','01912584949')

SELECT* FROM CUSTOMER



CREATE TABLE BIKE
(
	BikeId varchar(20) PRIMARY KEY,
	ModelNo varchar(200) NOT NULL,
	LicenseNo varchar (200) NOT NULL,
	Engine varchar(200) NOT NULL,
	OnRent varchar(100) NOT NULL,
	AvailableFrom varchar (50) NOT NULL,
	AvailableTill varchar (50) NOT NULL
) 

INSERT INTO BIKE
VALUES('B01', 'KA 04 JQ 5657', 'NK45637893C0007','VC10338','Yes', '7 PM', '12PM') 

SELECT* FROM BIKE



CREATE TABLE PARTNER
(
	PartnerId varchar (20) PRIMARY KEY,
	BikeId varchar (20) NOT NULL FOREIGN KEY REFERENCES BIKE (BikeId),
	
	PartnerName varchar(50) NOT NULL,
	P_NID_No varchar (20) NOT NULL,
	P_EmailAddress varchar(40)NOT NULL,
	P_Phone varchar(11) NOT NULL,
	P_RentingHours varchar (50) NOT NULL
)

INSERT INTO PARTNER 
VALUES(1,'B01','Arifur Rahman Jawad',36773899936,'freakarj@gmail.com','01748993452', '4 hours')

SELECT* FROM PARTNER


CREATE TABLE ORDER_FORM
(
	OrderId varchar(30) PRIMARY KEY,
	CustomerId varchar (20) NOT NULL FOREIGN KEY REFERENCES CUSTOMER (CustomerId),
	BikeId varchar (20) NOT NULL FOREIGN KEY REFERENCES BIKE (BikeId),
	PhoneNo varchar (20) NOT NULL,
	O_Amount varchar (20)  NOT NULL,
	O_Paid  varchar (20)  NOT NULL,
	O_Due  varchar (20)  NOT NULL ,
	O_Date varchar (100) NOT NULL
)

SELECT* FROM ORDER_FORM


CREATE TABLE PARTNER_FINANCE
(
	PFinSerialNo varchar(30) PRIMARY KEY,
	PartnerId varchar (20) NOT NULL FOREIGN KEY REFERENCES PARTNER (PartnerId),
	P_Receiveable varchar (20) NOT NULL,
	PaidToPartner varchar (20) NOT NULL,
	PartnerDue varchar (20) NOT NULL,
	ParnterFine varchar (20) NULL DEFAULT '0 tk'
)

INSERT INTO PARTNER_FINANCE
VALUES ('PFSN01',1, '2000 tk', '0 tk', '2000 tk','0 tk')

SELECT* FROM PARTNER_FINANCE

CREATE TABLE BIKE_FINANCE
(
	BFinSerialNo varchar(30) PRIMARY KEY,
	BikeId varchar (20) NOT NULL FOREIGN KEY REFERENCES BIKE (BikeId),
	EngineCost varchar (20) NULL,
	FuelCost varchar (20) NULL,
	TierCost  varchar (20) NULL,
	TotalCost  varchar (20) NOT NULL
)

INSERT INTO BIKE_FINANCE
VALUES ('BFSN01','B01', '1000 tk', '500 tk', '0 tk', '1500 tk')

SELECT* FROM BIKE_FINANCE
