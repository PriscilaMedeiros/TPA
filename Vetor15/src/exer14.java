import java.util.*;

public class exer14 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, num=3;
		int x[] = new int[3];
		int y[] = new int[3];
		int z[] = new int[3];
		

		
		for(i=0; i<num; i++){
			System.out.println("vals de a");
			x[i] = ler.nextInt();
		}


		for(i=0; i<num; i++) {
			System.out.println("vals de b");
			y[i] = ler.nextInt();
		}



		
		 for (i=0; i<num; i++) {

			    if (x[i] > y[i]) {
			       z[i] = 1;
				}
				
				
			    if(x[i] < y[i]) {
			    	z[i] = -1;
				}
				

			    if (x[i] == y[i]) {
		            z[i] = 0;      
			    }
		 } 
		 
			    for(i=0; i<num; i++) {
				System.out.print(z[i]);
			    }

		
	}

}
