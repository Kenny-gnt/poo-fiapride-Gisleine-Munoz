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

Criar uma classe como Passageiro é importante porque ajuda a manter o sistema organizado. No começo, até daria para usar variáveis soltas como nome e saldo, mas isso só funciona com poucos usuários. Conforme o sistema cresce, como no caso de ter muitos usuários, o código ficaria confuso e difícil de manter.
A classe funciona como um molde, permitindo criar vários objetos com a mesma estrutura. Assim, cada passageiro é representado de forma padronizada.Isso evita repetição de código e facilita muito a manutenção. Em um sistema com muitos usuários, usar classes torna tudo mais simples e organizado.


### Aula 2 - Métodos

**Pergunta:** Se nós podemos simplesmente fazer `passageiro.saldo = passageiro.saldo + 100` diretamente no código principal, por que dá tanto trabalho criar um método específico chamado `adicionarSaldo(valor)` para fazer isso? Quais seriam os riscos para a nossa startup de mobilidade se deixássemos qualquer programador alterar o saldo diretamente?

**Sua Resposta:**

Criar um método como adicionarSaldo(valor) é importante porque ele garante mais controle sobre como o saldo é alterado. Mesmo que seja possível mudar o valor diretamente no código, isso pode gerar erros ou até permitir valores inválidos, como números negativos. Ao usar um método, podemos validar o valor antes de aplicar a alteração, garantindo que o sistema funcione corretamente. Além disso, centraliza a lógica em um único lugar, facilitando manutenção e mudanças futuras. Se qualquer programador pudesse alterar o saldo diretamente, haveria risco de inconsistências nos dados e até prejuízos para a empresa. Em uma startup, isso poderia afetar a confiança dos usuários e causar problemas sérios no sistema.

---

### Aula 3 - Encapsulamento

**Pergunta:** No nosso código, os atributos são `private`, mas os métodos `getSaldo()` e `getNome()` são `public`. Por que é seguro deixar o `get` público, mas perigoso deixar o atributo original público?

**Pense bem:** Qual a diferença entre dar a alguém uma cópia de um documento seu, e entregar o documento original para a pessoa rasurar?

**Sua Resposta:**

Encapsulamento protege os dados da classe ao manter os atributos como private, evitando que sejam acessados diretamente. Os métodos get podem ser públicos porque apenas permitem visualizar os valores, sem dar a possibilidade de alteração. Dessa forma, a informação continua segura, já que ninguém consegue modificá-la sem passar por regras da própria classe. Já deixar os atributos públicos é perigoso, pois qualquer parte do código pode alterar os valores livremente, sem controle. É como entregar uma cópia de um documento para alguém ver, em vez do original que pode ser modificado.

---

### Aula 4 - Construtores

**Pergunta:**
Na nossa classe `Veiculo`, nós tomamos duas decisões arquitetônicas muito importantes:

1. Nós **não** criamos o método `setModelo()`.
2. O `setPlaca()` foi criado como **privado**, e criamos um método público chamado `atualizarPlaca()` para acessá-lo.

Pensando no mundo real e no Clean Code: Por que é um erro gravíssimo clicar em "Gerar Getters e Setters para tudo" automaticamente na sua IDE? Como as nossas duas decisões acima protegem o sistema de fraudes e falhas de lógica?

*Dica: Pense sobre o que pode ou não mudar fisicamente em um carro, e a diferença entre "alterar um dado no banco" e "executar um processo real no Detran".*

**Sua Resposta:**

Gerar getters e setters para tudo sem pensar é errado porque você perde o controle sobre o que pode ou não ser alterado no sistema. Nem todos os dados devem ser modificados livremente, como o modelo de um carro, que não muda na vida real. Já a placa pode mudar, mas isso exige um processo com regras, não apenas trocar um valor direto. Ao deixar o `setPlaca()` privado e criar um método como `atualizarPlaca()`, garantimos que essa mudança siga uma lógica correta. Assim, o sistema fica mais seguro e evita alterações inválidas ou inconsistentes.


