import java.util.*;
public class exer2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i,n=1 ;
		int x[] = new int[5];
		int y[] = new int[10];


		for(i=0;i<=4;i++) {
			System.out.println("Insira os valores de a");
			x[i]= ler.nextInt();
		}
		for(i=0; i<10; i++) {
			y[0] = x[0]*n;
			System.out.println("O valor final da tabuada de: "+x[0]+"é: ");
			System.out.println(y[0]);
			n++;
		}
		for(i=0; i<10; i++) {
			y[1] = v1[1]*n;	
			System.out.println("O valor final da tabuada de: "+x[1]+"é: ");
			System.out.println(y[1]);
			n++;
		}
		for(i=0; i<10; i++) {x
			y[2] = v1[2]*n;	
			System.out.println("O valor final da tabuada de: "+x[2]+"é: ");
			System.out.println(y[2]);
			n++;
		}
		for(i=0; i<10; i++) {
			y[3] = v1[3]*n;	
			System.out.println("O valor final da tabuada de: "+x[3]+"é: ");
			System.out.println(y[3]);
			n++;
		}
		for(i=0; i<10; i++) {
			y[4] = v1[4]*n;		
			System.out.println("O valor final da tabuada de: "+x[4]+"é: ");
			System.out.println(y[4]);
			n++;
		}

	}
}
