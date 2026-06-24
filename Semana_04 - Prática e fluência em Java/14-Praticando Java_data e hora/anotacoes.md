# 📝 Anotações de Estudo — Praticando Java: Data e Hora

## 🎯 Visão Geral do Módulo
Estas anotações pertencem à **Semana 04 — Prática e Fluência em Java** da Jornada Geração Caldeira. O objetivo principal deste módulo prático foi dominar a moderna API de Datas e Horas do Java (`java.time`), introduzida a partir do Java 8. Foram abordados conceitos essenciais para manipulação temporal em sistemas corporativos, incluindo o gerenciamento de datas puras (`LocalDate`), horários isolados (`LocalTime`), cronometragem e cálculo de intervalos (`Duration`), formatação e análise sintática localizada (*parsing* com `DateTimeFormatter`), além da complexa manipulação de fusos horários globais (`ZonedDateTime` e `ZoneId`) e a integração com fluxos de entrada interativos (`Scanner`).

---

## 🏗️ Demandas de Negócio e Resoluções Práticas

### 🔹 Demanda 01: Algoritmo de Registro Temporal de Eventos e Auditoria de Ciclo de Vida de Tarefas
* **Contexto da Demanda:** No desenvolvimento de ecossistemas corporativos de gerenciamento de fluxos de trabalho (*Workflow Management Systems*) e gerenciadores de produtividade, a rastreabilidade temporal é um requisito crítico para fins de auditoria, segurança, cálculo de SLAs (*Service Level Agreements*) e conformidade regulatória. O sistema necessita de uma sub-rotina de *logging* automatizada que, no momento exato da instanciação ou criação de uma nova atividade pelo operador, capture de forma assíncrona ou síncrona os metadados cronológicos do servidor. A rotina deve isolar e registrar o carimbo de data/hora (*timestamp*) com alta precisão para assegurar a idoneidade do ciclo de vida do registro.
* **Requisitos Técnicos:**
  * Simular a representação textual do título ou descrição da atividade de negócio utilizando uma variável primitiva/objeto da classe `String`.
  * Empregar os componentes modernos da API de Tempo do Java (`java.time`), utilizando especificamente as classes `LocalDate` e `LocalTime` (ou opcionalmente `LocalDateTime`) para capturar o instante cronológico corrente por meio do método estático de fábrica `.now()`.
  * Preservar a alta precisão temporal nativa do sistema operacional (incluindo frações de segundos e nanossegundos) para mitigar colisões de registros em concorrências de alta volumetria.
  * Formatar a saída de dados para exibir de maneira legível e segmentada no console as strings representativas da data atual (no padrão internacional `AAAA-MM-DD`) e da hora atual com precisão milesimal/nanossegmentada.

### 🔹 Demanda 02: Algoritmo de Localização Temporal e Formatação de Relatórios Operacionais Diários
* **Contexto da Demanda:** Em ecossistemas corporativos que processam e centralizam volumes massivos de transações financeiras, atualizações logísticas de pedidos e históricos de atendimento ao cliente, a legibilidade dos *logs* de auditoria é indispensável para a eficiência operacional. A equipe de análise de negócios necessita que as marcas temporais geradas nativamente pelo servidor passem por um processo de localização e internacionalização. A rotina deve traduzir os dados cronológicos brutos para o padrão sociocultural e regulatório brasileiro, otimizando a interpretação visual e acelerando a tomada de decisões.
* **Requisitos Técnicos:**
  * Capturar o instante cronológico corrente do servidor utilizando a API moderna de datas do Java (`java.time`), instanciando de forma integrada os dados de calendário e relógio (como através da classe `LocalDateTime.now()`).
  * Empregar la classe `DateTimeFormatter` para construir as regras e máscaras de formatação personalizadas necessárias para a transformação dos dados.
  * Configurar estritamente o padrão isolado `dd-MM-yyyy` (dia, mês e ano com quatro dígitos, separados por hífen) para a representação de datas, e o padrão `HH:mm` (formato militar/24 horas para horas e minutos) para a escala horária.
  * Executar o método `.format()` nos objetos temporais para converter os tipos primitivos/complexos de tempo em strings formatadas legíveis.
  * Exibir no console de saída os resultados processados em linhas distintas de acordo com a formatação exigida pelo escopo de negócio ("Data formatada: X" e "Hora formatada: Y").

