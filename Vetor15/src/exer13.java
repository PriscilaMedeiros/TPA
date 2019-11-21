import java.util.*;

public class exer13 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i, n = 3;
		int x[] = new int[3];
		int y[] = new int[3];

		for (i = 0; i < n; i++) {
			System.out.println("vals de a");
			x[i] = in .nextInt();
		}
		for (i = 0; i < n; i++) {

			if (x[i] % 2 == 0) {
				y[i] = 1;
				System.out.println("pares" + y[i] + " e o numero n:  " + x[i]);
			} else {
				y[i] = 0;

			}
		}












	}

}