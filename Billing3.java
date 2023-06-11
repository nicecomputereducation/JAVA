import java.util.*;
class Billing 
{
	void printBill()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Price:");
		float price=sc.nextFloat();
		System.out.print("Quantity:");
		int qty=sc.nextInt();
		float bill=price*qty;
		System.out.println("Bill:"+bill);
	}
	static{
		new Billing().printBill();
	}
}
