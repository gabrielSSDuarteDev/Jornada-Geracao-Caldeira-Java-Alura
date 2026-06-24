# 📝 Anotações de Estudo — Praticando Java: Laços for e while

## 🎯 Visão Geral do Módulo
Estas anotações pertencem à **Semana 04 — Prática e Fluência em Java** da Jornada Geração Caldeira. O objetivo deste bloco prático de estudos foi dominar os mecanismos de controle de fluxo iterativo e estruturas de repetição em Java. Foram abordados conceitos de laços contados (`for`), laços condicionais/indeterminados (`while` e `do-while`), controle de saltos de execução (`break` e `continue`), gerenciamento de variáveis contadoras e acumuladoras, além do processamento dinâmico de coleções de dados, vetores e validação de dados de entrada com loops.

---

## 🏗️ Demandas de Negócio e Resoluções Práticas

### 🔹 Demanda 01: Algoritmo de Simulação de Progressão Sequencial e Contagem de Etapas
* **Contexto da Demanda:** No desenvolvimento de uma aplicação voltada para monitoramento de atividades físicas ou rastreamento de bem-estar, o sistema necessita de um módulo capaz de simular e exibir, de forma sequencial e incremental, o avanço gradual de um usuário durante uma subida de escadas. A rotina deve processar dinamicamente o limite máximo estipulado pelo usuário e emitir alertas de progresso a cada etapa concluída até reportar o atingimento do objetivo final.
* **Requisitos Técnicos:**
  * Capturar a quantidade total de degraus informada como alvo da iteração, alocando o valor em uma variável do tipo inteiro (`int`).
  * Implementar uma estrutura de repetição (`for` ou `while`) configurada com uma variável de controle inicializada em 1, garantindo o incremento unitário a cada ciclo de execução até que o teto definido seja alcançado.
  * Exibir no console de saída mensagens dinâmicas interpolando o contador atual com o status de avanço correspondente ("Subindo o degrau X").
  * Inserir uma instrução de encerramento imediatamente após a saída do laço de repetição para disparar e consolidar a mensagem de sucesso de chegada ao topo da estrutura.

### 🔹 Demanda 02: Algoritmo de Consolidação e Auditoria de Receitas Comerciais
* **Contexto da Demanda:** O módulo de gestão financeira e fluxo de caixa de um estabelecimento comercial (varejo de vestuário) necessita de uma rotina automatizada para consolidar o faturamento bruto acumulado. O sistema deve processar um conjunto de registros de entradas financeiras, realizar a agregação e o somatório dos valores de forma automática e emitir um balanço consolidado para apoiar a análise de desempenho financeiro semanal da diretoria.
* **Requisitos Técnicos:**
  * Armazenar a série histórica de receitas utilizando uma estrutura de dados indexada do tipo vetor unidimensional de inteiros (`int[]`).
  * Declarar e inicializar uma variável acumuladora do tipo inteiro (`int`) com valor zero, destinada a centralizar o somatório dos fluxos de entrada.
  * Implementar um laço de repetição (como o laço `for` tradicional ou a estrutura otimizada `for-each`) para iterar sequencialmente sobre todos os elementos contidos no vetor, aplicando o operador de atribuição aditiva (`+=`) para incrementar o acumulador a cada ciclo.
  * Exibir de forma clara e formatada no console de saída o montante total apurado da receita consolidada.

### 🔹 Demanda 03: Algoritmo de Agregação Analítica e Filtragem de Indicadores Pares
* **Contexto da Demanda:** No desenvolvimento de um módulo de inteligência de negócios (BI) ou processamento de relatórios estatísticos, o sistema frequentemente necessita varrer um intervalo linear de registros para extrair métricas consolidadas com base em propriedades específicas. A rotina deve iterar de forma automatizada sobre um escopo predefinido (de 1 a 100), identificar e isolar exclusivamente os indicadores de paridade (números pares) para computar o somatório acumulado, fornecendo um diagnóstico final do fluxo analítico processado.
* **Requisitos Técnicos:**
  * Declarar e inicializar uma variável acumuladora do tipo inteiro (`int`) com valor zero para centralizar o valor consolidado da soma.
  * Implementar uma estrutura de repetição (`for` ou `while`) configurada para percorrer de forma sequencial e incremental o intervalo fechado compreendido entre os limites 1 e 100.
  * Inserir uma estrutura de desvio condicional (`if`) interna ao laço de repetição para avaliar o valor de cada iteração através do operador de resto da divisão (`% 2 == 0`), assegurando que apenas registros divisíveis por 2 sejam elegíveis.
  * Aplicar o operador de atribuição aditiva (`+=`) para incrementar a variável acumuladora apenas com os valores que passarem com sucesso pelo critério de filtragem condicional.
  * Formatar e exibir no console a mensagem final contendo o resultado total da soma consolidada.

