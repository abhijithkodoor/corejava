

class Cot{
	double price;
}
class Chair{
	double price;
	
}
class DiningTable{
	double price;;
	
}
class Furniture{
	public double calcDiscount(Cot c) {
		System.out.println("Cot discount");
		return(c.price*0.10);
	}
public double calcDiscount(Chair ch) {
	System.out.println("Chair discount");
	return(ch.price*0.15);
	}
public double calcDiscount(DiningTable d) {
	System.out.println("Dining table discount");
	return(d.price*0.20);
}
}
public class Overloading {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cot c=new Cot();
		c.price=250.00;
		Chair ch=new Chair();
		ch.price=525.00;
		DiningTable d=new DiningTable();
		d.price=2575.00;
		Furniture f=new Furniture();
		System.out.println(f.calcDiscount(c));
		System.out.println(f.calcDiscount(ch));
		System.out.println(f.calcDiscount(d));

	}

}
