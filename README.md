# 👤 Cadastro de Usuários

![Java](https://img.shields.io/badge/Java-21-red?style=for-the-badge\&logo=openjdk)
![XML](https://img.shields.io/badge/XML-Export-orange?style=for-the-badge)
![OOP](https://img.shields.io/badge/POO-Object%20Oriented-blue?style=for-the-badge)
![Build](https://img.shields.io/badge/build-passing-brightgreen?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-lightgrey?style=for-the-badge)

---

# 📌 Sobre o projeto

O **Cadastro de Usuários** é uma aplicação desenvolvida em **Java** para cadastro de usuários utilizando conceitos de Programação Orientada a Objetos (POO), herança, polimorfismo, enumerações e manipulação de arquivos XML.

A aplicação permite cadastrar usuários classificados como **Operador** ou **Administrador**, diferenciando-os entre **Pessoa Física** e **Pessoa Jurídica**, com exportação automática das informações para arquivos XML.

---

# 🚀 Funcionalidades

* Cadastro de usuários
* Geração automática de identificadores UUID
* Classificação entre Operador e Administrador
* Cadastro de Pessoa Física
* Cadastro de Pessoa Jurídica
* Exportação automática para arquivos XML
* Interface gráfica utilizando JOptionPane

---

# 🧱 Tecnologias utilizadas

* Java
* XML
* Java Swing (JOptionPane)
* UUID
* Programação Orientada a Objetos (POO)

---

# 🏗️ Estrutura do projeto

```text
src/

├── controllers
│   └── UsuarioController
│
├── entities
│   ├── Usuario
│   ├── PessoaFisica
│   └── PessoaJuridica
│
├── enums
│   └── ClassificacaoUsuario
│
└── repositories
    └── UsuarioRepository
```

---

# 🔄 Fluxo da aplicação

```text
Cadastro do Usuário
        │
        ▼
Classificação
(Operador ou Administrador)
        │
        ▼
Tipo de Usuário
(Pessoa Física ou Jurídica)
        │
        ▼
Coleta dos Dados
        │
        ▼
Exportação para XML
```

---

# 📂 Arquivos gerados

Após o cadastro, o sistema gera automaticamente arquivos XML contendo os dados cadastrados.

Exemplos:

```text
usuario_UUID.xml
PessoaFisica_UUID.xml
PessoaJuridica_UUID.xml
```

Os arquivos são armazenados no diretório configurado pela aplicação.

---

# ⚙️ Como executar o projeto

## 1. Clone o repositório

```bash
git clone https://github.com/beatrizlima-tech/java-usuario.git
```

## 2. Abra o projeto

Importe o projeto em uma IDE Java, como IntelliJ IDEA ou Eclipse.

## 3. Execute a aplicação

Execute a classe principal para iniciar o cadastro de usuários.

---

# 📚 Conceitos aplicados

* Programação Orientada a Objetos
* Herança
* Polimorfismo
* Encapsulamento
* Enumerações
* UUID
* Manipulação de arquivos XML
* Interface gráfica com JOptionPane
* Organização em camadas

---

# 📌 Melhorias futuras

* Persistência em banco de dados
* Interface gráfica em JavaFX
* Exportação para JSON
* Validação de dados
* Integração com Spring Boot

---

# 👩‍💻 Autora

Desenvolvido por **Beatriz Lima**

🔗 GitHub
https://github.com/beatrizlima-tech

💼 LinkedIn
https://www.linkedin.com/in/beatrizlima-tech
