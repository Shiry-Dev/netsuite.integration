-- CREATE SCHEMA IF NOT EXISTS NetSuiteIntegration DEFAULT CHARACTER SET utf8;
-- USE NetSuiteIntegration;
-- CREATE TYPE IF NOT EXISTS allocation_type AS ENUM ('HARD', 'SOFT');

-- CREATE TYPE IF NOT EXISTS allocation_unit AS ENUM ('PERCENT_OF_TIME', 'HOURS');

CREATE TABLE IF NOT EXISTS collaborator (
    collaborator_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    employee VARCHAR(255),
    email VARCHAR(255),
    class TINYINT,
    employee_level TINYINT,
    supervisor_id INT,
    title VARCHAR(255),
    is_job_resource BOOLEAN
);

CREATE TABLE IF NOT EXISTS allocation (
    allocation_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    collaborator_id BIGINT NOT NULL,
    project INT,
    alt_name VARCHAR(255),
    project_task INT,
    full_name VARCHAR(255),
    start_date DATE,
    end_date DATE,
    number_hours INT,
    is_billable BOOLEAN,
    is_overhead BOOLEAN,
    unit ENUM('PERCENT_OF_TIME', 'HOURS'),
    percent_of_time INT,
    allocation_type ENUM('HARD', 'SOFT'),
    is_active BOOLEAN,
    FOREIGN KEY (collaborator_id) REFERENCES collaborator(collaborator_id)
);

CREATE TABLE IF NOT EXISTS skill (
    skill_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS tag (
    tag_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    description VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS collaborator_skill (
    collaborator_skill_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    collaborator_id BIGINT NOT NULL,
    skill_id BIGINT NOT NULL,
    FOREIGN KEY (collaborator_id) REFERENCES collaborator(collaborator_id),
    FOREIGN KEY (skill_id) REFERENCES skill(skill_id)
);

CREATE TABLE IF NOT EXISTS collaborator_tag (
    collaborator_tag_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    collaborator_id BIGINT NOT NULL,
    tag_id BIGINT NOT NULL,
    FOREIGN KEY (collaborator_id) REFERENCES collaborator(collaborator_id),
    FOREIGN KEY (tag_id) REFERENCES tag(tag_id)
);