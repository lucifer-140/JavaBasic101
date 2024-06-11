package Java_enum;


// enum Planet{
//     MERCURY,VENUS,EARTH,MARS,JUPITER;
// }

enum Planet{
    MERCURY(1),
	VENUS(2),
	EARTH(3),
    MARS(4),
    JUPITER(5);

    int number;

    Planet(int number){
        this.number = number;
    }
}

public class Main {
    public static void main(String[] args) {
        
        //enum = enumerated (ordered listing of items in a collection)
        //grouping of constants that behave similarly to objects

        Planet myPlanet = Planet.EARTH;

        canILiveHere(myPlanet);

    }

    static void canILiveHere(Planet myPlanet){
        switch (myPlanet) {
            case EARTH:
                System.out.println("You can live here");
                System.out.println("This is planet #"+myPlanet.number);
                break;
        
            default:
                System.out.println("You cant live here...yet");
                System.out.println("This is planet #"+myPlanet.number);
                break;
        }
    }
}
