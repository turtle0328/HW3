package p15;

public class p15 {
	public static void main(String[] args)
	{
		Car car1 =new Car();
		
		int num =1234;
		double gas =20.5;
		
		car1.setNumGas(num,gas);
	}
}

class Car
{
	int num;
	double gas;
	
	void setNumGas(int n ,double g)
	{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+",�T�o�q�]��"+gas);
	}
	
	void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
}