### 🔹 Demanda 03: Algoritmo de Mensuração Cronométrica e Cálculo de Impacto Temporal em Projetos
* **Contexto da Demanda:** No ecossistema de gestão de agências de desenvolvimento de software (*Software Houses*) e metodologias ágeis, o rastreamento preciso das horas faturáveis (*billable hours*) e a análise de produtividade são vitais para o controle de custos, rentabilidade e cumprimento de prazos contratuais. O sistema necessita de uma rotina de cálculo cronométrico capaz de receber os horários de início e término de uma atividade, processar matematicamente o intervalo temporal (delta) decorrido e extrair a volumetria exata de horas e minutos despendidos, fornecendo métricas precisas para os dashboards de gerência de projetos.
* **Requisitos Técnicos:**
  * Representar os horários de início e término das tarefas utilizando a classe `LocalTime` da API nativa `java.time`, ideal para instanciar referências horárias puras desassociadas de fusos horários ou calendários específicos.
  * Efetuar a análise sintática (*parsing*) das strings de entrada correspondentes aos horários de trabalho utilizando o método estático `LocalTime.parse()`.
  * Utilizar a classe `Duration` para computar de forma precisa o intervalo temporal existente entre os dois objetos `LocalTime` por meio do método estático `Duration.between()`.
  * Extrair o montante isolado de horas e o saldo residual de minutos a partir do objeto de duração gerado, empregando métodos modernos como `.toHours()` e `.toMinutesPart()` (disponível a partir do Java 9) ou calculando o resto da divisão do total de minutos por 60 (`.toMinutes() % 60`).
  * Formatar e exibir no console a mensagem final correspondente ao balanço de tempo, interpolando os valores de forma limpa e legível para o usuário ("Diferença de tempo: X horas e Y minutos").

### 🔹 Demanda 04: Algoritmo de Projeção Cronológica e Predição de Prazos de Entrega de Projetos
* **Contexto da Demanda:** No gerenciamento de projetos de desenvolvimento de software (*Project Management*) e engenharia de requisitos, o controle rigoroso de cronogramas e a predição acurada de marcos de entrega (*milestones*) são cruciais para mitigar riscos de atrasos contratuais e gerenciar as expectativas de clientes e *stakeholders*. O sistema necessita de uma rotina de cálculo cronológico que automatize a estimativa da data de conclusão de um projeto. A sub-rotina deve receber uma data de início arbitrária e um intervalo de dias corridos associados ao esforço de desenvolvimento, realizando a projeção matemática exata da data final de entrega.
* **Requisitos Técnicos:**
  * Representar a data de início do ciclo do projeto utilizando a classe `LocalDate` da API nativa `java.time`, ideal para manipulações puras de calendário que desconsideram componentes horários e fusos horários.
  * Capturar o prazo estimado de desenvolvimento através de uma variável de tipo numérico inteiro (`int` ou `long`), que representa a volumetria de dias úteis/corridos alocados para o projeto.
  * Efetuar a aritmética de datas de forma segura empregando o método nativo de incremento `.plusDays()`, garantindo que o motor do Java processe automaticamente viradas de meses, anos e a incidência de anos bissextos.
  * Instanciar um objeto da classe `DateTimeFormatter` configurado estritamente com a máscara padrão `dd-MM-yyyy` para realizar a conversão e formatação do resultado final segundo os padrões nacionais de leitura.
  * Exibir no console de saída a linha textual resultante interpolada de forma limpa e padronizada conforme as regras de negócio ("Data de entrega: X").

