# Curso Alura - Java: Trabalhando com Listas e Coleções de Dados

Este repositório contém os conceitos teóricos, práticas de código e o projeto final desenvolvidos durante o curso **Java: trabalhando com listas e coleções de dados** da Alura. O objetivo principal do curso é dominar o uso de estruturas de dados dinâmicas, manipulação de coleções de objetos, ordenação e boas práticas de Programação Orientada a Objetos (POO).

---

## 📋 Módulos do Curso e Conteúdos Abordados

### Módulo 1: Listas de Objetos
* **Evolução das Estruturas:** Compreensão de por que arrays tradicionais (`Produto[]`) possuem limitações de tamanho fixo e introdução às coleções dinâmicas.
* **A Classe `ArrayList`:** Criação e manipulação de listas dinâmicas utilizando a API do Java.
* **Instanciação em Loops:** Como criar instâncias de objetos dinamicamente dentro de estruturas de repetição (`while`/`for`) baseadas nas ações do usuário.
* **Métodos Fundamentais:** Utilização dos métodos `.add()`, `.size()` e `.get()` para gerenciar os elementos internos da lista.

### Módulo 2: Construindo Objetos com Construtores
* **Encapsulamento e Inicialização:** Definição de construtores personalizados para garantir que um objeto seja instanciado com todos os seus atributos obrigatórios preenchidos (ex: `new Produto(nome, valor)`).
* **Sobrecarga de Construtores:** Criação de múltiplos construtores para uma mesma classe, oferecendo flexibilidade na inicialização de objetos.
* **Palavra-chave `this`:** Utilização do `this` para diferenciar atributos de instância de parâmetros locais.

### Módulo 3: Boas Práticas com Interfaces e Polimorfismo
* **Programação Orientada a Interfaces:** Entendimento do porquê declarar variáveis utilizando a interface abstrata (ex: `List<Produto>`) em vez da implementação concreta (`LinkedList` ou `ArrayList`).
* **Diferença entre Coleções:** * `ArrayList`: Excelente para busca e acesso direto via índice (Performance $O(1)$).
  * `LinkedList`: Ideal para cenários com inserções e remoções frequentes de elementos nas extremidades.
* **Polimorfismo:** Capacidade de referenciar diferentes implementações de listas sob uma mesma interface comum (`List`).

### Módulo 4: Ordenação e Comparação de Dados
* **A Interface `Comparable`:** Implementação da interface `Comparable<T>` em classes de modelo para definir a ordem natural dos objetos.
* **Método `compareTo`:** Sobrescrita do método `compareTo(Objeto outro)` utilizando utilitários como `Double.compare()` ou `Integer.compare()` para ordenar atributos numéricos ou textuais.
* **Classe `Collections`:** Uso do método estático `Collections.sort(lista)` para ordenar coleções de forma crescente e automática baseando-se no critério definido no `compareTo`.

---

## 🛠️ Projeto Prático: Sistema de Compras com Cartão de Crédito

Como desafio de conclusão, foi desenvolvido um sistema de terminal que simula um carrinho de compras associado a uma conta bancária com limite de crédito:
1. O usuário define o limite inicial do cartão.
2. Um loop `while` solicita repetidamente novos produtos (descrição e valor).
3. A classe `CartaoCredito` valida se há saldo suficiente. Se houver, desconta do limite e adiciona o item ao `LinkedList`.
4. Ao encerrar as compras, a lista é ordenada em ordem crescente de preço utilizando a interface `Comparable` e exibe o extrato final de forma limpa e formatada.

---

## 🎓 Certificado de Conclusão

Abaixo está o registro da conclusão com sucesso de todas as etapas e desafios propostos pelo curso:

![Certificado de Conclusão](../../assets/Certificados/Certificado_%20Java-trabalhando%20com%20listas%20e%20cole%C3%A7%C3%B5es%20de%20dados.png)