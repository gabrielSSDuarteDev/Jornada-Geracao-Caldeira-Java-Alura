# ☕ Java: Criando a sua Primeira Aplicação

## 🎯 Visão Geral do Módulo
Este módulo consolidou a transição prática do **Pensamento Computacional** para a engenharia de software real. A lógica algorítmica abstrata (estruturas de repetição, condicionais e fluxos de dados) foi traduzida para a sintaxe fortemente tipada, estruturada e moderna da linguagem Java.

---

## 🏗️ 1. Do Pensamento Computacional ao Algoritmo
Antes da codificação direta na IDE, a lógica foi estruturada para a validação do fluxo do problema, simulando cenários reais de regras de negócio:

### Desafio Prático: Sistema de Controle Financeiro (Cálculo de Despesas)
* **Objetivo:** Somar despesas mensais de forma automatizada sem a necessidade de prever a quantidade exata de inserções do utilizador.
* **Critério de Parada:** O laço de repetição mantém-se ativo lendo e acumulando valores até que o utilizador informe o valor `0`.
* **Modelagem Teórica (Pseudocódigo):**
  ```text
  Algoritmo: Cálculo de Despesas
  Início
      Exibir("Digite o valor da despesa (ou 0 para sair): ")
      Inserir(valor_Despesa)
      total_Despesa = 0;
      
      enquanto (valor_Despesa diferente de 0) faça:
          total_Despesa = total_Despesa + valor_Despesa
          Exibir("Digite o próximo valor: ")
          Inserir(valor_Despesa)
          
      Exibir(total_Despesa)
  Fim
  ```

---

## 💻 2. Fundamentos de Sintaxe e Comandos Java Aplicados
Os conceitos lógicos do pseudocódigo foram implementados utilizando os recursos nativos da API do Java no ambiente do IntelliJ IDEA:

### 📥 Entrada e Formatação de Dados
* `Scanner sc = new Scanner(System.in);`: Instanciação do objeto leitor de fluxo de dados a partir do terminal.
* `sc.useLocale(Locale.US);`: Configuração de localização internacionalizada para garantir a leitura correta de pontos flutuantes (`double`) utilizando o ponto como separador decimal.
* **Text Blocks (`"""..."""`):** Funcionalidade moderna utilizada para renderizar strings multilinha (menus e cabeçalhos), mantendo a formatação visual e a indentação original sem a necessidade de concatenações exaustivas.
* **Saída Formatada (`System.out.printf`):** Utilização do especificador de formato `%.2f` para arredondar e exibir valores numéricos complexos com o formato monetário padrão de duas casas decimais.

### 🔄 Estruturas de Decisão e Loops de Repetição
* **Laço `while (op != 4)`:** Loop condicional baseado em sentinela. A aplicação roda em tempo de execução contínuo até que uma entrada específica de controle (opção 4) seja disparada.
* **Condicionais Desencadeadas (`if / else if`):** Estrutura responsável pelo desvio de fluxo e execução dos blocos lógicos específicos para cada operação selecionada no menu.

---

## 🛠️ 3. Projeto Prático: Sistema de Operações Bancárias (*CountBank*)
O projeto principal consistiu no desenvolvimento de uma aplicação de consola para simulação de um terminal bancário automatizado (`ContaBancaria.java`), aplicando **Modularização Técnica** através da extração de funções em métodos específicos com validações de segurança:

```java
import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        double saldo = 5000.00;
        int op = 0;

        System.out.printf("""
                ==================================================
                                    CountBank
                ==================================================
               
                **************************************************
                Dados iniciais do cliente:
                
                Nome:               Gabriel Soares de Souza Duarte
                Tipo de Conta:      Corrente
                Saldo Inicial:      R$%.2f
               
                **************************************************
                """, saldo);

        while(op != 4){
            System.out.println("""
                    =======================================
                               MENU DE OPERAÇÕES
                    =======================================
                    -> Digite a operação a ser executada:
                    
                    1. Consultar Saldos
                    2. Receber Valor
                    3. Transferir valor
                    4. Sair da Aplicação
                    """);
            
            op = sc.nextInt();
            
            if (op == 1) {
                System.out.printf("Saldo atual: R$%.2f\n\n", saldo);
            } else if(op == 2) {
                System.out.println("Digite o valor a ser adicionado ao seu saldo: \n");
                double valorDeposito = sc.nextDouble();
                saldo = receberValor(saldo, valorDeposito);
            } else if(op == 3) {
                System.out.println("Digite o valor a ser retirado do seu saldo: \n");
                double valorTransferencia = sc.nextDouble();
                saldo = tranferirValor(saldo, valorTransferencia);
            } else if(op == 4) {
                System.out.println("Encerrando Aplicação.....Fim");
            }
        }
    }

    private static double tranferirValor(double saldo, double valorTransferencia) {
        if(saldo < valorTransferencia || valorTransferencia <= 0) {
            System.out.println("[ERRO] Saldo insuficiente ou valor inválido\n");
        } else if(saldo >= valorTransferencia) {
            saldo -= valorTransferencia;
            System.out.printf("Transferindo R$%.2f\n", valorTransferencia);
            System.out.printf("Saldo atual: R$%.2f\n\n", saldo);
        }
        return saldo;
    }

    private static double receberValor(double saldo, double valorDeposito) {
        if(valorDeposito > 0){
            saldo += valorDeposito;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso!\n", valorDeposito);
            System.out.printf("Saldo atual: R$%.2f\n\n", saldo);
        } else {
            System.out.println("[ERRO] Valor de Depósito inválido\n");
        }
        return saldo;
    }
}
```

### Regras de Negócio e Blindagem de Código Implementadas:
1. **Consulta de Saldo:** Retorna uma visualização direta, limpa e formatada do saldo em tempo real.
2. **Depósito Seguro (`receberValor`):** Valida se o valor inserido é estritamente maior que zero antes de atualizar o saldo da conta, prevenindo inserções de dados inconsistentes.
3. **Transferência Validada (`tranferirValor`):** Aplica uma estrutura de validação lógica dupla para garantir que a transação ocorra apenas se o valor for positivo e se o utilizador possuir saldo suficiente, emitindo um alerta de erro caso as condições falhem.

---

## 🎓 Certificado de Conclusão
<img src="../../assets/Certificados/Certificado_Primeira Aplicacao Java.png" alt="Certificado Java: criando a sua primeira aplicação - Alura" width="100%"/>
```
