# Sistema de Contas

Um sistema simples de gerenciamento de contas a pagar e receber desenvolvido em Java.

## Funcionalidades

- Lançar contas a pagar e receber
- Listar todas as contas cadastradas
- Marcar contas como pagas
- Visualizar totais e saldo geral

## Pré-requisitos

- Java 8+ instalado
- Terminal ou prompt de comando

## Como executar

### 1. Navegar até a pasta do projeto
```bash
cd "c:\Users\alden\Área de Trabalho\Projeto Java\projetoJava"
```

### 2. Compilar o projeto
```bash
javac -d . src\Main.java src\model\*.java src\repository\*.java src\service\*.java
```

### 3. Executar a aplicação
```bash
java Main
```

## Como usar

Ao executar a aplicação, você verá o menu principal:

```
=== Sistema de Contas ===
1. Lançar conta
2. Listar contas
3. Marcar como paga
4. Ver totais
0. Sair
```

### Lançar uma conta
- Escolha a opção **1**
- Informe o tipo: `PAGAR` ou `RECEBER`
- Digite o valor (ex: `100.50`)
- Descreva a conta (ex: `Conta de luz`)
- Informe a data de vencimento no formato `dd/MM/yyyy` (ex: `25/10/2025`)

### Listar contas
- Escolha a opção **2** para ver todas as contas cadastradas

### Marcar como paga
- Escolha a opção **3**
- Selecione o número da conta que deseja marcar como paga

### Ver totais
- Escolha a opção **4** para visualizar:
  - Total a pagar
  - Total a receber
  - Saldo geral (receber - pagar)

## Estrutura do projeto

```
src/
├── Main.java              # Classe principal com interface de usuário
├── model/
│   ├── Conta.java         # Modelo da conta
│   └── TipoConta.java     # Enum para tipos de conta
├── repository/
│   └── ContaRepository.java # Repositório para gerenciar dados
└── service/
    └── ContaService.java   # Lógica de negócio
```

## Exemplo de uso

```
=== Sistema de Contas ===
1. Lançar conta
2. Listar contas
3. Marcar como paga
4. Ver totais
0. Sair
Escolha: 1

Tipo (PAGAR/RECEBER): PAGAR
Valor: 150.00
Descrição: Conta de luz
Data de vencimento (dd/MM/yyyy): 30/10/2025
```