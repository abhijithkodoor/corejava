
public class EnumDemo {
	enum weekday {Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday}
	public static void main(String[] args) {
//		weekday[] w=weekday.values();
//		for(weekday w1:w)
//			System.out.println(w1);
//		String userInput="Sunday";
//		if(weekday.valueOf(userInput)==weekday.Friday) 
//			System.out.println("weekend");
//		else
//			System.out.println("Not weekend");	
//	
		int k=5;
		Integer i=new Integer(k);
		System.out.println("Highest integer value is "+i.MAX_VALUE);
		Double d=new Double(123.5);
		System.out.println("Highest double value is "+d.MAX_VALUE);
		System.out.println("Highest exponent value is "+d.MAX_EXPONENT);
		int x=i.intValue();
		System.out.println(x);
		int kk=878;
		System.out.println(Integer.toHexString(kk));		
		System.out.println(Integer.toBinaryString(kk));	
		System.out.println(Integer.toOctalString(kk));
		String company="Deloitte work for 9 hours *";
		
	}
}
