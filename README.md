# 👤 Cadastro de Usuários com Exportação XML

Projeto desenvolvido em Java para cadastro de usuários utilizando conceitos de Programação Orientada a Objetos (POO), herança, enumerações e manipulação de arquivos XML.

A aplicação permite cadastrar usuários classificados como Operador ou Administrador, além de diferenciá-los entre Pessoa Física e Pessoa Jurídica, exportando os dados para arquivos XML gerados automaticamente.

---

## 🚀 Tecnologias Utilizadas

* Java
* Java Swing (JOptionPane)
* XML
* UUID
* Programação Orientada a Objetos (POO)

---

## 📋 Funcionalidades

### Cadastro de Usuário

* Geração automática de identificador único (UUID)
* Cadastro de login
* Cadastro de senha

### Classificação de Usuário

O sistema permite classificar o usuário como:

* Operador
* Administrador

### Tipo de Usuário

Após a classificação, o usuário pode ser identificado como:

#### Pessoa Física

* Nome
* CPF

#### Pessoa Jurídica

* Razão Social
* CNPJ

### Exportação de Dados

Os dados cadastrados são exportados automaticamente para arquivos XML.

Exemplos:

```text
usuario_UUID.xml
PessoaFisica_UUID.xml
PessoaJuridica_UUID.xml
```

---

## 🏗️ Estrutura do Projeto

```text
src
│
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

## 🔄 Fluxo da Aplicação

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
Geração dos Arquivos XML
```

---

## 📂 Arquivos Gerados

Os arquivos XML são armazenados localmente no diretório:

```text
C:\temp\
```

### Exemplo de XML

```xml
<usuario>
   <id>UUID</id>
   <login>usuario</login>
   <senha>senha123</senha>
</usuario>
```

---

## 📚 Conceitos Aplicados

Durante o desenvolvimento foram praticados:

* Programação Orientada a Objetos
* Herança
* Encapsulamento
* Enumerações
* UUID
* Manipulação de Arquivos
* Exportação XML
* Interface gráfica com JOptionPane
* Organização em camadas

---

## 🎯 Objetivo

Projeto desenvolvido para consolidar conceitos fundamentais de orientação a objetos, modelagem de entidades e geração de arquivos XML utilizando Java.

---

## 👩‍💻 Desenvolvedora

**Beatriz Lima**

GitHub:
https://github.com/beatrizlima-tech
