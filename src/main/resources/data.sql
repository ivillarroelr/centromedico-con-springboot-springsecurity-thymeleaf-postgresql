INSERT INTO authority(id, authority) VALUES(1, 'USER');
INSERT INTO authority(id, authority) VALUES(2, 'ADMIN');

INSERT INTO users(id, username, password, enabled) 
VALUES(1, 'ivillarroelr', '$2a$04$wMZKNRu.HWMsvYJ.vHU9deZMJHNOMEyCh7ddhvtYBLxvE2M838rgC', true);

 INSERT INTO authorities_users(usuario_id, authority_id)
 VALUES(1,2);
INSERT INTO authorities_users(usuario_id, authority_id)
 VALUES(1,1);