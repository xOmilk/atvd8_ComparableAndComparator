import java.util.ArrayList;
import java.util.Collections;


public class App {

	public static void main() {
		
		Conta c1= new Conta("Lucas",12354,2000f, 1000f);
		Conta c2= new Conta("Fernando",5676,809f, 435f);
		Conta c3= new Conta("Vinicius",15676,2000f, 897f);
		
		ArrayList<Conta> a1= new ArrayList<Conta>();
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		
		
		//Nome
		Collections.sort(a1, new CompareNomes());
		for(Conta contas: a1) {
			contas.toString();
		}
		
		
	
		//numero
		Collections.sort(a1, new CompareNumeros());
		for(Conta contas: a1) {
			contas.toString();
		}
		
		
		
		
		
	}
	
	
}
