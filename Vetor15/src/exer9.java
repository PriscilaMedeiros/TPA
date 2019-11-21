import java.util.*;
public class exer9 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, n = 4, g = 0;

		int x[] = new int[4];
		int y[] = new int[4];
		int z[] = new int[4];



		for (i = 0; i < 4; i++) {
			System.out.println("bota os elementos de a");
			x[i] = ler.nextInt();

		}

		for (i = 0; i < n; i + +) {
			System.out.println("bota os elementos de b");
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

				if (g == n + 1) {
					z[i] = x[i];

				}


			}


		}

		for (i = 0; i < n; i + +) {


			System.out.println("a:  " + x[i]);
			System.out.println("b:  " + y[i]);


			if (i < g) {
				System.out.println("c: " + z[i]);
			}
		}






	}

}