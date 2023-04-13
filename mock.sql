DROP DATABASE IF EXISTS drone_feeder;
CREATE DATABASE IF NOT EXISTS drone_feeder;
use drone_feeder;
insert into cliente(nome)
values ("Roge");
insert into cliente(nome)
values ("Gustavo");
insert into latitude_longitude(latitude, longitude)
values ("-27.578562316498715", "-48.59879808648807");
insert into latitude_longitude(latitude, longitude)
values ("-27.589943124479092", "-48.51503230183055");
insert into drones(latitude_longitude_id)
values (1);
insert into drones(latitude_longitude_id)
values (2);
insert into drones(latitude_longitude_id)
values (2);
insert into video(video)
values ("video1");
insert into video(video)
values ("video2");
insert into retirada_entrega(data_retirada, data_entrega, is_entregue, loc_entrega,
loc_retirada, drones_id, latitude_longitude_id, video_id
)
values ("2023-02-12", "2023-02-13", true, "-27.578562316498715 -48.59879808648807",
	"-27.589943124479092 -48.51503230183055", 1, 1, 1
);
insert into retirada_entrega(data_retirada, data_entrega, is_entregue, loc_entrega,
loc_retirada, drones_id, latitude_longitude_id, video_id
)
values ("2023-02-12", "2023-02-13", true, "-27.578562316498715 -48.59879808648807",
	"-27.589943124479092 -48.51503230183055", 2, 2, 2
);
insert into pedido(clientes_id, retirada_entrega_id)
values (1, 1);
insert into pedido(clientes_id, retirada_entrega_id)
values (2, 2);
