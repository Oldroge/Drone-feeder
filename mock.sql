DROP DATABASE IF EXISTS dronefeeder;
CREATE DATABASE IF NOT EXISTS dronefeeder;
USE dronefeeder;
CREATE TABLE clientes(
	clientes_id int auto_increment not null,
    nome varchar(30) not null,
    primary key (clientes_id)
);
insert into clientes(nome)
values ("Roge");
insert into clientes(nome)
values ("Gustavo");

CREATE TABLE latitude_longitude(
	latitude_longitude_id int auto_increment not null,
    latitude varchar(30) not null,
    longitude varchar(30) not null,
    primary key (latitude_longitude_id)
);
insert into latitude_longitude(latitude, longitude)
values ("-27.578562316498715", "-48.59879808648807");
insert into latitude_longitude(latitude, longitude)
values ("-27.589943124479092", "-48.51503230183055");

CREATE TABLE drones(
	drones_id int auto_increment not null,
    latitude_longitude_id INTEGER,
    primary key (drones_id),
    foreign key(latitude_longitude_id) references latitude_longitude(latitude_longitude_id)
);
insert into drones(latitude_longitude_id)
values (1);
insert into drones(latitude_longitude_id)
values (2);
insert into drones(latitude_longitude_id)
values (2);

CREATE TABLE video(
	video_id int auto_increment not null,
    video varchar(100),
    primary key (video_id)
);
insert into video(video)
values ("video1");
insert into video(video)
values ("video2");

CREATE TABLE retirada_entrega(
	retirada_entrega_id int auto_increment not null,
    data_retirada varchar(30) null,
    data_entrega varchar(30) null,
    is_entregue boolean null,
    loc_entrega varchar(100) null,
    loc_retirada varchar(100) null,
    drones_id int null,
    latitude_longitude_id int null,
    video_id int null,
    primary key (retirada_entrega_id),
    foreign key (drones_id) references drones(drones_id),
    foreign key (latitude_longitude_id) references latitude_longitude(latitude_longitude_id),
    foreign key (video_id) references video(video_id)
);
insert into retirada_entrega(data_retirada, data_entrega, is_entregue, loc_entrega,
loc_retirada, drones_id, latitude_longitude_id, video_id
)
values ("2023-02-12", "2023-02-13", true, "-27.578562316498715 -48.59879808648807",
	"-27.589943124479092 -48.51503230183055", 1, 1, 1
);

CREATE TABLE pedido(
	pedido_id integer auto_increment not null,
    clientes_id integer,
    retirada_entrega_id integer,
    primary key (pedido_id),
    foreign key (clientes_id) references clientes(clientes_id),
    foreign key (retirada_entrega_id) references retirada_entrega(retirada_entrega_id)
);
insert into pedido(clientes_id, retirada_entrega_id)
values (1, 1);

