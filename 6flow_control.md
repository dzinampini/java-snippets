## if 
if (num < 0) {
            
            System.out.println("The integer is negative");
        }

## if ... else
if (num < 0) {
            
            System.out.println("The integer is negative");
        } 
        else {
            
            System.out.println("The integer is positive");
        }

## else if
if (num < 0) {
            
            System.out.println("The integer is negative");
        } 
        else if (num == 0) {
            
            System.out.println("The integer equals to zero");            
        }
         else {
            
            System.out.println("The integer is positive");
        }


## case statement 
domain = domain.trim().toLowerCase();

        switch (domain) {

            case "zw":
                System.out.println("Zimbabwe");
                break;

            case "sa":
                System.out.println("South Africa");
                break;

            case "bw":
                System.out.println("Botswana");
                break;

            case "uk":
                System.out.println("United Kingdom");
                break;

            default:
                System.out.println("Unknown");
                break;
        }

## while (check condition first)
 while (i < 10) {
            
            i++;
            sum += i;
        }

## do while (execute then check condition )
do {
            System.out.println(count);
        } 
        while (count != 0);


## for 
for (int i = 0; i < 10; i++) {
            
            System.out.println(i);
        }


## break 
  if (num == 22) {
                
                break;
            }

## continue statement 
The continue statement is used to skip a part of the loop and continue with the next iteration of the loop. It can be used in combination with for and while statements. 


while (num < 100) {
            
            num++;

            if ((num % 2) == 0) {
                continue;
            }

            System.out.print(num + " ");
        }

## goto 
// file name: Main.java 
public class Main { 
    public static void main(String[] args) 
    { 
  
    // label for outer loop 
    outer: 
        for (int i = 0; i < 10; i++) { 
            for (int j = 0; j < 10; j++) { 
                if (j == 1) 
                    break outer; 
                System.out.println(" value of j = " + j); 
            } 
        } // end of outer loop 
    } // end of main() 
} // end of class Main 

label is the goto in java 