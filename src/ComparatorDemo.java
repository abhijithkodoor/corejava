
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class Carss implements Comparable{
	String name;
	String color;
	double price;
	public Carss(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", color=" + color + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) {
		Carss cc=(Carss)o;
		return this.name.compareTo(cc.name);
		
	}
	
}
class PriceCompare implements Comparator<Carss>{

	@Override
	public int compare(Carss c1, Carss c2) {
		if(c1.price==c2.price)
			return 0;
		else if(c1.price>c2.price)
			return 1;
		else return-1;
	}
	
}
public class ComparatorDemo {
	enum week {Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		ArrayList a1=new ArrayList(3);
		ArrayList a2=new ArrayList();
		Carss c1=new Carss("Audi","Silver",5200000.00);
		Carss c2=new Carss("Ferrari","Black",2220000.00);
		Carss c3=new Carss("Lambo","yellow",2120000.00);
		Carss c4=new Carss("BMW","blue",1320000.00);
		a.add(c1);
		a.add(c2);
		a.add(c3);
		a.add(c4);

		PriceCompare p=new PriceCompare();
		System.out.println("Before sorting"+a);
		Collections.sort(a, p);;
		System.out.println("After sorting"+a);
		//System.out.println(Collections.binarySearch(a,1200000,p));
		Collections.fill(a1, c4);
		System.out.println(a1);
		System.out.println(Collections.min(a, p));
		System.out.println(Collections.min(a));
		

	}

}
