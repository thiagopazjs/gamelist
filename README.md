# 🎮 Lista Interativa de Games

Este é um projeto desenvolvido em **Java** utilizando o **Spring Framework**, com o objetivo de criar uma aplicação web simples para gerenciamento de uma lista de games. A aplicação permite **adicionar**, **editar** e **visualizar** games de forma interativa.

## 🚀 Funcionalidades

- ✅ Cadastrar novos games
- ✅ Editar dados de games existentes
- ✅ Listar todos os games registrados
- 🚧 Remover games da lista (em desenvolvimento)
- 🚧 Integração com banco de dados (planejado)

## 🛠️ Tecnologias utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Web**
- **Spring Data JPA** *(opcional, se já estiver usando)*
- **H2 Database / MySQL / outro** *(dependendo do que você usou)*
- **Maven** ou **Gradle**

## 📂 Estrutura do projeto

```bash
.
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/seunome/listagames/
│   │   │       ├── controllers/
│   │   │       ├── models/
│   │   │       ├── repositories/
│   │   │       └── ListaGamesApplication.java
│   │   └── resources/
│   │       ├── application.properties
│   │       └── static/ ou templates/ (caso use Thymeleaf)
├── README.md
└── pom.xml / build.gradle
