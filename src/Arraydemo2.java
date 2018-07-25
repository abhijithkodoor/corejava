
public class Arraydemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,50,2,5,55,25};
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("Max = "+max);
	}

}
