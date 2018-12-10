# Interfaces 
second method to achieve abstraction 

so we specify what a class must do but not how it does that 
obejective is to kind of achieve multiple inheritance which was said to  be unachievable in Java 


A Java interface is a bit like a class, except a Java interface can only contain method signatures and fields. An Java interface cannot contain an implementation of the methods, only the signature (name, parameters and exceptions) of the method. 


-can only have abstract methods 
-support multpile inheritance 
-has only static and final variables 

## Consider 
interface Religion{
	String city = "Kwekwe";
	void pastor();
	void location(); 
} 

class MbizoBaptist implements Religion{
	public void greet(){
		System.out.println("Rev Ncube");
	}
	public void pray(){
		System.out.println("Mkoba 14");
	}
}

class MkobaBaptist implements Religion{
	public void greet(){
		System.out.println("Rev ... ");
	}
	public void pray(){
		System.out.println("Mbizo 1");
	}
}

?? but where exactly is the interfacing part 

