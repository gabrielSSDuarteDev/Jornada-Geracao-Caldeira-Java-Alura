# 📝 Anotações de Estudo — Praticando Java: Orientação a Objetos

## 🎯 Visão Geral do Módulo
Estas anotações pertencem à **Semana 04 — Prática e Fluência em Java** da Jornada Geração Caldeira. O objetivo principal deste módulo prático foi dominar os pilares fundamentais da Programação Orientada a Objetos (POO) aplicados ao desenvolvimento de sistemas corporativos. Foram consolidados conceitos essenciais como Abstração (modelagem de entidades do mundo real), Encapsulamento (proteção do estado interno dos objetos e exposição segura através de métodos), Mutabilidade de Estado, e a manipulação de coleções dinâmicas de objetos através da classe `ArrayList` do ecossistema `java.util`. Tudo isso associado a regras de negócio e formatações de dados precisas e regionalizadas.

---

## 🏗️ Demandas de Negócio e Resoluções Práticas

### 🔹 Demanda 01: Modelagem de Domínio, Encapsulamento de Atributos e Gerenciamento de Inventário Corporativo
* **Contexto da Demanda:** Em cenários de expansão de operações varejistas, automação comercial e plataformas de e-commerce de tecnologia, a governança de dados sobre o estoque ativo é crucial para mitigar rupturas de suprimentos, otimizar o capital de giro e assegurar a acurácia dos balancetes patrimoniais. O sistema necessita de um componente estrutural de software baseado no paradigma orientado a objetos (POO) para abstrair, isolar e centralizar a representação das entidades de produtos. Essa modelagem visa padronizar o armazenamento de metadados operacionais essenciais e fornecer relatórios de auditoria interna limpos, legíveis e em conformidade com as regras fiscais locais de exibição monetária.
* **Requisitos Técnicos:**
  * Projetar uma classe de domínio específica (como `Produto`) empregando os conceitos fundamentais da Orientação a Objetos para representar fielmente a entidade de negócio e suas características.
  * Declarar e tipar de forma estrita as propriedades da classe para armazenar o identificador nominal (`String nome`), o valor de mercado (`double preco`) e a volumetria física de unidades (`int quantidade`).
  * Assegurar as boas práticas de encapsulamento, garantindo que o estado interno do objeto seja protegido contra acessos e modificações indevidas a partir de escopos externos.
  * Construir um método de comportamento focado na exportação visual de dados (como `exibirRelatorio()`) encarregado de extrair os metadados da instância e realizar o *output* formatado no console.
  * Empregar os recursos de localização e formatação de texto do Java (como `System.out.printf()` ou a classe `String.format()`) para renderizar a propriedade de preço sob a máscara monetária padrão do real brasileiro (`R$`), delimitando estritamente duas casas decimais e utilizando a vírgula como separador decimal.

### 🔹 Demanda 02: Algoritmo de Catalogação Bibliográfica, Abstração de Entidades Literárias e Padronização de Metadados
* **Contexto da Demanda:** Em sistemas de gestão de acervos bibliográficos, plataformas de gerenciamento de conhecimento (*Content Management Systems - CMS*) e ecossistemas de bibliotecas digitais, a padronização e a consistência na representação de ativos informacionais são imperativas para garantir a eficácia dos mecanismos de busca e recuperação de dados. O sistema necessita de uma estrutura baseada no paradigma de orientação a objetos para abstrair e encapsular as propriedades fundamentais de obras literárias. Essa modelagem visa eliminar a dispersão de dados, impor integridade aos registros e unificar a exibição das informações textuais para os usuários finais, otimizando a experiência de consulta ao catálogo.
* **Requisitos Técnicos:**
  * Projetar uma classe estrutural de domínio (como `Livro`) fundamentada no princípio de abstração da POO para centralizar os metadados da entidade literária.
  * Declarar e tipar estritamente os atributos da classe, utilizando `String titulo` para a denominação da obra, `String autor` para a atribuição de responsabilidade intelectual e `int paginas` para mensurar a volumetria física/extensão do texto.
  * Implementar um método comportamental de exibição focado (como `exibirCatalogo()`) para manter a coesão da classe, delegando a ela a responsabilidade exclusiva de saber como representar a si mesma textualmente.
  * Utilizar o método de saída formatada de fluxos `System.out.printf()` para estruturar dinamicamente a mensagem final através de especificadores de formato (como `%s` para strings e `%d` para valores numéricos inteiros).
  * Garantir a inclusão explícita de caracteres de aspas duplas devidamente escapados (`\"`) envolvendo a propriedade do título para satisfazer o padrão sintático estrito exigido pelo escopo do negócio (`"Título" de Autor com X páginas`).

