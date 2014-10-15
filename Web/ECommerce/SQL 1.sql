CREATE TABLE Produto 
(
    id        INT NOT NULL PRIMARY KEY
              GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    nome      VARCHAR(100),
    preco     DOUBLE,
    descricao VARCHAR(100),
    imagem    VARCHAR(100),
    categoria VARCHAR(100)
);

INSERT INTO PRODUTO (imagem,nome,descricao,preco) VALUES(
,'assets/img/galaxy.png'
,'Galaxy S5'
,'O melhor da Samsung no mercado'
,1800);
INSERT INTO PRODUTO (imagem,nome,descricao,preco) VALUES('assets/img/iphone.png'
,'Iphone 4'
,'O mais estável da Apple no mercado'
,600);
INSERT INTO PRODUTO (imagem,nome,descricao,preco) VALUES('assets/img/lumia.png'
,'Lumia 930'
,'O mais novo Windows Phone, com o melhor a te oferecer'
,1200);
INSERT INTO PRODUTO (imagem,nome,descricao,preco) VALUES('assets/img/motox.png'
,'Moto X'
,'O melhor smartphone da Motorola'
,900);
INSERT INTO PRODUTO (imagem,nome,descricao,preco) VALUES('assets/img/xperia.png'
,'Xperia Z2'
,'O mais completo smartphone do mercado'
2300);
INSERT INTO PRODUTO (imagem,nome,descricao,preco) VALUES('assets/img/ArquivoExibir.jpeg'
,'Notebook 2 em 1 Touch'
,'Muito divertoso'
,1400);

INSERT INTO PRODUTO 
(
     NOME
   , PRECO
   , DESCRICAO
   , IMAGEM
   , CATEGORIA
) VALUES
(
     'Tenis'
    ,300
    ,'Bonito'
    ,'/'
    ,'Calçados'
);

CREATE TABLE Pedido 
(
    id         INT NOT NULL PRIMARY KEY
               GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    id_usuario INT,
    endereco   VARCHAR(300),
    nome_produto  VARCHAR(300),
    preco_produto DOUBLE,
    qtd_produto DOUBLE,
    total      DOUBLE
);

INSERT INTO Pedido
(
        id_usuario
     ,  endereco
     ,  nome_produto
     ,  preco_produto
     ,  qtd_produto
     ,  total
) VALUES
(
        1
     ,  300
);