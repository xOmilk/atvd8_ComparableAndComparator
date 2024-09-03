import java.util.Comparator;

public class CompareNomes implements Comparator<Conta>{

	@Override
	public int compare(Conta o1, Conta o2) {
		
		return o1.getTitular().compareTo(o2.getTitular());
	}
	
	

}
