package package1;
import package2.*;

public class A {
    
    //*******************************************
    // public: visible in all classes in all packages
    // protected: visible to all classes in the same package or classes in other packages that are a subclass
    // default: visible to all classes in the same package 
    // private: visible only in the same class
    //*******************************************

    protected String protectedMessage = "This is protected";

    public static void main(String[] args) {
        
        C c = new C();

        // System.out.println(c.defaultMessage);
        System.out.println(c.publicMessage);

        // B b = new B();
        // System.out.println(b.privateMessage);
    }

}
