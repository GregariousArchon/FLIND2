
public class Employee {
	private int empid = 0;
	private String ename;
	private double basicsalary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netsalary;
	private double grosssalary;
	static int count = 0;
	public Employee() {
//		empid = -1;
//		ename = "";
//		basicsalary = -1;
//		hra = 0.5 * basicsalary;
//		medical = -1;
//		pf = 0.12 * basicsalary;
//		pt = 200;
//		netsalary = -1;
//		grosssalary = -1;
		count ++;
		this.empid = count;
	}
//	public static String company_name = "HSBC";
//	public Employee() {
////		this();
//		System.out.println("DEFAULT CONSTR.");
//		
//	}
	public Employee(String ename, double basicsalary, double medical) {
		this();
//		System.out.println("PARAMETERIZED CONSTR.");
		
//		this.empid = empid;
		this.ename = ename;
		this.basicsalary = basicsalary;
		hra = 0.5 * basicsalary;
		this.medical = medical;
		pf = 0.12 * basicsalary;
		pt = 200;
//		this.netsalary = netsalary;
//		this.grosssalary = grosssalary;
		
	}
	public double calculateGrossSalary () {
		this.grosssalary = this.basicsalary + this.hra + this.medical;
		return this.grosssalary;
	}
	public double calculateNetSalary () {
		this.netsalary = this.calculateGrossSalary() - this.pf - this.pt;
		return this.netsalary;
	}
	public void printEmp() {
		System.out.println("ID: "+ empid);
		System.out.println("NAME: "+this.ename);
		System.out.println("GROSS: "+this.calculateGrossSalary ());
		System.out.println("NET: "+this.calculateNetSalary ());
	}
}
