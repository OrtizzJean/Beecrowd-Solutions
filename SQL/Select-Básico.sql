/*
* Beecrowd 2602 - Select Básico!
* https://judge.beecrowd.com/pt/problems/view/2602
* Sua empresa está fazendo um levantamento de quantos clientes estão cadastrados nos estados,
porém, faltou levantar os dados do estado do Rio Grande do Sul.

Então você deve Exibir o nome de todos os clientes cujo estado seja ‘RS’.
*/  


SELECT name
FROM customers
WHERE state = 'RS';
