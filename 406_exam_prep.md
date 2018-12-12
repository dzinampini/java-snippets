# this and super keyword use in constructors 


class People {
	People(int a, int b){
	this.a = a;
	this.b = b; 

}
}

class Student {
	Student(){
		// invoke or call parent class constructor
		super (a,b);
	}

  //to access super class members 
  super.variable_name[] 
	super.method_name() //invoke base class method 
}

# final variable 
its value can’t be modified, essentially, a constant. 
final int THRESHOLD = 5;

# final method 
When we use final specifier with a method, the method cannot be overridden in any of the inheriting classes. 


class Base { 
   private final void foo() {
		System.out.println("This is the text that will show");
	} 
} 

class Derived { 
   private void foo() {
		System.out.println("This method will not overide that of the main class");
	} 
} 

# final class
If you make any class as final, you cannot extend it.

    final class Bike{}  
      
    class Honda1 extends Bike{  
      void run(){System.out.println("running safely with 100kmph");}  
        
      public static void main(String args[]){  
      Honda1 honda= new Honda1();  
      honda.run();  
      }  
    }  



# difference between final and static 
static int value1 = 5; 
//can be changed by using Example.value1= anyvalue;
 
  final int VALUE = 10; 
//cannot be changed as it is constant 
and cannot be used without creating instance of class Example.
   
  static final int value3 = 18;
//cannot be changed but can be accessed using Example.value3;


# Java destructor - finalize()
we use the finalize() method 

# difference between array and array list 
-The major difference between the two is that arrays are fixed length data structure. But, ArrayList is variable length, which means ArrayList can grow or shrink its size dynamically.nother 
-array does not allow generics. AL allows generic data structure 
-other difference is that while creating array you need to specify its size or insert elements into it to make sure size is specified. But for ArrayList that is optional.

# advantages of array list 
- re-sizable array
-Elements can be inserted at or deleted from a particular position.
- ArrayList class has many methods to manipulate the stored objects.
- ArrayList can hold any type of objects.
- ArrayList can hold duplicate elements.

# toString() method 
If you want to represent any object as a string, toString() method comes into existence.
The toString() method returns the string representation of the object. 

    class Student{  
     int rollno;  
     String name;  
     String city;  
      
     Student(int rollno, String name, String city){  
     this.rollno=rollno;  
     this.name=name;  
     this.city=city;  
     }  
       
     public String toString(){//overriding the toString() method  
      return rollno+" "+name+" "+city;  
     } 

     public static void main(String args[]){  
       Student s1=new Student(101,"Raj","lucknow");  
       Student s2=new Student(102,"Vijay","ghaziabad");  
         
       System.out.println(s1);//compiler writes here s1.toString()  
       System.out.println(s2);//compiler writes here s2.toString()  
     }  
    }  


# comparing objects p1 and p2
p1.equals(p2); 

# polymorphic array 

List<Employee> listEmployees = new ArrayList<Employee>();


int n = 5; 
 Employee x[] = new Employee[n];
 for( int i=0;i<5;i++){
 	x[0] = new Employee("Different name", "Different surname");
 }

for( int i=0;i<5;i++){
 	listEmployees.add(x[i]);
 }

for(int i=0; i<; i++){ 
 System.out.println(listEmployees.get(i).toString()); } 
} 


# java api packages 
sql
util
io
swing 
javax

# methods of accessing packages in java 
import forest.aterik;
import forest.lion; 
package forest;


import jungle.Lion; or import jungle.asterik; 

public class Dzina{
	public static void main(String args[] ){
		Jungle j = new Jungle(); //
}
}

# Similarities Between Array and ArrayList

1. add and get method : Performance of Array and ArrayList are similar for the add and get operations .Both operations runs in constant time.

2. Duplicate elements : Both array and arraylist can contain duplicate elements.

3. Null Values : Both can store null values and uses index to refer to their elements.

4. Unordered :  Both does not guarantee ordered  elements.


# Autoboxing and Unboxing in Java 
is the automatic conversion that the Java compiler makes

Autoboxing ... from the primitive types to its corresponding object wrapper class. 

For example, converting an int to an Integer, a double to a Double, and so on. 

If the conversion goes the other way, this is called unboxing. that is Integer to int

 Here is the simplest example of autoboxing:

Character ch = 'a';

# security mechanisms in java 
1. security manager (determines the resources that can be accessed by classes of a program eg. file reading and writing)
2. bytecode verifier (check bytecode fragments for illegal code )
3. classloader (seperates imported packages from program packages )

# static initializer block 
will be called on loading of the class, and will have no access to instance variables or methods
static {
    a = 10;
    b = 20;
 }

# Non-Static Initializer block 
on the other hand is created on object construction only, will have access to instance variables and methods

# using a fully qualified reference to call a package 
methodpaName.packageName.className objectname = new methodpaName.packageName.className(); 

done in  case if there is a conflict of ClassNames, then only in that case it is advisable to go for fully qualified names.

the other method is using the import statement 
Import statements make your code more readable, since you are not cluttering the code with the complete package.

# compare jdbc and odbc 
obdbc - is for Ms. provide communication between front end applications (other than java_) and Ms DBs like Ms SQL and Access
use pointers 
less secure

jdbc - provide comms between java and databases (oracle, mysql, msaccesss, etc ) 
no pointers 
more secure

# copy constructor in java
Base (int a, int b){
  this.a = a;
  this.b = b;
}

Sub(int c){
  a.c = a; 
  b.c = b; 
  //this is a copy constructor 
}