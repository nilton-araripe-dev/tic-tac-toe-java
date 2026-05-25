import java.util.Scanner;

public class Matriz {
public static void main(String[] args) {
Scanner leitor = new Scanner(System.in);
char[][] tabuleiro = new char[3][3];

for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
tabuleiro[i][j] = '-';
}
}

char jogadorAtual = 'X';
int contadorJogadas = 0;

while (contadorJogadas < 9) {

for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(tabuleiro[i][j] + " ");
}
System.out.println();
}
System.out.println("Jogador atual: " + jogadorAtual);
System.out.println("Digite a linha que deseja jogar (0 a 2):");
int linha = leitor.nextInt();

System.out.println("Digite a coluna que deseja jogar (0 a 2):");
int coluna = leitor.nextInt();

if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
                
if (tabuleiro[linha][coluna] == '-') {
tabuleiro[linha][coluna] = jogadorAtual;
contadorJogadas++;
                    
boolean verificarVitoria = false;
                    
for (int i = 0; i < 3; i++) {
if (tabuleiro[i][0] == tabuleiro[i][1] &&
tabuleiro[i][1] == tabuleiro[i][2] &&
tabuleiro[i][2] != '-'
) {
verificarVitoria = true;
contadorJogadas = 9;
}
if (tabuleiro[0][i] == tabuleiro[1][i] &&
tabuleiro[1][i] == tabuleiro[2][i] &&
tabuleiro[2][i] != '-'
) {                            
verificarVitoria = true;
contadorJogadas = 9;
}
}
                    
if ((tabuleiro[0][0] == tabuleiro[1][1] &&
    tabuleiro[1][1] == tabuleiro[2][2] &&
    tabuleiro[2][2] != '-') || 
    (tabuleiro[0][2] == tabuleiro[1][1] &&
    tabuleiro[1][1] == tabuleiro[2][0] && 
    tabuleiro[2][0] != '-')
) {
verificarVitoria = true;
contadorJogadas = 9;
}                    
                   
if (verificarVitoria) {
System.out.println("Jogador: " + jogadorAtual + " venceu!");
} else if (contadorJogadas == 9) {
System.out.println("Empate!");
}

if (!verificarVitoria) {
if (jogadorAtual == 'X') {
jogadorAtual = 'O';
} else {
jogadorAtual = 'X';
}
}
} else {
System.out.println("Posição já preenchida! Tente novamente.");
}
                
} else {
System.out.println("Erro: Posição inválida! Escolha apenas números de 0 a 2.");
}
}

System.out.println("--- Tabuleiro Final ---");
for (int i = 0; i < 3; i++) {
for (int j = 0; j < 3; j++) {
System.out.print(tabuleiro[i][j] + " ");
}
System.out.println();
}
        
leitor.close();
}
}
