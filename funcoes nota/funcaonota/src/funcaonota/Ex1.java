package funcaonota;
import java.util.*; 
public class Ex1 {
	
	public static double Juros(double valor, int mes) {
		Scanner ler = new Scanner (System.in);
		int i; 	
		for(i=1;i<=mes;i++) {
			valor= valor+(valor*0.01);
		}
		return valor;
	}
	
	public static void main (String[] args) {
		int mes;
		double valor,x; 
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Qual valor você gostaria de investir?");
		valor = ler.nextInt();
		
		System.out.println("Por quantos meses ele vai ficar no banco?");
		mes = ler.nextInt();
		if(mes<0&&mes>12) {
			System.out.println("SEU ANIMAL, PELO AMOR DE DEUS, EXISTE 12 MESES, E TU BOTA O MES 13? QUAL SEU PROBLEMA?");
			System.exit(0);
		}
		x=Juros(valor,mes);
		
		System.out.println("Sua renda total será de: "+x);
	}
}
