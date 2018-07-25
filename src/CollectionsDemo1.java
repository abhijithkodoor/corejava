import java.util.ArrayList;

public class CollectionsDemo1 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add("Guru");
		a1.add(10);
		Integer ii;
		String jj;
		for (int i = 0; i < a1.size(); i++) {
			a1.get(i);
			if(a1.get(i) instanceof Integer)
				ii=(Integer)a1.get(i);
			else if(a1.get(i) instanceof String)
				jj=(String)a1.get(i);
			
		}
		
	}

}
