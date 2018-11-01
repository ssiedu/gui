//working with multiple Layouts

import java.awt.*;
public class GUIThree
{
public static void main(String args[])
{
	//step-1 (create a container)
	Frame f=new Frame();
	f.setSize(400,400);
	f.setVisible(true);
	
	//step-2 (create components)
	
	Label l1=new Label("Name");
	Label l2=new Label("Age");
	Label l3=new Label("Subjects");
	TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	Button b1=new Button("Save");
	Button b2=new Button("Cancel");
	Button b3=new Button("Exit");
	Checkbox c1=new Checkbox("java");
	Checkbox c2=new Checkbox("php");

	//step-3 (add components on container)
	Panel p=new Panel();
	Panel p1=new Panel();
	Panel p2=new Panel();
	p.setLayout(new FlowLayout(0));
	//p1.setLayout(new GridLayout(3,2));
	p1.setLayout(new GridLayout(3,2,30,20));
	p2.setLayout(new FlowLayout());

	p.add(c1); p.add(c2);

	p1.add(l1); p1.add(t1);
	p1.add(l2); p1.add(t2);
	p1.add(l3); p1.add(p);
	


	p2.add(b1); p2.add(b2); p2.add(b3);

	f.add("North",p1);
	f.add("South",p2);

	p2.setBackground(Color.pink);
}
}