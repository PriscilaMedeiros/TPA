import java.util.*;
public class exer6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int x[] = new int[11];
		int y[] = new int[11];
		int i;

		for (i = 0; i < 11; i++) {
			System.out.println("insira aqui pf ");
			x[i] = ler.nextInt();
		}

		for (i = 0; i < 11; i++) {
			y[i] = x[i];
			x[i] = x[i] * x[i];
			System.out.println("n escolhido " + y[i] + " \nvalor " + x[i]);


		}










	}

}