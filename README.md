# viridis-cassandra-test
Projeto com a utilização das principais funções de agregação no Apache Cassandra: MAX, MIN, SUM, AVG 

### Requisitos
- Cassandra 2.2
- Java 8
- Ajustar a configuração em cassandra.yaml
-- enable_user_defined_functions: true

### Execução
Para rodar o projeto é necessário criar persistir a base no cassandra. Para isso basta acessar o cqlsh e executar os comandos: 
- /src/resources/script.cql

### Referências

A implementação da expressão linear (ax+b), ainda em desenvolvimento, foi analisada de acordo com a documentação oficial do CQL 2.2: 
* [CQL 2.2] - Documentação oficial CQL 2.2

[Documentação CQL 2.2]: <http://cassandra.apache.org/doc/cql3/CQL-2.2.html#udfs>
