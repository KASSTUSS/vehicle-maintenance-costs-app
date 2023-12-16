DROP
DATABASE IF EXISTS vehicle_maintenance_costs;

CREATE
DATABASE vehicle_maintenance_costs;
USE
vehicle_maintenance_costs;

CREATE TABLE cars
(
    id    bigint AUTO_INCREMENT PRIMARY KEY,
    make  VARCHAR(255),
    model VARCHAR(255),
    year  INT
);

CREATE TABLE expenses
(
    id          bigint AUTO_INCREMENT PRIMARY KEY,
    car_id      bigint,
    date        VARCHAR(18),
    category    VARCHAR(50),
    description VARCHAR(255),
    amount      DECIMAL(10, 2),
    FOREIGN KEY (car_id) REFERENCES Cars (id)
);