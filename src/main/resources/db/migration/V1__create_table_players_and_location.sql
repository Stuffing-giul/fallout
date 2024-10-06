--Создание таблицы locations
CREATE TABLE public.locations
(
    id                varchar(36)  NOT NULL,
    name              varchar(255) NOT NULL,
    description       text         NOT NULL,
    north_location_id varchar(36) references locations (id),
    south_location_id varchar(36) references locations (id),
    east_location_id  varchar(36) references locations (id),
    west_location_id  varchar(36) references locations (id),

    CONSTRAINT locations_pkey PRIMARY KEY (id)
);

--Создание таблицы players
CREATE TABLE public.players
(
    id                  varchar(36)  NOT NULL,
    "name"              varchar(255) NOT NULL,
    experience          integer      NOT NULL default 0,
    health              integer      NOT NULL default 100,
    maxHealth           integer      NOT NULL default 100,
    strength            integer      NOT NULL default 0,
    agility             integer      NOT NULL default 0,
    intelligence        integer      NOT NULL default 0,
    defense             integer      NOT NULL default 0,
    current_location_id varchar(36) references locations (id),

    CONSTRAINT subcontractor_organization_pkey PRIMARY KEY (id)
);

