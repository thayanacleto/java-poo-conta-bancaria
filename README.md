# 💻 Projeto Conta Bancária em Java

Projeto desenvolvido para praticar conceitos fundamentais de **Programação Orientada a Objetos (POO)** utilizando Java.

O foco não é interface, e sim **modelagem correta**, regras de negócio e organização do código.

---

## 🧠 Conceitos aplicados

- Encapsulamento
- Construtores
- Enumerações
- Composição de classes
- Métodos com regra de negócio
- Organização por pacotes

---

## 🧱 Estrutura do projeto

banco/
├─ application/
│ └─ Program.java
├─ entities/
│ ├─ Conta.java
│ └─ Titular.java
└─ enums/
└─ StatusConta.java


---

## 📌 Regras de negócio implementadas

- A conta possui um **status** (`ATIVA` ou `BLOQUEADA`)
- Depósitos só são permitidos se:
  - a conta estiver ativa
  - o valor for maior que zero
- Saques só são permitidos se:
  - a conta estiver ativa
  - houver saldo suficiente
- A classe `Conta` é responsável pelas regras
- O `main` apenas cria objetos e executa ações

---

## 🚀 Objetivo do projeto

Este projeto faz parte do meu processo de aprendizado em Java e POO, servindo como base para estudos futuros de:

- Herança
- Polimorfismo
- Classes abstratas
- Boas práticas de design orientado a objetos

---

## 🛠️ Tecnologias

- Java
- VS Code
- Git & GitHub

---

## ✨ Status do projeto

✔️ Concluído (versão inicial)  
🔄 Sujeito a evoluções conforme avanço nos estudos
