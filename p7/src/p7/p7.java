package p7;

public class p7
{
	public static void main(String[] args)
	{
	Car car1 ;
	car1 =new Car();
	
	car1.num =1234;
	car1.gas =20.5;
	
	Car car2 =new Car();
	car2.num =2345;
	car2.gas =30.5;
	
	System.out.println("ca1車號是"+ car1.num);
	System.out.println("ca1汽油量是"+ car1.gas);
	
	System.out.println("ca2車號是"+ car2.num);
	System.out.println("ca2汽油量是"+ car2.gas);
	}
}

//Car類別
class Car
{
	int num;
	double gas;
}