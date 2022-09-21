DROP DATABASE IF EXISTS console_shop;

DROP SCHEMA IF EXISTS console_shop;

CREATE DATABASE IF NOT EXISTS console_shop;

USE console_shop;

CREATE TABLE IF NOT EXISTS categories (
  id   INTEGER(10) AUTO_INCREMENT,
  name VARCHAR(45) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS products (
  id            INTEGER(10) AUTO_INCREMENT,
  name     		VARCHAR(45) NOT NULL,
  description   VARCHAR(45)	NOT NULL,
  price         DECIMAL(10) NOT NULL,
  manufacturer  VARCHAR(45) NOT NULL,
  category_id   INTEGER(10) NOT NULL,
  PRIMARY KEY (id),
  INDEX category_product_id (category_id ASC) VISIBLE,
  CONSTRAINT category_product_id
  FOREIGN KEY (category_id)
  REFERENCES categories (id)
  ON DELETE CASCADE
  ON UPDATE NO ACTION
);

INSERT INTO categories (name)
VALUES
('Laptop'),
('Tablet'),
('Smartphone');

INSERT INTO products (name, description, price, manufacturer, category_id)
VALUES
('Laptop', 'ASUS ROG 751', 1100, 'China', 1),
('Laptop', 'ASUS ROG 750', 1300, 'China', 1),
('Laptop', 'ASUS ROG 756', 1200, 'China', 1),
('Laptop', 'ASUS ROG 755', 900, 'China', 1),
('Laptop', 'ASUS ROG 754', 999, 'China', 1),
('Laptop', 'ASUS ROG 952', 1500, 'China', 1),
('Tablet', 'ASUS ZenPad 751', 800, 'China', 2),
('Tablet', 'IPad', 700, 'China', 2),
('Tablet', 'Samsung', 900, 'China', 2),
('Smartphone', 'Samsung Galaxy', 600, 'South Korea', 3),
('Smartphone', 'Xiaomi', 400, 'China', 3),
('Smartphone', 'IPhone', 900, 'USA', 3);