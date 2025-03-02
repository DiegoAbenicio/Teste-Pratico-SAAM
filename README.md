# Teste prático SAAM

## Sobre:

Teste prático desenvolvido com **Java Swing** e com **PostgreSQL**. O sistema permite o cadastro e login de usuários, também possui um CRUD completo para gerenciamento de trabalhadores.

---

## Especificações e Configurações:

### Versão do java

Teste criado utilizando o **Java 8**.

---

### Configurando BD

Para a configuração do banco de dados, vá até:
**`src/main/java/com/diegoabenicio/testepraticosaam/model/ConnectionDataBase.java`**

E altere as seguintes linhas:

```java
linha 14: String url = "jdbc:postgresql://localhost:**(porta)**/**(database)**"

linha 15: String user = (usuário do seu banco de dados)

linha 16: String password = (senha do seu banco de dados)
```

## Criando as tabelas

Utilize o arquivo `script.sql`, localizado na pasta raiz do projeto, para criar as tabelas e o banco de dados.

> **Observação:** Por padrão, a instrução para o database está comentada.
> Caso queira criar tudo de uma vez, basta remover o comentário antes de executar o script

### Demonstração do Projeto

Link para um vídeo hospedado no youtube com o funcionamento do código:

(https://www.youtube.com/watch?v=J6xFxhi7usI)
