CREATE DATABASE mmf
GO

USE mmf
CREATE TABLE dbo.mmfData (
    fund varchar(128),
	fundCusip varchar(16),
	percentOfFund float,
	cusip varchar(16),
	value float,
	principal float,
	coupon float,
	issuer varchar(128),
	countryAbbreviated varchar(8),
	country varchar(32),
	region varchar(32),
	sector varchar(32)
)
