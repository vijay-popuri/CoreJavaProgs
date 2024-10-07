package basicprogs;

public class Exceptions {

	public static void main(String[] args) 
	{
		try {
			int a=10/0;
		}
		catch(Exception e){
			System.out.println("Exception occurs please check...");
		}

	}

}
