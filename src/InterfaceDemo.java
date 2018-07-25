interface TVRemote{
	public void switchOff();
	public void switchOn();
	public void changeChannel();
	public void increaseVolume();
	public void decreaseVolume();
}
class Sony implements TVRemote{

	@Override
	public void switchOff() {
		System.out.println("Sony Switch off");
	}

	@Override
	public void switchOn() {
		System.out.println("Sony Switch on");
	}

	@Override
	public void changeChannel() {
		System.out.println("Sony channel changed");
	}

	@Override
	public void increaseVolume() {
		System.out.println("Sony volume increased");
	}

	@Override
	public void decreaseVolume() {
		System.out.println("Sony volume decreased");
	}
	
}
class Samsung implements TVRemote{

	@Override
	public void switchOff() {
		System.out.println("Samsung switch off");

	}

	@Override
	public void switchOn() {
		System.out.println("Samsung switch on");

	}

	@Override
	public void changeChannel() {
		System.out.println("Samsung channel changed");

	}

	@Override
	public void increaseVolume() {
		System.out.println("Samsung volume increased");

	}

	@Override
	public void decreaseVolume() {
		System.out.println("Samsung volume decreased");

	}
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		Sony s=new Sony();
		Samsung sa=new Samsung();
		s.switchOn();
		s.changeChannel();
		s.decreaseVolume();
		s.increaseVolume();
		s.switchOff();
		sa.switchOn();
		sa.changeChannel();
		sa.decreaseVolume();
		sa.increaseVolume();
		sa.switchOff();
				
	}

}
