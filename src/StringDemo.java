
public class StringDemo {

	public static void main(String[] args) {
		String userName=args[0];
		String pass=args[1];
		if(userName.equals("Abhijith")&&pass.equals("Deloitte")) {
			System.out.println("valid user");
		}
		else {
			System.out.println("Invalid user");
		}
	}

}
