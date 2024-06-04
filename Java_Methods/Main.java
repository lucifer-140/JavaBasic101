package Java_Methods;

public class Main {

	public static void main(String[] args) {
		
		// method = a block of code that is executed whenever it is called upon
		
		int x = 3;
		int y = 4;
		
		int z = add(x,y);

		System.out.println(z);
	}
	
    // the method to return a value, you can use a primitive data type (such as int, char, etc.)
    // void means that this method does not have a return value.
    // so int this case use "int" as we need to return a value.
	// bellow has a method that take int called x as "parameter"
	static int add(int x, int y) {
		
		int z = x + y;
		return z;
		
	}
	
}