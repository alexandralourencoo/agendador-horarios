# Agendador de Horários

API REST para gerenciamento de agendamentos, desenvolvida com Java e Spring Boot.

O projeto permite cadastrar, consultar, alterar e excluir agendamentos, com os dados armazenados em um banco H2.

## Tecnologias

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Lombok

## Funcionalidades

- Criar um agendamento
- Consultar agendamentos de um determinado dia
- Alterar um agendamento
- Excluir um agendamento
- Verificar disponibilidade de horário

## Estrutura do projeto

O projeto está dividido em algumas camadas:

```text
controller
service
infrastructure
    entity
    repository
