package com.Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hospital
{
	
	Scanner sc=new Scanner(System.in);
	List l=new ArrayList();
	Doctor d=new Doctor();
	public void addToken()
	{
		int c1=1,c2=2,c3=3,c4=4,c5=5;
		int tokenno=l.size()+1;
		System.out.print("Enter name = ");
		String name=sc.next();
		System.out.print("Enter cno = ");
		long cno=sc.nextLong();
		System.out.print("Etner address = ");
		String address=sc.next();
		System.out.println("-------------------------------------------------------");
		System.out.println("If You have following Symptoms Press respective number");
		System.out.println("--------------------------------------------------------");
		System.out.println("1.(Normal fever or Weakness, Headache, Cold)");
		System.out.println("2.(Chills,fatigue,fever,night swets,shivering or sweting,Vomiting)");
		System.out.println("3.(Excessive thirst or Uranation,fatigue,weight loss or blurred vision)");
		System.out.println("4.(Headache,Shortness of braeth,Noseleeds)");
		System.out.println("5.(Yellow ting to the skin,membrance,and the whites of the eyes;pale stools;dark urine,itchiness)");
		switch(sc.nextInt())
		{
		case 1:System.out.println("For above symptoms we have Dr.K.K.Mehta please visit them in cabin : "+c1);break;
		case 2:System.out.println("For above symptoms we have Dr.A.R.Khede please visit them in cabin : "+c2);break;
		case 3:System.out.println("For above symptoms we have Dr.H.S.Nene please visit them in cabin : "+c3);break;
		case 4:System.out.println("For above symptoms we have Dr.J.K.Kale please visit them in cabin : "+c4);break;
		case 5:System.out.println("For above symptoms we have Dr.N.S.Wadiya please visit them in cabin : "+c5);break;
		}
		
		
		
		Patient p=new Patient(tokenno,name,cno,address);
		if(l.add(p) && tokenno<=50)
		{
			System.out.println("<<<<<Pateint is Added>>>>>");
		}
		else
		{
			System.err.println("Pateint is -NOT- Added");
		}
	}
	public void removeToken()
	{
		System.out.print("Enter token no = ");
		int token=sc.nextInt();
		int index=0;
		for(int i=0;i<l.size();i++)
		{
	    	Patient p=	(Patient)l.get(i);
		  if(p.token==token)
		  {
			  l.remove(p);
			  index=i;
			  System.out.println("Pateint token cancelled");
			  dec(index);
			  return;
		  }
		
		}
		System.err.println("Token number is not existing");
		removeToken();
	}
	public void listOfPatient()
	{
		System.out.print("Enter username = ");
		String name=sc.next();
		System.out.print("Enter pswd = ");
		int pswd=sc.nextInt();
		if(name.equals(d.name1) || name.equals(d.name2) || name.equals(d.name3) || name.equals(d.name4) || name.equals(d.name5) )
		{
			if(pswd==d.pswd1 || pswd==d.pswd2 || pswd==d.pswd3 || pswd==d.pswd4 || pswd==d.pswd5)
			{
				for(int i=0;i<l.size();i++)
				{
					Patient p=(Patient)l.get(i);
					list();
					System.out.print("Enter amount how much they must pay : ");
					p.money=sc.nextDouble();
					System.out.println("Have a great health !");
				}
				
			}
			else
			{
				System.err.println("Incorrect Password");
			}
		}
		else
		{
			System.err.println("Username is wrong");
		}
		
		 
		
	}
	public void bill()
	{
		System.out.print("Enter token number = ");
		int tokenno=sc.nextInt();
		for(int i=0;i<l.size();i++)
		{
			Patient p=(Patient)l.get(i);
			if(tokenno==p.token)
			{
				System.out.println("Total bill you have to paid is : "+ p.money+ " RS");
				System.out.print("Enter amount here : ");
				double bal=sc.nextDouble();
				if(bal>=p.money)
				{
					System.out.println("please collect bal : "+(bal-p.money)+" RS");
					System.out.println("Have a great health !");
					p.money=0;
					return;
					
				}
				else				
				{
					if(bal<=p.money)
					{
						System.out.println("you have to pay : " + (p.money-bal));
						System.out.println("1.pay now 2.paylater");
						int choice=sc.nextInt();
						if(choice==1)
							bill();
						else if(choice==2)
							System.out.print("Plase enter how much time you need to arrange money in sec : ");
						    int time = sc.nextInt(); 
						    try 
						    {
								Thread.sleep(5000);
							} 
						    catch (InterruptedException e) 
						    {
							
								e.printStackTrace();
							}
						    bill();
						return;
					}
				
				}
			}
		}
		System.out.println("Token no is not existing");
	}
	public void dec(int index)
	{
		for(int i=index;i<l.size();i++)
		{
			Patient p =	(Patient)l.get(i);
			p.token--;
		}
		
	}
	public void list()
	{
		for(int i=0;i<l.size();i++)
		{
			Patient p =	(Patient)l.get(i);
	
			System.out.println(p);
			
		}
	}
	


}