### 🔹 Demanda 05: Algoritmo de Prorrogação Cronológica, Gestão de Vencimentos e Ajuste de Títulos Financeiros
* **Contexto da Demanda:** No desenvolvimento de módulos financeiros, sistemas ERP ou plataformas de faturamento de serviços (*Billing Systems*), a gestão de recebíveis e o processamento de prorrogações de prazos de faturas são regras de negócio críticas para a manutenção do fluxo de caixa e o relacionamento com o cliente. O sistema necessita de uma rotina automatizada que seja capaz de recalcular a data de vencimento de um título com base no acréscimo de um intervalo variável de meses. Esse mecanismo mitiga erros manuais de contagem de calendário e assegura a integridade das datas para o envio de remessas e futuras rotinas de conciliação bancária.
* **Requisitos Técnicos:**
  * Representar a data de vencimento original utilizando a classe `LocalDate` da API nativa `java.time`, ideal para manipulações de calendário puras desassociadas de dados de relógio ou fusos horários.
  * Armazenar a quantidade de meses solicitada para o adiamento em uma variável de tipo numérico inteiro (`int` ou `long`).
  * Efetuar a aritmética cronológica utilizando o método nativo de incremento `.plusMonths()`, garantindo que o motor do Java processe de forma automatizada as variações na volumetria de dias de cada mês (ajustando de forma segura cenários complexos, como adicionar meses a datas de fim de mês ou viradas de ano).
  * Utilizar a classe `DateTimeFormatter` configurada estritamente com a máscara padrão `dd-MM-yyyy` para realizar a conversão e formatação da nova data segundo os padrões nacionais de leitura.
  * Exibir no console de saída a resposta final formatada e interpolada dinamicamente conforme a regra de negócio ("Nova data de vencimento: X").

### 🔹 Demanda 06: Algoritmo de Análise Cronológica Relativa e Validação de Status de Eventos
* **Contexto da Demanda:** No ecossistema de gestão de agências de turismo, operadoras de viagens e plataformas de agendamento de excursões, manter um controle automatizado sobre o ciclo de vida e a situação das programações é vital para mitigar falhas operacionais e otimizar a logística. O sistema necessita de uma rotina analítica que compare uma data de evento previamente cadastrada com o dia corrente do servidor. Essa rotina deve determinar em tempo real se a atividade já foi concluída ou se ainda está pendente de execução, subsidiando os módulos de controle de inventário, liberação de vagas e auditoria de reservas.
* **Requisitos Técnicos:**
  * Representar tanto a data do evento quanto a data corrente do sistema utilizando a classe `LocalDate` da API nativa `java.time`, ideal para manipulações puras de calendário desassociadas de dados horários.
  * Capturar o instante cronológico do dia atual do servidor chamando o método de fábrica estático `LocalDate.now()`.
  * Empregar os métodos lógicos relacionais nativos da classe `LocalDate`, especificamente o `.isBefore()` (para verificar se o evento é anterior à data atual) ou `.isAfter()` (para verificar se é posterior), garantindo uma comparação semântica precisa e segura.
  * Implementar uma estrutura de desvio condicional (`if / else`) baseada nos resultados dos métodos lógicos para classificar o estado do evento e definir a mensagem de saída correspondente.
  * Instanciar um objeto da classe `DateTimeFormatter` configurado estritamente com a máscara de formatação padrão `dd-MM-yyyy` para padronizar a exibição de ambas as datas segundo o formato de leitura nacional.
  * Exibir no console de saída, de forma estruturada e sequencial, as strings formatadas das datas seguidas pelo diagnóstico final do status do evento ("O evento já ocorreu." ou "O evento ainda está por vir.").

