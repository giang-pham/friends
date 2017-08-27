CREATE TABLE Connection
(
    id IDENTITY PRIMARY KEY,
    user1 VARCHAR2(50) NOT NULL,
    user2 VARCHAR2(50) NOT NULL,
);

CREATE TABLE Subscription
(
    id IDENTITY PRIMARY KEY,
    requestor NUMBER(19) NOT NULL,
    target NUMBER(19) NOT NULL,
);

CREATE TABLE Block
(
    id IDENTITY PRIMARY KEY,
    requestor NUMBER(19) NOT NULL,
    target NUMBER(19) NOT NULL,
);
