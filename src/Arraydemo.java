
public class Arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,2};
		int flag=0;
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		for (int j = arr.length-1; j >= 0; j--) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
		for (int j = 0; j < arr.length; j++) {
			
			if (arr[j]==26) {
				flag=1;
				break;
			}
		}
		if (flag==1) {
			System.out.print("26 if found");
		}
		else {
			System.out.print("26 is not found ");
		}
	}

}
