INSERT INTO tb_participant (id, name, email) VALUES (1, 'José Silva', 'jose@gmail.com');
INSERT INTO tb_participant (id, name, email) VALUES (2, 'Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participant (id, name, email) VALUES (3, 'Maria do Rosário', 'maria@gmail.com');
INSERT INTO tb_participant (id, name, email) VALUES (4, 'Teresa Silva', 'teresa@gmail.com');

INSERT INTO tb_category (id, description) VALUES (1, 'Curso');
INSERT INTO tb_category (id, description) VALUES (2, 'Oficina');

INSERT INTO tb_activity (id, name, description, price, category_id) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO tb_activity (id, name, description, price, category_id) VALUES (2, 'Oficina de GitHub', 'Controle versões de seus projetos', 50.00, 2);

INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 1);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 2);

INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 2);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 3);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 4);

INSERT INTO tb_block (id, event_day, start_time, end_time, activity_id) VALUES (1, '2017-09-25', '08:00:00', '11:00:00', 1);
INSERT INTO tb_block (id, event_day, start_time, end_time, activity_id) VALUES (2, '2017-09-25', '14:00:00', '18:00:00', 2);
INSERT INTO tb_block (id, event_day, start_time, end_time, activity_id) VALUES (3, '2017-09-26', '08:00:00', '11:00:00', 2);
