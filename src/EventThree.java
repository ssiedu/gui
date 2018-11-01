import java.awt.*; import java.awt.event.*;
public class EventThree extends Frame implements MouseListener, MouseMotionListener
{
public void mouseMoved(MouseEvent e)
{
	setTitle("Moving");
}
public void mouseDragged(MouseEvent e)
{
	setTitle("Dragging");
}
public void mousePressed(MouseEvent e)
{
	t1.setText("Welcome");
}
public void mouseReleased(MouseEvent e)
{
	t1.setText("");
}
public void mouseClicked(MouseEvent e){}
public void mouseEntered(MouseEvent e)
{
	t1.setBackground(Color.green);
}
public void mouseExited(MouseEvent e)
{
	t1.setBackground(Color.white);
}

public EventThree()
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
	t1.addMouseListener(this);
	t1.addMouseMotionListener(this);
}
public static void main(String args[])
{
	EventThree ob=new EventThree();
	ob.setSize(400,400);
	ob.setVisible(true);
}
TextField t1,t2;
Button b1,b2, b3;
}