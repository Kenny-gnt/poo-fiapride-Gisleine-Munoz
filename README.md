# Projeto FiapRide - [Gisleine Muñoz Ticona]

## Informações do Aluno

* **Nome:** Gisleine Muñoz Ticona
* **RM:** 563804
* **Turma:** 2CCPG
* **Curso:** Ciências Da Computação
* **GitHub:** Kenny-gnt

---

## Descrição do Projeto

Este projeto é o resultado do aprendizado nas aulas 1-9 de Programação Orientada a Objetos, onde desenvolvemos o sistema **FiapRide** (aplicativo de mobilidade urbana).

---

## Checklist de Implementação

* [x] Aula 1 - Classes e Objetos
* [x] Aula 2 - Métodos
* [x] Aula 3 - Encapsulamento
* [x] Aula 4 - Construtores
* [x] Aula 5 - Associação
* [x] Aula 6 - Herança
* [x] Aula 7 - Polimorfismo
* [x] Aula 8 - Classes Abstratas
* [x] Aula 9 - Interfaces

---

## Perguntas de Reflexão

### Aula 1 - Classes e Objetos

**Pergunta:** Por que precisamos criar uma classe `Passageiro`? Não seria mais fácil apenas criar variáveis soltas no main, como `String nomeAna = "Ana"` e `double saldoAna = 50.0`?

**Pense:** E se o FiapRide tiver 1 milhão de usuários? Como a Classe ajuda a resolver isso?

**Sua Resposta:**

Criar uma classe como Passageiro é importante porque ajuda a manter o sistema organizado e escalável. No começo, usar variáveis soltas parece mais simples, mas isso só funciona em sistemas muito pequenos. Conforme o FiapRide cresce e passa a ter milhares ou até milhões de usuários, seria praticamente impossível controlar tantas variáveis espalhadas pelo código. A classe funciona como um molde, permitindo criar vários objetos com a mesma estrutura e comportamento. Durante o desenvolvimento do meu projeto percebi que isso também facilita manutenção, reutilização e organização do sistema, porque cada objeto representa uma entidade real de forma padronizada.

### Aula 2 - Métodos

**Pergunta:** Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?

**Sua Resposta:**

Criar um método como adicionarSaldo(valor) é importante porque ele garante controle sobre como o saldo será alterado. Mesmo sendo mais rápido modificar o valor diretamente, isso deixaria o sistema vulnerável a erros e alterações inválidas. Durante as aulas percebi que métodos existem para proteger as regras de negócio. No FiapRide, por exemplo, um saldo negativo poderia causar prejuízos ou inconsistências no sistema. Centralizar essa lógica em um método também facilita futuras mudanças, como adicionar validações, limites ou registro de transações sem precisar alterar várias partes do código.

---

### Aula 3 - Encapsulamento

**Pergunta:** No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

**Pense bem:** Qual a diferença entre dar a alguém uma cópia de um documento seu, e entregar o documento original para a pessoa rasurar?

**Sua Resposta:**

Encapsulamento protege os dados da classe ao manter os atributos como private, evitando acesso direto. Os métodos get podem ser públicos porque apenas permitem visualizar as informações, sem modificar os valores originais. Já deixar os atributos públicos seria perigoso, porque qualquer parte do sistema poderia alterar os dados livremente, sem validação ou controle. Durante o desenvolvimento percebi que isso é muito importante para evitar inconsistências e proteger a lógica do sistema. É como entregar uma cópia de um documento para alguém visualizar, em vez do documento original que pode ser alterado ou rasurado.

---

### Aula 4 - Construtores

**Pergunta:**
Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:

1. Nós **não** criamos o método `setModelo()`.
2. O `setPlaca()` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca()` para acessá-lo.

Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em "Gerar Getters e Setters para tudo" automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?

*Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre "alterar um dado no banco" e "executar um processo real no Detran".*

**Sua Resposta:**

Gerar getters e setters automaticamente para tudo é perigoso porque o sistema perde controle sobre os dados importantes. Nem toda informação deve poder ser alterada livremente. No caso do veículo, o modelo praticamente nunca muda no mundo real, então não faz sentido existir um setModelo(). Já a placa pode até mudar, mas isso exige um processo com validações, parecido com o que acontece no Detran. Por isso, usar atualizarPlaca() é mais seguro do que deixar um setter público simples. Durante as aulas percebi que Clean Code não é criar métodos para tudo automaticamente, mas pensar nas regras reais do sistema e proteger a lógica da aplicação.



---

### Aula 5 - Associação

**Pergunta:** No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo?

*Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?*

**Sua Resposta:**

Não é melhor usar só a String do nome, porque ela guarda apenas o texto e não permite acessar outros dados ou ações do passageiro. Ao usar o objeto Passageiro, a viagem consegue acessar o saldo e chamar métodos, como descontar o valor da corrida. Se fosse apenas "Ana Silva", o sistema não teria como alterar o saldo dela. Por isso, usar o objeto completo garante que as regras de negócio funcionem corretamente.

---

### Aula 6 - Herança

**Pergunta:** No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?

**Sua Resposta:**

O Java não permite que a filha altere diretamente os atributos privados da mãe porque isso quebraria o encapsulamento, que aprendemos nas aulas anteriores. Mesmo que Carro herde de Veiculo, alguns dados precisam continuar protegidos para evitar alterações indevidas. Ao obrigar o uso de métodos como super() ou setPlaca(), o sistema mantém regras e validações centralizadas. Isso garante mais segurança e organização no código. Durante o projeto, percebi que herança não significa acesso total aos dados da classe mãe, mas sim reaproveitamento controlado da estrutura e dos comportamentos.

---

### Aula 7 - Polimorfismo

**Pergunta:** No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?

**Sua Resposta:**

Não conseguiríamos chamar calcularAutonomia() dentro do loop se o método não existisse na classe mãe Veiculo. Mesmo que Carro e Moto tenham esse método, o Java olha para o tipo da variável do loop, que é Veiculo. Por isso, o contrato precisa existir na base da hierarquia, garantindo que todos os veículos tenham esse comportamento. Foi nessa aula que entendi melhor o polimorfismo, porque percebi que o sistema consegue tratar objetos diferentes de forma genérica, desde que todos sigam o mesmo contrato definido na classe mãe.

---

### Aula 8 - Classes Abstratas

**Pergunta:** Pense no mundo real: Faz sentido existir um objeto que é APENAS "Veículo" sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema?

**Sua Resposta:**

No mundo real, não faz muito sentido existir apenas um “Dispositivo” genérico. Sempre teremos um tipo específico, como notebook ou celular. Por isso, no meu projeto, transformei Dispositivo em uma classe abstrata, servindo apenas como um molde para as subclasses. O Java não deduz isso sozinho porque ele não entende a lógica do negócio, apenas executa o que o programador define. Se esquecermos de colocar abstract, qualquer pessoa poderia criar new Dispositivo(), mesmo sem existir um dispositivo genérico de verdade. Isso poderia gerar inconsistências no sistema e quebrar a lógica da aplicação.

---

### Aula 9 - Interfaces

**Pergunta:** Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`?

