insert into AUTODEAL_COLOR (ID, VERSION, NAME, CODE) values (uuid_in((md5((random())::text))::cstring), 1, 'RED', 1);
insert into AUTODEAL_COLOR (ID, VERSION, NAME, CODE) values (uuid_in((md5((random())::text))::cstring), 1, 'BLACK', 2);
insert into AUTODEAL_COUNTRY (ID, VERSION, NAME, CODE) values (uuid_in((md5((random())::text))::cstring), 1, 'Russia', 7);