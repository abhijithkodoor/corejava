
public class BufferDemo {

	public static void main(String[] args) {
		StringBuffer myname=new StringBuffer("Deloitte");
		myname.append("Banglore");
		System.out.println(myname);
		System.out.println(myname.reverse());
		myname.insert(0,"India");
		System.out.println(myname);

	}

}
