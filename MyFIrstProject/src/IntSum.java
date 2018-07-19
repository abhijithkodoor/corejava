
public class IntSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,sum=0;
		
		for (int i = 0; i < args.length; i++) {
			x=Integer.parseInt(args[i]);
			sum=sum+x;
		}
		System.out.println("Sum ="+sum);
	}

}
