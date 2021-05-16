## Construindo uma API Rest de Consulta de cidade do Brasil

#### O projeto

- O projeto consistia na criação de uma API Rest para consuta de distância entre cidades.
- A partir de um Banco de Dados com informações de Estado, Cidade e Pais
- No banco das cidades tinhamos a Latitude e Longitude das cidade e com isso podemos calcular com uma boa precisão a distância entre elas.

#### A Novidade

- Esse API é algo que podemos usar pensando em um sistema de entregas, entre tantas outras opções de uso, pensando em entrega rapidamente nos deparamos com um problema que todos comerciantes passam em lojas on-line, o custo de enviar uma mercadoria de um canto à outro.
- Quando temos a distância um grande fator de custo já é definido, mas no Brasil temos um particularidade do imposto no envio de mercadorias. 
- Há uma cobrança chamada DIFAL que trata-se da diferença entre o ICMS do local de Origem e do local de Destino
- O Estado de Destino cobrar 100% da diferença entre os ICMS. 
- Pensando nisso adicionei uma nova tabela no SQL para tratar esse problema, a tabela "icms".
- Essa tabela traz o ICMS cobrado em cada Estado, a cobrança é feita simplesmente pela diferença entre "From-To" (De-Para), sendo 0 caso o ICMS em "From" seja maior que o de "TO".
- Esse é uma primeira ideia que foi adicionada de maneira simples, usando SQL para criar a tabela, adicionando uma nova entidade, criando um repositório, serviços e recursos para API.

#### O que olhar:

- As entidade mapeadas são:
  - /cities
  - /states
  - /countries
  - /distances/by-points?from=??&to=??
    - Aqui calculamos a distância em milhas entre duas cidades, localizadas pelo ID da cidade
  - /distances/by-cube?from=??&to=??
    - Aqui calculamos a distância em metros entre duas cidades, localizadas pelo ID da cidade
  - /taxes/all
    - Retorna a tabela de ICMS
  - /taxes/difal?from=??&to=??
    - Retorna o DIFAL entre dois Estados definidos pelo seu ID