### 🔹 Demanda 07: Algoritmo de Antecipação Cronológica, Parametrização de Alertas Notificacionais e Gestão de Passivos
* **Contexto da Demanda:** No setor financeiro e de controladoria de grandes corporações, manter a pontualidade na liquidação de títulos e obrigações é imprescindível para mitigar custos com juros, multas de mora e perdas de crédito. Da mesma forma, em sistemas de cobrança ativa de clientes, mitigar a inadimplência exige réguas de comunicação proativas. O sistema necessita de uma rotina cronológica capaz de calcular de forma regressiva a data ideal para o disparo automático de notificações e lembretes preventivos, tomando como base a data-limite de vencimento do boleto/fatura e uma janela de antecedência customizada em dias corridos.
* **Requisitos Técnicos:**
  * Representar a data limite de vencimento da fatura através da classe `LocalDate` da API nativa `java.time`, assegurando a manipulação pura de dados de calendário desvinculados de componentes horários.
  * Armazenar o intervalo ou período de antecedência da notificação em uma variável de tipo numérico inteiro (`int` ou `long`), simbolizando o recuo estratégico de dias na linha do tempo.
  * Efetuar a aritmética cronológica reversa empregando o método nativo de decréscimo `.minusDays()`, delegando ao motor do Java o gerenciamento automatizado de retrocessos de calendário complexos, como viradas de meses ou incidência de anos bissextos.
  * Instanciar um objeto da classe `DateTimeFormatter` parametrizado estritamente com a máscara de formatação nacional `dd-MM-yyyy` para realizar a conversão do resultado temporal em uma string legível para o usuário final.
  * Emitir no console de saída a linha informativa resultante da operação interpolada de forma limpa e padronizada de acordo com as regras de negócio ("Data do lembrete: X").

### 🔹 Demanda 08: Algoritmo de Sincronização Transfronteiriça, Resolução de Fusos Horários Globais e Localização de Relógios
* **Contexto da Demanda:** No ecossistema de turismo internacional, plataformas de reservas de voos globais, centrais de atendimento multinacionais ou sistemas de comunicação transfronteiriços, o gerenciamento preciso de múltiplos fusos horários é um requisito arquitetural mandatório. Operar com base exclusiva no relógio local da máquina servidora ou do cliente pode acarretar sérias inconsistências operacionais e falhas de agendamento logístico. O sistema necessita de uma rotina de software capaz de capturar o instante cronológico exato daquela localidade de forma independente da infraestrutura onde o software está sendo executado, e convertendo esses dados brutos em uma saída estritamente horária de fácil leitura.
* **Requisitos Técnicos:**
  * Utilizar a classe `ZoneId` da API nativa `java.time` para identificar e instanciar o fuso horário geográfico alvo por meio do método estático de fábrica `ZoneId.of("Asia/Tokyo")`.
  * Empregar a classe `ZonedDateTime` para capturar o instante temporal completo (unindo a data, o horário e o fuso) correspondente à região parametrizada, acionando o método de fábrica `ZonedDateTime.now(zoneId)` para mitigar interferências do relógio local do sistema operacional host.
  * Instanciar um objeto da classe `DateTimeFormatter` configurado estritamente com a máscara de tempo `HH:mm:ss` (horas, minutos e segundos sob a notação de 24 horas) para omitir os componentes de calendário e frações de segundos na exibição final.
  * Invocar o método `.format()` no objeto de data/hora zoneado para converter os metadados temporais em uma string estritamente textual e padronizada.
  * Exibir no console de saída a linha informativa resultante da operação interpolada de forma limpa conforme o padrão esperado pelo negócio ("Horário atual em Tóquio: X").

