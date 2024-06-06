package Java_Pass_Objects;


public class Main {

	public static void main(String[] args) {
			
		Garage garage = new Garage();
		
		Car car1 = new Car("BMW");
		Car car2 = new Car("Tesla");
		
		garage.park(car1);
		garage.park(car2);
		
	}
}



//If using nested class use the code bellow

// public class Main {

//     public static void main(String[] args) {
//         Garage garage = new Garage();
//         Car car1 = new Car("BMW");
//         Car car2 = new Car("Tesla");
//         garage.park(car1);
//         garage.park(car2);
//     }

//     // Garage class nested within Main
//     static class Garage {
//         void park(Car car) {
//             System.out.println("The " + car.name + " is parked in the garage.");
//         }
//     }

//     // Car class nested within Main
//     static class Car {
//         String name;
//         Car(String name) {
//             this.name = name;
//         }
//     }
// }