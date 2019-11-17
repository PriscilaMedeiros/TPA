package funcaonota;
import java.util.*;
public class Ex2 {
	
	public static int Menu() { 
		int x; 
		Scanner ler = new Scanner (System.in);
		System.out.println("Escolha a sua opção\n 1-A vista 10% de desconto\n 2- Em duas vezes \n 3-De 3 até 10 vezes com 10% de juros ao mes (somente para compras acima de R$ 1000,0-)");
		x = ler.nextInt();
		return x; 
	}
	
	public static double Vista10(double valor) {
		valor = valor-(valor*0.10);
		return valor ; 
	}
	
	public static double DuasVezes(double valor) {
		valor =valor/2; 
		return valor; 
	}
	
	public static double Composto(double valor) {
		int mes,i; 
		Scanner ler = new Scanner (System.in);
		System.out.println("Escolha a quantia de mês ( de 3 a 10 )");
		mes=ler.nextInt();
		if(valor<100&&mes<3&&mes>10) {
			System.out.println("Inválido");
			System.exit(0);
		}
		for(i=1;i<=mes;i++) {
			valor= valor+(valor*0.03);
		}
		valor=valor/mes;
		return valor; 
	}
	public static void main(String[]args) {
		int x,recebe,mes;
		double recebe2,vtotal;
		Scanner ler = new Scanner (System.in);
			System.out.println("Escolha o valor total do seu cliente");
			vtotal= ler.nextInt();
			recebe=Menu();
		
		if(recebe==1) {
			recebe2=Vista10(vtotal);
			System.out.println("O valor com 10% de desconto a vista será de "+recebe2);
		}
		else if(recebe==2) {
			recebe2=DuasVezes(vtotal);
			System.out.println("O valor dividido em 2 vezes, sendo cada parcela com o vsalor de "+recebe2);
		}
		else if(recebe==3) {
			recebe2=Composto(vtotal);
			System.out.println("O valor de cada parcela será: "+recebe2);
		}
		
	}
}
