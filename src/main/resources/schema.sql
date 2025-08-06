-- Table participants
CREATE TABLE IF NOT EXISTS participants (
    id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    gpro_identifier BIGINT UNIQUE NOT NULL,
    name VARCHAR(255),
    PRIMARY KEY (id)
);

-- Table raw_races
CREATE TABLE IF NOT EXISTS raw_races (
    id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    season BIGINT,
    race BIGINT,
    pool VARCHAR(50),
    PRIMARY KEY (id)
);

-- Table raw_results
CREATE TABLE IF NOT EXISTS raw_results (
    id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    gpro_manager_id BIGINT,
    name VARCHAR(255),
    q1_position VARCHAR(50),
    q1_lap_time VARCHAR(50),
    q2_position VARCHAR(50),
    q2_lap_time VARCHAR(50),
    starting_grid_position VARCHAR(50),
    starting_grid_cumulated_lap_time VARCHAR(50),
    race_position VARCHAR(50),
    race_time VARCHAR(50),
    raw_race_id BIGINT,
    PRIMARY KEY (id),
    CONSTRAINT fk_raw_results_raw_race
    FOREIGN KEY (raw_race_id) REFERENCES raw_races(id)
);

-- Table registrations
CREATE TABLE IF NOT EXISTS registrations (
    id BIGINT NOT NULL GENERATED ALWAYS AS IDENTITY,
    season BIGINT,
    participant_gpro_identifier BIGINT,
    PRIMARY KEY (id),
    CONSTRAINT fk_registrations_participant
    FOREIGN KEY (participant_gpro_identifier) REFERENCES participants(gpro_identifier)
);