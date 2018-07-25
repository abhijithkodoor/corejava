
public class PasswordValidator {

	public static void main(String[] args) {
		String pass="88888";
		int uflag=0;
		int dflag=0;
		int sflag=0;
		int wflag=0;
		char arr[]=pass.toCharArray();
		if(arr.length>=5&&arr.length<=10) {
			for(int i=0;i<arr.length;i++) {
				Character x=new Character(arr[i]);
				if(Character.isDigit(x)) {
					dflag=1;
				}
				else if(Character.isLetter(x)) {
					if(Character.isUpperCase(x)) {
						uflag=1;
					}
				}
				else if(Character.isWhitespace(x)) {
					wflag=1;
				}
				else {
					sflag=1;
				}
			}
			if(uflag==1&&sflag==1&&dflag==1&&wflag!=1) {
				System.out.println("Valid password");
			}
			else {
				System.out.println("2 Invalid password");
			}
		}
		else 
		{
			System.out.println("1 Invalid password");
		}
		
		
		
		
	}

}
