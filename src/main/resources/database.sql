-- table: users
CREATE table users (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  user_name VARCHAR(255) NOT NULL ,
  password VARCHAR(255) NOT NULL
)
ENGINE = InnoDB;

-- table: roles
CREATE table roles (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  name VARCHAR(100) NOT NULL
)
ENGINE = InnoDB;

-- table: users-roles
CREATE table users_roles (
  user_id INT NOT NULL ,
  role_id INT NOT NULL,

  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (role_id) REFERENCES roles(id),

  UNIQUE (user_id, role_id)

)
ENGINE = InnoDB;

-- Insert data

INSERT INTO users VALUES (2, 'admin','$2y$08$azMlwEteBL68YhbW/t22k.6liD8N1F1EvsKqc2q8VEtwL.VEya75e
');

INSERT INTO roles VALUES (1, 'ROLE_USER');
INSERT INTO roles VALUES (2, 'ROLE_ADMIN');

INSERT INTO users_roles VALUES (1, 2);

INSERT INTO users_roles VALUES (2, 2);
