# 📝 Anotações de Estudo — Praticando Java: Condicionais If Else

## 🎯 Visão Geral do Módulo
Estas anotações pertencem à **Semana 04 — Prática e Fluência em Java** da Jornada Geração Caldeira. O objetivo deste bloco de estudo foi dominar os mecanismos de controle de fluxo e tomada de decisão em Java. Foram abordados conceitos de lógica booleana, operadores relacionais (`==`, `!=`, `>`, `<`, `>=`, `<=`) e operadores lógicos (`&&`, `||`, `!`), aplicados na construção de estruturas condicionais (`if`, `else if`, `else`) robustas para guiar o comportamento do software com base em regras de negócio dinâmicas e restrições complexas.

---

## 🏗️ Demandas de Negócio e Resoluções Práticas

### 🔹 Demanda 01: Controle de Fluxo para Mecânica de Paridade em Jogos
* **Contexto da Demanda:** No desenvolvimento de uma solução de entretenimento digital, a lógica do motor de jogo precisa classificar números previamente definidos para disparar eventos específicos ou determinar turnos com base em paridade (se o número é par ou ímpar). 
* **Requisitos Técnicos:**
  * Alocar o valor numérico de teste em uma variável do tipo inteiro (`int`).
  * Aplicar a validação lógica através do operador de resto da divisão (`% 2 == 0`).
  * Implementar a estrutura condicional `if / else` para desviar o fluxo de execução e exibir a mensagem de saída formatada indicando explicitamente se o número em questão é par ou ímpar.

### 🔹 Demanda 02: Avaliação Automática e Segmentação de Desempenho Escolar
* **Contexto da Demanda:** Uma plataforma de gestão pedagógica e diário de classe eletrônico necessita de um componente automatizado para avaliar a média final dos estudantes. O sistema deve analisar o indicador de desempenho e determinar de forma instantânea a situação acadêmica atual (Aprovação, Recuperação ou Reprovação) com base nas diretrizes e regras de negócio da instituição de ensino.
* **Requisitos Técnicos:**
  * Armazenar a nota final avaliada utilizando o tipo de dado de ponto flutuante (`double`) para suportar perfeitamente os valores fracionados do boletim.
  * Implementar uma estrutura condicional encadeada (`if / else if / else`) combinada com operadores relacionais (`>=`, `<`, `&&`) para isolar com precisão as três faixas de notas estipuladas pelo regulamento escolar.
  * Formatar e exibir uma saída dinâmica via console, interpolando o valor da média com o diagnóstico textual correspondente.

### 🔹 Demanda 03: Mecanismo de Autenticação e Controle de Acesso Corporativo
* **Contexto da Demanda:** O setor de segurança da informação de uma empresa necessita de uma rotina de validação para proteger o acesso de colaboradores ao sistema interno. O programa deve comparar uma tentativa de entrada de credencial fornecida pelo usuário com uma chave/senha padrão pré-estabelecida na aplicação, agindo como uma camada inicial de controle de segurança.
* **Requisitos Técnicos:**
  * Utilizar variáveis apropriadas para armazenar a credencial mestre e a tentativa de entrada fornecida no fluxo de execução.
  * Implementar uma estrutura de controle condicional binária (`if / else`) para avaliar a correspondência exata entre os valores.
  * Retornar e exibir de forma clara o status da validação no console, desviando o fluxo para liberação ("Acesso permitido!") ou bloqueio imediato ("Acesso negado!") conforme o resultado da verificação.

