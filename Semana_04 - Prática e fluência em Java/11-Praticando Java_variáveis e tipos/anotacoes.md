# 📝 Anotações de Estudo — Praticando Java: Variáveis e Tipos

## 🎯 Visão Geral do Módulo
Estas anotações pertencem à **Semana 04 — Prática e Fluência em Java** da Jornada Geração Caldeira. O objetivo deste bloco de estudo foi consolidar a fluência prática na manipulação de memória através do ecossistema de tipagem do Java. Foram abordados conceitos fundamentais como a escolha correta entre tipos primitivos e objetos (*Wrappers*), alocação de memória, controle de escopo e os mecanismos de conversão de dados através de *Casting* (explícito e implícito), aplicados diretamente na resolução de problemas práticos e simulações de cenários de mercado.

---

## 🏗️ Demandas de Negócio e Resoluções Práticas

### 🔹 Demanda 01: Mapeamento e Exibição de Perfil Cadastral
* **Contexto da Demanda:** O sistema interno de gerenciamento acadêmico necessita de um módulo inicial capaz de coletar, registrar temporariamente em memória e exibir as credenciais de usuários cadastrados. É fundamental a escolha otimizada dos tipos de dados para evitar desperdício de memória no servidor.
* **Requisitos Técnicos:** * Declarar e tipar adequadamente as variáveis para armazenar: Nome completo, Idade, Altura e Status de Matrícula (se é estudante ou não).
  * Garantir a exibição dos dados de forma legível e alinhada no console de saída.

### 🔹 Demanda 02: Ajuste de Precisão de Dados e Controle de Estoque
* **Contexto da Demanda:** Um sistema de controle e gerenciamento de inventário exige que a contagem física de mercadorias seja armazenada estritamente como números inteiros, uma vez que itens tangíveis não admitem frações no estoque físico (ex: 19.5 unidades). No entanto, o fluxo de dados brutos de entrada fornece esses valores no formato de ponto flutuante (`double`).
* **Requisitos Técnicos:**
  * Realizar a conversão forçada de tipos (*Casting* explícito) para transformar de forma segura o dado do tipo `double` em um valor do tipo inteiro (`int`).
  * Aplicar o conceito de truncamento numérico nativo do Java para descartar a parte decimal e isolar apenas a unidade inteira do produto para o inventário.

### 🔹 Demanda 03: Cálculo de Média de Desempenho Acadêmico
* **Contexto da Demanda:** Uma plataforma de gestão escolar e boletins eletrônicos necessita automatizar o cálculo de desempenho dos estudantes a partir de avaliações periódicas. Como as notas escolares frequentemente possuem valores fracionados, a arquitetura do sistema exige o uso de tipos de dados que preservem as casas decimais de forma precisa durante os cálculos intermediários.
* **Requisitos Técnicos:**
  * Alocar variáveis utilizando o tipo ponto flutuante de dupla precisão (`double`) para garantir a fidelidade das notas parciais armazenadas.
  * Implementar a lógica para o cálculo da média aritmética simples, garantindo o uso correto dos parênteses para aplicar a precedência ideal dos operadores aritméticos (soma antes da divisão).
  * Exibir o resultado final da média diretamente no console com precisão decimal completa.

### 🔹 Demanda 04: Conversão de Unidades e Internacionalização de Métricas Climáticas
* **Contexto da Demanda:** Um sistema automatizado de telemetria e monitoramento de uma estufa agrícola registra métricas ambientais de temperatura utilizando a escala Celsius (armazenada como valor inteiro devido às especificações dos sensores locais). No entanto, para cumprir requisitos contratuais de auditoria, esses dados precisam ser exportados em relatórios formatados na escala Fahrenheit (com suporte a frações decimais) para clientes internacionais.
* **Requisitos Técnicos:**
  * Alocar o dado bruto de entrada do sensor utilizando o tipo inteiro (`int`).
  * Aplicar a fórmula matemática de conversão termométrica: `(Celsius * 9 / 5) + 32`.
  * Garantir a promoção automática de tipos (*Casting* implícito) para que o resultado final da conversão seja armazenado e exibido como um ponto flutuante (`double`), preservando a precisão fracionada exigida pelo relatório de destino.

### 🔹 Demanda 05: Sistema de Triagem e Catalogação de Acervo Literário
* **Contexto da Demanda:** O módulo de inventário de uma livraria ou biblioteca necessita de uma rotina inicial para o cadastro de novos títulos. Para otimizar o processamento e a entrada de dados, as categorias dos livros são identificadas internamente no banco de dados por um caractere único identificador ('F', 'N', 'T', 'H'). O sistema precisa carregar os metadados do livro e traduzir esse caractere na descrição por extenso da categoria ao exibir o comprovante de cadastro.
* **Requisitos Técnicos:**
  * Alocar variáveis utilizando os tipos apropriados para cada dado do livro: texto (`String`) para título e autor, numérico inteiro (`int`) para páginas, ponto flutuante (`double`) para o preço e caractere simples (`char`) para a categoria.
  * Implementar uma estrutura condicional de seleção (como `switch-case` ou `if-else`) para avaliar o caractere da categoria e associá-lo ao seu respectivo nome por extenso (Ficção, Não-ficção, Tecnologia ou História).
  * Exibir uma mensagem de confirmação final via console, interpolando todas as variáveis coletadas de forma clara e coesa.

