exceptional handling manages runtime errors 

Why?
-maintain normal flow of the program

Types of Exceptions 

1. Checked 
classes which inherit the Throwable class fall in this range
except RuntimeException and Error 
Eg. SQLException and IOException

2. Unchecked 
classes which inherit RuntimeException class 
eg. ArithmeticExccetion

3. Error 
an error is irrecovable 
eg. OutOfMemoryError, VirtualMachineError,AssertionError 


## Exception Keywords 
1. try 
specify a block of code to pace exception

2. catch 
handle the exception

3. finally
execute the important code of the program, whether the exception is handledd or not 

4. throw
throw an exception 

5. throws
declare exceptions but doesnt thow

## Eg
    public class JavaExceptionExample{  
      public static void main(String args[]){  
       try{  
          //code that may raise exception  
          int data=100/0;  
       }catch(ArithmeticException e){System.out.println(e);}  
       //rest code of the program   
       System.out.println("rest of the code...");  
      }  
    } 