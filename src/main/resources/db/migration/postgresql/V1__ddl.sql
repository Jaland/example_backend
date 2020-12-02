CREATE TABLE todov2 (
  id SERIAL PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  date TIMESTAMP NOT NULL,
  completed Boolean DEFAULT false
);
