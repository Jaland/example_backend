DROP TABLE IF EXISTS todo;

CREATE TABLE todo (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250) NOT NULL,
  completion_date DATETIME NOT NULL,
  completed Boolean DEFAULT false
);

INSERT INTO todo (name, description, completion_date, completed) VALUES
  ('Apicur.io', 'Create my first OpenAPI Spec', now() - INTERVAL 2 DAY, true),
  ('OpenApi Generator', 'Generate my OpenAPI Springboot App', now() - INTERVAL 1 DAY, true),
  ('OAG Templating', 'Add DB persistance to my Springboot App', now() + INTERVAL 20 MINUTE, false)