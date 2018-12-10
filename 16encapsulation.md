# Encapsulation 
wrapping data and methods together as a unit 
binding code to the data it manipulates 


achived by declaring instance variables as private 


To achieve encs
1. declare variables as private 
2. provide setter (mutator) and getter(accessor) methods to modify the data 

As an example 

public class Student{
	private String name; //data encapsulation

	public void setName(String name){
		this.name = name; 
	}

	public String getNAme(){
		return name; 
	}

	public static void main(String[] args){
		Student s = new Student();
		s.setName("Dzinaishe Mpini");
		System.out.println(s.getName());
	}
}
