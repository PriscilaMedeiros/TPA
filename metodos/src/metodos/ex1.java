package metodos;
import java.util.* ; 
public class ex1 {
	
public static void Potencia(){
	int e,b ;
	double r ;
	Scanner ler = new Scanner (System.in);
	System.out.println("Escolha sua base");
	b = ler.nextInt(); 
	System.out.println("\n Escolha seu expoente");
	e = ler.nextInt();
	
	r=Math.pow(b, e);
	
	System.out.println("\n resultado: "+r );
	
}
public static void main (String [] args) {
	Potencia(); 
}
}