### 🔹 Demanda 03: Algoritmo de Mutabilidade de Estado, Governança de Saldos e Ciclo de Vida de Contas Digitais
* **Contexto da Demanda:** Em ecossistemas de *fintechs*, plataformas de *internet banking* e carteiras digitais, o controle estrito sobre o estado financeiro de contas correntes é vital para a prevenção de fraudes, mitigação de riscos operacionais e conformidade com marcos regulatórios bancários. Durante fluxos operacionais críticos, como o encerramento definitivo de uma conta ou a liquidação de passivos, o sistema exige uma rotina segura para alterar o estado interno da entidade, zerando seus ativos disponíveis. Padronizar essa mutação por meio de métodos comportamentais específicos garante a rastreabilidade da operação e evita a persistência de saldos residuais inconsistentes antes do arquivamento do registro.
* **Requisitos Técnicos:**
  * Modelar uma classe de domínio (como `ContaDigital`) utilizando os pilares da POO para encapsular os dados e comportamentos financeiros de um usuário.
  * Declarar e gerenciar a propriedade de precisão numérica correspondente à liquidez da entidade (`double saldo`), representando o montante financeiro disponível para transações.
  * Implementar um método comportamental mutador focado (como `zerarSaldo()`) encarregado de redefinir o estado interno do atributo de valor estritamente para `0.0`, simulando com segurança o fluxo de desativação ou encerramento da conta.
  * Construir um método de leitura e exibição (como `exibirSaldo()`) para externar o estado corrente da propriedade, centralizando a responsabilidade de apresentação visual na própria classe.
  * Empregar recursos de formato de strings do Java (`System.out.printf`) para garantir que o saldo seja exibido no console sob o prefixo monetário nacional (`R$`), delimitado obrigatoriamente com duas casas decimais, mantendo o alinhamento visual com relatórios financeiros profissionais.

### 🔹 Demanda 04: Algoritmo de Telemetria Ambiental, Monitoramento Concorrente e Atuação Preditiva em AgTech
* **Contexto da Demanda:** Em ecossistemas de agricultura de precisão (*AgTech*) e estufas automatizadas baseadas em arquiteturas IoT (*Internet of Things*), a estabilidade das variáveis microclimáticas é um fator de sucesso crítico para a maximização do rendimento de culturas de alto valor e prevenção de fitopatologias. O sistema necessita de uma estrutura de software capaz de processar os dados brutos de telemetria enviados pelos sensores de campo, associando cada leitura ao seu respectivo setor geográfico. Essa sub-rotina deve padronizar a exibição das métricas ambientais e atuar como um motor de regras básico, disparando gatilhos de alerta em tempo real sempre que os limiares biológicos de tolerância térmica forem violados, permitindo ações imediatas de mitigação pela equipe operacional.
* **Requisitos Técnicos:**
  * Projetar uma classe de domínio específica (como `SensorAmbiente`) utilizando os pilares de abstração e encapsulamento da POO para representar os dispositivos de monitoramento de campo.
  * Declarar e tipar estritamente as propriedades da classe para armazenar a identificação espacial do dispositivo (`String local`) e o valor da última medição física realizada (`double temperaturaAtual`).
  * Construir um método comportamental coeso (como `analisarLeitura()`) encarregado de processar a saída de dados e centralizar a lógica de verificação de regras de negócio.
  * Implementar uma estrutura de desvio condicional (`if`) para avaliar se o estado da propriedade `temperaturaAtual` ultrapassa o limite crítico de segurança de **37.5°C**. Caso o gatilho seja acionado, o sistema deve exibir de forma integrada a string de contingência correspondente ("Alerta: Temperatura acima do limite!").
  * Empregar recursos de saída de fluxo formatada (como `System.out.printf()`) para renderizar o valor térmico limitando a exibição a apenas uma casa decimal, garantindo o uso da vírgula como separador regionalizado e a concatenação correta da unidade de medida (**°C**).

