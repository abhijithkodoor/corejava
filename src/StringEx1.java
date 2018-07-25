
public class StringEx1 {

	public static void main(String[] args) {
	int count=0;
//		String str="CC ac C";
//		for (int i = 0; i < str.length(); i++) {
//			if(str.charAt(i)=='C') {
//				count++;
//			}
//		}
//		System.out.println("Frequency of  C ="+count);
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[i].length(); j++) {
				if(args[i].charAt(j)=='C') {
					count++;
				}
			}
		}
		System.out.println("Frequency of  C ="+count);
	}

}
