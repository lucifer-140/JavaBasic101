package Java_Keyword_this;

class Main {

    int age;
    Main(int age){
        this.age = age;
    }

    public static void main(String[] args) {
        Main obj = new Main(8);
        System.out.println("obj.age = " + obj.age);
    }
}

//   created an object named obj of the class Main
//   Main obj = new Main(8);    ---> constructor

//   when the constructor is called, 'this' inside 
//   the constructor is replaced by the object obj 
//   that has called the constructor

//   then print the reference to the object "obj" and "this" keyword of the class.


//   using 'this' keyword to assgin value to the object