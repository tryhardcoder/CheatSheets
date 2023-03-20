






// Variable definition
/*type*/ /*name*/ = /*value*/;
int x = 30;





// Function definition
/* return type */ /* name */ (/* parameter definitions */) {
    // code
    return // result (optional if return type is void)
}

void logX(String x) {
    System.out.println(x);
}




// if statement
if(x) {
    // some code
}




// for loop
for(/* variable def */; /* stop condition */; /*what to do to the counter at the end*/) {
    // some code
}

for(int i = 0; i < 10; i++) {
    System.out.println("Hi from I");
}

// runs once for every object in the collection "l"
// "x" is a reference to that object
for(Obj x : l) {

}








// A basic file
package frc.robot; // filepath, ish, try looking at files in the same folder and copying the header


public class Thingy {
    // everything in your class
}

// only one class is allowed per file*
// and it needs to have the same name as the file, case sensitive, without the .java















// BASE TYPES

int x = 4;
// Int, short for integer, stores whole numbers

float y = 3.3;
// float, short for "floating point number", stores numbers with
// decimals

double z = 4.452348756;
// double, short for "double precision float"
// a float that's more precise


boolean t = true;
boolean f = false;
// I have no idea why booleans are called what they are
// But they store true/false values



String s = "Hello bitches";
// Note the uppercase "S" in "String"
// Stores a series of characters.
// Not really considered an object.
// If you want to compare it though, make sure to use ".equals()" instead of "=="





// ARITHMATIC OPS
// work on numbers
x * x; // multiply
x + x; // add
x - x; // subtract
x / x; // divide, if both are integers, this will return an int and chop off the decimal

x *= x; // assign the value of x * x back into x
// any math operator followed by an = does the same thing

x++; // x = x + 1;
x--; // x = x - 1;



// BOOLEAN OPS

x == y; // do "x" and "y" contain the same value? True/False
x != y; // do "x" and "y" not the same value? True/False
x < y; // is "x" less than "y"
x > y; // is "x" greater than "y"
x <= y; // is "x" less than or equal to "y" // works with >= too

// boolean only
!x      // opposite of the value in "x"
x && y // if x and y both equal true, the expression is true
x || y // if x or y equals true, the exp is true



// single line comment
/*
    multiline comment
    =seruighsleriguhserliguehsrgl;eurhgerui;ghae
*/