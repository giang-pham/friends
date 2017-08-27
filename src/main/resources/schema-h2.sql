CREATE TABLE Connection
(
    id NUMBER(19) NOT NULL,
    user1 VARCHAR2(50) NOT NULL,
    user2 VARCHAR2(50) NOT NULL,
);

CREATE TABLE Subscription
(
    id NUMBER(19) NOT NULL,
    requestor NUMBER(19) NOT NULL,
    target NUMBER(19) NOT NULL,
);

CREATE TABLE Block
(
    ID NUMBER(19) NOT NULL,
    requestor NUMBER(19) NOT NULL,
    target NUMBER(19) NOT NULL,
);
