package com.customer.app;

import java.util.Scanner;

import com.lti.model.Bidders;

public class TestBid {
	public static Bidders bid;
	static BidDaoImpl biddao=new BidDaoImpl();
	
public static void addDetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Farmer Id: ");
	int f_id =sc.nextInt();
	System.out.println("Enter Bid Price: ");
	double amount =sc.nextDouble();
	System.out.println("Enter Quantity: ");
	int qty =sc.nextInt();
	bid=new Bidders(f_id,amount,qty);
}
public static void main(String args[])
{
	Scanner sc1=new Scanner(System.in);
	int n=1;
	while (n>=1&&n<=6)
	{
	System.out.println("What do you want to do?");
	System.out.println("1.Add Bid   2.Delete Bid   3.Update Bid   4.List by Id   5.List All Bids   6.Exit");
	 n= sc1.nextInt();
	switch(n)
	{
	case 1 : addDetails();
					biddao.addBid(bid);
					break;
	case 2 : System.out.println("Enter Bid Id to Delete:");
					int m=sc1.nextInt();
					biddao.deleteBid(m);
					break;			
	case 3 : System.out.println("Enter Bid Id to Update:");
					int b_id=sc1.nextInt();
					addDetails();
					biddao.updateBid(bid,b_id);
					break;
	case 4 : addDetails();
					biddao.ListById();
					break;
	case 5 : addDetails();
					biddao.ListAllBids();
					break;		
	case 6: System.exit(0);		
					
	default: System.out.println("Invalid Choice!!");
	}
}
}
}
