Java GUI comes from 2 packages 
swing and awt(abstract window toolkit)

AWT Components
button, label, checkbox, choice, list, container 

container is a component that contains componts like the button, label, etc, 
it extends container class (frame, dialog and panel)

window 
container with no borders and menu

panel
componet that doesnt contain title and menu bar 

frame 
container that has title and menu 

## Impotant Methods 
1. add (Component c)
- inserts a component 

2. setSize (int width, int height)
-sets the size 

3. setLayout(LayoutManager m)
-define the layout manager 

4. setVisible(boolean status)  
-change the visibility 

5. setBounds (position)
-change the position 

so there are 2 ways to create a frame in AWT
1. thru inheritance 
2. association

### the inheritance route 
import java.awt.asterik;
class First extends Frame {
	First(){
		Button b = new Button("Click Me");
		b.setBounds(30, 100, 80, 30);

		Label l = new Label ("Username"); 
		
		add(b);
		setSize(300, 300);
		setLayout(null);
		setVisible(true); 
	}

	public static void main(Sring args []){
		First f = new First(); 

	}
} 

### the association route 
import java.awt.asterik;

class First{
	First(){
		Frame f = new Frame(); 
		Button b = new Button("Click Me");
		b.setBounds(30, 50, 80, 30);

		f.add(b);  
		f.setSize(300, 300); 
		f.setLayout(null); 

		First obj = new First();
	}
}

## The sWING route 
-swing is part of the Java foundatonal classes 
-used to create widows based apps
-built on top of awt 
-jfc simplify development of desktop applications 

Java AWT
-components are platform dependent 
-heavyweght components 
-doesnt support pluggable look and feel 
-provides less components than swing 
doesnt follow MVC 

Java Swing 
-patform independent
-lightweight 
supports puggable look and feel 
more powerful components such as as tables and list 
follows mvc 

import javax.swing.asterik;
public class Simple extends JFrame implements ActionListener{
	JFrame f = new JFrame();

	Simple(){
		JButton b = new JButton("Click Me");
		b.setBounds(130, 20, 30, 40);
		b.ActionListener(this); 

		String country[] = {"India", "USA", "England", "New Zealand", "Canada", "Australlia"}
		JComboBox cb = new JComboBox(country); 
		cd.setBounds(country);

		JRadioButton rb1, rb2;
		rb1 = new JRadioButton("Male");
		rb2 = new JRadioButton("Female");

		Sttring data[][] = {{"1", "D Mpini", 570}, {"2", "R Mpini", 0}, {"3", "W Mpini", 700}};

		String column[] = {"ID", "NAME", "SALARY"}; 

		JTable jt = new newJTable(data, column);
		jt.setBounds(30, 40, 200, 300);

		add(b); 
		add(cb);
		add(rb1);
		add(rb2);
		add(jt);  
		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerfomed(ActionEvent e){
		if(rb1.isSelected()){
			JOptionPane.showMessageDialog(this, "You are male");
		}

		else if(rb2.isSelected()){
			JOptionPane.showMessageDialog(this, "You are females");
		}
	}
	public static void main(String [] args){
		Simple s = new Simple(); 
	}
} 


## Layout managers in java 


