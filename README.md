# xy-inc

> Aplicação criada por Adriana Cirelli, para o teste de avaliação da empresa ZUP INNOVATION:


//Requisições:
>A aplicação foi desenvolvida em linguagem JAVA( Versão 8 - para evitar conflito entre verões mais recentes), 
através do framework Spring Tools (4). 
>Uso do client (XAMPP) para conectar com o Banco de dados MySQL. 
>Uso do client HTTP (Postman) para requisições REST  - executar/testar aplicação. 

//Metodologia:
>Foi construída uma tabela (ModelPontos) com as colunas 'id', 'nome', 'coodenadax' e 'coordenaday', implementada no pacote 'model'. Foram construídos os métodos GET, POST, PUT e DELETE através do pacote 'controller' e testados via postman (documentação apresentada e formado Json - EMPRESA XY.postman_collection.json - , alocada no conteúdo do referido repositório).
>Foi insirida a dependência swagger no Pom do programa, afins de ampliar as possibilidades de teste dos métodos da aplicação.
>Os dados inseridos na tabela ModelPontos foram armazenados no pacote 'repository' da aplicação.
>Foi criada a classe 'teste',dentro do pacote 'teste' para aplicação do teste unitário de listagem de pontos, através das ferramentas de testes automatizados - Junit-5 - (documentação apresentada em  formato PDF - doc_teste_junit.pdf -, alocada no conteúdo do referido repositório).

