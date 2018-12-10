# event driven programming 
programming style that uses a signal and response approach to programming 

signal: mouse scroling 
Event: object that acts as event listener


so we have a component as waiting for event firing 
then the event happens 
and the listener invokes an event handler with the event as an argument of the event 

## eg
import java.awt.asterik;
import java.awt.event.asterik; 

class Event extends Frame{
	
	Event(){
		TextField tf = TextFied();
		tf.setBounds(100, 120, 170, 20);

		Button b = new Button("Click Me");
		b.setBounds(60, 50, 170, 20); 

		Outer o = new Outer(this); 

		b.addActionListener(o);

		add(b); 
		add(tf);

		setSize(300, 300);

		setLayout(null); 
		setVisible(true); 
	}
	publis static void main(String args []){
		Event e = new Event();
	}
}

import java.awt.event.asterik; 
class Outer implements ActionListener{ //actionLisetener is an interface 
	Event ev = new Event(); //declare reference variable
	Outer (Event ev){
		this.ev = ev; 
	}

	public void actionPerformed(ActionEvent e){
		ev.tf.setText("Hello and Welcome!")
	}
}