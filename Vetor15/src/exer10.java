import java.util.*;
public class exer10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int x[] = new int[4];
		int y[] = new int[4];
		int z[] = new int[4];
		int i, n = 4, g = 0;

		for (i = 0; i < 4; i + +) {
			System.out.println("bota os coiso de a: ");
			x[i] = ler.nextInt();
		}


		for (i = 0; i < n; i + +) {
			System.out.println("bota os coiso de b: ");
			y[i] = ler.nextInt();
		}



		for (i = 0; i < n; i + +) {
			g = 0;


			for (i = 0; i < n; i + +) {
				if (x[i] == y[i]) {
					g = n + 1;
				} else {
					g = 0;
				}
				if (g == 0) {
					z[i] = x[i];

				}



			}


		}

		for (i = 0; i < n; i + +) {
			System.out.println("Elementos de A: " + x[i]);
			System.out.println("Elementos de B: " + y[i]);
			System.out.println("Elementos de C: " + z[i]);

		}





















	}

}