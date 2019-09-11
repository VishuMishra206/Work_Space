package Menu_driven;

import java.util.Scanner;
public class Menu {
	static double b,a,e,st,Rate;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO MENU DRIVEN");
		System.out.println();
		
		while(true)
		{
			System.out.println("ORDER SNACKS, ENTER 1");
			System.out.println("ORDER LUNCH, ENTER 2");
			System.out.println("ORDER CHAAT,ENTER 3");
			System.out.println("ORDER JUICES/TEA, ENTER 4");
			System.out.println("TO EXIT, ENTER 5");
			System.out.println();
			
			
			System.out.println("Enter your choice : ");
			int choice=sc.nextInt();
			snacks s=new snacks();
			lunch l=new lunch();
			chaat c=new chaat();
			juice j=new juice();
			//System.out.println("Enter The Quantity");
		    //int quantity=sc.nextInt();
			
		    
			switch(choice)
			{
			
			case 1: System.out.println("WELCOME TO THE SNACKS AREA");
			        s.snacks();
			        System.out.println("Enter The Quantity");
				    int quantity=sc.nextInt();
			        double Rate=20;
                    e= quantity*Rate;
                    System.out.println("Choice:"+a+"\t\tQuantity:"+quantity);
                    System.out.println("Name:"+st+"\t\tRate:Rs"+Rate);
                    System.out.println("\t\tTotal price:Rs"+e);
                    break;
			        
			       
			case 2: System.out.println("WELCOME TO THE LUNCH AREA");
			        l.lunch();
			        System.out.println("Enter The Quantity");
				    int quan=sc.nextInt();
			        double rate=50;
                    e= quan*rate;
                    System.out.println("Choice:"+a+"\t\tQuantity:"+quan);
                    System.out.println("Name:"+st+"\t\tRate:Rs"+rate);
                    System.out.println("\t\tTotal price:Rs"+e);
			        break;
			        
			case 3: System.out.println("WELCOME TO THE CHAAT AREA");
			        c.chaat();
			        System.out.println("Enter The Quantity");
				    int qu=sc.nextInt();
			        double rat=30;
                    e= qu*rat;
                    System.out.println("Choice:"+a+"\t\tQuantity:"+qu);
                    System.out.println("Name:"+st+"\t\tRate:Rs"+rat);
                    System.out.println("\t\tTotal price:Rs"+e);
			        break;
			case 4: System.out.println("WELCOME TO THE JUICE AREA");
			        j.juice();
			        System.out.println("Enter The Quantity");
				    int quanti=sc.nextInt();
			        double Rates=35;
                    e= quanti*Rates;
                    System.out.println("Choice:"+a+"\t\tQuantity:"+quanti);
                    System.out.println("Name:"+st+"\t\tRate:Rs"+Rates);
                    System.out.println("\t\tTotal price:Rs"+e);
			        break;
			case 5: System.out.println("THANKS FOR THE ORDER !!!!!!!!");        
			        System.exit(0);
			        break;
			default: System.out.println("Incorrect ORDER....Please order again from MENU !!! ");        
			
			
			}
			
		}
		

	}
	
	
	
	/*public static void snacks()
	{
		System.out.println("You get:");
		System.out.println("chips : 2 Pack:");
		//System.out.println("cold_drink : 1 Bottle:");
		//System.out.println("waffers : 2 Pack:");
		
	}
	
	public static void lunch()
	{
		System.out.println("You get:");
		System.out.println("Daal_Makhani : 1 bowl:");
		//System.out.println("Butter Cheese Dosa : 1 Pieces:");
		//System.out.println("Special Plate : 1 Plate:");
		
	}

	public static void chaat()
	{
		System.out.println("You get:");
		System.out.println("Chatt Papdi : 2 Pieces:");
		//System.out.println("Aloo Chaat : 2 Pieces:");
		//System.out.println("Rajasthani Chaat: 2 Pieces:");
		
	}
	
	public static void juice()
	{
		System.out.println("You get:");
		System.out.println("Orange : 1 Glass:");
		//System.out.println("Banana : 1 Glass:");
		//System.out.println("Pine_Apple : 1 Glass:");
		
	}*/
}
