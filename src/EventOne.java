import java.awt.*; import java.awt.event.*;
public class EventOne extends Frame implements ActionListener, TextListener, FocusListener, ItemListener
{
public void itemStateChanged(ItemEvent e)
{
if(e.getSource()==c1)
{
	boolean b=c1.getState();
	ch.setEnabled(b);

}
else if(e.getSource()==ch)
{
	Color c[]={Color.black,Color.red,Color.green,Color.blue};
	int i=ch.getSelectedIndex();
	t1.setForeground(c[i]);

/*
	String s=ch.getSelectedItem();
	switch(s)
	{
	case "red":
		t1.setForeground(Color.red);
	break;
	case "green":
		t1.setForeground(Color.green);
	break;

	case "blue":
		t1.setForeground(Color.blue);
	break;
	case "black":
		t1.setForeground(Color.black);
	break;
	}
*/
}
}
public void focusGained(FocusEvent e)
{
	if(e.getSource()==t1)
	{
	t1.setBackground(Color.green);
	}
	else if(e.getSource()==t2)
	{
	t2.setBackground(Color.green);
	}
	else if(e.getSource()==b2)
	{	
	b3.setEnabled(true);
	}
}
public void focusLost(FocusEvent e)
{
	if(e.getSource()==t1)
	{
	t1.setBackground(Color.white);
	}
	else if(e.getSource()==t2)
	{
	t2.setBackground(Color.white);
	}
}
public void textValueChanged(TextEvent e)
{
	t2.setText(t1.getText());
}
public void actionPerformed(ActionEvent e)
{
	if(e.getSource()==b1)
	{
		String s=t1.getText();
		t2.setText(s);
	}
	else if(e.getSource()==b2)
	{
		t1.setText(""); t2.setText("");
		t1.requestFocus();
	}
	else if(e.getSource()==b3)
	{
		System.exit(0);
	}
}

public EventOne()
{
	initComponents();
}
public void initComponents()
{
	setLayout(new FlowLayout());
	c1=new Checkbox("allow");
	c1.setState(true);
	add(c1);
	ch=new Choice();
	ch.add("black");
	ch.add("red");
	ch.add("green");
	ch.add("blue");
	add(ch);
	t1=new TextField(10);
	t2=new TextField(10);
	b1=new Button("Copy");
	b2=new Button("Clear");
	b3=new Button("Exit");
	add(t1); add(t2); add(b1); add(b2);add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	t1.addTextListener(this);
	t1.addFocusListener(this);
	t2.addFocusListener(this);
	b3.setEnabled(false);
	b2.addFocusListener(this);
	ch.addItemListener(this);
	c1.addItemListener(this);
}
public static void main(String args[])
{
	EventOne ob=new EventOne();
	ob.setSize(400,400);
	ob.setVisible(true);
}
Checkbox c1;
Choice ch;
TextField t1,t2;
Button b1,b2, b3;
}