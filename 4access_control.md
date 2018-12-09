## Access Control
### Packages
Package in Java is a mechanism to encapsulate a group of classes, sub packages and interfaces. Packages are used for:

    Preventing naming conflicts. For example there can be two classes with name Employee in two packages, college.staff.cse.Employee and college.staff.ee.Employee
    Making searching/locating and usage of classes, interfaces, enumerations and annotations easier
    Providing controlled access: protected and default have package level access control. A protected member is accessible by classes in the same package and its subclasses. A default member (without any access specifier) is accessible by classes in the same package only.
    Packages can be considered as data encapsulation (or data-hiding).


#### Imports

#### Access Modifiers in classes 
Modifier 	Class 	Subclass	Package	World
private 	Y 		N 			N 		N
protected 	Y 		Y 			Y 		N
public 		Y 		Y 			Y 		Y
default 	Y 		N 			Y 		N 