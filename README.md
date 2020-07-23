# estagio-cm
Repositório para atividades/exercícios dos estagiários da CM

## Setup do projeto
1. Realizar o fork do projeto para seu repo;
2. Realizar o clone;
3. No IntelliJ, importar gradle project. No Eclipse (com plugin *Buildship Gradle Integration*), Importar > Gradle > Existing Gradle project.
4. Para banco de dados, instalar o PostgreSQL. As configurações ficam no arquivo `database.properties`. Por padrão está apontando pra uma base chamada estagiocm, que pode ser criado na base PostgreSQL local com esse mesmo nome.
5. Configurar Tomcat 8.5.53. na IDE (IntelliJ ou Eclipse);
6. Se o depoy da aplicação estiver devidamente configurado, ao iniciar o Tomcat e acessar localhost:8080 com a msg:  
```
It works!! Se apresente Estagiário! 
```

## Tarefa 1 - CRUD Usuário
### Deve ser criada uma página contendo um formulário com os seguintes campos:
1. Nome (Texto);
2. Dt. Nascimento (texto com máscara (dd/MM/aaaa);
3. Senha (campo password só imprime øøøøø);
4. Botão salvar (grava os dados no banco de dados);
5. Botão pesquisar (usa as informações digitadas nos campos e pesquisa no banco de dados, listando em uma tabela abaixo os registros encontrados);

## Tarefa Bônus - Autenticação
### Implementar mecanismo de autenticação onde:
1. Tela inicial da aplicação é uma tela de login (usuario e senha);
2. Somente usuarios logados poderão acessar as páginas da aplicação;

### Detalhes da aplicação
- Usar o modelo de camadas que foi demonstrado na TechMeeting (Controller, Service, Repository, Model)
- Usar JSPs e Javascript com JQuery;
- Usar VRaptor (v3.5.2), Spring (v4.3.4.RELEASE) e Hibernate (v4.2.12.Final);
- Usar Tomcat (v8.5.30) e PostgreSQL (v10);
- Usar Gradle (v4.10.3)

### O que será avaliado
O resultado deve ser semelhante a uma tela de cadastro do Varejofacil. O uso de modelos para trafegar os dados da tela até o banco. Uso de chamada ajax (da JSP/JS para o Controller), uso de injeção de dependência (@Autowired do Spring), uso de mapeamento e querying (Criteria ou HQL) O/RM do Hibernate/JPA (@Entity, @Column). Uso do Git.

- Crie um fork deste repositório para seu próprio repositório e dê permissão para o usuário *danielchaves*

## Qualquer dúvida, questionar os devs

