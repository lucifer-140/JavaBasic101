package Java_CopyObjects;

public class Main {

	public static void main(String[] args) {
		
		//  Concept: copy car1 value to car2
		//  how?
		//  THIS IS WRONG -->  car2 = car1  
		//               ---> this will not change the value, but the address of the object
		//


		
		Car car1 = new Car("Chevrolet","Camaro",2021);
		
		Car car2 = new Car("Ford","Mustang",2022);
		car2.copy(car1);
		Car car3 = new Car(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());		
		System.out.println();
		System.out.println(car3.getMake());
		System.out.println(car3.getModel());
		System.out.println(car3.getYear());		
	
	}
}