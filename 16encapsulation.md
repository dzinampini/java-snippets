# Encapsulation 
wrapping data and methods together as a unit 
binding code to the data it manipulates 


achived by declaring instance variables as private 


To achieve encs
1. declare variables as private 
2. provide setter (mutator) and getter(accessor) methods to modify the data 

As an example 

public class Student{
	private String name; //data encapsulation

	public void setName(String name){
		this.name = name; 
	}

	public String getNAme(){
		return name; 
	}

	public static void main(String[] args){
		Student s = new Student();
		s.setName("Dzinaishe Mpini");
		System.out.println(s.getName());
	}
}



## same package encapsulation 

package encapsulation;

class Student{
    private String name, prog, sex, level; 
    
    public void setName(String name){
        this.name = name;
    }
    public void setProg(String prog){
        this.prog = prog;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public void setLevel(String level){
        this.level = level;
    }
    
    public String getName(){
        return name;
    }
    
    public String getProg(){
        return prog;
    }
    
    public String getSex(){
        return sex;
    }
    
    public String getLevel(){
        return level;
    }
   
}

public class Encapsulation {

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("dzina"); 
        s.setProg("HCSC");
        s.setLevel("4.2");
        s.setSex("male"); 
        
        System.out.println("Name: " + s.getName() 
                           + "\n Prog: "+ s.getProg()
                           + "\n Sex: "+ s.getSex()
                            + "\n Level: "+ s.getLevel()
                );
       
    }
}


##  different package encapsulation 

package rectangle;
class Rectangle{
	private double length, width;
	
	public  void setLength(double length){
		this.length = length;
	}

	public  void setWidth(double width){
		this.width = width;
	}
	

	public	double area(){
		return length*width;
	}

}

package paint;
import rectangle.asterik;

class PaintCost{
	private static double cost_per_m = 3.40;
	
	Rectangle r = new Rectangle();
	
	double total_paint_cost(){
		r.setLength(45);
		r.setWidth(36); 
		return cost_per_m*r.area();
	}
	public static void main(String [] args){
		PaintCost pc = new PaintCost();
		System.out.println("The total paint cost 
				is " + pc.totalpaintcost()); 
	}
} 

## demonstrate use of the toString() method  
public class Solution{
	private String fname, surname;
	
	public void setFname(String fname){
		this.fname = fname;
	}
	public void setSurname(String surname){
		this.fsurname = surname;
	}

	public String toString(){
		return "First Name " + fname +
			"Surname " + surname; 
	}

	public static void main(String [] args){
		Solution s = new Solution();
		s.setFname("dzinaishe");
		s.setSurname("Mpini");
		System.out.println(s.toString());
	} 
}