### 🔹 Demanda 04: Algoritmo de Análise Comparativa de Grandezas Numéricas
* **Contexto da Demanda:** Um módulo de inteligência de dados ou calculadora utilitária necessita de uma rotina capaz de receber dois valores numéricos de entrada para processar uma análise comparativa de valores. O sistema deve discernir de forma exata qual dos dois parâmetros possui maior magnitude ou reportar de forma clara caso ambos os registros fornecidos sejam idênticos.
* **Requisitos Técnicos:**
  * Alocar os dados comparativos em variáveis do tipo numérico inteiro (`int`).
  * Desenvolver uma estrutura condicional de múltipla escolha (`if / else if / else`) utilizando operadores relacionais de comparação (`>`, `==`) para cobrir todas as três possibilidades matemáticas estruturadas na regra de negócio.
  * Exibir dinamicamente no console a informação exata sobre qual o maior número avaliado ou a confirmação de que os valores são iguais.

### 🔹 Demanda 05: Cálculo de Desconto Automatizado e Regra de Varejo
* **Contexto da Demanda:** O módulo de PDV (Ponto de Venda) de um estabelecimento comercial necessita de uma rotina automatizada para aplicar diretrizes promocionais de precificação com base no valor final do carrinho de compras. O sistema deve avaliar se o total bruto do pedido atinge ou ultrapassa o gatilho estipulado (R$ 100,00) para conceder uma bonificação de 10% de desconto e atualizar o saldo devedor do cliente.
* **Requisitos Técnicos:**
  * Manipular valores monetários utilizando o tipo numérico de ponto flutuante (`double`), assegurando a fidelidade dos centavos na entrada e saída dos dados.
  * Implementar uma estrutura de controle condicional (`if / else`) utilizando o operador relacional maior ou igual (`>=`) para determinar a elegibilidade do desconto.
  * Aplicar operadores aritméticos para calcular a redução percentual de 10% sobre o valor original caso a condição seja atendida (`valorCompra * 0.9`).
  * Exibir no console uma saída informativa e customizada, exibindo se o desconto foi aplicado e o valor final recalculado.

### 🔹 Demanda 06: Validação de Calendário Operacional e Fluxo de Escopo Logístico
* **Contexto da Demanda:** O sistema de roteirização, despacho e distribuição de uma empresa de logística opera exclusivamente durante a semana unconventional. Para evitar o agendamento indevido de coletas ou falhas no fluxo de suprimentos, o software necessita de uma rotina de validação que analise o dia da semana informado pelo operador (em formato de texto padronizado em letras minúsculas) e determine se o período corresponde a um dia útil de atividade ou a um intervalo não operacional de fim de semana.
* **Requisitos Técnicos:**
  * Manipular dados textuais utilizando a classe `String` e aplicar métodos de comparação de igualdade estrutural de texto (como `.equals()`).
  * Implementar uma estrutura de desvio condicional (`if / else`) otimizada por operadores lógicos booleanos de disjunção (`||`) para agrupar múltiplos critérios de validação e isolar os dias não úteis dos dias comerciais de funcionamento.
  * Exibir uma mensagem final via console confirmando o status operacional do dia fornecido, aplicando a devida formatação para a experiência do usuário.

### 🔹 Demanda 07: Validação de Limites Operacionais para Concessão de Crédito Bancário
* **Contexto da Demanda:** O sistema de autoatendimento ou internet banking de uma instituição financeira necessita de uma camada de validação preliminar para solicitações de crédito. O algoritmo deve analisar o montante de empréstimo requisitado pelo cliente e certificar se o valor está em conformidade com as faixas de limite estipuladas pelas regras de negócio e políticas de risco do banco (permitindo exclusivamente valores entre R$ 1.000,00 e R$ 5.000,00).
* **Requisitos Técnicos:**
  * Representar a quantia financeira utilizando variáveis de ponto flutuante (`double`) para garantir a consistência de valores monetários.
  * Implementar operadores relacionais de fronteira (`>=` e `<=`) associados ao operador lógico de conjunção (`&&`) para testar se o valor atende simultaneamente aos limites mínimo e máximo do intervalo fechado.
  * Empregar uma estrutura condicional simples (`if / else`) para desviar o fluxo do programa, exibindo uma mensagem informativa clara caso o valor digitado viole ou atenda às restrições do banco.

