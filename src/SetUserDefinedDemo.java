import java.util.HashSet;

class MobilePhone{
	String mobileName;
	double price;
	public MobilePhone(String mobileName, double price) {
		super();
		this.mobileName = mobileName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "mobileName=" + mobileName + "\n price=" + price ;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof MobilePhone ))
			return false;
		MobilePhone mm=(MobilePhone)obj;
		if(this.mobileName==mm.mobileName && this.price==mm.price)
			return true;
		else
			return false;
	}
	@Override
	public int hashCode() {
		return (int) (this.price*5);
	}
	
}

public class SetUserDefinedDemo {

	

	public static void main(String[] args) {
		MobilePhone mp1=new MobilePhone("Samsung", 12000.00);
		MobilePhone mp2=new MobilePhone("Samsung", 12000.00);
		HashSet h=new HashSet();
		h.add(mp1);
		h.add(mp2);
		System.out.println(h);

	}

}
