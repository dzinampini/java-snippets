# Association

Association refers to the relationship between multiple objects
It refers to how objects are related to each other and how they are using each other's functionality
Composition and aggregation are two types of association

## Aggregation
Aggregation is a weak association
An association is said to be aggregation if both Objects can exist independently
For example, a Team object and a Player object
The team contains multiple players but a player can exist without a team

represents a has-a relationship 
Code reuse is best achieved by aggregation

## Composition
The composition is the strong type of association
An association is said to composition if an Object owns another object and another object cannot exist without the owner object
Consider the case of Human having a heart 
	Here Human object contains the heart and heart cannot exist without Human

## Aggregation vs Composition 

    Dependency: Aggregation implies a relationship where the child can exist independently of the parent. 
    Type of Relationship: Aggregation relation is “has-a” and composition is “part-of” relation.
    Type of association: Composition is a strong Association whereas Aggregation is a weak Association.


Demonstate Aggregation
### demo 1
public class Team {   //Team   
   private List players; //players can be 0 or more

   public Team () {
      players = new ArrayList();
   }
}

class Player {} //Player Object

### demo 2
import java.io.asterik; 
import java.util.asterik; 
 
class Student 
{ 
	String name; 
	int id ; 
	String dept; 
	
	Student(String name, int id, String dept) 
	{ 
		
		this.name = name; 
		this.id = id; 
		this.dept = dept; 
		
	} 
} 

Department class contains list of student Objects. It is associated with student  class through its Object(s). 
class Department { 
	
	String name; 
	private List<Student> students; 

	Department(String name, List<Student> students) 
	{ 		
		this.name = name; 
		this.students = students; 	
	} 
	
	public List<Student> getStudents() 
	{ 
		return students; 
	} 
} 

// main method 
class GFG 
{ 
	public static void main (String[] args) 
	{ 
		Student s1 = new Student("Mia", 1, "CSE"); 
		Student s2 = new Student("Priya", 2, "CSE"); 
		Student s3 = new Student("John", 1, "EE"); 
		Student s4 = new Student("Rahul", 2, "EE"); 
	
		// making a List of CSE Students. 
		List <Student> cse_students = new ArrayList<Student>(); 
		cse_students.add(s1); 
		cse_students.add(s2); 
		
		// making a List of all EE Students 
		List <Student> ee_students = new ArrayList<Student>(); 
		ee_students.add(s3); 
		ee_students.add(s4); 
		
		Department CSE = new Department("CSE", cse_students);  
		Department EE = new Department("EE", ee_students); 
		
		List <Department> departments = new ArrayList<Department>(); 
		departments.add(CSE);  
		departments.add(EE); 
		
		// creating an instance of Institute
		Institute institute = new Institute("BITS", departments); 
		
	} 
} 


### demonstrate composition 
import java.io.asterik; 
 
class Engine  
{ 
    // starting an engine. 
    public void work() 
    { 
          
        System.out.println("Engine of car has been started "); 
          
    } 
      
} 
  
// Engine class 
final class Car  
{ 
    private final Engine engine; // Composition 
    //private Engine engine;     // Aggregation 
      
    Car(Engine engine) 
    { 
        this.engine = engine; 
    } 
      
    // car start moving by starting engine 
    public void move()  
    { 
          
        //if(engine != null) 
        { 
            engine.work(); 
            System.out.println("Car is moving "); 
        } 
    } 
} 
  
class GFG  
{ 
    public static void main (String[] args)  
    { 
          
        // making an engine by creating  
        // an instance of Engine class. 
        Engine engine = new Engine(); 
          
        // Making a car with engine. 
        // so we are passing a engine  
        // instance as an argument while 
        // creating instace of Car. 
        Car car = new Car(engine); 
        car.move(); 
          
    } 
} 