### 🔹 Demanda 04: Algoritmo de Processamento Combinatório e Análise Fatorial Numérica
* **Contexto da Demanda:** No desenvolvimento de motores matemáticos, módulos estatísticos, rotinas probabilísticas ou subcomponentes de análise combinatória, o cálculo fatorial é um requisito essencial para mapear arranjos e possibilidades de cenários de dados. O sistema necessita de uma rotina lógica que receba um número de entrada e realize o produtório de todos os seus números inteiros positivos antecedentes de forma automatizada, entregando a magnitude do valor final para apoiar operações analíticas e fluxos de cálculo de maior complexidade.
* **Requisitos Técnicos:**
  * Capturar o número base para a operação a partir da entrada do usuário, armazenando-o em uma variável apropriada do tipo inteiro (`int`).
  * Declarar e inicializar uma variável acumuladora para o produto com o valor inicial de 1, estabelecendo-o adequadamente como o elemento neutro da multiplicação.
  * Implementar uma estrutura de repetição (`for` ou `while`) configurada para iterar ao longo do intervalo numérico de forma incremental (de 1 até o número informado) ou decremental (do número informado decrescendo até 1).
  * Utilizar o operador de atribuição multiplicativa (`*=`) dentro do escopo do laço para multiplicar iterativamente o valor corrente do contador pelo total acumulado a cada ciclo.
  * Exibir de maneira estruturada no console de saída a resposta final, interpolando dinamicamente o número informado e o seu respectivo resultado fatorial calculado.

### 🔹 Demanda 05: Algoritmo de Varredura Linear e Identificação de Magnitude Máxima
* **Contexto da Demanda:** No desenvolvimento de módulos de análise de dados, dashboards de monitoramento de performance ou sistemas de controle de inventário, frequentemente é necessário avaliar um lote de entradas para isolar o maior indicador de desempenho ou valor de pico. O sistema necessita de uma rotina dinâmica que receba uma sequência variável de entradas numéricas fornecidas pelo operador, realize uma varredura linear sequencial e identifique o valor de maior magnitude absoluta para subsidiar relatórios analíticos.
* **Requisitos Técnicos:**
  * Capturar uma sequência de dados numéricos informados pelo usuário em formato de linha única (delimitada por espaços), aplicando métodos de divisão de texto (`.split()`) e conversão de tipo para estruturar um arranjo indexado de inteiros (`int[]`).
  * Declarar uma variável de controle para rastrear e armazenar o maior valor identificado até o momento, inicializando-a estrategicamente com o primeiro elemento da coleção ou com a constante de limite inferior absoluto (`Integer.MIN_VALUE`).
  * Implementar um laço de repetição (como a estrutura otimizada `for-each`) para percorrer sequencialmente todos os elementos contidos no vetor numérico.
  * Utilizar uma estrutura condicional (`if`) interna ao laço para comparar o valor da iteração corrente com a variável de controle; caso o número atual seja estritamente maior, o sistema deve atualizar o estado da variável de controle com o novo valor máximo encontrado.
  * Exibir de forma clara e formatada no console de saída o diagnóstico final contendo o maior número apurado na amostragem de dados.

### 🔹 Demanda 06: Algoritmo de Autenticação Segura com Controle de Tentativas e Bloqueio de Acesso
* **Contexto da Demanda:** No desenvolvimento de sistemas bancários, internet banking e plataformas que exigem alto nível de segurança cibernética, é crucial implementar mecanismos de defesa para mitigar ataques de força bruta e tentativas de acessos não autorizados. O sistema necessita de uma rotina de validação de credenciais que limite o número de tentativas consecutivas de entrada de senha a um teto máximo de 3 oportunidades. Caso o usuário exceda esse limite sem se autenticar com sucesso, o software deve bloquear temporariamente a conta para proteção dos dados; caso contrário, o acesso deve ser liberado imediatamente.
* **Requisitos Técnicos:**
  * Declarar variáveis apropriadas para armazenar a senha mestre de validação (utilizando a classe `String`) e um contador do tipo inteiro (`int`) inicializado para monitorar e limitar o número de tentativas do usuário.
  * Implementar uma estrutura de repetição condicional (`while` ou `do-while`) configurada para executar o fluxo de autenticação enquanto o número de tentativas permitidas não for esgotado e o acesso não tiver sido concedido.
  * Capturar dinamicamente a senha digitada pelo operador a cada iteração do laço através de métodos de leitura de dados (`Scanner`).
  * Empregar uma estrutura de desvio condicional (`if / else`) interna ao laço para verificar a igualdade estrutural do texto fornecido com a credencial padrão, utilizando obrigatoriamente o método `.equals()`.
  * Interromper imediatamente o fluxo de execução do laço de repetição (utilizando a instrução `break`) e exibir uma mensagem de sucesso no console ("Senha Correta! Acesso concedido!") caso a validação seja positiva.
  * Decrementar o contador de controle e exibir um alerta contendo o saldo de oportunidades restantes caso a senha informada seja incorreta.
  * Construir uma validação condicional de encerramento para identificar se o laço foi concluído por esgotamento de tentativas, disparando uma mensagem de contingência e restrição de segurança no console ("Conta bloqueada temporariamente.").

