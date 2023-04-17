/* Multi line
comment
*/

-- Single line comment

-- Creating table

CREATE TABLE persons(
	personID int,
    lastName varchar(100), -- (100) nozīmē, cik simbolus varēs ievadīt
    firstName varchar(100),
    address varchar(255),
    city varchar(50),
    PRIMARY KEY(personID)
);

-- Delete table

DROP TABLE IF EXISTS persons;

-- Insert records in table

INSERT INTO persons(personID, lastName, firstName, address, city)
VALUES(1000, 'Trump', 'Donald', 'House is 515 North County Road, Palm Beach, Florida 33480', 'Florida');

INSERT INTO persons VALUES(1001, 'Obama', 'Barack', '2500 W. Golf Road Hoffman Estates, IL 60169-1114', 'Florida');

INSERT INTO persons (personID, lastName, firstName) VALUES (1002, 'Biden', 'Joe');

INSERT INTO persons (personID, lastName, firstName) VALUES (1003, 'George W.', 'Bush');

-- View table data/records

SELECT * FROM persons;

SELECT lastName,city FROM persons;

SELECT lastName, city FROM persons WHERE city = 'Florida';

-- Update data

UPDATE persons SET city = 'New York' WHERE personID = 1002;

-- Delete data

DELETE FROM persons WHERE personID = 1003;