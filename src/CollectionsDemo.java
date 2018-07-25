import java.util.ArrayList;

public class CollectionsDemo {

	public static void main(String[] args) {
			ArrayList a1=new ArrayList();
			a1.add("Guru");
			a1.add("Shaurya");
			a1.add(true);
			a1.add(0,true);
			for (int i = 0; i < a1.size(); i++) {
				System.out.println(a1.get(i));
			}
			System.out.println(a1);
			for (int i = 0; i < a1.size(); i++) {
				if(a1.get(i).equals(true))
				 a1.remove(i);
			}
			System.out.println(a1);
			a1.remove("Shaurya");
			int index=a1.indexOf("Guru");
			if(index!=-1) {
				a1.remove(index);
				a1.add(index, "Abhijith");
			}
			else {
				System.out.println("Guru not found");
			}
			System.out.println(a1);
			

	}

}
