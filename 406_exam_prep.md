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

	super.method() //invoke base class method 
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


n = 5; 
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


