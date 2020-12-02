CREATE TABLE todov2 (
  id SERIAL PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  date TIMESTAMP NOT NULL,
  completed Boolean DEFAULT false
);



INSERT INTO todov2 (name, description, date, completed) values ('Split The Service', 'Prove that we can split the backend service in 2', (NOW() - INTERVAL '2 DAY'), true)