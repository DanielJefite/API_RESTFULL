## 🚀 Tecnologias Utilizadas

  

- Java 17

- Spring Boot 3.5.0

- Spring Data JPA

- PostgreSQL

- Maven

- Docker e Docker Compose

  

---

  

## 📦 Como executar o projeto

  

### 1. Clonar o repositório

  

```bash

git  clone  https://github.com/DanielJefite/API_RESTFULL.git

cd  API_RESTFULL


```

  

### 2. Rodar com Maven

  

Certifique-se de ter o **Java 17** e o **Maven** instalados.

  

```bash

mvn  clean  install

mvn  spring-boot:run

```

  

A aplicação ficará disponível em: `http://localhost:8080`

  

---

  

## 🐳 Executar com Docker Compose

  

1. Certifique-se de que o Docker esteja instalado.

2. Entre na pasta onde está o arquivo "docker-compose.yml" através do prompt

2. Execute o seguinte comando:

  

```bash

docker-compose  up  --build

```

  

A API sobe em: `http://localhost:8080`

O PostgreSQL estará disponível na porta `5432`.

  

---

  

## 🔌 Endpoints da API

  

| Método | Endpoint | Descrição |

|--------|--------------------|------------------------------------|

| GET | /disciplinas | Lista todas as disciplinas |

| GET | /disciplinas/{id} | Retorna uma disciplina por ID |

| POST | /disciplinas | Cria uma nova disciplina |

| PUT | /disciplinas/{id} | Atualiza uma disciplina existente |

| DELETE | /disciplinas/{id} | Remove uma disciplina |

  

### Exemplo de JSON para POST/PUT:

  

```json

{

"nome": "Algoritmos",

"professor": "João da Silva",

"indice": 8.5,

"codigo": 1234

}

```

  

---

  

## 🛠️ Configurações do Banco de Dados

  

No arquivo `application.properties`:

  

```
spring.datasource.url=jdbc:postgresql://localhost:5428/disciplina_db

spring.datasource.username=aula

spring.datasource.password=senha

spring.jpa.hibernate.ddl-auto=update

spring.jpa.show-sql=true

spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

server.port=8080

```

  

---


## 📄 Licença

  

Este projeto é de uso acadêmico para fins educacionais.
