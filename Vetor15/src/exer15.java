import java.util.*;
public class exer15 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x[] = new int[2];
		int y[] = new int[2];
		int z[] = new int[2];
		int i, n = 2, j, aux, aux1;

		for (i = 0; i < n; i++) {
			System.out.println("Insira os elementos de A");
			x[i] = in .nextInt();

		}


		for (i = 0; i < (n - 1); i++) {
			aux1 = i;
			for (j = (i + 1); j < n; j++) {
				if (x[j] < y[i]) {
					aux1 = j;
				}
			}
			aux = x[i];
			x[i] = y[i];
			y[i] = aux;
		}

		for (i = 0; i < (n - 1); i++) {
			aux1 = i;


			for (j = (i + 1); j < n; j++) {
				if (x[j] > z[i]) {
					aux1 = j;


				}


				aux = x[i];
				x[i] = z[i];
				z[i] = aux;
			}


		}

		for (i = 0; i < n; i++) {
			System.out.println("crescente: " + y[i]);
			System.out.println("decrecente: " + z[i]);
		}




	}

}