### 🔹 Demanda 08: Validação Geométrica e Teorema da Desigualdade Triangular
* **Contexto da Demanda:** Um aplicativo de apoio educacional ou módulo de renderização gráfica necessita de uma rotina lógica para validar a consistência de formas espaciais. O programa deve receber três medidas de comprimentos lineares e avaliar se eles atendem aos critérios do Teorema da Desigualdade Triangular, garantindo que a soma de dois lados quaisquer seja sempre estritamente maior do que o terceiro lado antes de autorizar a criação da figura.
* **Requisitos Técnicos:**
  * Armazenar os comprimentos dos três lados em variáveis do tipo numérico (como `int` ou `double`).
  * Construir uma expressão booleana composta utilizando operadores relacionais (`>`) articulados de forma simultânea por operadores lógicos de conjunção (`&&`), garantindo o teste de todas as três combinações obrigatórias (`a + b > c`, `a + c > b` e `b + c > a`).
  * Empregar uma estrutura de controle condicional (`if / else`) para direcionar o fluxo de saída do console, exibindo de forma assertiva se os lados fornecidos são capazes ou não de projetar um triângulo válido.

### 🔹 Demanda 09: Sistema de Triagem de Doadores e Validação Multicritério
* **Contexto da Demanda:** O módulo de recepção e triagem clínica de um hemocentro ou banco de sangue necessita automatizar a checagem inicial de elegibilidade para potenciais doadores de sangue. O sistema deve avaliar múltiplos parâmetros biológicos (idade entre 18 e 65 anos e peso superior a 50 kg) e, caso o indivíduo não esteja apto, o algoritmo deve rastrear e apontar exatamente qual diretriz de saúde foi violada para fins de feedback clínico.
* **Requisitos Técnicos:**
  * Alocar a idade utilizando o tipo inteiro (`int`) e o peso por meio de uma variável de ponto flutuante de dupla precisão (`double`).
  * Implementar uma estrutura de desvio condicional complexa (usando `if / else` com verificações isoladas ou encadeadas) para testar os limites numéricos e as faixas de corte de cada requisito de forma independente.
  * Capturar o cenário de falha específico e exibir uma mensagem customizada via console, detalhando a inaptidão acompanhada do motivo exato da recusa ("Motivo: Deve ter entre 18 e 65 anos" ou "Motivo: Peso insuficiente").

### 🔹 Demanda 10: Controle de Acesso Multifator e Diagnóstico de Segurança
* **Contexto da Demanda:** Um sistema corporativo de segurança da informação necessita de uma rotina rigorosa de autenticação e autorização em duas etapas. O software deve validar simultaneamente um código numérico de acesso fixo (2023) e um nível hierárquico de privilégios (1, 2 ou 3). Se qualquer um dos fatores falhar, o sistema deve bloquear o acesso e identificar precisamente o vetor de falha (código incorreto, permissão inválida ou ambos) para fins de auditoria.
* **Requisitos Técnicos:**
  * Alocar o código de acesso e o nível de permissão utilizando variáveis do tipo inteiro (`int`).
  * Implementar estruturas condicionais encadeadas (`if / else if / else`) combinadas com operadores relacionais (`==`) e operadores lógicos (`&&`, `||`) para mapear com precisão os quatro cenários possíveis (sucesso total, falha no código, falha no nível ou falha em ambos).
  * Exibir no console de saída o status da autenticação ("Acesso permitido") ou a justificativa detalhada do bloqueio.

---

## 🎓 Certificado de Conclusão

Estas anotações e resoluções práticas atestam a conclusão e domínio técnico das competências propostas no módulo de tomada de decisões e estruturas condicionais em Java.

<p align="center">
  <img src="../../assets/Certificados/Certificado Praticando Condicionais.png" alt="Certificado Alura - Praticando Java: Condicionais If Else" width="90%"/>
</p>

---
<p align="center">Documentação mantida para fins de portfólio profissional e histórico acadêmico na Jornada Geração Caldeira 2026.</p>