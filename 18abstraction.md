# Abstraction
-hiding the implementation details 
and showing only functionality to the user 
abstraction help you focus on what the object does and not really how it does it 
2 ways to achieve 
1. abstract class
2. interfaces 

## Abstract Class
class declared with abstract keyword 
can have abstract and no abstract methods
must have one/method abstract methods  

abstract class Figure{
	double a, b;

	Figure(double a, double b){
		this.a = a; 
		this.b = b; 
	}

	abstract double area(); 
}

class Rectangle extends Figure{
	Rectangle(double a, double b){
		super(a, b); 
	}

	//override area from Fig
	double area(){
		return this.a*this.b; 
	}
}

class Triangle extends Figure{
	Rectangle(double a, double b){
		super(a, b); 
	}

	//override area from Fig
	double area(){
		return 0.5*this.a*this.b; 
	}
}