Como as interfaces resolvem esse problema?

**Sua Resposta:**

Java permite apenas uma herança porque duas classes mães poderiam gerar conflitos no sistema. Se CarroEletrico herdasse de Veiculo e Bateria ao mesmo tempo, e ambas tivessem um método chamado ligar(), o Java não saberia qual implementação usar. Isso deixaria o código confuso e difícil de manter. As interfaces resolvem esse problema porque funcionam apenas como contratos de comportamento, definindo o que a classe deve fazer, mas sem implementar lógica diretamente. No meu projeto, Notebook e Celular implementam a interface Recarregavel mesmo sendo dispositivos diferentes. Assim, ambos podem ser tratados como Recarregavel sem precisar compartilhar a mesma hierarquia de herança. Durante a atividade percebi que interfaces dão mais flexibilidade ao sistema sem criar conflitos de implementação.

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**

Escolhi desenvolver um sistema de gerenciamento de dispositivos eletrônicos, trabalhando com notebooks e celulares para simular controle de desempenho, uso e recarga dos dispositivos.

**Quais classes você criou?**

Criei as classes Dispositivo, Notebook, Celular, UsoDispositivo e a interface Recarregavel.

**Qual foi o maior desafio técnico que você enfrentou?**

O maior desafio foi entender como aplicar corretamente herança, polimorfismo, classes abstratas e interfaces dentro do mesmo projeto. No começo eu tinha dificuldade para decidir o que deveria ficar na classe mãe e o que deveria ficar apenas nas subclasses. Também foi desafiador compreender por que usar métodos abstratos e interfaces em vez de colocar tudo diretamente nas classes concretas. Conforme fui evoluindo no projeto, percebi que a organização do código faz muita diferença na manutenção e na reutilização das funcionalidades. Outro ponto importante foi entender o polimorfismo, principalmente quando utilizei arrays de Dispositivo e Recarregavel para tratar objetos diferentes de forma genérica. Isso me ajudou a enxergar melhor como orientação a objetos funciona na prática. Além disso, tive que tomar cuidado com encapsulamento para proteger os atributos e evitar alterações indevidas no sistema.

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**

Durante essas 9 aulas aprendi os principais fundamentos da programação orientada a objetos, como classes, objetos, métodos, encapsulamento, construtores, associação, herança, polimorfismo, classes abstratas e interfaces. No começo eu enxergava as classes apenas como uma forma de organizar código, mas durante o desenvolvimento do projeto percebi que elas representam entidades reais do sistema e ajudam a proteger as regras de negócio. Também aprendi a importância de pensar na arquitetura antes de simplesmente criar getters e setters para tudo. Conforme o projeto evoluiu, consegui entender melhor como cada conceito se conecta e como eles tornam o sistema mais organizado, reutilizável e fácil de manter.

**Qual conceito foi mais difícil de entender?**

O conceito mais difícil para mim foi polimorfismo, porque no começo era estranho entender como objetos diferentes poderiam ser tratados pelo mesmo tipo genérico. Só consegui compreender melhor quando apliquei isso no meu próprio projeto usando arrays de Dispositivo e Recarregavel. Depois que vi funcionando na prática, ficou mais fácil entender como o Java escolhe automaticamente o comportamento correto de cada objeto.

**O que você melhoraria no seu projeto se pudesse refazer?**

Se pudesse refazer o projeto, eu melhoraria principalmente a organização das responsabilidades das classes. Agora consigo perceber que algumas validações e comportamentos poderiam estar mais separados para deixar o sistema ainda mais limpo e escalável. Também adicionaria mais tipos de dispositivos e mais interfaces para praticar melhor múltiplos contratos de comportamento. Além disso, tentaria deixar o código mais flexível para futuras expansões, aplicando ainda mais os princípios de orientação a objetos e Clean Code.
