/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistvspolyarray;
import java.util.*;

/**
 *
 * @author dzinampini
 */
public class ArrayListVsPolyArray {
    String firstName,lastName;
    public ArrayListVsPolyArray (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String toString() {
        return firstName + " " + lastName;
    }
public static void main(String[] args){
    List<ArrayListVsPolyArray> listArrayListVsPolyArrays = new ArrayList<ArrayListVsPolyArray>();
    ArrayListVsPolyArray emp1 = new ArrayListVsPolyArray("Tawanda", "Chihuyo");
    ArrayListVsPolyArray emp2 = new ArrayListVsPolyArray("Ernest", "Kachere");
    ArrayListVsPolyArray emp3 = new ArrayListVsPolyArray("Dzinaishe", "Mpini");
    ArrayListVsPolyArray emp4 = new ArrayListVsPolyArray("Patson", "Mutambirwa");
    ArrayListVsPolyArray emp5 = new ArrayListVsPolyArray("Fidelis", "Chitimbe");
    
    listArrayListVsPolyArrays.add(emp1);
    listArrayListVsPolyArrays.add(emp2);
    listArrayListVsPolyArrays.add(emp3);
    listArrayListVsPolyArrays.add(emp4);
    listArrayListVsPolyArrays.add(emp5);
    
//display
    int w=listArrayListVsPolyArrays.size(); 
        for(int i=0; i<w; i++){ 
         System.out.println(listArrayListVsPolyArrays.get(i).toString()); 
        }
    } 
}
