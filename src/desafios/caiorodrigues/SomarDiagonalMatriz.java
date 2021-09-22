package desafios.caiorodrigues;

public class SomarDiagonalMatriz {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];

        int somai = 0;
        int somaj = 0;

        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j) {
                    somai += i;
                    somaj += j;
                }
                System.out.println("Linha "+i + "/ " + "Coluna " + j+ ": " + "Posicao_"+i + j);
            }
        }
        System.out.println("Soma diagonal da Matriz: "+"Total "+somai+somaj);
    }
}
