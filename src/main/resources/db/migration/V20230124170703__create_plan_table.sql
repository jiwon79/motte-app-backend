DROP TABLE IF EXISTS plan;

CREATE TABLE plan (
    id MEDIUMINT PRIMARY KEY AUTO_INCREMENT,
    date DATE NOT NULL,
    title VARCHAR(255) NOT NULL,
    tag VARCHAR(31) NOT NULL,
    content VARCHAR(255),
    location VARCHAR(255)
);