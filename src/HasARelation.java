class employ1{
	double salary;
	String name;
	int eid;
	String dept;
	Address add;
	public employ1(double salary, String name, int eid, String dept, Address add) {
		this.salary = salary;
		this.name = name;
		this.eid = eid;
		this.dept = dept;
		this.add = add;
	}
	public void printEmployeeDetails() {
		System.out.println(this.name);
		System.out.println(this.eid);
		System.out.println(this.dept);
		System.out.println(this.salary);
		this.add.printAddressDetails();
	}
}
class Address{
	String house;
	String place;
	String district;


	public Address(String house, String place, String district) {
	
		this.house = house;
		this.place = place;
		this.district = district;
	}
	public void printAddressDetails() {
		System.out.println(this.house);
		System.out.println(this.place);
		System.out.println(this.district);
	}
}
public class HasARelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a=new Address("kodoor","pala","kottayam");
		employ1 e1=new employ1(12000,"abhi",101,"it",a);
		e1.printEmployeeDetails();
	}

}
