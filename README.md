# 📝 Agenda de Tarefas API

API RESTful para gerenciamento de tarefas (CRUD) desenvolvida em **Java 25** com **Spring Boot 3**. O projeto foi estruturado seguindo boas práticas de arquitetura em camadas, validações de dados e DTOs (*Data Transfer Objects*) desacoplados entre **Request** e **Response** utilizando *Java Records*.

---

## 🛠️ Tecnologias e Ferramentas

* **Linguagem:** Java 25
* **Framework:** Spring Boot 3.x
  * Spring Data JPA
  * Spring Web
  * Spring Boot Starter Validation
* **Banco de Dados:** MySQL 8.x (Gerenciado via MySQL Workbench)
* **Utilitários:** Lombok (geração de boilerplate na Entity)
* **Gerenciador de Dependências:** Maven

---

## 🏗️ Arquitetura do Projeto

A aplicação adota uma organização em camadas bem definidas no pacote `com.exemplo.agendatarefas`:

```text
src/main/java/com/exemplo/agendatarefas/
├── controller/
│   └── TarefaController.java       # Mapeamento dos endpoints HTTP (REST)
├── dto/
│   ├── request/
│   │   ├── TarefaCreateRequest.java # Record DTO para criação de tarefas
│   │   └── TarefaUpdateRequest.java # Record DTO para atualização de tarefas
│   └── response/
│       └── TarefaResponse.java      # Record DTO para respostas da API
├── entity/
│   ├── StatusTarefa.java            # Enum com os status (PENDENTE, EM_ANDAMENTO, CONCLUIDA)
│   └── Tarefa.java                  # Mapeamento ORM da tabela "tb_tarefas"
├── repository/
│   └── TarefaRepository.java        # Interface de persistência (Spring Data JPA)
└── service/
    └── TarefaService.java           # Regras de negócio e conversões DTO <-> Entity
