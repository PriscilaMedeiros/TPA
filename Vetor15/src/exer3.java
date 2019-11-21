import java.util.*;
public class exer3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i;
		int x[] = new int[10];


		for (i = 0; i < 10; i++) {
			System.out.println("Insira o seu número");
			x[i] = in .nextInt();
		}




		for (i = 0; i < 10; i++) {
			if (x[i] % 2 == 0) {
				System.out.println((x[i]) + " É primo");
			} else if (x[i] % 2 != 0) {
				System.out.println(x[i] + " Não primo");
			}

		}























	}

}