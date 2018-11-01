import java.awt.*; import java.awt.event.*;
public class EventTwo extends Frame implements KeyListener
{
public void keyPressed(KeyEvent e)
{
	int n=e.getKeyCode();
	if(n==KeyEvent.VK_F1)
	{
		String s1=t1.getText();
		String s2=s1.toUpperCase();
		t1.setText(s2);
	}
	else if(n==KeyEvent.VK_F2)
	{
		t1.setText(t1.getText().toLowerCase());
	}
	else if(n==KeyEvent.VK_ESCAPE)
	{
		System.exit(0);
	}
	else if(n==KeyEvent.VK_ENTER)
	{	
		t2.setText(t1.getText());
	}
}
public void keyReleased(KeyEvent e)
{}
public void keyTyped(KeyEvent e)
{}

public EventTwo()
{
	initComponents();
}
public void initComponents()
{
	setLayout(new FlowLayout());
	t1=new TextField(10);
	t2=new TextField(10);
	b1=new Button("Copy");
	b2=new Button("Clear");
	b3=new Button("Exit");
	add(t1); add(t2); add(b1); add(b2);add(b3);
	t1.addKeyListener(this);
}
public static void main(String args[])
{
	EventTwo ob=new EventTwo();
	ob.setSize(400,400);
	ob.setVisible(true);
}
TextField t1,t2;
Button b1,b2, b3;
}