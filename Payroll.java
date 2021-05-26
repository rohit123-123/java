package day4;

import java.util.Scanner;

/*3:Consider that payroll software needs to be developed for computerization of
operations of an ABC organization. The organization has employees.
3.1. Construct a class Employee with following members using private access
specifies:
 Employee Id integer
 Employee Name string
 Basic Salary double
 HRA double
 Medical double
 PF double
PT double
 Net Salary double
 Gross Salary double
Please use following expressions for calculations:
 * HRA = 50% of Basic Salary
* PF = 12% of Basic Salary
* PT = Rs. 200

3.2. Write methods to display the details of an employee and calculate the gross
and net salary.
* Goss Salary = Basic Salary + HRA + Medical
* Net Salary = Gross Salary – (PT + PF)

Create a TestEmployee Class.Create Object of employee class and assign values and display Details.
*/
public class Payroll {

	private int id;
	private String name;
	private double basicSal;
	private double hra;
	private double pf;
	private double pt;
	private double totalSal;
	private double grossSal;

	public void accept()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the id");
			 this.id = s.nextInt();
			System.out.println("enter the name");
			 this.name = s.next();
			System.out.println("enter the basic salary");
			 this.basicSal =s.nextDouble();
	System.out.println("ENTER THE HRA");		
	this.hra=s.nextDouble(); 
	System.out.println("enter pf");
	this.pf =s.nextDouble();
	System.out.println("pf is"+pf);
	
	}
	
	
	public void display()
{
	System.out.println("id"+this.id);
	System.out.println("name"+ this.name);
	System.out.println("basicsla"+ this.basicSal);
	System.out.println("hra"+ this.hra);
	System.out.println("pf"+this.pf);
	
 this.grossSal =this.basicSal +this.hra;
this.totalSal = this.grossSal -(this.pf+this.pt);
System.out.println("gross is" + this.grossSal);
System.out.println("net slary is"+ this.totalSal);
}	


}

