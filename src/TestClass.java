
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double max;
		Car temp=new Car();
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		Car c4=new Car();
		Car c5=new Car();
		c1.setCarDetails("Audi", 20, 4500000, true);
		c2.setCarDetails("BMW", 15, 5000000, true);
		c3.setCarDetails("Maruthi", 28, 450000, false);
		c4.setCarDetails("Ferrari", 8, 36000000, true);
		c5.setCarDetails("Bugatti", 3, 16000000, true);
		c1.printCarDetails();
		c2.printCarDetails();
		c3.printCarDetails();
		c4.printCarDetails();
		c5.printCarDetails();
		Car cars[]={c1,c2,c3,c4,c5};
		max=c1.price;
		for(Car c:cars) {
			if(max<c.price) {
				max=c.price;
				temp=c;
			}
		}
		System.out.println("car name"+ temp.carName);
		
	}

}
