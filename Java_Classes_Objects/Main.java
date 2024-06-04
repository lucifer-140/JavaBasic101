package Java_Classes_Objects;

public class Main {

    //object = an instance of a class that may contain attributes and methods


	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		// Car myCar2 = new Car();

		System.out.println(myCar1.make);
		System.out.println(myCar1.model);

		myCar1.drive();
		myCar1.brake();

        
	}
}