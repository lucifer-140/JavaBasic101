package Java_Constructors;



public class Human {

	String name;
	int age;
	double weight;
	
	Human(String name,int age,double weight){
		
        //example: from Main file, human1 object, 'this' name will be = name
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	void eat() {
		System.out.println(this.name+" is eating");
	}
	void drink() {
		System.out.println(this.name+" is drinking *burp*");
	}
		
}