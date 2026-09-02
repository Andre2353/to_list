# 📝 Agenda de Tarefas API

API RESTful para gerenciamento de tarefas (CRUD), desenvolvida em **Java** com **Spring Boot**. O projeto aplica boas práticas de arquitetura de software, desacoplamento de camadas e separação clara de responsabilidades através do padrão DTO (*Data Transfer Object*), divididos entre **Request** (dados de entrada) e **Response** (dados de saída).

---

## 🛠️ Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot 3.x**
  * Spring Data JPA
  * Spring Web
  * Bean Validation (`spring-boot-starter-validation`)
* **Banco de Dados H2** (ou PostgreSQL/MySQL em ambiente de produção)
* **Lombok** (para redução de código boilerplate)

---

## 🏗️ Estrutura do Projeto

O código-fonte segue a organização em camadas no pacote `com.exemplo.agendatarefas`:

```text
src/main/java/com/exemplo/agendatarefas/
├── controller/
│   └── TarefaController.java       # Exposição dos endpoints REST
├── dto/
│   ├── request/
│   │   ├── TarefaCreateRequest.java # DTO para criação (POST)
│   │   └── TarefaUpdateRequest.java # DTO para atualização (PUT)
│   └── response/
│       └── TarefaResponse.java      # DTO para exibição/retorno de dados (GET, POST, PUT)
├── entity/
│   ├── Tarefa.java                  # Entidade de domínio (Mapeamento JPA)
│   └── StatusTarefa.java            # Enum com os status da tarefa
├── repository/
│   └── TarefaRepository.java        # Interface de comunicação com o banco (Spring Data JPA)
└── service/
    └── TarefaService.java           # Regras de negócio e conversões DTO <-> Entity
