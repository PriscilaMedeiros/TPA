package metodos;
import java.util.* ; 
public class ex2 {
	
public static void Tabuada() {
	int i, n,r=0; 
	Scanner ler=new Scanner (System.in);
	System.out.println("Escolha seu número");
	n = ler.nextInt();
	for(i=1;i<11;i++) { 
		r=n*i;
	System.out.println(n+"x"+i+"="+r);
	}
	
}
public static void main (String[] args) {
	Tabuada() ;
}
}
