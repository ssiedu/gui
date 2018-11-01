//working without LayoutManager

import java.awt.*;
public class GUITwo
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
	TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	Button b1=new Button("Save");

	//step-3 (add components on container)

	f.setLayout(null);
	l1.setSize(60,30);//w,h
	l1.setLocation(50,100);//x,y
	t1.setSize(100,30);
	t1.setLocation(130,100);

	l2.setBounds(50,150,60,30);//x,y,w,h
	t2.setBounds(130,150,100,30);
	b1.setBounds(100,200,70,30);

	f.add(l1); f.add(t1); f.add(l2); f.add(t2); f.add(b1);


}
}