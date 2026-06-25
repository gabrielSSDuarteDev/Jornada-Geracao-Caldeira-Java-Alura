# 📝 Anotações Técnicas: Módulo 01 — Consumo de APIs em Java
> **Curso Alura:** Consumindo APIs em Java: HttpClient, Postman e Tratamento de Dados  
> **Status:** Conteúdo Consolidado (Módulo 01)

Este documento centraliza os fundamentos teóricos e práticos abordados no primeiro módulo. O objetivo é compreender a arquitetura de comunicação web em Java, ferramentas de validação de endpoints e os padrões de design que sustentam sistemas escaláveis.

---

## 🛠️ 1. Padrões de Projeto (Design Patterns)

Os **Padrões de Projeto** são soluções padronizadas e amplamente testadas para problemas recorrentes na engenharia de software. Eles atuam como um vocabulário comum entre desenvolvedores e promovem código limpo, de fácil manutenção e baixo acoplamento.

Eles são categorizados pelo *Gang of Four (GoF)* em três grandes pilares:

### 🧩 A. Padrões de Criação (Creational)
Abstraem o processo de instanciação. Eles ajudam a tornar um sistema independente de como seus objetos são criados, compostos e representados.
* **Singleton:** Garante a existência de uma única instância de uma classe em toda a execução do programa (centralizando recursos compartilhados, como pools de conexão).
* **Builder:** Permite a construção passo a passo de objetos complexos. É o padrão utilizado pela biblioteca nativa de HTTP do Java para configurar requisições.
* **Factory Method:** Delega a responsabilidade de instanciação de uma subclasse para um método de fábrica, evitando o uso excessivo do operador `new` diretamente no código cliente.

### 🏛️ B. Padrões de Estrutura (Structural)
Tratam da composição de classes e objetos para formar estruturas maiores, garantindo que a alteração de uma parte não quebre o sistema inteiro.
* **Adapter:** Converte a interface de uma classe em outra interface esperada pelo cliente, permitindo que classes incompatíveis trabalhem juntas.
* **Facade (Fachada):** Provê uma interface simplificada e unificada para um subsistema complexo, escondendo as interações complexas de baixo nível.

### 🎯 C. Padrões de Comportamento (Behavioral)
Focam nos algoritmos e na atribuição de responsabilidades entre os objetos, otimizando a comunicação interna do software.
* **Strategy:** Define uma família de algoritmos, encapsula cada um deles e os torna intercambiáveis em tempo de execução.
* **Observer:** Define uma dependência um-para-muitos entre objetos, de modo que quando um objeto muda de estado, todos os seus dependentes são notificados automaticamente.

---

## 🌐 2. Integração com APIs Externas (Estudo de Caso: OMDb API)

O consumo de dados modernos baseia-se na comunicação com **APIs RESTful** através do protocolo HTTP/HTTPS. No curso, a **OMDb API** (Open Movie Database) é o serviço externo utilizado para buscar informações de obras cinematográficas.

### 🔍 Anatomia de uma URL de Requisição
A comunicação exige que a requisição seja enviada para um endereço estrito, composto por chaves de acesso (*Tokens*) e parâmetros de busca (*Query Params*):

```text
       URL Base (Endpoint)           Query Params (Parâmetros)
 ┌──────────────┴──────────────┐   ┌────────────┴─────────────┐
 https://www.omdbapi.com/v1/movies?t=matrix&apikey=ef31a4c9
 └─────────────┬─────────────────┘ └───┬──┘ └───────┬────────┘
        Protocolo + Domínio            Filme    Chave de Acesso
```

* **URL Base / Host:** `https://www.omdbapi.com/` — O servidor remoto onde a API está hospedada.
* **Query Parameters (`?` e `&`):** Parâmetros utilizados para filtrar os dados. 
    * `t=matrix`: Define o parâmetro `t` (Title) como "matrix".
    * `apikey=...`: Define a credencial de segurança exigida pelo servidor para autorizar a requisição.

---

