
public class Employee1 {
	private int employeeId;
	private String employeeName;
	private double employeeSalary;
	private static String companyName="Deloitte";
	

	public double calculateBonus() {
		if(employeeSalary<=5000) {
		return employeeSalary*0.20;
		}
		else {
			return employeeSalary*0.10;
		}
	}
	public Employee1() {
		this.employeeId = 102;
		this.employeeName = "James";
		this.employeeSalary = 10121.00;
	}
	public Employee1(int employeeId, String employeeName, double employeeSalary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	public static String getCompanyName() {
		return companyName;
	}
	
	

	
	
	
}
