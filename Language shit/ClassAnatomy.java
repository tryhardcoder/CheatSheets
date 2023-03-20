







public class Thingy {

    // Note that code cannot be put inside of the "class scope"
    // If you want code to run when an object is created, it should go in the constructor
    // You could also make a static "init" function that does what you want

    // instance variables
    public int x = 0;
    public int y = 9;
    public int z = 2034879563012954786123054876312;


    // constructor, runs when you type "new Thingy();"
    public Thingy() {
        // do something :)
    }


    // "Member functions"
    public int getXPlusY() {
        return this.x + this.y;
    }

    public void toString() { } // A standard java function used to convert an instance of your class to a str


    // "Static functions"
    // static functions can't access instance variables, because they aren't associated with one instance
    // They are able to reference any other variables or functions marked as "static" though
    public static void logX() {
        System.out.println("X");
    }


}