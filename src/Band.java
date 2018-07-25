
public class Band {
	private String bandName;
	private String[] singers;
	private String guitarists[];
	private String drummer;
	private String keyboardPlayer;
	
	public void setBandDetails(String bandName,String[] singers,String[] guitarists,String drummer,String keyboardPlayer) {
		this.bandName = bandName;
		this.drummer=drummer;
		this.guitarists=guitarists;
		this.keyboardPlayer=keyboardPlayer;
		this.singers=singers;
	}
	public void printBandDetails() {
		System.out.println(this.bandName);
		System.out.println(this.drummer);
		System.out.println(this.keyboardPlayer);
		for (int i = 0; i < this.guitarists.length; i++) {
			System.out.println(this.guitarists[i]);
		}
		for (int i = 0; i < this.singers.length; i++) {
			System.out.println(this.singers[i]);
		}
	}
	public int countMembers() {
		return 2+singers.length+guitarists.length;
	}
	
	
}
