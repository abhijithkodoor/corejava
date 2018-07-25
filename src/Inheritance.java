class Parent{
	public void m2() {
		System.out.println("m2 of parent");
	}
public void m4() {
	System.out.println("m4 of parent");
	}
}
class Child extends Parent{
	public void m2() {
		System.out.println("m2 of child");
	}
public void m1() {
	System.out.println("m1 of child");
	}
public void m3() {
	System.out.println("m3 of child");
}
}
public class Inheritance {

	public static void main(String[] args) {
		 
		Child c=new Child();
		c.m1();
		c.m3();
		c.m2();
		c.m4();
		Parent p=new Parent();
		p.m2();
		p.m4();
		Parent p1=new Child();
		p1.m2();
		p1.m4();
	 
		
		Child c1=(Child)p1;
		c1.m1();
	 
	}

}
