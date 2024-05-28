CREATE SCHEMA infrastructure;

CREATE TABLE IF NOT EXISTS infrastructure.computers
(
    id integer,
    inventory_number character varying(255) COLLATE pg_catalog."default",
    graphic_adapter character varying(255) COLLATE pg_catalog."default",
    processor character varying(255) COLLATE pg_catalog."default",
    rom integer,
    ram integer,
    CONSTRAINT computers_pkey PRIMARY KEY (id)
)
    TABLESPACE pg_default;

ALTER TABLE IF EXISTS infrastructure.computers
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS infrastructure.laptops
(
    id integer,
    inventory_number character varying(255) COLLATE pg_catalog."default",
    graphic_adapter character varying(255) COLLATE pg_catalog."default",
    processor character varying(255) COLLATE pg_catalog."default",
    rom integer,
    ram integer,
    display character varying(255) COLLATE pg_catalog."default",
    CONSTRAINT laptops_pkey PRIMARY KEY (id)
)
    TABLESPACE pg_default;

ALTER TABLE IF EXISTS infrastructure.laptops
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS infrastructure.peripherals
(
    id integer,
    peripheral_name character varying(255) COLLATE pg_catalog."default",
    peripheral_type character varying(255) COLLATE pg_catalog."default",
    computer_id integer,
    laptop_id integer,
    CONSTRAINT peripherals_pkey PRIMARY KEY (id),
    CONSTRAINT computer_id FOREIGN KEY (computer_id)
        REFERENCES infrastructure.computers (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT laptop_id FOREIGN KEY (laptop_id)
        REFERENCES infrastructure.laptops (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
    TABLESPACE pg_default;

ALTER TABLE IF EXISTS infrastructure.peripherals
    OWNER to postgres;

CREATE TABLE IF NOT EXISTS infrastructure.software
(
    id integer,
    software_name character varying(255) COLLATE pg_catalog."default",
    software_version character varying(255) COLLATE pg_catalog."default",
    is_licensed boolean,
    computer_id integer,
    laptop_id integer,
    CONSTRAINT software_pkey PRIMARY KEY (id),
    CONSTRAINT computer_id FOREIGN KEY (computer_id)
        REFERENCES infrastructure.computers (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE,
    CONSTRAINT laptop_id FOREIGN KEY (laptop_id)
        REFERENCES infrastructure.laptops (id) MATCH SIMPLE
        ON UPDATE CASCADE
        ON DELETE CASCADE
)
    TABLESPACE pg_default;

ALTER TABLE IF EXISTS infrastructure.software
    OWNER to postgres;