### 🔹 Demanda 07: Algoritmo de Validação Cadastral e Consistência de Dados Identificadores
* **Contexto da Demanda:** No desenvolvimento de módulos de *onboarding* de novos usuários, sistemas de CRM ou formulários de cadastro de clientes, é imperativo garantir a integridade, a qualidade e a padronização dos dados que dão entrada na aplicação, evitando o armazenamento de registros inconsistentes, nulos ou puramente fictícios. O sistema necessita de uma rotina de checagem preliminar para o campo de identificação (nome do usuário), que restrinja terminantemente entradas em branco, nulas ou com comprimento insuficiente (mínimo de 3 caracteres), mantendo o operador em um fluxo cíclico de reentrada até que um valor em total conformidade com as restrições de negócio seja fornecido.
* **Requisitos Técnicos:**
  * Manipular os dados textuais informados utilizando a classe `String` para garantir o correto tratamento de cadeias de caracteres.
  * Implementar uma estrutura de repetição condicional (`while` ou `do-while`) estruturada para forçar a execução contínua do fluxo de captura de dados enquanto o critério de validação do comprimento mínimo não for plenamente satisfeito.
  * Utilizar métodos nativos da classe `String` como o `.trim()` (para eliminar espaçamentos vazios residuais nas extremidades do texto) combinando-o ao método `.length()` para mensurar com exatidão a volumetria real de caracteres válidos inseridos.
  * Aplicar operadores relacionais de comparação (`< 3`) para validar a regra de restrição de tamanho, emitindo uma mensagem de alerta e inconsistência no console a cada falha de verificação.
  * Configurar uma instrução de saída final formatada e interpolada imediatamente após a quebra do laço de repetição para ratificar o sucesso da operação ("Nome 'X' cadastrado com sucesso!").

### 🔹 Demanda 08: Algoritmo de Triagem Quantitativa, Classificação de Sinais e Auditoria de Fluxos Numéricos
* **Contexto da Demanda:** No desenvolvimento de plataformas educacionais, módulos de auditoria analítica ou motores de processamento estatístico de dados, frequentemente faz-se necessária a criação de rotinas flexíveis para a recepção contínua de parâmetros numéricos sem um limite fixo de tamanho (comprimento indeterminado). O sistema necessita de uma rotina de validação capaz de capturar uma sequência dinâmica de entradas textuais fornecidas pelo operador, discriminar a polaridade matemática de cada registro (computando de forma isolada a volumetria de valores positivos e negativos) e manter o fluxo cíclico ativo até que um gatilho de interrupção textual padronizado ("fim") seja acionado, emitindo um balanço consolidado ao término da operação.
* **Requisitos Técnicos:**
  * Declarar e inicializar variáveis contadoras do tipo inteiro (`int`) com valor zero, destinadas a centralizar e mensurar individualmente o total de ocorrências de números positivos e de números negativos.
  * Implementar uma estrutura de repetição condicional de fluxo contínuo (como um laço indeterminado `while (true)`) para gerenciar a captura recurrent de dados via console utilizando a classe `Scanner`.
  * Armazenar temporariamente a entrada do usuário em uma variável da classe `String`, permitindo que o sistema suporte nativamente tanto a inserção de caracteres alfabéticos de controle quanto de registros numéricos.
  * Empregar uma estrutura condicional preliminar de interrupção interna ao laço utilizando o método `.equalsIgnoreCase()` para verificar se o comando de parada ("fim") foi digitado; caso positivo, o sistema deve acionar imediatamente a instrução `break` para encerrar o ciclo de iterações.
  * Implementar o método de conversão de tipo (`Integer.parseInt()`) para transformar a string de entrada em um tipo numérico inteiro (`int`) logo após garantir que a entrada não corresponde ao comando de encerramento.
  * Desenvolver um desvio condicional (`if / else if`) utilizando operadores relacionais de comparação de grandeza (`>` e `<`) para classificar o sinal do número inteiro obtido, incrementando o contador correspondente de forma unitária a cada correspondência.
  * Exibir de forma limpa e formatada no console de saída o diagnóstico quantitativo final contendo o total acumulado de números positivos e negativos processados pela aplicação.

