
public class Sumeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=0;
		int arr[]= {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				s = s + arr[i];
			}
		}
		System.out.println("Sum ="+ s);
	}
}


