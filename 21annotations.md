# Annotations 
 Java annotations are used to provide meta data for your Java code. 
 Being meta data, Java annotations do not directly affect the execution of your code, although some types of annotations can actually be used for that purpose. 

typically used for the following purposes:
    Compiler instructions
    Build-time instructions
    Runtime instructions

 @AnnotationName 

 A Java annotation can have elements for which you can set values. An element is like an attribute or parameter. Here is an example of a Java annotation with an element: 
 @Entity(tableName = "vehicles")


Built In Annotations 
1. @Deprecated
The @Deprecated annotation is used to mark a class, method or field as deprecated, meaning it should no longer be used. If your code uses deprecated classes, methods or fields, the compiler will give you a warning.

2. @Override
The @Override Java annotation is used above methods that override methods in a superclass. If the method does not match a method in the superclass, the compiler will give you an error. 

3. @SuppressWarnings
The @SuppressWarnings annotation makes the compiler suppress warnings for a given method. For instance, if a method calls a deprecated method, or makes an insecure type cast, the compiler may generate a warning. 

and then you can create your annotations 