### 🔹 Demanda 05: Algoritmo de Gestão Acadêmica, Automação de Médias e Avaliação de Rendimento Escolar
* **Contexto da Demanda:** No ecossistema de plataformas de tecnologia educacional (*EdTechs*) e sistemas de gestão de aprendizagem (*LMS*), a automação de rotinas administrativas e o monitoramento do desempenho estudantil são cruciais para reduzir a carga de trabalho do corpo docente e mitigar falhas em cálculos manuais. O sistema necessita de um componente baseado no paradigma orientado a objetos para modelar o perfil acadêmico dos discentes. Essa estrutura deve centralizar o histórico de avaliações, computar a média aritmética das notas de forma nativa e classificar automaticamente o status de aprovação do estudante com base nos critérios regimentais da instituição.
* **Requisitos Técnicos:**
  * Projetar uma classe de domínio específica (como `Aluno`) fundamentada nos pilares de abstração e encapsulamento da POO para gerenciar os dados individuais de desempenho.
  * Declarar e tipar estritamente os atributos essenciais para a avaliação, utilizando `String nome` para a identificação do estudante e variáveis flutuantes (`double` ou `float`) para armazenar os ciclos avaliativos (`nota1` e `nota2`).
  * Implementar um método comportamental coeso (como `exibirBoletim()`) encarregado de efetuar o cálculo matemático da média aritmética simples e determinar a situação final do aluno.
  * Utilizar uma estrutura de desvio condicional (`if / else`) para avaliar se a média obtida atende ao critério de corte mínimo (média igual ou maior que **7.0**) para definir o status de rendimento entre "Aprovado" ou "Reprovado".
  * Empregar recursos de saída formatada (como `System.out.printf()`) para exibir os dados textuais, as notas originais e a média consolidada limitando a renderização a apenas uma casa decimal,aximizando a padronização visual das informações no console.

### 🔹 Demanda 06: Algoritmo de Mutação de Estado, Gestão de Progressão de Carreira e Governança de Acessos
* **Contexto da Demanda:** No ecossistema de sistemas de Recursos Humanos (*HR Techs*) e plataformas de Gestão de Identidade e Acesso (*IAM*), a governança sobre a movimentação de pessoal, promoções corporativas e reestruturações departamentais é crítica para manter a conformidade regulatória e a segurança operacional (princípio do menor privilégio). O sistema necessita de uma estrutura baseada no paradigma orientado a objetos capaz de gerenciar o ciclo de vida do colaborador, permitindo a mutação segura de seu estado interno (cargo e nível de autorização) e fornecendo rastreabilidade por meio da exibição clara do delta de transição (estado imediatamente anterior versus o estado atualizado).
* **Requisitos Técnicos:**
  * Modelar uma classe de domínio específica (como `Colaborador`) empregando os pilares de abstração e encapsulamento da POO para centralizar os metadados de identificação e privilégios do funcionário.
  * Declarar e tipar estritamente os atributos da classe, utilizando `String nome` para o identificador pessoal, `String cargo` para a atribuição da função funcional e `int nivelAcesso` para a escala numérica de privilégios nos sistemas da empresa.
  * Implementar um método comportamental mutador coeso (como `alterarCargoENivel()`) que receba os novos parâmetros de atuação e atualize de forma segura o estado dos atributos internos protegidos.
  * Desenvolver uma rotina de exibição para realizar o *output* estruturado no console, injetando as divisórias textuais estritas exigidas pela regra de negócio (`--- Antes da atualização ---` e `--- Após atualização ---`).
  * Executar o fluxo sequencial no método principal: instanciar o objeto com os dados iniciais, invocar a rotina de impressão, executar o método de alteração cadastral com os novos insumos e, por fim, acionar novamente a rotina de impressão para validar graficamente a persistência da atualização em memória.

