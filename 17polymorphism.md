# Polymorphism
-many forms 

there are 2 types 
1. compile time (method overloading)
2. run time (method overriding)



## Compile Time Polymorphism 
achieved thru
1. changing the number of args 
2. changing the data type 
3. interchanging the poistions of the args 


## Run Time / Dynamic Method Dispatch
-over ride functionality of a base class method 
- a method declared with the final keyword cannot be overriden
-constructors cannot be overridden 

?? do the actual polymorphism 



??then do 

## Upcasting 
when the reference variable of a parent class refers to the object of the child class it is known as upcasting 

class A{
	void display(){
		System.out.println("I'm in A");
	}
}

class B extends A{
	void display(){
		System.out.println("I'm in B");
	}

	public static void main(String [] args){
		A a = new B(); //upcasting happened. read the definition  
		a.display(); 
	}
}
Output: I'm in B
