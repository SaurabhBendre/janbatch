package basicPack;

public class ConstProgam3 {

	int empID;
	String empName;
	int empSalary;
	String companyName;
	char empBand;
	
	//1st emp
	public ConstProgam3()
	{
		empID = 101;
		empName = "Rahul";
		empSalary = 50000;
		companyName = "velocity";
		empBand = 'A';	
	}
	
	public ConstProgam3(int a)
	{
		empID = 102;
		empName = "Akshay";
		empSalary = 55000;
		companyName = "velocity";
		empBand = 'B';	
	}
	
	
	//public ConstProgam3(int empID, String empName,int empSalary,String companyName,char empBand)
	//{
	//	empID = empID;
	//	empName = empName;
		//empSalary = empSalary;
	//	companyName = companyName;
	//	empBand = empBand;		
	//}
	
	public ConstProgam3(String a, int b)
	{
		empID = 103;
		empName = "Himanshu";
		empSalary = 60000;
		companyName = "velocity";
		empBand = 'C';		
	}
	
	public void printEmpData()
	{
		System.out.println("empId is-"+empID+" EmpName is- "+empName+
		           " empSalary is- "+empSalary+" companyName is- "
		           +companyName+" empBand is- "+empBand);
	}
	
	public static void main(String[] args) 
	{

		//second scenario
		//first emp
		ConstProgam3 p1 = new ConstProgam3();
		p1.printEmpData();
		
		//second emp
		ConstProgam3 p2 = new ConstProgam3(30);
		p2.printEmpData();
		
		//third emp
		ConstProgam3 p3 = new ConstProgam3("Hii",5);
		p3.printEmpData();
			
	}

}
	


