import java.util.*;
public class exer5 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int i, j;
		int x[] = new int[2];

		for (i = 0; i < 2; i++) {
			System.out.println("Insira os valores ");
			x[i] = ler.nextInt();
		}

		for (i = 0; i < 2; i++) {
			for (j = 1; j <= a[i]; j++) {
				if (x[i] % j == 0 && j == x[i]) {
					System.out.println(x[i] + " e divisivel por: " + num);
				} else {
					System.out.println(x[i] + " n divisivel por: " + num);
				}
			}
		}
	}

}