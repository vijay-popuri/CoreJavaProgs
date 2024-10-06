package Oops;

class Student {
	private int rno;
	private String name;

	void setRno(int rno) {
		this.rno = rno;
	}

	void setName(String name) {
		this.name = name;
	}

	int getRno() {
		return rno;
	}

	String getName() {
		return name;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		Student st = new Student();
		st.setRno(1);
		st.setName("Vijay");
		st.setRno(2);
		st.setName("Raju");
		int rno = st.getRno();
		String name = st.getName();
		System.out.println("Roll no is " + rno);
		System.out.println("The name of the Student is " + name);// it prints the second object since win the object
																	// variable these are stores

	}

}
