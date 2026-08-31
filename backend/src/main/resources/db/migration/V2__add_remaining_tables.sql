CREATE TABLE admin_users (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL
);

CREATE TABLE profile (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    title VARCHAR(150) NOT NULL,
    bio TEXT NOT NULL,
    home_intro TEXT,
    contact_email VARCHAR(150) NOT NULL,
    social_links TEXT
);

CREATE TABLE experience (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    company VARCHAR(150) NOT NULL,
    role VARCHAR(150) NOT NULL,
    start_date DATE NOT NULL,
    end_date DATE,
    description TEXT NOT NULL
);

CREATE TABLE projects (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    title VARCHAR(150) NOT NULL,
    description TEXT NOT NULL,
    repo_url VARCHAR(255),
    live_url VARCHAR(255),
    image_url VARCHAR(255),
    display_order INTEGER NOT NULL DEFAULT 0
);

CREATE TABLE project_skill (
    project_id INTEGER NOT NULL,
    skill_id INTEGER NOT NULL,

    FOREIGN KEY (project_id) REFERENCES projects(id) ON DELETE CASCADE,
    FOREIGN KEY (skill_id) REFERENCES skills(id) ON DELETE CASCADE,
    PRIMARY KEY (project_id, skill_id)
);

CREATE TABLE contact_messages (
    id INTEGER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL,
    message TEXT NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    is_read BOOLEAN NOT NULL DEFAULT false
);