


public class TestClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySchool m1=new MySchool();
		pack1.Trainer t1=new pack1.Trainer();
		m1.nameOfTheSchool="Nirmala";
		m1.city="banglore";
		m1.noOfStudents=500;
		t1.name="abhi";
		t1.setSalary(12000);
		t1.age=26;
		System.out.println(m1.nameOfTheSchool);
		System.out.println(m1.noOfStudents);
		System.out.println(m1.city);
		System.out.println(t1.name);
		System.out.println(t1.getsal());
		System.out.println(t1.age);
		pack1.LabTrainer l1=new pack1.LabTrainer(); 
		System.out.println(l1.getsal());

	}

}
