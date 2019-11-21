import java.util.*;

public class ex1 {
public static void main(String[] args) {
	double v[][] = new double [5][5];
	int i=0,j=0 ; 
	Scanner ler = new Scanner (System.in);
	
	
	//Atribuição de valores
	for(j=0;j<5;j++) {		
		for(i=0;i<5;i++) {
		v[j][i]=Math.random()*10;
		System.out.println(v[i][j]);
		}
	}
	
	//Diagonal
	for(j=0;j<5;j++) {		
		for(i=0;i<5;i++) {
			if(j==i) {
				System.out.println("\n\n\n"+v[j][i]);
			}
		
		}
	}
	

	
	
}
}
