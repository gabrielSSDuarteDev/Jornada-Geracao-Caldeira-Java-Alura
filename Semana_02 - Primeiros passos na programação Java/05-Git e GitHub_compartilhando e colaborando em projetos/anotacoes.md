
# 🔀 Git e GitHub: Controle de Versão, Compartilhamento e Colaboração

## 🌐 1. Conceituação: Repositório Local vs. Repositório Remoto

O controle de versão com Git baseia-se na sincronização entre dois ambientes fundamentais:

* **Repositório Local:** É o ambiente de desenvolvimento que reside inteiramente na sua máquina física. Todas as alterações, históricos de commits e branches ficam guardados na pasta oculta `.git`. Ele não depende de internet para funcionar.
* **Repositório Remoto:** É a instância do projeto hospedada em um servidor na nuvem (como o GitHub). Ele funciona como a "fonte da verdade" do projeto, permitindo que múltiplos desenvolvedores enviem, centralizem e compartilhem suas contribuições de código.

### 🎯 A Importância de se Utilizar um Repositório
Utilizar um sistema de repositórios vai muito além de apenas "guardar código". Suas principais vantagens são:
* **Histórico e Rastreabilidade:** Permite saber exatamente quem alterou cada linha de código, quando a mudança foi feita e o motivo (através das mensagens de commit).
* **Segurança e Backup:** Caso sua máquina sofra uma falha de hardware, o código está seguro na nuvem. Além disso, se uma nova funcionalidade quebrar o sistema, é fácil retornar a um estado anterior estável.
* **Trabalho em Equipe Descentralizado:** Múltiplos programadores podem trabalhar no mesmo arquivo simultaneamente sem o risco de um sobrescrever o trabalho do outro.
* **Portfólio Vivo:** O GitHub funciona como uma vitrine técnica para o mercado, comprovando a sua constância de estudos e evolução prática.

---

## 🛠️ 2. Criação e Inicialização de Repositórios

Para iniciar o rastreamento de um projeto via terminal, utilizamos comandos específicos de preparação:

* `git init`
    * **O que faz:** Inicializa um repositório Git local vazio dentro da pasta atual do terminal. Cria o diretório oculto `.git` e permite que você comece a monitorar os arquivos.
* `git clone <url-do-repositorio>`
    * **O que faz:** Copia um repositório remoto já existente (do GitHub) integralmente para a sua máquina local. Ele já baixa todo o histórico de commits, as branches e configura automaticamente o vínculo remoto padrão (`origin`).

---

## 🔄 3. Comandos Fundamentais e Fluxo de Trabalho (Workflow)

O fluxo diário de manipulação de arquivos passa por três estados locais (*Working Directory*, *Staging Area* e *Local Repository*) antes de ir para a nuvem:

### Verificação e Diagnóstico:
* `git status`
    * **O que faz:** Exibe o estado atual do seu diretório de trabalho. Mostra quais arquivos foram modificados mas não adicionados, quais estão na *Staging Area* aguardando um commit e quais arquivos o Git ainda não está rastreando (*untracked files*). É o comando de diagnóstico mais usado.
* `git log`
    * **O que faz:** Exibe a lista cronológica de todos os commits realizados na branch atual. Mostra o identificador único (Hash SHA-1), o autor, a data, o horário e a mensagem descritiva de cada commit.

### Manipulação e Envio:
* `git add <nome-do-arquivo>` ou `git add .`
    * **O que faz:** Envia arquivos modificados ou novos do seu diretório de trabalho para a **Staging Area** (área de preparação). O ponto `.` adiciona todas as modificações de uma vez.
* `git commit -m "Mensagem explicativa"`
    * **O que faz:** Grava permanentemente o instantâneo (*snapshot*) do código que estava na Staging Area no histórico do seu repositório local.
* `git push <remote> <branch>` (Ex: `git push origin main`)
    * **O que faz:** Envia os commits realizados no seu repositório local para o repositório remoto no GitHub, atualizando a branch correspondente na nuvem.
* `git pull`
    * **O que faz:** Traz as atualizações mais recentes do repositório remoto e as mescla (*merge*) automaticamente na sua branch de trabalho local.

---

## 🌿 4. Ramificação, Fusão e Cópia (Branch, Merge e Fork)

Para trabalhar em equipe de forma segura, o Git utiliza o conceito de linhas temporais isoladas:

* **Branch (Ramificação):** Linha de desenvolvimento independente criada a partir da principal para testar recursos sem afetar o código estável.
* **Merge (Fusão):** O ato de unir o histórico e as linhas de código de uma branch secundária de volta para a branch principal.
* **Fork (Cópia Externa):** Ação no ecossistema do GitHub que gera uma cópia idêntica do repositório de outra pessoa na sua conta, permitindo modificações livres para posterior envio de melhorias via *Pull Request*.

---

## ⏪ 5. Desfazendo Alterações e Corrigindo Commits

Quando ocorrem erros no desenvolvimento, o Git possui ferramentas para corrigir o histórico local e remoto:

### Atualização do Último Commit (Correção rápida)
* `git commit --amend -m "Nova mensagem corrigida"`
    * **O que faz:** Modifica o **último commit** realizado. Ele permite mudar a mensagem de um commit que foi escrita errada ou incluir arquivos modificados de última hora que você esqueceu de colocar no `git add`.
    * **Regra de Ouro:** Só utilize o `--amend` se o commit ainda for estritamente local. Nunca altere o histórico de um commit que já foi enviado ao GitHub via `push`.

### Reversões de Histórico
* `git revert <hash-do-commit>`
    * **O que faz:** Cria um **novo commit** que desfaz as alterações introduzidas pelo commit alvo. É a forma mais segura para repositórios remotos compartilhados com o time.
* `git reset <hash-do-commit>`
    * **O que faz:** Move o ponteiro do histórico do Git de volta para o commit especificado, apagando os registros posteriores. O modo `--soft` mantém as alterações na Staging Area, enquanto o modo `--hard` destrói completamente o código gerado após aquele ponto.

---

## 📝 6. Documentação de Projetos: A Importância do README

O arquivo `README.md` (escrito em formato Markdown) é a porta de entrada e o cartão de visitas de qualquer repositório no GitHub.

### Por que ele é fundamental?
* **Contextualização:** Explica brevemente o que o projeto é, qual problema ele resolve e qual é o seu objetivo.
* **Guia de Instalação:** Fornece o passo a passo de como clonar, configurar as variáveis de ambiente, instalar as dependências e rodar o projeto localmente.
* **Stack Tecnológica:** Lista de forma visual as linguagens (como Java, C ou PHP) e frameworks utilizados na construção da aplicação.

---

## 🎓 Certificado de Conclusão
<img src="../../assets/Certificados/Certificado_Git-GitHub.png" alt="Certificado Git e GitHub: Compartilhamento e Colaboração - Alura" width="100%"/>

```
