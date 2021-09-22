package desafios.caiorodrigues;

import java.util.Scanner;
//Converter unidades do tipo peso/tempo/tamanho

public class ConversorMedidas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o converdor desejado");
        System.out.println("1= Peso; 2= tempo; 3= tamanho");

        float valor;
        int unidade;

        do {
            unidade = scanner.nextInt();

            if (unidade == 1) {
                System.out.println("Digite uma medida de Peso");
                valor = scanner.nextFloat();
                System.out.println(valor + "Kg = " + valor * 1000 + " gramas");
                System.out.println(valor + "Kg = " + valor / 1000 + " toneladas");
                break;
            }

            if (unidade == 2) {
                System.out.println("Digite algum minuto");
                valor = scanner.nextFloat();
                System.out.println(valor + "Minutos = " + valor * 60 + " segundos");
                System.out.println(valor + "Minutos = " + valor / 60 + " horas");
                break;
            }
            if (unidade == 3) {
                System.out.println("Digite algum metro");
                valor = scanner.nextFloat();
                System.out.println(valor + "Metros = " + valor * 100 + " cm");
                System.out.println(valor + "Metros = " + valor / 1000 + " Kilometros");
                break;
            }else{
                System.out.println("Numero Errado,Digite Novamente");
                System.out.println("Lembrando 1, 2, ou 3");
            }
        }while (unidade != 1 | unidade != 2 | unidade != 3);
    }
}

