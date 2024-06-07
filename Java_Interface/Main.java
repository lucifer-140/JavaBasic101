package Java_Interface;

public class Main {

    // interface = a template that can be applied to a class.
    //             similar to inheritance, but specifies what a class has/must do.
    //             classes can apply more than one interface, inheritance is limited to 1 super
	public static void main(String[] args) {
		
		Fish fish = new Fish();
		
		fish.hunt();
		fish.flee();
				
	}
} 