### 🔹 Demanda 07: Algoritmo de Gerenciamento de Tarefas, Mapeamento de Estados e Iteração de Coleções Dinâmicas
* **Contexto da Demanda:** No ecossistema de aplicativos de produtividade pessoal, gerenciadores de projetos (*To-Do Apps*) e sistemas de rastreamento de fluxos de trabalho (*Task Tracking Systems*), a capacidade de agrupar entidades correlatas e gerenciar seus estados de ciclo de vida de forma dinâmica é uma necessidade fundamental. O sistema necessita de uma estrutura baseada na Programação Orientada a Objetos para modelar atividades diárias, mapeando flags booleanas primitivas em saídas semânticas amigáveis para o usuário ("Pendente" ou "Concluída"). Além disso, para lidar com a volumetria variável de registros, o sistema deve integrar estruturas de coleções indexadas para indexar, armazenar e iterar sobre o lote de tarefas cadastradas.
* **Requisitos Técnicos:**
  * Projetar uma classe estrutural de domínio (como `Tarefa`) utilizando os pilares da POO para encapsular o escopo e o estado de execução de uma atividade.
  * Declarar e tipar estritamente as propriedades da classe, empregando `String descricao` para detalhar o escopo da ação e `boolean concluida` como indicador lógico do estado de cumprimento da tarefa.
  * Construir um método comportamental coeso de exibição (como `exibirTarefa()`) encarregado de avaliar o estado atual do atributo lógico e traduzir o valor booleano puro para as strings de negócio correspondentes (`Pendente` para `false` e `Concluída` para `true`).
  * Utilizar a classe genérica `ArrayList` do ecossistema de coleções do Java (`java.util.ArrayList`) para instanciar uma lista dinâmica capaz de agrupar múltiplos objetos do tipo `Tarefa` em memória.
  * Implementar uma estrutura de repetição limpa e otimizada (como o loop *for-each*) para percorrer sequencialmente a coleção de dados e invocar o método de exibição de cada instância cadastrada, assegurando a saída perfeitamente alinhada ao padrão estrito exigido.

### 🔹 Demanda 08: Algoritmo de Baixa Automatizada, Validação de Consistência de Inventário e Regras de Restrição de Escassez
* **Contexto da Demanda:** Em sistemas de gestão de varejo (ERP) e controle de inventário para o comércio de vestuário, garantir a sincronização em tempo real entre as transações de PDV (Ponto de Venda) e a disponibilidade física dos produtos é vital para evitar o faturamento de itens indisponíveis (ruptura de estoque) e prejuízos logísticos. O sistema necessita de uma rotina transacional robusta baseada no paradigma orientado a objetos que valide a suficiência de saldo antes de consolidar qualquer baixa de estoque. Essa regra de negócio atua como uma trava de segurança, aplicando uma política de controle interno e emitindo alertas imediatos de insuficiência de insumos.
* **Requisitos Técnicos:**
  * Modelar uma classe de domínio específica (como `ItemEstoque`) empregando os pilares de abstração e encapsulamento da POO para assegurar que as mutações no saldo físico ocorram apenas através de métodos seguros e validados.
  * Declarar e tipar de forma estrita as propriedades essenciais da entidade, utilizando `String nome` para a identificação da peça de vestuário e `int quantidade` para registrar o volume físico remanescente em depósito.
  * Implementar um método comportamental com lógica de validação transacional (como `vender()`) que receba o volume de itens demandados para a transação comercial através de um parâmetro numérico inteiro.
  * Desenvolver uma estrutura de desvio condicional (`if / else`) para avaliar a viabilidade da operação: caso haja saldo suficiente em estoque, efetuar a dedução aritmética e processar a atualização do estado do objeto; caso contrário, abortar o fluxo de baixa e emitir o alerta padrão exigido pelo negócio.
  * Empregar o método de saída de fluxo formatado `System.out.printf()` para injetar dinamicamente as propriedades do objeto na string de confirmação de sucesso, garantindo a exibição limpa e estruturada do saldo restante (`Venda realizada. Estoque restante de %s: %d\n`).

