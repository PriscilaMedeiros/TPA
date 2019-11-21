import java.util.*;
public class exer12 {
	public static void main(String[] args) {

		int x[] = new int[10];
		int y[] = new int[10];
		int i = 0, v = 9, g = 0;
		Scannerl er = new Scanner(System.in);

		while (i < 10) {
			System.out.println("digita o  " + (i + 1) + "val");
			x[i] ler.nextInt();
			i++;
		}


		i = 0;

		while (i < 10 && v > 0) {
			if (x[i] == x[v]) {
				i++;
				v--;
			} else if (x[i] != x[v]) {
				i = 1000;
			}
		}
		if (i > 100) {
			System.out.println("N palíndromo");
		} else {
			System.out.println("�um pal�ndromo");
		}
	}
}