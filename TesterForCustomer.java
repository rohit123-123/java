package day4;

import java.util.Scanner;

public class TesterForCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in);
		
 Customer ob = new Customer();
 ob.acceptInfo();
ob.showDetail();
 	
	
 Customer ob1 = new Customer();
 ob1.acceptInfo();
ob1.showDetail();
 System.out.println("CHange  the creditlimit");
 double cl1 = sc.nextDouble();
 ob1.setCreditLimit(cl1);	
 cl1=ob1.getCreditLimit();
	
	System.out.println("changed creditLimit is"  + cl1);
	}

}
