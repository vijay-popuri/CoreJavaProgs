package Oops;
class A{
	void disp() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
}

class B extends A{//if you try to change the return type of the method then it will show the error.
	void  disp() {
		int a=30;
		int b=70;
		System.out.println(a+b);
	}
}
public class ChangeReturnTypeForInheritedMethod {

	public static void main(String[] args) 
	{
		

	}

}
