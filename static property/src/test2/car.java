package test2;

public class car {
    private String name;

    private String engine;

    public static int numberOfCars = 0;


    public car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }


    // getters and setters

}
