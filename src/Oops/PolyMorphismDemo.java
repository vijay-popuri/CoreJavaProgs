package Oops;

class Car{
	void run() {
		System.out.println("Car is running in the Highway..");
	}
	void dash() {
		System.out.println("car is damaged");
	}
}
class Hyundai extends Car{
	void run() {
		System.out.println("Hyundai is running in the Highway..");
	}
	void dash() {
		System.out.println("Hyundai is damaged");
	}
}

class Safari extends Car{
	void run() {
		System.out.println("Safari is running in the Highway..");
	}
	void dash() {
		System.out.println("Safari is damaged");
	}
}
class Showroom{
	void showCarFunctionaliteis(Car c) {
		c.run();
		c.dash();
	}
}
public class PolyMorphismDemo {

	public static void main(String[] args) {
		Safari sf=new Safari();
		Hyundai hy=new Hyundai();
		Showroom sh=new Showroom();
		sh.showCarFunctionaliteis(sf);
		sh.showCarFunctionaliteis(hy);

	}

}