---

### Aula 5 - Associação

**Pergunta:** No construtor da `Viagem`, nós exigimos o objeto inteiro (`Passageiro solicitante`). Se o nosso resumo só precisa imprimir o nome da pessoa, não seria mais fácil e mais leve pedir apenas a String do nome no construtor da Viagem (`String nomeDoPassageiro`) em vez do objeto todo?

*Pense nas regras de negócio: O que acontece na hora que a Viagem acaba e o sistema precisa descontar o saldo? Se a Viagem tiver apenas a String "Ana Silva", ela consegue mexer no dinheiro dela?*

**Sua Resposta:**
[Escreva sua reflexão aqui]

---

### Aula 6 - Herança

**Pergunta:** No nosso código, a mãe `Veiculo` possui os atributos `placa` e `modelo` como `private`. Quando o `Carro` herda de `Veiculo`, ele recebe esses atributos, mas o código dentro de `Carro` NÃO consegue fazer `this.placa = "ABC"`. Ele é obrigado a usar o `super()` ou o `setPlaca()`.

Por que o Java não deixa a filha alterar as variáveis privadas da mãe diretamente? Qual o princípio das aulas passadas que isso está protegendo?

**Sua Resposta:**
[Escreva sua reflexão aqui]

---

### Aula 7 - Polimorfismo

**Pergunta:** No nosso loop `for (Veiculo veiculo : frota)`, a variável `veiculo` é do tipo genérico `Veiculo`. Se esquecêssemos de criar o método `calcularAutonomia()` lá na classe mãe `Veiculo`, nós conseguiríamos chamá-lo dentro do loop, mesmo sabendo que ele existe dentro do `Carro` e da `Moto`? Por que o contrato precisa existir na base da hierarquia?

**Sua Resposta:**
[Escreva sua reflexão aqui]

---

### Aula 8 - Classes Abstratas

**Pergunta:** Pense no mundo real: Faz sentido existir um objeto que é APENAS "Veículo" sem ser um tipo específico? Você já entrou em uma concessionária e comprou "um veículo" genérico?

Por que, então, no código, precisamos EXPLICITAMENTE dizer ao Java que `Veiculo` é `abstract`? Por que ele não deduz isso sozinho?

Pense: Se esquecermos de colocar `abstract`, qual o risco que corremos? Alguém pode criar `new Veiculo()` e quebrar a lógica do nosso sistema?

**Sua Resposta:**
[Escreva sua reflexão aqui]

---

### Aula 9 - Interfaces

**Pergunta:** Por que Java permite herança simples (apenas uma mãe), mas múltipla implementação de interfaces (vários contratos)?

Pense: Se `CarroEletrico` pudesse herdar de `Veiculo` E de `Bateria` ao mesmo tempo (herança múltipla), o que aconteceria se AMBAS as mães tivessem um método chamado `ligar()`?

Como as interfaces resolvem esse problema?

**Sua Resposta:**
[Escreva sua reflexão aqui]

---

## Desafios Técnicos Implementados

### Desafio Pessoal (Seu Projeto)

**Qual foi o domínio que você escolheu para seu projeto pessoal?**
[Responda aqui: ex: Sistema de Biblioteca, Playlist de Música, PetShop, etc.]

**Quais classes você criou?**
[Liste suas classes: ex: Livro, Usuario, Emprestimo]

**Qual foi o maior desafio técnico que você enfrentou?**
[Descreva o desafio e como você o resolveu - 10-15 linhas]

---

## Conclusão

**O que você aprendeu nestas 9 aulas?**
[Reflexão final - conte sobre sua jornada de aprendizado]

**Qual conceito foi mais difícil de entender?**
[Qual conceito e como você superou a dificuldade?]

**O que você melhoraria no seu projeto se pudesse refazer?**
[Reflexão crítica sobre seu próprio código]
