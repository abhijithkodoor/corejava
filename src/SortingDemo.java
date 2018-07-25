import java.util.*;
class Cars implements Comparable{
	String name;
	String color;
	double price;
	public Cars(String name, String color, double price) {
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
		Cars cc=(Cars)o;
		return this.name.compareTo(cc.name);
		
	}
	
}
public class SortingDemo {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		Cars c1=new Cars("Audi","Silver",1200000.00);
		Cars c2=new Cars("Ferrari","Black",2220000.00);
		Cars c3=new Cars("Lambo","yellow",2120000.00);
		Cars c4=new Cars("BMW","blue",1320000.00);
		a.add(c1);
		a.add(c2);
		a.add(c3);
		a.add(c4);

		
		System.out.println("Before sorting"+a);
		Collections.sort(a);
		System.out.println("After sorting"+a);
		
			
		
		
	}

}
