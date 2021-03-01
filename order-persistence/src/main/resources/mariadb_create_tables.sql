--Order table
CREATE TABLE if not exists order_db.order (
	ord_id int NOT NULL AUTO_INCREMENT,
	ord_desc VARCHAR(255) NOT NULL,
	ord_date DATE,
	purch_amt DECIMAL(15, 2) NOT NULL,
	ord_status VARCHAR(50),
	created_by VARCHAR(50) NOT NULL,
	created_dt TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY(ord_id)
);

INSERT order_db.order ( ord_desc, ord_date, purch_amt, ord_status, created_by) VALUES ("desc", '2010-01-12', '1000.00', 'created', 'pavan');