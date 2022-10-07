INSERT INTO TBL_FORMA_PAGAMENTO(id, tipo, parcelas) values(default, 0, 1);
INSERT INTO TBL_DESCRICAO(id, valor, data_hora, estabelecimento, nsu, codigo_autorizacao, status) values(default,30.00,NULL,'Estabelecimento 1', 12344321,0,'0');
INSERT INTO TBL_TRANSACAO(id, cartao, id_descricao, id_forma_pagamento) values(default,'1234123412341234', 1, 1 ) ;
INSERT INTO TBL_PAGAMENTO values ( default, 1);


INSERT INTO TBL_FORMA_PAGAMENTO(id, tipo, parcelas) values(default, 0, 1);
INSERT INTO TBL_DESCRICAO(id, valor, data_hora, estabelecimento, nsu, codigo_autorizacao, status) values(default,60.00,NULL,'Estabelecimento 2', 12344321,0,'0');
INSERT INTO TBL_TRANSACAO(id, cartao, id_descricao, id_forma_pagamento) values(default,'1234123412341234', 2, 2 ) ;
INSERT INTO TBL_PAGAMENTO values ( default, 2);


INSERT INTO TBL_FORMA_PAGAMENTO(id, tipo, parcelas) values(default, 0, 1);
INSERT INTO TBL_DESCRICAO(id, valor, data_hora, estabelecimento, nsu, codigo_autorizacao, status) values(default,50.00,NULL,'Estabelecimento 3', 12344321,0,'0');
INSERT INTO TBL_TRANSACAO(id, cartao, id_descricao, id_forma_pagamento) values(default,'1234123412341234', 3, 3 ) ;
INSERT INTO TBL_PAGAMENTO values ( default, 3);