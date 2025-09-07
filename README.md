# Exemplo MSN Messenger

Este projeto demonstra a implementação de conceitos fundamentais de Programação Orientada a Objetos (POO) em Java, utilizando um sistema de mensagens instantâneas como exemplo prático.

## 📁 Estrutura do Projeto

```bash
src/
├── apps/                           # Pacote contendo as classes de mensagens
│   ├── ServicoMensagemInstantanea.java  # Classe abstrata base
│   ├── MSNMessenger.java               # Implementação do MSN Messenger
│   ├── FacebookMessenger.java          # Implementação do Facebook Messenger
│   └── TelegramMessenger.java          # Implementação do Telegram
├── excecoes/                       # Pacote contendo exceções customizadas
│   └── OpcaoInvalidaException.java     # Exceção para opções inválidas
└── ComputadorPedrinho.java         # Classe principal do programa
```

## 🏗️ Arquitetura e Padrões de Design

### Herança e Abstração

O projeto utiliza o conceito de **herança** através de uma classe abstrata `ServicoMensagemInstantanea` que define o contrato comum para todos os serviços de mensagem instantânea. As classes filhas (`MSNMessenger`, `FacebookMessenger`, `TelegramMessenger`) implementam os métodos abstratos definidos na classe pai.

### Polimorfismo

O programa demonstra **polimorfismo** ao permitir que uma variável do tipo `ServicoMensagemInstantanea` possa referenciar qualquer uma das implementações concretas, escolhida dinamicamente em tempo de execução.

## 📋 Descrição dos Arquivos

### `ComputadorPedrinho.java`

**Classe principal** que contém o método `main` e implementa a lógica de seleção do serviço de mensagem.

**Funcionalidades:**

- Apresenta um menu interativo para o usuário escolher entre 3 opções de mensageiros
- Utiliza um `switch` expression para instanciar o serviço escolhido
- Implementa tratamento de exceções para opções inválidas
- Executa os métodos `enviarMensagem()` e `receberMensagem()` do serviço selecionado

**Dependências:**

- `Scanner` para entrada de dados do usuário
- Classes do pacote `apps` para os serviços de mensagem
- `OpcaoInvalidaException` para tratamento de erros

### `apps/ServicoMensagemInstantanea.java`

**Classe abstrata base** que define o contrato comum para todos os serviços de mensagem instantânea.

**Métodos abstratos:**

- `enviarMensagem()` - Define como enviar mensagens
- `receberMensagem()` - Define como receber mensagens
- `salvarHistoricoMensagem()` - Define como salvar o histórico (método protegido)

**Métodos concretos:**

- `validarConectadoInternet()` - Valida a conexão com a internet (método protegido)

**Características:**

- Utiliza o modificador `abstract` para impedir instanciação direta
- Demonstra o conceito de **abstração** ao definir apenas a interface comum
- Métodos `protected` para controle de acesso nas classes filhas

### `apps/MSNMessenger.java`

**Implementação concreta** do serviço MSN Messenger que herda de `ServicoMensagemInstantanea`.

**Funcionalidades implementadas:**

- `enviarMensagem()` - Envia mensagem via MSN Messenger
- `receberMensagem()` - Recebe mensagem via MSN Messenger
- `salvarHistoricoMensagem()` - Salva histórico específico do MSN

**Fluxo de envio:**

1. Valida conexão com internet
2. Exibe mensagem de envio
3. Salva histórico da mensagem

### `apps/FacebookMessenger.java`

**Implementação concreta** do serviço Facebook Messenger que herda de `ServicoMensagemInstantanea`.

**Funcionalidades implementadas:**

- `enviarMensagem()` - Envia mensagem via Facebook Messenger
- `receberMensagem()` - Recebe mensagem via Facebook Messenger
- `salvarHistoricoMensagem()` - Salva histórico específico do Facebook

**Características:**

- Segue o mesmo padrão de implementação do MSN Messenger
- Personaliza as mensagens de saída para o contexto do Facebook

### `apps/TelegramMessenger.java`

**Implementação concreta** do serviço Telegram que herda de `ServicoMensagemInstantanea`.

**Funcionalidades implementadas:**

- `enviarMensagem()` - Envia mensagem via Telegram
- `receberMensagem()` - Recebe mensagem via Telegram
- `salvarHistoricoMensagem()` - Salva histórico específico do Telegram

**Características:**

- Mantém consistência com as outras implementações
- Adapta as mensagens para o contexto do Telegram

### `excecoes/OpcaoInvalidaException.java`

**Exceção customizada** que herda de `NullPointerException` para tratar opções inválidas de seleção.

**Características:**

- Herda de `NullPointerException` (escolha específica do projeto)
- Possui mensagem padrão definida como constante
- Oferece dois construtores: um com mensagem padrão e outro com mensagem customizada
- Documentação JavaDoc completa explicando o propósito da exceção

**Construtores:**

- `OpcaoInvalidaException()` - Usa mensagem padrão
- `OpcaoInvalidaException(String mensagem)` - Permite mensagem customizada

## 🎯 Conceitos de POO Demonstrados

### 1. **Herança**

- `ServicoMensagemInstantanea` como classe pai
- Classes filhas herdam comportamento comum

### 2. **Abstração**

- Classe abstrata define interface comum
- Métodos abstratos forçam implementação nas classes filhas

### 3. **Polimorfismo**

- Uma variável pode referenciar diferentes tipos de objetos
- Mesmo método se comporta diferentemente dependendo do objeto

### 4. **Encapsulamento**

- Métodos `protected` controlam acesso
- Separação entre interface pública e implementação interna

### 5. **Tratamento de Exceções**

- Exceção customizada para casos específicos
- Validação de entrada do usuário

## 🔧 Padrões de Código

- **Nomenclatura**: Segue convenções Java (PascalCase para classes, camelCase para métodos)
- **Documentação**: JavaDoc nas classes de exceção
- **Organização**: Pacotes bem estruturados por funcionalidade
- **Comentários**: Código bem documentado explicando conceitos de POO

Este projeto serve como um excelente exemplo para entender como aplicar conceitos fundamentais de Programação Orientada a Objetos em Java de forma prática e didática.
