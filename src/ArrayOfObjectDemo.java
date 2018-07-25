class Product3{
	String name;
	double price;
	@Override
	public String toString() {
		return "Product3 [name=" + name + ", price=" + price + "]";
	}
	public Product3(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
}
public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		Product3 p1=new Product3("laptop", 35000.25);
		Product3 p2=new Product3("laptop", 25500.25);
		Product3 p3=new Product3("laptop", 45000.25);
		Product3[] arr= {p1,p2,p3};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
