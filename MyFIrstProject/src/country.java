
public class country {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String countries[]= {"India","us","aaa","bbb"};
		String capital[]= {"Delhi","Los","zzz","yyy"};
		String country="bbb";
		int flag=0;
		for(int i=0;i<countries.length;i++) {
			if(countries[i].equals(country)) {
				flag=i;
			}
		}
		System.out.println("Capital of "+countries[flag]+" is "+capital[flag]);
	}

}
