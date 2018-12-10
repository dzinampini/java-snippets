## Access Control
### Packages
Java packages are a mechanism to group Java classes that are related to each other, into the same "group" (package). 
When a Java project grows bigger, for instance an app or API, it is useful to split the code into multiple Java classes, and the classes into multiple Java packages. 
When you divide classes into multiple Java packages, it becomes easier to figure out where a certain class you are looking for is.

A Java package is like a directory in a file system. 
In fact, on the disk a package is a directory. 
All Java source and class files of classes belonging to the same package are located in the same directory.


    Preventing naming conflicts. For example there can be two classes with name Employee in two packages, college.staff.cse.Employee and college.staff.ee.Employee
    Making searching/locating and usage of classes, interfaces, enumerations and annotations easier
    Providing controlled access: protected and default have package level access control. A protected member is accessible by classes in the same package and its subclasses. A default member (without any access specifier) is accessible by classes in the same package only.
    Packages can be considered as data encapsulation (or data-hiding).

   //in short  
1. enable to organise code in a sensible fashion
2. prevent conflicts between class names 

#### To Create
-create -> class
-enter class name eg Lion 
-enter the package name eg jungle (prefereably small letter) 
-if you have package in your class file it should be the first in your class file package jungle

if you go into your root folder / src
you will find jungle in there 

now if you want to create a sub package 
you woud have to use jungle.mafungautsi where mafungautsi is the package name 


#### To Use 
if you want to use the jungle class in like YourClassYouAreWorkingOn i.e in (defaultpackage)

import jungle.Lion; or import jungle.asterik; 

public class Dzina{
	public static void main(String args[] ){
		Jungle j = new Jungle(); //
}
}

#### more points to note 
so there are 2 types of packages 
1. inbuilt( )
2. user defined (we use )

we use th import keyword to import a package 


#### Access Modifiers in classes 
Modifier 	Class 	Subclass	Package	World
private 	Y 		N 			N 		N
protected 	Y 		Y 			Y 		N
public 		Y 		Y 			Y 		Y
default 	Y 		N 			Y 		N 