## ☕ 3. Requisições e Respostas HTTP em Java

A partir do **Java 11**, a API nativa `java.net.http` passou a oferecer suporte nativo robusto e assíncrono para comunicação web através de três pilares principais: `HttpClient`, `HttpRequest` e `HttpResponse`.

### 🔄 O Fluxo de Comunicação
```text
 ┌──────────────┐    1. HttpRequest (GET)    ┌──────────────┐
 │  Seu Código  │ ─────────────────────────> │   Servidor   │
 │   em Java    │ <───────────────────────── │  da OMDb API │
 └──────────────┘    2. HttpResponse (JSON)  └──────────────┘
```

### 💻 Implementação Prática Comentada
Abaixo está o padrão ideal de implementação utilizando o padrão de projeto **Builder** nativo do Java para disparar uma requisição síncrona:

```java
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ServicoConsumoApi {
    public static void main(String[] args) {
        // 1. Instanciar o Cliente HTTP (Motor encarregado da conexão de rede)
        HttpClient client = HttpClient.newHttpClient();

        // 2. Construir a Requisição utilizando o padrão DESIGN PATTERN: BUILDER
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=matrix&apikey=65864b2c"))
                .GET() // Define o verbo HTTP de busca/leitura de dados
                .build();

        try {
            // 3. Enviar a requisição e capturar a Resposta do servidor externo
            // O BodyHandlers.ofString() traduz os bytes de rede diretamente para texto puro (String)
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // 4. Analisar as propriedades recebidas no Response
            System.out.println("====== METADADOS DA RESPOSTA ======");
            System.out.println("Código de Status HTTP: " + response.statusCode());
            
            System.out.println("\n====== CORPO DA RESPOSTA (JSON BRUTO) ======");
            System.out.println(response.body());

        } catch (IOException e) {
            System.err.println("Erro de E/S ou falha de conexão de rede: " + e.getMessage());
        } catch (InterruptedException e) {
            System.err.println("A requisição foi interrompida abruptamente: " + e.getMessage());
            Thread.currentThread().interrupt(); // Boa prática de concorrência
        }
    }
}
```

### 💡 Conceitos-Chave de Redes no Java
* **Status Code (Código de Status):** Indica o resultado da sua requisição. O código `200` sinaliza sucesso rotineiro, enquanto códigos na faixa `400` (ex: `404`) indicam erros do cliente/endereço incorreto, e na faixa `500` falhas internas do servidor.
* **`BodyHandlers.ofString()`:** É o tradutor encarregado de ler o fluxo de dados brutos vindo do servidor web e convertê-lo em uma cadeia de caracteres (`String`) que represente o payload (JSON).

---

## 🚀 4. Validação de Endpoints via Postman

Escrever código Java e compilar a aplicação a cada alteração de URL consome muito tempo. A ferramenta **Postman** resolve isso atuando como uma interface visual de testes para chamadas HTTPS.

### 📋 Fluxo de Trabalho Recomendado no Postman
1.  **Configuração da Ação:** Defina o seletor de métodos HTTP para `GET` (localizado ao lado da barra de endereços).
2.  **Passagem de Endereço:** Insira a URL completa da API (`https://www.omdbapi.com/`).
3.  **Gerenciamento de Query Params:** Utilize a tabela integrada chamada **Params** para cadastrar as chaves organizadamente:
    * `Key: t` | `Value: matrix`
    * `Key: apikey` | `Value: [sua_chave]`
4.  **Disparo:** Clique no botão azul **Send**.
5.  **Inspeção Crítica do JSON:**
    * No painel inferior, altere a aba de resposta de *Raw* para **Pretty** e selecione a tipagem **JSON**.
    * Isto estruturará o texto indentado em pares de `chave: valor`. Essa estrutura visual permite analisar quais chaves do JSON (ex: `"Title"`, `"Year"`, `"Runtime"`) serão necessárias mapear no código Java através de bibliotecas como o Gson ou Jackson nos módulos subsequentes.