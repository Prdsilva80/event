🧩 Desafio 02 - Modelo de Domínio e ORM

Projeto desenvolvido como parte do Desafio 02 do curso de Java Spring Boot, com o objetivo de aplicar conceitos de modelo de domínio, mapeamento objeto-relacional (ORM) e relacionamentos entre entidades usando Spring Data JPA e banco de dados H2.

🚀 Tecnologias Utilizadas

- Java 21

- Spring Boot 3.5.7

- Spring Data JPA

- H2 Database (em memória)

- Maven

--------

🧠 Conceitos Aplicados

- Entidades e Relacionamentos:

- `Activity` ↔ `Category` → relação Muitos-para-Um

- `Activity` ↔ `Participant` → relação Muitos-para-Muitos

- `Activity` ↔ `Block` → relação Um-para-Muitos

- JPA / Hibernate para geração automática das tabelas (`ddl-auto=create`).

- `import.sql` utilizado para popular a base de dados automaticamente na inicialização.

- H2 Console habilitado para inspeção do banco em memória.

--------

🗃️ Modelo Relacional

    erDiagram
    CATEGORY ||--o{ ACTIVITY : contains
    ACTIVITY ||--o{ BLOCK : has
    ACTIVITY }o--o{ PARTICIPANT : participates

    CATEGORY {
        Long id
        String description
    }

    ACTIVITY {
        Long id
        String name
        String description
        Double price
        Long category_id
    }

    BLOCK {
        Long id
        Date event_day
        Time start_time
        Time end_time
        Long activity_id
    }

    PARTICIPANT {
        Long id
        String name
        String email
    }

-------

💾 Dados Iniciais (`import.sql`)
```
-- Participantes
INSERT INTO tb_participant (id, name, email) VALUES (1, 'José Silva', 'jose@gmail.com');
INSERT INTO tb_participant (id, name, email) VALUES (2, 'Tiago Faria', 'tiago@gmail.com');
INSERT INTO tb_participant (id, name, email) VALUES (3, 'Maria do Rosário', 'maria@gmail.com');

-- Categorias
INSERT INTO tb_category (id, description) VALUES (1, 'Curso');
INSERT INTO tb_category (id, description) VALUES (2, 'Oficina');

-- Atividades
INSERT INTO tb_activity (id, name, description, price, category_id) VALUES (1, 'Curso de HTML', 'Aprenda HTML de forma prática', 80.00, 1);
INSERT INTO tb_activity (id, name, description, price, category_id) VALUES (2, 'Oficina de Github', 'Oficina de Github', 0.00, 2);

-- Relações N:N
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 1);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 2);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (1, 3);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 1);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 2);
INSERT INTO tb_activity_participant (activity_id, participant_id) VALUES (2, 3);

-- Blocos
INSERT INTO tb_block (id, event_day, start_time, end_time, activity_id) VALUES (1, '2017-09-25', '08:00:00', '11:00:00', 1);
INSERT INTO tb_block (id, event_day, start_time, end_time, activity_id) VALUES (2, '2017-09-26', '14:00:00', '17:00:00', 2);
```

-------

⚙️ Configuração do Banco H2

Arquivo: `src/main/resources/application.properties`

```
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
```

-------

🧩 Execução do Projeto

1. Certifique-se de ter o Java 21 instalado.

2. Execute o projeto no terminal

3. Acesse o console H2:

URL: http://localhost:8080/h2-console

JDBC URL: `jdbc:h2:mem:testdb`

Username: `sa`

Password: (deixe em branco)

4. Execute consultas como:

```
SELECT * FROM tb_participant;
SELECT * FROM tb_activity;
SELECT * FROM tb_category;
SELECT * FROM tb_block;
```

🧾 Resultado Esperado

Ao iniciar o projeto, o console exibirá:
```
Tomcat started on port 8080 (http)
H2 console available at '/h2-console'
Started EventApplication in X seconds
```

E o banco H2 conterá os registros conforme o script `import.sql`.

🏁 Conclusão

Este projeto demonstra na prática os principais conceitos de mapeamento objeto-relacional (ORM) com JPA e Hibernate, incluindo:

- Criação de entidades e relacionamentos;

- Geração automática de schema;

- Inserção inicial de dados;

- Integração com o banco H2 para testes.

💡 É um exercício completo de modelagem relacional e aplicação prática dos fundamentos do Spring Boot.
