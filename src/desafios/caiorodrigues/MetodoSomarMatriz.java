package desafios.caiorodrigues;

import org.w3c.dom.ls.LSOutput;

import java.security.SecureRandom;

public class MetodoSomarMatriz {
    public static void main(String[] args) {
        int linha = 3;
        int coluna = 3;
        int[][] matriz = new int[linha][coluna];

        geraValor(matriz, linha, coluna);
        somaDiagonal(matriz, linha, coluna);


    }

    public static void geraValor(int matriz[][], int linha, int coluna) {
        for (int l = 0; l < linha; l++) {
            for (int c = 0; c < coluna; c++) {
                matriz[l][c] = new SecureRandom().nextInt(100);
                System.out.print(matriz[l][c]);
                System.out.print("-");
            }
            System.out.printf("%n");
        }
    }

    public static void somaDiagonal(int matriz[][], int linhas, int colunas) {
        int soma = 0;
        int valor = 0;
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                if (l == c) {
                    valor = matriz[l][c];
                    soma += matriz[l][c];
                    System.out.print(valor + "+");
                }
            }
        }
        System.out.println("=");
        System.out.println("Resultado: " + soma);
    }
}
