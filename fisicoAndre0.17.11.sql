-- Geração de Modelo físico
-- Sql ANSI 2003 - brModelo.



CREATE TABLE Produtos (
TipoProduto Texto(1),
Descricao Texto(1),
Avaliacao varchar,
CodP int PRIMARY KEY,
Preco float,
Peso int
)

CREATE TABLE Clientes (
nome string,
telefone int,
endereco String,
Email string,
Cod cliente int PRIMARY KEY,
CPF int,
Senha int
)

CREATE TABLE Fornecedores (
telefone INT,
nome VARCHAR,
cnpj/cpf int,
Codfornecedor INT PRIMARY KEY,
pais VARCHAR
)

CREATE TABLE venda (
Codvenda int PRIMARY KEY,
tipoEnvio strig,
valorTotal float,
dataVenda date,
formaDePag String,
quantidade int,
nomeCliente String,
peso int,
codProd int,
codForn int,
Codcliente int,
FOREIGN KEY(Codcliente) REFERENCES Clientes (Cod cliente)
)

CREATE TABLE pedido (
Codfornecedor INT,
Cod P int,
FOREIGN KEY(Codfornecedor) REFERENCES Fornecedores (Codfornecedor),
FOREIGN KEY(Cod P) REFERENCES Produtos (CodP)
)

CREATE TABLE gera (
CodP int,
Codvenda int,
FOREIGN KEY(CodP) REFERENCES Produtos (CodP),
FOREIGN KEY(Codvenda) REFERENCES venda (Codvenda)
)

CREATE TABLE OPCAO (
Codvenda int,
Codigopagamento int,
FOREIGN KEY(Codvenda) REFERENCES venda (Codvenda)
)

CREATE TABLE Tipo de pagamento (
Debito varchar,
Codigopagamento int PRIMARY KEY,
Credito varchar,
Boleto varchar
)

ALTER TABLE OPCAO ADD FOREIGN KEY(Codigopagamento) REFERENCES Tipo de pagamento (Codigopagamento)
