
public class BufferDemo1 {

	public static void main(String[] args) {
		StringBuffer name=new StringBuffer("aaraa");
		
		System.out.println(name);
		for (int j=name.length()-1;j>=0;j--) {
			System.out.print(name.charAt(j));
			
			
		}
		
	}

}
