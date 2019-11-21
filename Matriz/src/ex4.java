import java.util.*;
public class ex4 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		// Declarar Matriz
		int tabela[][] = new int[4][4];
		int tabelabackup[][] = new int [4][4];
		int userv[][] = new int [4][4]; 
		int i,j,k=0, valor=0,l=0;
		int contadorpontos=0;
		int contadorrodadas=0;
		
		//Resetar o game
		while(k<2) {
			// Cadastro de valor
			for(j=0;j<8;j++) {
				for(i=0;i<8;i++) {
					valor = new Random().nextInt(75) + 1;
					tabela[j][i]= valor;
				}
			}
			//Por dados no backup
			for(j=0;j<8;j++) {
				for(i=0;i<8;i++) {
					tabelabackup[j][i]=tabela[j][i];
				}
			}
			
			//Checar se s�o iguais
			for(j=0;j<8;j++) {
				for(int m=0;m<5;m++) {	
					for(i=0;i<5;i++) {
						if(tabelabackup[j][m]==tabela[j][i]) {
							tabela[j][i]=	valor = new Random().nextInt(100) + 1;
						}
					}
				}
			}
			for(j=0;j<2;j++) {
				for(i=0;i<2;i++) {
					System.out.println("Diga o n�mero que voc� acha que �");
					userv[j][i] = ler.nextInt();
					contadorrodadas++;
					
					if(tabela[j][i]==userv[j][i]) {
						System.out.println("Acertou!");
						contadorpontos++;
					}
					if(contadorpontos==16){
						i=3;
						j=3;
					}
					else { 
						System.out.println("Errastes!");
					}
				}
				j=0;
				i=0;
			}
			
			
			System.out.println("Bingo! Foram um total de "+contadorrodadas+" rodadas")
			System.out.println("Os n�meros eram:");

			for(j=0;j<8;j++) {
				for(i=0;i<8;i++) {
					System.out.print(tabela[j][i]+" ");
					if(i==7) {
						System.out.print("\n");
					}
				}
			}
				System.out.println("N�o foi dessa vez =/\n Quer jogar novamente?\n 1-Sim 2-N�o");
				l=ler.nextInt();
			
				if(l==1) {
					k=0;
				}
				else {
					System.exit(0);
				}
		
		}
		}
	}
}
