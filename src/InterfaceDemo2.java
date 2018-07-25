interface comparison{
	public void whichIsGreater(Object o1,Object o2);
}
class Employee11 implements comparison{
	String empid;
	double salary;
	Employee11(String empid, double salary) {
		
		this.empid = empid;
		this.salary = salary;
	}
	@Override
	public void whichIsGreater(Object o1, Object o2) {
		Employee11 e1=(Employee11)o1;
		Employee11 e2=(Employee11)o2;
		if(e1.salary>e2.salary)
			System.out.println(e1.empid+" is greater");
		else
			System.out.println(e2.empid+" is greater");

	}
	
}
class Apple implements comparison{
	String source;
	double price;
	public Apple(String source, double price) {
		super();
		this.source = source;
		this.price = price;
	}
	@Override
	public void whichIsGreater(Object o1, Object o2) {
		Apple a1=(Apple)o1;
		Apple a2=(Apple)o2;

		if(a1.price>a2.price)
			System.out.println(a1.source+" is greater");
		else
			System.out.println(a2.source+" is greater");
	}
	
}
public class InterfaceDemo2 {

	public static void main(String[] args) {
		Employee11 e1=new Employee11("emp1",25000.0);
		Employee11 e2=new Employee11("emp2",35000.0);
		Employee11 e3=new Employee11(null,0);
		e3.whichIsGreater(e1, e2);
		Apple a1=new Apple("Kashmir",2343.22);
		Apple a2=new Apple("salem",3333.22);
		Apple a3=new Apple(null,0);
		a3.whichIsGreater(a1, a2);
	}

}
