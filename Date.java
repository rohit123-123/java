package day4;
//1:Create Date class with  data members day,month,year.
//Write a method to accept all data members.write display function to display date.
import java.util.Scanner;
public class Date {

	private int day;
	private int month;
	private int year;
	
	
   
	
	public void accept()
	{
		Scanner s = new Scanner(System.in);	
		System.out.println("enter the date");
		 day = s.nextInt();
		System.out.println("enter the month"); 
		 month = s.nextInt();
		 System.out.println("enter the year");
		 
		  year = s.nextInt();
	
	
	}
	public void display()
	{
		System.out.println("day is=" + day);
		System.out.println("month is=" + month);
		System.out.println("year is=" + year);
	}
	
	

}
