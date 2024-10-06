package Oops;
abstract class Adition{
	abstract void add(int a,int b);
	void mul(int a,int b) {
		System.out.println("multiplication is "+(a*b));
	}
}
class TakeAdition extends Adition{
	void add(int a,int b) {
		System.out.println("The adition is "+(a+b));
	}
}


public class AbstractionDemo
{

	public static void main(String[] args) 
	{
		Adition ta=new TakeAdition();//polymorphism
		ta.add(10, 20);
		ta.mul(10, 10);

	}

}
