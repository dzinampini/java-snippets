package javamethods;

/**
 *
 * @author dzinampini
 */
    //Java Program to demonstrate the use of a static method.  
    class JavaMethods{  
         int regnumber;  
         String fullname;  
         static String programme = "HINFO";  
         //static method to change the value of static variable  
         static void changeProgramme(){  
            programme = "HCSC";  
         }  
         //constructor to initialize the variable  
         JavaMethods(int r, String n){  
            regnumber = r;  
            fullname = n;  
         }  
         //method to display values  
         void display(){
            System.out.println("Reg Number " + regnumber + "\n Full Name " + fullname +" \n Programme "+programme);
         }  
    }  

//Test class to create and display the values of object  
    public class TestStaticMethod{
        public static void main(String args[]){  
            JavaMethods.changeProgramme();//calling change method  
            //creating objects  
            JavaMethods a = new JavaMethods(1,"Liberty");  
            JavaMethods b = new JavaMethods(2,"Amos");  
            JavaMethods c = new JavaMethods(3,"Chatikobo");  
            //calling display method  
            a.display();  
            b.display();  
            c.display();  
        }  
    }  
 

   