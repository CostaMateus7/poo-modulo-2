# Programação Orientada a Objetos - Módulo 2

Projeto desenvolvido como atividade do **Módulo 2 da disciplina de Programação Orientada a Objetos**.

O objetivo da atividade é aplicar conceitos de orientação a objetos em Java por meio da criação de uma classe `ContaCorrente`, responsável por representar uma conta bancária e realizar algumas operações básicas.

## 📌 Funcionalidades

A classe `ContaCorrente` possui informações como:

- Primeiro nome do cliente
- Sobrenome do cliente
- Número da conta corrente
- Saldo
- Taxa de juros
- Limite do cheque especial

Foram implementados métodos para:

- Realizar depósitos
- Realizar saques
- Verificar o limite disponível para saque
- Aplicar rendimento sobre saldo não negativo
- Exibir o saldo
- Retornar o nome completo do cliente
- Retornar o número da conta

## 💻 Exemplo de utilização

No método `main`, é criada uma instância da classe `ContaCorrente`:

```java
ContaCorrente conta = new ContaCorrente(
    "Mateus",
    "Santos",
    123456789
);
```

Em seguida, são realizadas as operações propostas pela atividade:

```java
conta.depositar(100);
conta.sacar(125);
conta.rendimento();
conta.exibirSaldo();
```

## 📂 Estrutura do projeto

```text
poo-modulo-2/
│
├── README.md
│
└── src/
    ├── App.java
    └── ContaCorrente.java
```

## 🧠 Conceitos praticados

Durante o desenvolvimento da atividade foram praticados conceitos como:

- Classes e objetos
- Atributos
- Métodos
- Construtores
- Instanciação de objetos
- Tipos primitivos
- Parâmetros
- Retorno de métodos
- Modificadores de acesso
- Estruturas condicionais
- Uso do `this`

## 🛠️ Tecnologias utilizadas

- Java
- Visual Studio Code
- Git
- GitHub

## 👨‍💻 Autor

**Mateus Costa Santos**

Projeto desenvolvido para fins acadêmicos e de aprendizagem.