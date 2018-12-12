## Language Fundamentals 
Lexical Tokenshhhhhhhhhh8hhh9h
### Identifiers 
 Identifiers are names for variables, methods, classes, or parameters. 
 Identifiers can have alphanumerical characters, underscores and dollar signs ($). 
It is an error to begin a variable name with a number. White space in names is not permitted.
Identifiers are case sensitive. 

### Keywords
reserved words (we cant use them as class names, variable anmes , method names)
abstract        continue        for             new             switch 
assert          default         goto            package         synchronized
boolean         do              if              private         this
break           double          implements      protected       throw
byte            else            import          public          throws
case            enum            instanceof      return          transient
catch           extends         int             short           try
char            final           interface       static          void
class           finally         long            strictfp        volatile
const           float           native          super           while

### Seperators 
 A separator is a sequence of one or more characters used to specify the boundary between separate, independent regions in plain text or other data stream.

[ ]   ( )   { }   ,   ;   .   "


### Literals 
A literal is a textual representation of a particular value of a type. Literal types include boolean, integer, floating point, string, null, or character. Technically, a literal will be assigned a value at compile time, while a variable will be assigned at runtime.

int age = 24; 
String nationality = "Zimbabwean";

Here we assign two literals to variables. 
Number 24 and string "Zimbabwean" are literals. 
	Integer  (int)
	Floating Point (float)
	Boolean (bool)
	Characters (char)

### Whitespaces 
 White space in Java is used to separate tokens in the source file. It is also used to improve readability of the source code.
int i = 0;
White spaces are required in some places. For example between the int keyword and the variable name. In other places, white spaces are forbidden. They cannot be present in variable identifiers or language keywords.
int a=1;
int b = 2;
int c  =  3;
The amount of space put between tokens is irrelevant for the Java compiler. The white space should be used consistently in Java source code. 

### Comments  
// comment				Single-line comments
/* comment */			Multi-line comments
/** documentation */	Documentation comments


### Conventions 
 Conventions are best practices followed by programmers when writing source code. 
 Each language can have its own set of conventions. 
 Conventions are not strict rules; they are merely recommendations for writing good quality code. 

    1. Class names begin with an uppercase letter.
    2. Method names begin with a lowercase letter.
    3. Use camel casing (Each subsequent word in an identifier name begins with a capital letter.)
    4. The parameter name of the main() method is called args.
    5. Constants are written in uppercase.
    
Arrays
An array is a group of like-typed variables that are referred to by a common name. 
Declaring
type var-name[];
OR
type[] var-name;

Object[]  ao,        // array of Object
Collection[] ca;  // array of Collection

Instantiating 
//Declare and initialise at once 
int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 

//alocating memory
var-name = new type [size]; //this assigns size to the array 

// initialize the first elements of the array 
      arr[0] = 10; 
          
      // initialize the second elements of the array 
      arr[1] = 20; 
          
      //so on... 
      arr[2] = 30; 
      arr[3] = 40; 
      arr[4] = 50; 

Accesing all items 
for (int i = 0; i < arr.length; i++){
  System.out.println(arr[i]);
 }

	Searching 
	Constructing 
	USing an array
	Anonymous Array 
	MD Array 
	SOrting 
	Searching 

Multi dimensional Arrays 
int[][] intArray = new int[10][20]; //a 2D array or matrix
int arr[][] = { {2,7,9},{3,6,1},{7,4,2} }; 
  

int[][][] intArray = new int[10][20][10]; //a 3D array

Enumerated Types
Enumerations serve the purpose of representing a group of named constants in a programming language. 
For example the 4 suits in a deck of playing cards may be 4 enumerators named Club, Diamond, Heart, and Spade, belonging to an enumerated type named Suit. 
Other examples include natural enumerated types (like the planets, days of the week, colors, directions, etc.). 

declaring 
Enum declaration can be done outside a Class or inside a Class but not inside a Method. 

public class Test 
{ 
    enum Color 
    { 
        RED, GREEN, BLUE;  //CONSTANTS SHOULD BE ALL CAPS 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        Color c1 = Color.RED; 
        System.out.println(c1); 
    } 
}