INSERT INTO authority(id, authority) VALUES(1, 'USER');
INSERT INTO authority(id, authority) VALUES(2, 'ADMIN');

INSERT INTO users(id, username, password, enabled) 
VALUES(1, 'ivillarroelr', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

INSERT INTO users(id, username, password, enabled) 
VALUES(2, 'pmartinez', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

 INSERT INTO authorities_users(usuario_id, authority_id)
 VALUES(1,2);
INSERT INTO authorities_users(usuario_id, authority_id)
 VALUES(1,1);

 INSERT INTO especialidad(id_especialidad, nombre_especialidad, descripcion_especialidad)
 VALUES(1,'PEDIATRIA','');


 INSERT INTO especialidad(id_especialidad, nombre_especialidad, descripcion_especialidad)
 VALUES(2,'MEDICO GENERAL','');

  INSERT INTO especialidad(id_especialidad, nombre_especialidad, descripcion_especialidad)
 VALUES(3,'NEUROLOGO','');
 
  INSERT INTO especialidad(id_especialidad, nombre_especialidad, descripcion_especialidad)
 VALUES(4,'GASTROENTEROLOGO','');

  INSERT INTO especialidad(id_especialidad, nombre_especialidad, descripcion_especialidad)
 VALUES(5,'OFTALMOLOGO','');

   INSERT INTO especialidad(id_especialidad, nombre_especialidad, descripcion_especialidad)
 VALUES(6,'OTORRINOLARINGOLOGO','');

 INSERT INTO medico(rut, apellido, nombre, telefono, id_especialidad)
 VALUES(170411927, 'VILLARROEL', 'IVAN','+56-9-68712186',1);

  INSERT INTO paciente(rut, apellido, nombre, edad)
 VALUES(191112223, 'RIVERA', 'FERNANDA',1);
