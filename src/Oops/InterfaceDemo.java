package Oops;
interface Logical
{
	void max(int a,int b,int c);
}
interface Arithmetic extends Logical{
	void add(int a,int b,int c);
	void mul(int a,int b,int c);
}
class ImplementationCls implements Arithmetic{
	public void add(int a,int b,int c) {
		System.out.println("Adition is "+(a+b+c));
	}
	public void mul(int a,int b,int c) {
		System.out.println("Multiplication is "+(a*b*c));
	}
	public void max(int a,int b,int c) {
		if(a>b && a>c) {
			System.out.println("A is Big");
		}
		else if(b>a && b>c) {
			System.out.println("B is big");
		}
		else {
			System.out.println("C is big");
		}
	}
}
public class InterfaceDemo {

	public static void main(String[] args)
	{
		ImplementationCls impl=new ImplementationCls();
		impl.add(10,20, 30);
		impl.mul(10, 10, 10);
		impl.max(435, 340, 2340);

	}

}