### 🔹 Demanda 06: Classificação Paramétrica de Produtos por Faixa de Preço
* **Contexto da Demanda:** A plataforma de catálogo de um e-commerce necessita de uma rotina automatizada para classificar dinamicamente os produtos de seu inventário em categorias comerciais com base em seu valor de venda. Essa classificação é fundamental para estruturar filtros de busca no site e direcionar campanhas de marketing específicas.
* **Requisitos Técnicos:**
  * Manipular valores monetários utilizando o tipo numérico de ponto flutuante apropriado (`double`).
  * Implementar operadores relacionais (`<=`, `>`, `&&`) combinados com estruturas condicionais encadeadas (`if / else if / else`) para avaliar as fronteiras numéricas estipuladas pelas regras de negócio.
  * Mapear e exibir no console a categoria correspondente de forma automática: Econômico (até R$ 50,00), Intermediário (entre R$ 50,01 e R$ 200,00) ou Premium (acima de R$ 200,00).

### 🔹 Demanda 07: Algoritmo de Verificação de Paridade para Mecânicas de Jogos
* **Contexto da Demanda:** O motor lógico de um jogo digital necessita de uma rotina rápida para determinar a paridade de pontuações, identificadores de itens ou rodadas alcançadas pelos jogadores. Essa verificação é crucial para disparar mecânicas específicas da gameplay, tais como a alternância de turnos entre personagens, concessão de bônus em rodadas pares ou eventos específicos em fases ímpares.
* **Requisitos Técnicos:**
  * Alocar o valor numérico a ser testado utilizando o tipo numérico inteiro nativo (`int`).
  * Aplicar o operador aritmético de módulo (`%`) por 2 para extrair o resto da divisão inteira do número.
  * Implementar uma estrutura condicional simples (`if / else`) para avaliar o resultado: caso o resto seja igual a zero, classificar e exibir o número como Par; caso contrário, classificá-lo e exibi-lo como Ímpar no console de acesso.

### 🔹 Demanda 08: Conversão de Câmbio Monetário para Viagens Internacionais
* **Contexto da Demanda:** Uma plataforma ou aplicativo de planejamento de finanças pessoais necessita de uma funcionalidade ágil para simular a conversão de fundos para viagens internacionais. O utilizador informa um montante em moeda local (Reais - R$) e o sistema deve calcular o equivalente na moeda de destino (Dólares Americanos - US$) com base em uma taxa fixa de câmbio pré-estabelecida (R$ 5,25 por dólar).
* **Requisitos Técnicos:**
  * Utilizar variáveis do tipo de ponto flutuante de dupla precisão (`double`) para representar de forma fiel os valores monetários fracionados e as cotações de mercado.
  * Implementar a operação aritmética de divisão para calcular o montante convertido, dividindo o valor total em reais pela taxa de câmbio de referência.
  * Exibir o valor final resultante em dólares americanos diretamente no console de saída de forma legível.

### 🔹 Demanda 09: Correção de Escopo de Variáveis em Sistema de Controle de Acesso
* **Contexto da Demanda:** Um portal de entretenimento digital possui uma camada de segurança para restringir o acesso a determinados conteúdos com base na faixa etária do usuário. Durante a manutenção do sistema, foi identificado um bug de lógica e compilação decorrente do isolamento incorreto de variáveis dentro de blocos de chaves (`{ }`), fazendo com que o sistema apresentasse falhas estruturais ou tratasse usuários indevidamente como menores de idade por falta de visibilidade da variável.
* **Requisitos Técnicos:**
  * Analisar o ciclo de vida e a visibilidade das variáveis, corrigindo o erro de escopo ao declarar a variável de controle no nível correto do método (escopo local do método e não interno ao bloco condicional).
  * Garantir a integridade do fluxo de decisão utilizando estruturas condicionais (`if / else`) para validar se a idade é maior ou igual à maioridade legal (18 anos).
  * Assegurar que a mensagem final de liberação ou bloqueio de conteúdo seja exibida corretamente no console sem falhas de referência de memória.

### 🔹 Demanda 10: Planejamento Logístico e Cálculo de Autonomia de Combustível
* **Contexto da Demanda:** Um aplicativo de planejamento de viagens e telemetria veicular necessita de um algoritmo capaz de calcular estimativas de autonomia logística para trajetos rodoviários. O sistema recebe parâmetros de eficiência energética do automóvel e dados volumétricos do tanque para determinar se um percurso planejado pode ser concluído de forma segura sem paradas para reabastecimento.
* **Requisitos Técnicos:**
  * Manipular dados quantitativos complexos utilizando variáveis do tipo de ponto flutuante (`double`) para consumo médio, volumes de combustível e distâncias lineares.
  * Implementar as fórmulas matemáticas de cálculo de autonomia logística: Autonomia Máxima (`consumoMedio * capacidadeTanque`) e Autonomia Atual (`consumoMedio * combustivelAtual`).
  * Empregar operadores relacionais (`>=`) e estruturas de desvio condicional (`if / else`) para comparar a autonomia atual com a distância informada do trajeto, gerando uma resposta conclusiva sobre a viabilidade da viagem no console de saída.

---

## 🎓 Certificado de Conclusão

Estas anotações e resoluções práticas atestam a conclusão e domínio técnico das competências propostas no módulo de fundamentos de variáveis, tipos e estruturas de controle.

<p align="center">
  <img src="../../assets/Certificados/Certificado - Praticando Java.png" alt="Certificado Alura - Praticando Java: Variáveis e Tipos" width="90%"/>
</p>

---
<p align="center">Documentação mantida para fins de portfólio profissional e histórico acadêmico na Jornada Geração Caldeira 2026.</p>