
public class Stringarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[]= {"Abhi","Ibin","Arun","Jilu","Gur"};
		int found=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equals("Guru")) {
				System.out.println("Guru is positioned at "+i+1);
				found=1;
				break;
			}
		}
		if(found==0) {
			System.out.println("Guru is not found");
		}
	}

}
