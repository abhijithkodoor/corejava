
public class Commandline {

	public static void main(String...args) {
		// TODO Auto-generated method stub
		System.out.println("You passed... "+args.length+" arguments");
		for (int j = 0; j < args.length; j++) {
			System.out.println("Data is " + args[j]);
		}
	}

}
