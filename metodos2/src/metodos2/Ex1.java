package metodos2;
import java.util.*;
public class Ex1 {

	public static void Fatorial(int n){
		int i,a=0,n2=0;
		Scanner ler = new Scanner (System.in);
		for(i=n - 1;i>0;i--) { 
			n = n * i ; 
			
		}
		System.out.println("O valor é "+n);
	}
	public static void Tabuada(int n) {
		int i,n2 ; 
		for(i=1;i<=10;i++) {
			n2 = n*i; 
			System.out.println(n+" x "+i+"="+n2);
		}
		
	}
	public static void Sex(int n,int s) {
		int i;
		if(s==1&&n<65) {
			n  = n - 65; 
			System.out.println("Falta "+n+"y para você se aposentar");
		}
		else if(s==2&&n<60) {
			n  = 60-n; 
			System.out.println("Falta "+n+"y para você se aposentar");
		}
		else {
			System.out.println("Idade inválida, morra");
			System.exit(5);
		}
		
	}
	public static void Potencia(int n,int b) { 
		int i ; 
		for(i=1;i<b;i++) {
			n=n*n;
		}
		System.out.println(n);
	}
	public static void Menu() {
				int e,n,s,b,i,r; 
				Scanner ler = new Scanner (System.in);
					
			for(i=0;i<5;i++) {
				System.out.println("Escolha o seu EX!\n 1- FAT\n 2- TAB \n 3 - PREVIDÊNCIA \n 4 - Potência");
				e = ler.nextInt();
				if(e==1) {
					n=0;
					System.out.println("Escolha o valor para executar o fat ");
						n=ler.nextInt();
						Fatorial(n);
				}
				else if(e==2) {
					n=0;
					System.out.println("Escolha o seu número da tabuada");
						n=ler.nextInt();
						Tabuada(n);
				}
				else if(e==3) {
					n=0;
					System.out.println("Sua idade");
					n=ler.nextInt();
					
					System.out.println("Seu sexo: 1 para masc, 2 para fem");
					s=ler.nextInt();
					
					Sex(n,s);
				}
				else if(e==4) { 
					n=0;
					System.out.println("O número ");
					n=ler.nextInt();
					
					System.out.println("o expoente");
					b=ler.nextInt();
					
					Potencia(n,b);
				}
				else if(e==5) {
					System.out.println("Você quer mesmo sair? Deixar tudo para trás? O código que a pessoa programou\n para você será em vão? Tudo isso, todo o esforço dela foi em vão? Você é um monstro, adeus");
					System.exit(0);
				}
			System.out.println("Quer reiniciar?\n 1=sim\n 2=não");
			r=ler.nextInt();
			if(r==1) {
				i++;
			}
	else if(r==2){
		System.exit(0);
	}
	}
	}
	
	public static void main(String[] args) {
		Menu();
	}

}
