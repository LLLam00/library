/*
create schema library;

create table library.book
(bid char(20) primary key,
bname char(20), 
bwriter char(20),
bpublish char(10),
bclass char(20),
bdate date,
bprice float,
bcopy int,
bstate char(2),
bcaseid char(10),
FOREIGN KEY (bcaseid) REFERENCES library.bookcase(bcaseid)
);

create table library.reader
(rid char(20) primary key,
rname char(20),
rsex char(2),
rtype char(20),
rdept char(20),
rdate date,
lbnum int,
bnum int,
lbhtime char(4),
rtele char(15)
);

create table library.manager
(mid char(20) primary key,
userid char(15) primary key,
password char(15),
mname char(10),
msex char(2),
mtele char(15),
mage char(15)
);

create table  library.bookcase(
bcaseid char(20) primary key,
num int
);

create table library.rmanage
(mid char(20),
rid char(20),
roperation char(20),
PRIMARY KEY(mid,rid),
FOREIGN KEY (mid) REFERENCES library.manager(mid),
FOREIGN KEY (rid) REFERENCES library.reader(rid)
);

create table library.bmanage
(mid char(20),
bid char(20),
boperation char(20),
PRIMARY KEY(mid,bid),
FOREIGN KEY (mid) REFERENCES library.manager(mid),
FOREIGN KEY (bid) REFERENCES library.book(bid)
);

create table library.mmanage
(mid char(20) PRIMARY KEY,
moperation char(20),
FOREIGN KEY (mid) REFERENCES library.manager(mid)
);

create table library.fine
(mid char(20),
rid char(20),
bid char(20),
fine float,
clstate char(2),
PRIMARY KEY(mid,rid,bid),
FOREIGN KEY (mid) REFERENCES library.manager(mid),
FOREIGN KEY (rid) REFERENCES library.reader(rid),
FOREIGN KEY (bid) REFERENCES library.book(bid)
);

create table  library.borrow(
rid char(20),
bid char(20),
outdate date,
yhdate date,
PRIMARY KEY(rid,bid),
FOREIGN KEY (rid) REFERENCES library.reader(rid),
FOREIGN KEY (bid) REFERENCES library.book(bid)
);

create table  library.return(
rid char(20),
bid char(20),
indate date,
PRIMARY KEY(rid,bid),
FOREIGN KEY (rid) REFERENCES library.reader(rid),
FOREIGN KEY (bid) REFERENCES library.book(bid)
);

create table  library.belong(
bcaseid char(20),
bid char(20),
booksnum int,
PRIMARY KEY(bcaseid,bid),
FOREIGN KEY (bcaseid) REFERENCES library.book(bcaseid),
FOREIGN KEY (bid) REFERENCES library.book(bid)
);


CREATE VIEW book_search 
AS
SELECT bname,bwriter,bpublish,bclass,bcaseid,bstate FROM library.book;

create unique index bid on library.book(bid);

create unique index rid on library.reader(rid);

create unique index mid on library.manager(mid);

create unique index bcaseid on library.bookcase(bcaseid);

SELECT bid,bname,bwriter,bcaseid,bstate
FROM library.book 
WHERE bwriter='东野圭吾';

SELECT bname,bwriter,bcaseid;
FROM library.book 
WHERE bname like'中国%';


SELECT rname,rtele
FROM library.reader
WHERE rid=
      (SELECT rid
      FROM library.fine
      WHERE clstate='否' AND fine.rid=reader.rid
      );

SELECT *
FROM library.reader
WHERE rid=
      (SELECT rid
      FROM library.borrow
      WHERE borrow.rid=reader.rid 
      AND bid=
          (SELECT bid
          FROM library.book
          WHERE bname='中国香港：政治与文化的视野' AND book.bid=borrow.bid
      ));

SELECT *
FROM library.book
WHERE bid=
      (SELECT bid
      FROM library.bmanage
      WHERE boperation='修改' AND bid=book.bid
      );
*/