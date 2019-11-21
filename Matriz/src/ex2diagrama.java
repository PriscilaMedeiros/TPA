import java.util.*;
public class ex6{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int x[][] = new int [5][5];



        for(int i=0; i<x.length; i++){
            for (int j=0;j<x[i].length;j++ ) { //.lenght é mt bom, nem precisa usar 5 mais priscila
                x[i][j] = ler.nextInt();
            }
        }




        j=4;



        for(i=0;i<5;i++;j--){
            System.out.print(x[i][j]+": ");
        
        
        }
    
    
    }


}