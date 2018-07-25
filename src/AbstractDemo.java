abstract class Person{
	String name,location;
	int age;
	
	public boolean doesHeBreathe() {
		System.out.println("Every person Breathes");
		return true;
	}
	public boolean doesHeSleep() {
		System.out.println("Every person Sleeps");

		return true;
	}
	public abstract boolean doesHeDriveCar();
	@Override
	public String toString() {
		return "Person [name=" + name + ", location=" + location + ", age=" + age + "]";
	}
	
}
abstract class Employee6 extends Person{
	public abstract boolean doesHeDriveCar();
}
class Driver1 extends Employee6{

	@Override
	public boolean doesHeDriveCar() {
		System.out.println("Every Driver Drives Car");
		return true;
	}
	public void getDetails(String name,String location,int age) {
		this.name=name;
		this.location=location;
		this.age=age;
	}
	
	
}
public class AbstractDemo {

	public static void main(String[] args) {
		Driver1 d=new Driver1();
		d.getDetails("Abhi", "Pala", 21);
		System.out.println("Breathing?"+d.doesHeBreathe());
		System.out.println("Sleeping?"+d.doesHeSleep());
		System.out.println("Driving?"+d.doesHeDriveCar());
		System.out.println(d);
		
	}

}