### 🔹 Demanda 09: Algoritmo de Conversão de Fusos Horários, Intermediação Global de Instantes e Agendamento Distribuído
* **Contexto da Demanda:** No cenário de corporações globais, empresas multinacionais ou equipes que operam sob o modelo de trabalho distribuído (*remote-first*), a coordenação de agendas, reuniões síncronas e alinhamentos operacionais entre fusos horários geograficamente distantes (como Brasil e Austrália) é um desafio logístico crítico. Agendar conferências sem um mecanismo automatizado de conversão temporal pode gerar desencontros operacionais e prejuízos à produtividade. O sistema necessita de uma rotina de software capaz de capturar o instante exato do relógio no fuso horário local da máquina *host* e projetá-lo matematicamente para o fuso correspondente à cidade de Sydney, preservando o exato mesmo ponto absoluto na linha do tempo global e formatando o resultado de maneira enxuta.
* **Requisitos Técnicos:**
  * Utilizar a classe `ZonedDateTime` da API nativa `java.time` para capturar o carimbo de data, hora e fuso atual baseado nas configurações do sistema operacional local (`ZonedDateTime.now()`).
  * Instanciar o fuso horário geográfico de destino utilizando a classe `ZoneId` parametrizada estritamente com a string identificadora oficial `"Australia/Sydney"`.
  * Realizar a conversão de fuso horário preservando a equivalência absoluta do ponto temporal por meio do método nativo `.withZoneSameInstant()`, garantindo que apenas a perspectiva do relógio mude, mantendo o instante idêntico a nível global.
  * Configurar a classe `DateTimeFormatter` com a máscara de formatação `HH:mm` para isolar apenas as horas e os minutos sob a notação de 24 horas, omitindo os dados de calendário e segundos.
  * Exibir no console de saída, de forma sequencial, os resultados obtidos antes e depois da conversão ("Horário atual no sistema: X" e "Horário atual em Sydney: Y").

### 🔹 Demanda 10: Algoritmo de Gestão de Ponto Eletrônico, Cálculo de Jornada Laboral e Auditoria de Banco de Horas
* **Contexto da Demanda:** Em departamentos de Recursos Humanos, administração de pessoal e sistemas de controle de frequência (*Time Tracking Systems*), o gerenciamento preciso das jornadas de trabalho é fundamental para o cumprimento da legislação trabalhista, processamento de folha de pagamento e governança corporativa. O sistema necessita de uma rotina dinâmica que capture os horários de entrada e de saída real dos colaboradores via console, calcule o horário previsto para o término do expediente com base na carga contratual acordada e apure o saldo líquido do banco de horas (créditos de horas extras ou débitos de horas não trabalhadas), garantindo total transparência e integridade nos registros de assiduidade.
* **Requisitos Técnicos:**
  * Instanciar a classe `Scanner` para viabilizar a captura interativa e dinâmica de dados textuais fornecidos pelo operador diretamente através do console de entrada.
  * Declarar um objeto da classe `DateTimeFormatter` parametrizado com a máscara estrita `"HH:mm"` para validar a entrada de dados horários e mitigar exceções de análise sintática (*parsing*).
  * Efetuar a análise textual das strings informadas para o horário de entrada e para o horário real de saída utilizando o método estático `LocalTime.parse()`, alocando os resultados em objetos baseados na classe `LocalTime`.
  * Capturar a carga horária diária regulamentar como um tipo numérico inteiro (`int` ou `long`), representando a volumetria de horas cheias contratadas para a jornada do colaborador.
  * Computar o horário de saída previsto adicionando de forma aritmética a carga horária informada à marca temporal de entrada, empregando o método nativo `.plusHours()`.
  * Calcular a duração real trabalhada e a diferença líquida (delta) frente à jornada prevista, utilizando a classe `Duration` (por meio do método `Duration.between()`) para centralizar a precisão matemática da operação.
  * Desenvolver uma lógica estruturada de desvio condicional (`if / else if / else`) para identificar se o saldo de horas apurado é positivo (horas extras), negativo (atrasos ou saídas antecipadas) ou estritamente zerado (cumprimento exato da meta diária).
  * Formatar e exibir no console de saída o diagnóstico analítico final, isolando os componentes de horas e minutos residuais obtidos no cálculo, garantindo a aplicação correta dos sinais indicativos (`+`, `-` ou valor neutro) conforme os requisitos de negócio.

---

## 🎓 Certificado de Conclusão

Estas anotações e resoluções práticas atestam a conclusão e domínio técnico das competências propostas no módulo de tratamento, aritmética e manipulação de objetos de data e hora em Java.

<p align="center">
  <img src="../../assets/Certificados/Certificado - Praticando Data e Hora.png" alt="Certificado Alura - Praticando Java: Data e Hora" width="90%"/>
</p>

---
<p align="center">Documentação mantida para fins de portfólio profissional e histórico acadêmico na Jornada Geração Caldeira 2026.</p>