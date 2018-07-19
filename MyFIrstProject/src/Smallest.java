
public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,50,2,5,55,25};
		int min=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println("Max = "+min);
	}

}
