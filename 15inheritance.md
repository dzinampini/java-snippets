# Inheritance 
one class aacquires members (methods and variables) of another 

provides and is- a relationship 

superclass / baseclass / parent class
-the class where properties are inherited from 

subclass / derived class / child class 
-the class which inherits

## Why Inheritance 
-method overriding 
-code reusability 

## Types 
### single (A inherits from B)
public class A{
	
}
public class B extends A{
	
}

### multiple (A inherits from multipe base classes)
public class C{
	
}
public class B  {
	
}

public class A extends B, C{
	
}


### multilevel (A inherits from B. B inherits from C)
Java does not support multiple inheritance 

### Hybrid (combination of 2/more inheritance types )


## Rules
1. private members of the superclass are not inherited 
2. default accessibility members are not inherited 
3. constructors are not inherited 
4. initialiser blocks are not inherited 
5. one subclass can only extend one super class 


## inheritance with same package and with different package 
package package1;

public class MyClass1 {
    public void tryMePublic() { System.out.println("I'm public"); }
    protected void tryMeProtected() { System.out.println("I'm protected"); }
    void tryMePackage() { System.out.println("I'm package"); }
}

//Children class in the same package
package package1;
public class Class2 extends MyClass1 {
    public void doNow() {
        tryMePublic(); // OK
        tryMeProtected(); // OK
        tryMePackage(); // OK
    }    
}


/// Children class in different package
package package2;
import package1.MyClass1;

public class Class3 extends MyClass1 {
    public void doNow() {
        MyClass1 c = new MyClass1();
        c.tryMeProtected() // ERROR, because only public methods are allowed to be called on class instance, whereever you are
        tryMePublic(); // OK
        tryMeProtected(); // OK
        tryMePackage(); // ERROR
    }    
}