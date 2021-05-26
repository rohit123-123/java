package day4;

import java.util.Scanner;

/*2:>Create a java applicstion for the following.
 Create a Customer class , with data members (all private : tight encapsulation)
name(String),email(String),age(int), creditLimit(double)

2.1 Write acceptInfo() method to accept customer details:

2.2 Write a method , showDetails to display customer name & credit limit only.

Naming convention : public void setCreditLimit(double limit) {...}
public double getCreditLimit(){...}

2.3 Create a TestCustomer class . Use scanner to accept user i/ps.
Create 2 customers object.
Display customer details of both customers.
Prompt user , for changing creditLimit of the customer2.
Display new credit limit on the console.

*/
public class Customer {

		private String name;
		private String email;
		private int age;
		private double creditLimit;
		
public void acceptInfo()
{
	Scanner s = new Scanner(System.in);
	System.out.println("enter the name");
	name=s.next();
	System.out.println("enter the email");
	email = s.next();
	System.out.println("enter the age");
	age = s.nextInt();
	System.out.println("enter the creditLimit");
	creditLimit = s.nextInt();
	
}

 public void showDetail()
 {
	 System.out.println("customer name is" +this.name);
	 System.out.println("credit limit is" + creditLimit);
 }

 public void setCreditLimit(double creditLimit)   								/* setter have control over the instance variable so its a good 
 																				*so its a good practise to use it.even if we made instance variable
 																				*private we can still have indirect access to it throguh getter and
 																				*setter.
 																				*/
 {
	this.creditLimit = creditLimit;                                             /* this.() is objects creditlimit and creditlimit on right side is
 																			is local variable..*/
 }																			
public double getCreditLimit()
{
	return this.creditLimit;
}

}
