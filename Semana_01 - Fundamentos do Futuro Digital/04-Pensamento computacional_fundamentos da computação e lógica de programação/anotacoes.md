# 🧠 Pensamento Computacional: Fundamentos da Computação e Lógica de Programação

## 🛠️ O que é Programação?
A construção de qualquer software baseia-se numa equação fundamental:

$$\text{Programação} = \text{Lógica de Programação} + \text{Linguagem de Programação}$$

* **Lógica de Programação:** É o desenvolvimento do raciocínio estruturado, focado em resolver problemas por meio de uma sequência lógica de passos. Independe de tecnologia.
* **Linguagem de Programação:** É a ferramenta técnica (a sintaxe, os comandos e as regras gramaticais) utilizada para traduzir a lógica humana em instruções que o computador consiga compreender (ex: Java, C, PHP).

---

## 🏛️ Os 4 Pilares do Pensamento Computacional
O pensamento computacional é uma metodologia de resolução de problemas que divide os desafios em quatro etapas sequenciais:

1.  **Decomposição:** Consiste em pegar num problema complexo e dividi-lo em subproblemas menores e mais gerenciáveis.
2.  **Reconhecimento de Padrões:** Identificar características comuns, repetições ou similaridades entre os subproblemas divididos e experiências passadas.
3.  **Abstração:** Filtrar o que é irrelevante, focando apenas nos elementos essenciais e genéricos necessários para resolver o problema atual.
4.  **Algoritmos:** Criação de um conjunto de regras passo a passo, claras e finitas, para solucionar o desafio original.

---

## 🔄 Fluxo de Dados: Entrada, Processamento e Saída

Todo sistema computacional baseia-se num ciclo contínuo de manipulação de dados:

* **Entrada de Dados:** A captura de informações externas fornecidas pelo usuário ou por sensores (ex: digitação de um valor, clique, leitura de um CEP).
* **Processamento de Dados:** A fase em que as regras de negócio, cálculos matemáticos e testes lógicos atuam sobre as entradas recebidas para transformá-las.
* **Saída de Dados:** A entrega do resultado final processado de volta para o usuário ou para outro sistema (ex: exibição de um valor total na tela, envio de um e-mail).

### 📦 O que são Variáveis?
Variáveis são espaços alocados temporariamente na memória RAM do computador para armazenar dados que serão utilizados durante a execução do processamento. Elas possuem um nome (identificador), um tipo de dado (texto, número, booleano) e um valor armazenado que pode se modificar ao longo do fluxo.

---

## 🧮 Operações Lógico-Aritméticas

Os motores de cálculo e decisão nos blocos de processamento dependem diretamente de dois tipos de operações:

### Operadores Aritméticos
Utilizados para computar transformações matemáticas sobre dados quantificáveis:

| Operador | Operação | Exemplo |
| :---: | :--- | :--- |
| `+` | Adição | `total = total + valor` |
| `-` | Subtração | `desconto = preco - 10` |
| `*` | Multiplicação | `taxa = 0.05 * preco` |
| `/` | Divisão | `media = soma / quantidade` |
| `%` | Resto da Divisão (Módulo) | `resto = 5 % 2` *(Resultado: 1)* |

### Operadores Lógicos
Utilizados para avaliar condições booleanas, retornando estritamente **Verdadeiro** ou **Falso**:

* **AND (E / `&&`):** Exigente. O resultado só é verdadeiro se **todas** as condições forem verdadeiras.
* **OR (OU / `||`):** Flexível. O resultado é verdadeiro se pelo menos **uma** das condições for verdadeira.
* **NOT (NÃO / `!`):** Inversor. Transforma Verdadeiro em Falso e vice-versa.

---

## 🚦 Estruturas de Controle: Decisão e Repetição

### Estruturas de Decisão (Condicionais)
Desviam o fluxo do algoritmo criando ramificações com base num teste lógico.
* **Se / Senão (`if / else`):** Caso a condição seja verdadeira, o sistema executa um bloco de código; caso contrário, executa outro.

### Estruturas de Repetição (Laços / Loops)
Permitem que um bloco de instruções seja executado repetidas vezes de forma automatizada até que uma condição de parada seja atingida.
* **Enquanto (`while`):** Repete o bloco continuamente *enquanto* a condição testada se mantiver Verdadeira. Exige uma atualização da variável de controle dentro do laço para evitar Loops Infinitos.

---

## 🛠️ Aplicação Prática: Pseudocódigo vs. Fluxograma

A concepção de um algoritmo pode ser validada e desenhada através de duas representações principais:

* **Pseudocódigo:** Uma descrição estruturada do algoritmo em linguagem natural (português estruturado), aproximando-se da lógica escrita da programação sem se amarrar às travas de uma sintaxe real.
* **Fluxograma:** Uma representação visual e gráfica do algoritmo utilizando formas geométricas padronizadas (Elipses para Início/Fim, Retângulos para Processos, Losangos para Tomadas de Decisão) para mapear o caminho que os dados percorrem.

### 🧩 Funções em Algoritmos
Funções são sub-rotinas ou blocos isolados de pseudocódigo que executam uma tarefa específica e bem definida (ex: `calcular_taxa()`, `exibir()`). Elas ajudam na legibilidade e permitem que o código seja reaproveitado em diferentes pontos do algoritmo sem a necessidade de reescrever as mesmas linhas de instrução.

---

## 🖥️ Caracterização de Dispositivos e Arquitetura de Von Neumann

Os computadores físicos operam seguindo um modelo de organização clássico conhecido como **Arquitetura de Von Neumann**, o qual divide o hardware do dispositivo em quatro unidades principais interconectadas por barramentos:

1.  **Unidade Central de Processamento (CPU):** O cérebro do computador, composto pela **ULA** (Unidade Lógica e Aritmética, que realiza os cálculos) e pela **UC** (Unidade de Controle, que orquestra o fluxo de instruções).
2.  **Memória Principal (RAM):** Memória volátil e de rápido acesso que armazena as instruções do programa e os dados (variáveis) enquanto eles estão sendo ativamente processados.
3.  **Dispositivos de Entrada:** Componentes físicos responsáveis por enviar dados externos para dentro do sistema (ex: teclado, mouse, sensores).
4.  **Dispositivos de Saída:** Componentes físicos que traduzem os sinais digitais processados em resultados perceptíveis para o mundo externo (ex: monitores, impressoras, atuadores mecânicos).

---

## 🎓 Certificado de Conclusão
<img src="../../assets/Certificados/Certficado_Pensmento_Computacional.jpg" alt="Certificado Pensamento Computacional - Alura" width="100%"/>
