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
    total      DOUBLE
);

INSERT INTO Pedido
(
        id_usuario
     ,  'xxxxx'
     ,  total
) VALUES
(
        1
     ,  300
);

CREATE TABLE ProdutoPedido
(
    id          INT NOT NULL PRIMARY KEY
                GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    nome_produto  VARCHAR(300),
    preco_produto DOUBLE,
    qtd_produto DOUBLE,
    id_pedido   INT
);


INSERT INTO ProdutoPedido 
(
     ID_PRODUTO
   , QTD_PRODUTO
   , ID_PEDIDO
) VALUES
(
     1
    ,1
    ,1
);