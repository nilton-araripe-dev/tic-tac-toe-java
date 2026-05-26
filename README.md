Markdown
# Jogo da Velha (Console)

Este é um clássico Jogo da Velha (Tic-Tac-Toe) interativo desenvolvido em Java para ser jogado diretamente no console. O projeto foi criado para consolidar o entendimento sobre estruturas de dados bidimensionais (matrizes), loops aninhados e lógica de validação de estados (vitória, empate e jogadas inválidas).

## 🚀 Funcionalidades

* **Tabuleiro Dinâmico:** Renderização do tabuleiro $3 \times 3$ no console a cada rodada.
* **Alternância de Turnos:** Troca automática entre os jogadores `X` e `O`.
* **Validação de Jogadas:** O sistema impede que um jogador escolha uma posição que já foi ocupada.
* **Verificação de Vitória:** Checagem automática a cada jogada para identificar se houve um vencedor nas linhas, colunas ou diagonais.
* **Detecção de Empate:** Se as 9 jogadas forem feitas e ninguém vencer, o jogo encerra declarando "Velha" (empate).

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8 ou superior)
* **Biblioteca Padrão:** `java.util.Scanner` (para capturar as coordenadas de linha e coluna digitadas pelos jogadores)

## 🔧 Como Executar o Jogo

Para rodar o jogo na sua máquina local, certifique-se de ter o Java JDK instalado.

1. **Clonar o repositório:**
   ```bash
   git clone [https://github.com/nilton-araripe-dev/tic-tac-toe-java.git](https://github.com/nilton-araripe-dev/tic-tac-toe-java.git)
Navegar até a pasta do projeto:

Bash
cd nome-do-seu-repositorio
Compilar o código:

Bash
javac Matriz.java
Executar o programa:

Bash
java Matriz
🧠 Aprendizados Aplicados
Neste projeto, os principais conceitos de programação praticados foram:

Matrizes (Arrays Bidimensionais): Uso de char[3][3] para representar as coordenadas do tabuleiro.

Loops Aninhados (Nested Loops): Uso de estruturas for dentro de for para varrer e desenhar a matriz na tela.

Lógica Condicional Avançada: Verificação rigorosa de padrões matemáticos para determinar o fim do jogo.


Desenvolvido por Nilton Araripe
