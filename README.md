# 📝 API To-Do List

Uma API RESTful desenvolvida em Java com Spring Boot para o gerenciamento de tarefas e usuários. O projeto aplica boas práticas de arquitetura, separação de responsabilidades (Service, Repository, Controller) e o padrão DTO (Data Transfer Object) para garantir a segurança dos dados.

## 🚀 Tecnologias Utilizadas

* **Java 17+**
* **Spring Boot** (Spring Web)
* **Spring Data JPA** (Mapeamento Objeto-Relacional)
* **MySQL Driver** (Integração com banco de dados MySQL)
* **Validation / Hibernate Validator** (Validação de campos, regras de e-mail e tamanho de senhas)
* **Lombok** (Geração automática de Getters, Setters e Construtores para código mais limpo)

## ⚙️ Funcionalidades

* **Cadastro de Usuários:** Validação rigorosa de dados de entrada (`@NotBlank`, `@Email`, `@Size`) através do `UsuarioRequest`.
* **Listagem Segura de Usuários:** Retorno de dados formatados via `UsuarioResponse`, garantindo que informações sensíveis (como senhas) nunca vazem para o cliente.
* **Gerenciamento de Tarefas:** Estrutura pronta para criar tarefas com datas, descrições e status de andamento usando Enums (CANCELADA,INICIADA,PAUSADA,CONCLUIDA).

## 🛠️ Como rodar o projeto localmente

**1. Clone o repositório**
```bash
git clone [https://github.com/Andre2353/to_list.git](https://github.com/Andre2353/to_list.git)
