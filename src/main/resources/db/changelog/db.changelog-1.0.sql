--liquibase formatted sql

--changeset leir:1
CREATE TABLE quests
(
    id SERIAL PRIMARY KEY,
    exp INT DEFAULT 0,
    explanation TEXT NOT NULL UNIQUE
);

--changeset leir:2
CREATE TABLE users
(
    id SERIAL PRIMARY KEY,
    jwt_token TEXT
);

--changeset leir:3
CREATE TABLE departments
(
    id INT PRIMARY KEY
);

--changeset leir:4
CREATE TABLE users_quests
(
      user_id BIGINT REFERENCES users (id),
      quest_id INT REFERENCES quests(id),
      CONSTRAINT users_quests_pk PRIMARY KEY (user_id, quest_id)
);

--changeset leir:5
CREATE TABLE departments_quests
(
    department_id INT REFERENCES departments(id),
    quest_id INT REFERENCES  quests(id)
);