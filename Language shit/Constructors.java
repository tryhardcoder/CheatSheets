





// A constructor is a special function that runs when you make a new instance of a class

class Robot() {

    Spark motor;

    // It's defined like so,
    // A function with a missing return type, named the same as the class
    Robot() {
        motor = new Spark(0);
    }
}


// Whenever an instance of this robot class is created, the constructor runs.
// This one initalizes a motor.









// Constructors can also have different parameters, just like other functions

// A "default constructor"
Robot() {
    motor = new Spark(0);
}

// A different one
Robot(int port) {
    motor = new Spark(port);
}

// Which one is called depends on how many arguments are given

// uses default constructor
Robot badRobot = new Robot();

// uses new constructor
Robot differentRobot = new Robot(3);
