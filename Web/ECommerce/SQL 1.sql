CREATE TABLE Produto 
(
    id        INT NOT NULL PRIMARY KEY
              GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    nome      VARCHAR(100),
    preco     DOUBLE,
    descricao VARCHAR(100),
    imagem    VARCHAR(100)
);

INSERT INTO PRODUTO 
(
     NOME
   , PRECO
   , DESCRICAO
   , IMAGEM
) VALUES
(
     'Tenis'
    ,300
    ,'Bonito'
    ,'/'
);