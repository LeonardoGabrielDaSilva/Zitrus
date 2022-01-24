INSERT INTO ENDERECO(cep, logradouro, bairro, localidade, uf, ibge) VALUES('89188000', 'Rua Leopoldo da Cunha',
 																			'Centro', 'Agronômica', 'SC', '4200309');

INSERT INTO CLIENTE(cpf, nome, genero, email, telefone, endereco_cep) VALUES('09725525220','Leo','Masculino','leo@hotmail.com','47988165482','89188000');


INSERT INTO CLIENTE_ENDERECO(cliente_cpf, endereco_cep, numero) VALUES('09725525220','89188000', 550);