/*
* Beecrowd 2606 - Categorias.
* https://judge.beecrowd.com/pt/problems/view/2606
* Quando os dados foram migrados de Banco de Dados, houve um pequeno mal-entendido por parte do antigo DBA.

Seu chefe precisa que você exiba o código e o nome dos produtos, cuja categoria inicie com 'super'.
*/  

SELECT p.id, p.name
FROM products p
INNER JOIN categories c ON p.id_categories = c.id
WHERE c.name LIKE 'super%';
