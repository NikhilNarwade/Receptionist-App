package com.Hospital;

public class HospitalApplication
{
	public static void main(String[] args) 
	{
		
		Hospital h = new Hospital();
		for(;;)
		{
			System.out.println("----------------------------");
			System.out.println("Add Your Patient token here");
			System.out.println("----------------------------");
			System.out.println("1.Add Token 2.Remove Token 3.List 4.Bill");
			System.out.println("-----------------------------------------");
		   switch(h.sc.nextInt())
		   {
		   case 1:
		   {
			   h.addToken();
		   }
		   break;
		   case 2:
		   {
			   h.removeToken();
		   }
		   break;
		   case 3:
		   {
			   h.listOfPatient();
		   }
		   break;
		   case 4:
		   {
			   h.bill();
		   }
		   break;
		   case 5:
		   {
			   System.exit(1);
		   }
		   break;
		   }
		}
		
	}

}
