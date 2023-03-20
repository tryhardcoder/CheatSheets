



// FUNCTIONS






// The "definition" of a function looks like this:

int random(int x) {
    x += 34;
    x /= 4;

    if(x == 0) { return 0; }
    return x / -x;
    //// The code inside could be literally anything
}

// Functions are pieces of code.
// They can take in and operate on "Parameters" or "Arguments" (fancy words for the same thing)
// They can also "return" a value

//// Functions kinda have the same anatomy as variables! Type then name then value!

// Note the "return type" of this function is an integer.
// If your function doesn't return anything, then the return type is "void"
//// Variables can't have a type of "void" because that would mean they don't store anything.

// The second part of the definition is the name, how your piece of code is referred to.
// This function's name is "random"

// Inside of the parenthesis, there is a definition of a variable.
// Parameters can be assigned to and read from just like normal variables.
// A function taking multiple parameters looks like this:
int add(int x, int y) {
    x = (y + x) + 20;
    return x + y;
    //// this code is literally random, typical functions do something useful
}

// Each parameter looks like the definition of a variable, but with no value
// These values are set by the person "calling" the function
// ("calling" just means running the code inside of the func.)
// Calling a function looks like this:
add(20, 3);
// When the function is run, the parameter "x" is set to 20, and the parameter "y" is set to the value 20.




// Because the "add" function returns a value (which is an int),
// any variable that is an integer can be set to that value.
int t = 4;
int s = add(t, 30);
// The "x" parameter of the function is set to the value inside of "t", which is 4
// The "y" parameter is set to 30
// s is then set to the value returned from the "add" function







//// EXTRA:

add(add(t, t), 4);
// This piece of code is also valid.
// The inner "add" function is called first, and the return value from that is used as
//    the value for the first parameter of the outer "add" call.

// It's equivelent to doing this:
int x = add(t, t);
add(x, 4);

//// Putting things inside of each other like this is called "nesting", and it isn't just for functions!




