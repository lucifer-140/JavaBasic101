package Java_Random_Number;

// random.nextInt()
// random.nextDouble()
// random.nextBoolean()

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int x = random.nextInt(6)+1; 
        // +1 to generate random number from 1 to 6, since it start from 0, then without +1 it will be 0 to 5
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

    }
}