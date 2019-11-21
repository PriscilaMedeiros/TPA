import java.util.*;

public class exer7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);



		int x[] = new int[15];
		int y[] = new int[15];
		int i = 0, j = 0, p = 1, total;




		for (i - 0; i < 15; i++) {
			System.out.println("Digite o " + (i + 1) + " valor");
			x[i] = ler.nextInt();
			i++;



		}


		for (i = 0; i < 15; i++) {
			total = x[i];
			p = x[i] - 1;
			while (p > 0) {
				total = total * p;
				p--;



			}



			y[i] = total;
			total = 1;


		}


		for (i = 1; i < 14; i++) {
			System.out.println(y[i] + "-");

		}
		System.out.print(y[14]);

	}

}