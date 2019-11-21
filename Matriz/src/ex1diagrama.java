import java.util.*;

public class Ex1diagrama {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);




        int matriz[][]=new int [5][5];
        int i=0;
        int j=0;




        // ------------------------------------ //
        for(i=0; i<5; i++) {
            for (int j=0; j<matriz[i].length; j++) {
                matriz[i][j]=ler.nextInt();
            }
        }

                        i=0;

        for(i=0; i<5; i++) {
            System.out.println(matriz[i][i]+": ");
        }
    }
}