import java.util.*;
public class exer1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i, r;
		int x[] = new int[20];
		int y[] = new int[20];



		for (i =0;i<20;i++) {
			System.out.print("Seus val");
			x[i] = in .nextInt();
		}

		System.out.println("")
		for (i =0;i<20;i++) {
			if (x[i] % 2 == 0) {
				y[i] = a[i];
				System.out.print(" Par: " + y[i]);
			}
		}

		
		for (i =0; i<20; i++) {
			if (x[i] % 2 != 0) { 
				y[i] = x[i];
				System.out.print(" Impar: " + y[i]);
			}
		}
	}
}