### 🔹 Demanda 09: Algoritmo de Iteração Sequencial Dinâmica e Filtragem Seletiva de Sufixo Numérico
* **Contexto da Demanda:** No desenvolvimento de motores de jogos digitais pedagógicos e soluções voltadas à gamificação educacional, a introdução de quebras de linearidade e restrições lógicas é utilizada para incrementar o desafio cognitivo e a imprevisibilidade da experiência do usuário. O sistema necessita de uma rotina de contagem que percorra sequencialmente um intervalo linear a partir do valor unitário até um limite customizado pelo operador, aplicando uma regra de exclusão em tempo de execução para omitir qualquer registro que possua um sufixo numérico específico (terminados em 5), consolidando a progressão filtrada em uma saída horizontal formatada.
* **Requisitos Técnicos:**
  * Capturar o teto máximo da progressão informado pelo operador através do console, armazenando o dado em uma variável do tipo inteiro (`int`).
  * Implementar uma estrutura de repetição (`for` ou `while`) estruturada para iterar de forma incremental e sequencial a partir do valor inicial 1 até o limite definido.
  * Desenvolver uma estrutura condicional (`if`) interna ao laço para isolar e validar o último dígito do contador atual, utilizando estrategicamente o operador matemático de resto da divisão por dez (`% 10 == 5`).
  * Empregar a instrução de controle de desvio `continue` caso a condição de terminação seja verdadeira, abortando imediatamente o bloco de instruções do ciclo corrente e saltando para a próxima iteração do laço sem executar a impressão.
  * Formatar o console de saída utilizando métodos de impressão contínua (como `System.out.print()`) para exibir os números validados na filtragem em uma única linha horizontal, intercalados por espaçamentos estruturados.

### 🔹 Demanda 10: Algoritmo de Gestão de Eventos, Deduplicação Dinâmica e Controle de Fluxo de Dados Cadastrais
* **Contexto da Demanda:** No desenvolvimento de módulos de gerenciamento de eventos, platforms de RSVP ou sistemas de controle de acessos corporativos, é fundamental mitigar a redundância de dados para otimizar o planejamento de recursos e evitar desperdícios. O sistema necessita de uma rotina automatizada para o gerenciamento dinâmico de uma lista de participantes, capaz de registrar novas entradas de forma incremental, realizar a deduplicação de homônimos em tempo de execução (identificando registros duplicados de forma insensível a variações de letras maiúsculas e minúsculas), permitir a visualização instantânea da coleção sob demanda e interromper o fluxo operacional mediante um gatilho de saída específico.
* **Requisitos Técnicos:**
  * Utilizar uma estrutura de dados de dimensionamento dinâmico (como a classe `ArrayList<String>`) para centralizar e gerenciar o armazenamento escalável dos nomes dos convidados.
  * Implementar uma estrutura de repetição condicional indeterminada (como o laço contínuo `while (true)`) para sustentar a captura recorrente de dados e comandos via console através da classe `Scanner`.
  * Avaliar de forma patrimonial os comandos globais de controle utilizando métodos de comparação textual insensíveis a caixa (como `.equalsIgnoreCase()`) para identificar as instruções de encerramento ("sair") ou de exibição ("ver").
  * Interromper imediatamente o laço de execução (utilizando a instrução `break`) caso o comando de parada seja acionado, exibindo a respectiva mensagem de encerramento do programa.
  * Desenvolver uma rotina de varredura ou validação na coleção existente antes de efetuar qualquer inserção, utilizando loops ou métodos que avaliem a igualdade estrutural das strings desconsiderando a caixa (`.equalsIgnoreCase()`), com o intuito de isolar e bloquear tentativas de cadastros duplicados.
  * Emitir um alerta informativo no console caso a credencial já conste no banco de dados; caso o registro seja inédito, incluí-lo na estrutura dinâmica e emitir a mensagem de confirmação de sucesso.
  * Formatar e exibir no console o estado atualizado da lista com todos os elementos integrados à coleção sempre que o comando de visualização for invocado pelo operador.

---

## 🎓 Certificado de Conclusão

Estas anotações e resoluções práticas atestam a conclusão e domínio técnico das competências propostas no módulo de estruturas de repetição, loops e iterações em Java.

<p align="center">
  <img src="../../assets/Certificados/Certificado - Praticando Laços de Repetição.png" alt="Certificado Alura - Praticando Java: Laços for e while" width="90%"/>
</p>

---
<p align="center">Documentação mantida para fins de portfólio profissional e histórico acadêmico na Jornada Geração Caldeira 2026.</p>