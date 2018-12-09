## Java Basics
### Classes
a class is a blueprint that defines (the state and behaviour) of a set of objects

Some rules 
    There can only be one public class per source code file
    The name of the public class must match the name of the file
    If the class is part of a package this must be the first line of code
    Import declarations must be between package details and the class declaration
    Import and package statements apply to all classes within the source code file


### Objects
instance of a class

class instantiation
<classname> <objectname> = new <classname>(<inputparemeters>);
	<objectname>.<methodname>(); 			

reference values
	Rectangle box1 = new Rectangle (0, 0, 100, 200); 

object alias
aliasing - using two names on the same object 
Rectangle box1 = new Rectangle (0, 0, 100, 200);
Rectangle box2 = box1; 

As should be clear from this figure, whatever changes are made to box1 also apply to box2. 

As you can tell even from this simple example, code that involves aliasing can get confusing fast, and it can be very difficult to debug. 
PS: In general, aliasing should be avoided or used with care.





### Methods in Java 
see Methods for an example 

### Constructors 
there is only parameterised and default constructors in Java 

### Main Method 

### Instance Members

### Static Members
members which are defined without the STATIC keyword and are Outside any method declaration are Object specific and are known as instance variables. They are called so because their values are instance specific and are not shared among instances.

#### Static Variables (why -- saves memory )
Static variable in Java is variable which belongs to the class and initialized only once at the start of the program 
-so when you run program at start its when the value is initialised and all along its already initialised 
-see staticVariables for an examples 


//the output here will be 
Value of a = 0 
Value of b = 1
Value of a = 0
Value of b = 2

WHy 
-saves memory 

Scenario
Suppose there are 500 students in my college, now all instance data members will get memory each time when the object is created. All students have its unique rollno and name, so instance data member is good in such case. Here, "college" refers to the common property of all objects. If we make it static, this field will get the memory only once.

#### Static Block
** there is a thing called a static block which helps to initialise all static data memStatic variable in Java is variable which belongs to the class and initialized only once at the start of the bers 
public class Demo {
 static int a;
 static int b;
 static {
    a = 10;
    b = 20;
 }


#### Static Methods 
If you apply static keyword with any method, it is known as static method.
    A static method belongs to the class rather than the object of a class.
    A static method can be invoked without the need for creating an instance of a class.
    A static method can access static data member and can change the value of it.

### Basic Outputting and Inputting 
so there are 3 ways of getting user input 

#### Scanner 
import java.util.asterik;
public class HelloWord{
	String name, address, weight; 

	Scanner obj = new Scanner(System.in);

	public static void main(String [] args){
		System.out.println("Enter Name");
		name = obj.nextLine(); 
		System.out.println("Enter Address");
		address = obj.nextLine(); 
		System.out.println("Enter Weight");
		weight = obj.nextDouble(); 
		System.out.println("Hello %s, you weigh %s kg", name, weight);
	}
}

#### JOptionPane
this makes use of the GUI 

import.javax.swing.asterik; 
class inputExample{
	public static void main(String[] args){
	String userInput; 
	userInput = JOptionPane.showInputDialog("Enter your name"); 
	System.out.println(Hello + "userInput"); 


	//numbers we would need to do 
	age  = Integer.parseInt(userInput); 
	
}
}


#### BufferedReader
import java.io.asterik; 

class HelloWorld {
	string username;

	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your username");
	username = in.readine(); 

}