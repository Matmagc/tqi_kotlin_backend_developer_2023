CREATE TABLE carrinho (
  id BIGINT NOT NULL,
   quantidade INT NOT NULL,
   nome VARCHAR(255) NOT NULL,
   unidade VARCHAR(255) NOT NULL,
   preco DOUBLE PRECISION NOT NULL,
   categoria VARCHAR(255) NOT NULL,
   CONSTRAINT pk_carrinho PRIMARY KEY (id)
);