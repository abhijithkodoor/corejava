class Employee{
	
}
class HR extends Employee{
	
}
class Technical extends Employee{
	
}
class Recruiter extends HR{
	
}
class Financier extends HR{
	
}
class JavaPm extends Technical{
	
}
class MainframePm extends Technical{
	

}

public class MIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Technical t=new JavaPm();
		HR h=new Recruiter();
		Employee e=new HR();
		Employee e1=new MainframePm();
		
	}

}
