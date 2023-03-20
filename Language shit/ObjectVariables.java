









// Some variables are "objects", not basic types
Robot r = new Robot();
V2d pos = new V2d();
String s = "Hello bitches!";



// The type of an object is a class, heres roughly what the definition of one looks like
//// check the classAnatomy file for more about what they look like

public class Point {
    double x = 0;
    double y = 0;
}


// A class defines what an object of that type is.
Point p = new Point();

// A class defines what an object is made of
// An instance" is one of those objects

// for example, an "instance" of a V2d would have an "x" property and a "y" property.
//  these properties can be used just like regular variables, but need to be referenced like so:
p.x = 4;
p.y = 10;
/*name of object*/./*name of prop.*/

// I can create a shitload of "Point" variables, and they will all have different X's and Y's








// Classes can have functions built into them
// This means that any object of that type can "do" something
// Instances of this "server" class can send messages
public class Server {

    public int ip;

    public void sendMessage(String m) {
        System.out.println("Message send on IP " + this.ip + ", " + m);
    }
}

Server s = new Server();
s.ip = 8080;

// "Member functions" are referenced in the same way instance variables are
//// A member function is just a function that is a "member" of a class
/*name*/./*function*/();
s.sendMessage("Hello earthlings!");



