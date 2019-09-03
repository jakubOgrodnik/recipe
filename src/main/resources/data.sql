DROP TABLE IF EXISTS RECIPE;

CREATE TABLE RECIPE (
  id         INT default hibernate_sequence.nextval PRIMARY KEY,
  title  VARCHAR(250) NOT NULL,
  description  VARCHAR(20000) NOT NULL);

INSERT INTO RECIPE (title, description) VALUES ('Placki', 'zrob placki sadfasdfasdf     asdfasdf     asdfasdfasdf');
INSERT INTO RECIPE (title, description) VALUES ('Ziemniaki', 'obierz ziemniaki sadfasdfasdf     asdfasdfasdfasdfasdf');
