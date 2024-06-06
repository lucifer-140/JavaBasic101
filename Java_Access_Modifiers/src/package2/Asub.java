package package2;

import package1.*;
// above is import evrything in package1
// import package1.A;

public class Asub extends A{
    public static void main(String[] args) {
        
        Asub asub = new Asub();
        System.out.println(asub.protectedMessage);

        C c = new C();
        System.out.println(c.defaultMessage);
        System.out.println(c.publicMessage);
    }
}
