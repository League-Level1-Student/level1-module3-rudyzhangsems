package _01_intro_to_static;

public class Atletet {
	static int nextBibNumber;
    static String raceLocation = "New York";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Atletet (String name, int speed){
        this.name = name;
        this.speed = speed;
    }

    public static void main(String[] args) {
        //create two athletes
        //print their names, bibNumbers, and the location of their race. 
    	new Atletet ("Bob", 10);
    	new Atletet ("Bobo", 20);
    }

}
