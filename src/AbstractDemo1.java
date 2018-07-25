abstract class Person1{
	public abstract void whatDoYouDo();
	public boolean doYouSpeak(){
		System.out.println("Everyone speaks");
		return true;
	}
	
}
class Trainer extends Person1{

	@Override
	public void whatDoYouDo() {
		System.out.println("Delivers Lectures");
		
	}
	
}
class Doctor extends Person1{
	@Override
	public void whatDoYouDo() {
		System.out.println("Cures Ill");
		
	}
}
class Pilot extends Person1{
	@Override
	public void whatDoYouDo() {
		System.out.println("Flies the airplane");
		
	}
}
public class AbstractDemo1 {

	public static void main(String[] args) {
		Person1 p;
		p=new Trainer();
		System.out.println(p.doYouSpeak());
		p.whatDoYouDo();
		p=new Doctor();
		System.out.println(p.doYouSpeak());
		p.whatDoYouDo();
		p=new Pilot();
		System.out.println(p.doYouSpeak());
		p.whatDoYouDo();
	}

}
