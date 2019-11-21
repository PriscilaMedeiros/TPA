import java.util.*;
public class exer8 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i;
		int o;
		int n = 4, aux = 0, aj;

		int x[] = new int[4];
		int y[] = new int[4];



		for (i = 0; i < 3; i++) {
			System.out.println("diga seu n");
			x[i] = ler.nextInt();
		}


		for (i = 0; i < 3; i++) {
			aux = 0;


			for (o = i; o < 3; o++) {
				aux = aux + x[i];

			}

			y[i] = aux;

		}


		for (i = 0; i < 3; i++) {
			System.out.println("somatória " + x[i] + " \n resultado:  " + y[i]);
		}

	}

}