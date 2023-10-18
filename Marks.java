package codesoft.com.intern;

import java.util.Scanner;

import javax.security.auth.Subject;

public class Marks 
{
	public static void main(String[] args)
	{
		
		Scanner scan =new Scanner (System.in);
		
			
		
    System.out.println("Enter marks subject-wise out of 100..");
    System.out.println("enter marks in 1st Subject...");
    int sub1=scan.nextInt();
    
    
    System.out.println("enter marks in 2nd subject...");
    int sub2=scan.nextInt();
    System.out.println("enter marks in 3rd subject...");
    int sub3=scan.nextInt();
    System.out.println("enter marks in 4th subject..");
    int sub4=scan.nextInt();
    System.out.println("enter marks in 5th subject...");
    int sub5=scan.nextInt();
    System.out.println("enter marks in 6th subject....");
    int sub6=scan.nextInt();
    
      int sumofmarks=sub1+sub2+sub3+sub4+sub5+sub6;
     
      double avarage_persantage=sumofmarks/6;
      System.out.println("display results........");
        if(avarage_persantage>=90)
        {
        	System.out.println("secured A grade ");
        }
        else if(avarage_persantage>=80&&avarage_persantage<=89)
        {
        	System.out.println("secured B grade ");
        }
        else if(avarage_persantage>=70&&avarage_persantage<=79)
        {
        	System.out.println("secured C grade ");
        }
        else if (avarage_persantage>=60&&avarage_persantage<=69)
        {
        	System.out.println("secured D grade");
        }
        else if(avarage_persantage>=50&avarage_persantage<=59)
        {
        	System.out.println("secured E grade ");
        }
        else
        {
        	System.out.println("Fail");
        }
        System.out.println("sum of marks: "+sumofmarks);
        System.out.println("avarage_persantage: "+avarage_persantage);
      
      
		
	}
	
}