### 🔹 Demanda 09: Algoritmo de Tarifação Recorrente, Cálculo de Penalidades Cronológicas e Gestão de Devoluções de Ativos
* **Contexto da Demanda:** Em operações de varejo literário, bibliotecas ou plataformas de locação de bens de consumo, a pontualidade na logística de devolução é um fator crítico para garantir a rotatividade do inventário, otimizar a disponibilidade de títulos e assegurar a sustentabilidade do modelo de negócios. O sistema necessita de uma rotina automatizada baseada no paradigma orientado a objetos para gerenciar o fluxo de pós-venda e controle de devoluções. Essa estrutura deve calcular matematicamente as penalidades financeiras (multas por mora) associadas ao atraso cronológico, aplicando taxas diárias fixas e padronizando a exibição analítica do débito para assegurar a transparência na cobrança junto ao cliente.
* **Requisitos Técnicos:**
  * Modelar uma classe de domínio específica (como `Pedido`) aplicando os conceitos fundamentais de abstração e encapsulamento da POO para centralizar dados de inadimplência logística.
  * Declarar e tipar de forma estrita as propriedades da entidade, utilizando `String titulo` para designar a obra literária devolvida e `int diasAtraso` para registrar quantitativamente a janela temporal de atraso.
  * Implementar um método comportamental focado em processamento financeiro (como `calcularMulta()`) encarregado de aplicar a regra de negócio tarifária (multiplicador fixo de **R$ 2,50** por dia de atraso) e retornar o valor monetário resultante como um tipo numérico de ponto flutuante (`double`).
  * Desenvolver um método de leitura e exibição (como `exibirDetalhes()`) encarregado de invocar internamente a rotina de cálculo e realizar o *output* unificado das propriedades do objeto.
  * Empregar recursos de saída formatada (como `System.out.printf()`) para renderizar a string final interpolada, garantindo a exibição do prefixo monetário padrão (`R$`), a delimitação estrita de duas casas decimais com o separador regional e o alinhamento com a estrutura sintática exigida pelo escopo do negócio (`Livro: X | Multa por Y dias de atraso: R$ Z`).

### 🔹 Demanda 10: Algoritmo de Consolidação de Carrinho de Compras, Agregação de Itens e Cálculo de Faturamento de Checkout
* **Contexto da Demanda:** Na arquitetura de plataformas de e-commerce, gateways de pagamento e sistemas de frente de caixa (PDV), o processamento e a consolidação do carrinho de compras antes da etapa de faturamento é uma operação de missão crítica. O sistema necessita de uma rotina baseada no paradigma orientado a objetos capaz de instanciar diferentes itens, cada um com sua respectiva precificação unitária e volumetria, computar os subtotais individuais e agregá-los de forma cumulativa dentro de uma coleção de dados em memória. Essa lógica deve mitigar inconsistências no somatório de pedidos de múltiplas linhas e expor o valor macro consolidado da transação de forma padronizada.
* **Requisitos Técnicos:**
  * Modelar uma classe de domínio estrutural (como `ItemCarrinho`) aplicando os pilares da POO para encapsular as propriedades de cada item adicionado pelo consumidor.
  * Declarar e tipar de forma estrita as propriedades da classe: `String nome` para o identificador comercial, `double preco` para o valor unitário do ativo eletrônico e `int quantidade` para a volumetria adquirida daquele SKU específico.
  * Implementar um método comportamental com retorno (como `calcularSubtotal()`) responsável por executar a operação aritmética elementar de multiplicação entre as propriedades de preço e quantidade, retornando o produto resultante como um tipo primitivo `double`.
  * Instanciar uma coleção dinâmica utilizando a classe genérica `ArrayList` do pacote `java.util` para atuar como o contêiner estrutural do carrinho de compras, agrupando os diferentes objetos manipulados.
  * Desenvolver uma rotina de acumulação utilizando uma estrutura de repetição (como o loop *for-each*) para percorrer sequencialmente a coleção, invocando o método de subtotal de cada instância e somando os retornos em uma variável acumuladora global (como `totalCompra`).
  * Empregar recursos de saída formatada (como `System.out.printf()`) para externalizar o montante final da transação, garantindo a inserção do prefixo monetário institucional (`R$`), o limite mandatório de duas casas decimais e a estrutura sintática exata exigida pelo escopo do negócio (`Total da compra: R$ X`).

---

## 🎓 Certificado de Conclusão

Estas anotações e resoluções práticas atestam a conclusão e domínio técnico das competências propostas no módulo de modelagem, encapsulamento e lógica estruturada de objetos em Java.

<p align="center">
  <img src="../../assets/Certificados/Certificado - Praticando Orientacao a objetos.png" alt="Certificado Alura - Praticando Java: Orientação a Objetos" width="90%"/>
</p>

---
<p align="center">Documentação mantida para fins de portfólio profissional e histórico acadêmico na Jornada Geração Caldeira 2026.</p>