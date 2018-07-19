
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p1=520.5,p2=425.80,p3=230.55,p4=150,p5=60.10;
		
		if(p1>p2&&p1>p3&&p1>p4&&p1>p5) {
			System.out.println(p1+" is greater");
		}
		else if(p2>p3&&p2>p4&&p2>p5) {
			System.out.println(p2+" is greater");
		}
		else if(p3>p4&&p3>p5) {
			System.out.println(p3+" is greater");
		}
		else if(p4>p5) {
			System.out.println(p4+" is greater");
		}
		else {
			System.out.println(p5+" is greater");
		}
	
	
	}

}
