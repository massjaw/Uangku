CREATE TABLE m_user (
	id serial,
	username varchar(20),
	password varchar(20),
	PRIMARY KEY(id)
);
DROP TABLE user_cash
CREATE TABLE user_cash (
	id serial,
	user_id serial,
	balance double precision DEFAULT 0,
	PRIMARY KEY(id),
	CONSTRAINT user_balance
		FOREIGN KEY(user_id)
		REFERENCES m_user(id)
);

CREATE TABLE m_category (
	id serial,
	name varchar(20),
	PRIMARY KEY(id)
);

CREATE TABLE cash_flow (
	id serial,
    dates date,
	code varchar(10),
	category_id int,
	amount double precision,
	user_id int,
	PRIMARY KEY(id),
	CONSTRAINT user_transaction
		FOREIGN KEY(user_id)
		REFERENCES m_user(id),
	CONSTRAINT get_category
		FOREIGN KEY(category_id)
		REFERENCES m_category(id)
);