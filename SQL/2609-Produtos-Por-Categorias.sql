/*
* Beecrowd 2609 - Produtos por Categorias.
* https://judge.beecrowd.com/pt/problems/view/2608
* O setor financeiro da nossa empresa, está querendo saber os menores e maiores valores dos produtos, que vendemos.
Para isso exiba somente o maior e o menor preço da tabela produtos.
*/  

SELECT c.name, SUM(p.amount)
FROM products p
INNER JOIN categories c ON p.id_categories = c.id
GROUP BY c.name;
