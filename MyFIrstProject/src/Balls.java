
public class Balls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String basket1[]= {"red","yellow","green","blue"};
		String basket2[]= {"red","yellow","green","blue"};
		int count=0;
		for(int i=0;i<basket1.length;i++) {
			if(basket1[i].equals("red")) {
				count++;
			}
		}
		for(int i=0;i<basket2.length;i++) {
			if(basket2[i].equals("red")) {
				count++;
			}
		}
		System.out.println("number of red balls ="+count);
	}

}
