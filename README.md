Leitor e Tradutor de Produtos (CSV)
===================================

Este é um projeto simples em **Java** desenvolvido para praticar o gerenciamento de dependências através do **Maven**. A aplicação realiza a leitura de um arquivo de dados em formato CSV, processa as informações traduzindo-as de inglês para português e exibe o resultado final no terminal.

Tecnologias e Bibliotecas
----------------------------

*   **Java 25**

*   **Maven**: Gerenciamento de dependências e build.

*   **OpenCSV (5.12.0)**: Utilizado para o parsing e mapeamento do arquivo products.csv para objetos Java.

*   **LibreTranslate**: Integração com API de tradução para converter os dados dos produtos.


Como funciona
-----------------

1.  **Leitura**: O sistema busca o arquivo products.csv na pasta de recursos.

2.  **Mapeamento**: Utiliza anotações @CsvBindByName para converter as linhas do CSV diretamente no modelo Produto.

3.  **Tradução**: Através do TraduzProdutoService, os campos de nome, categoria e descrição são enviados para a API do LibreTranslate.

4.  **Saída**: Os dados originais e traduzidos são impressos no console.


Estrutura do Projeto
-----------------------

O projeto segue o padrão de arquitetura MVC simplificado:

*   model: Representação do dado (Produto).

*   service: Lógica de negócio (Integração com a tradução).

*   resources: Arquivos de configuração e dados (CSV).