class Mobile1{
	public void swithOff(){
		System.out.println("Switched off");
	}
	public void swithOn(){
		System.out.println("Switched On");
	}
	public void sendMessage(){
		System.out.println("Sending message");
	}
	public void makeCall(){
		System.out.println("Calling");
	}
}
class SmartPhone extends Mobile1{
	public void browse(){
		System.out.println("Browsing");
	}
	public void playGame(){
		System.out.println("Playing game");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone s=new SmartPhone();
		s.swithOff();
		s.browse();
	}

}
