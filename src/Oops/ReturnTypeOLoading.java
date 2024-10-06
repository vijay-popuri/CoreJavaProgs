package Oops;
class Add{
	void add(int a,int b,int c) {
		System.out.println("The adition is "+(a+b+c));
	}
	int add (int a,int b) {//in overrriding it is not possible
		
		return a+b;
	}
}
public class ReturnTypeOLoading {

	public static void main(String[] args)
	{
		
		Add ad=new Add();
		int res=ad.add(5, 9);
		System.out.println(res);
	}

}
