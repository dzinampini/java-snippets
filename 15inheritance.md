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
n