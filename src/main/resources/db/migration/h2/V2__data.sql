INSERT INTO todo (name, description, date, completed) VALUES
  ('Apicur.io', 'Create my first OpenAPI Spec', now() - INTERVAL 2 DAY, true),
  ('OpenApi Generator', 'Generate my OpenAPI Springboot App', now() - INTERVAL 1 DAY, true),
  ('OAG Templating', 'Add DB persistance to my Springboot App', now() + INTERVAL 20 MINUTE, false)