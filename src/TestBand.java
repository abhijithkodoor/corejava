
public class TestBand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Band b1=new Band();
		Band b2=new Band();
		String s1[]= {"aaa","bbb"};
		String s2[]= {"aa","bb"};
		String g1[]= {"xxx","yyy"};
		String g2[]= {"xx","yy","z"};
		b1.setBandDetails("Avial",s1, g1, "anoop", "sharan");
		b1.printBandDetails();
		b2.setBandDetails("Thai",s2, g2, "ashish", "manu");
		b2.printBandDetails();
		System.out.println(b1.countMembers());
		System.out.println(b2.countMembers());
	}
}

