






// This is an "if" statement:

if(/* some boolean expression */) {
    // some code to run
}

// If statements, a little like functions, take in a boolean
// if the value of that expression is "false", it will skip the code inside of the curly braces.
// it that value is "true", then that code will run


int x = 0;
int res = 0;
if(x == 0) { res = 1; }
else { res = 0; }
// Note the double equals:
// It is used for "comparison" instead of "assignment".
// the value of (x == 0) is true if "x" has the value of 0, false otherwise
// if(x = 0) ... would set the variable "x" to the value 0, and then
// who knows what the if statement would do, it hasn't been given a boolean


if(true) {
    join_kms(); }
// this code will always run, because the value of "true" will never change




// you can also give if statements the return value of a function
if(shouldTheRobotStop()) {
    stopTheRobot();
}



// or an expression
if(!(x || y) && r == 0) {
    // I have no idea when this would run
    cry();
}


