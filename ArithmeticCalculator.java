import java.awt.event.*;
import java.applet.*;
import java.awt.*;

public class ArithmeticCalculator extends Applet implements ActionListener {
    int a=0,v=1,d=0,r,f=0;
    char p,z;
    TextField t;
    Button[] b = new Button[10];
    Button bPlus, bMinus, bMultiply, bDivide, bEquals, bClear;

    public void init() {
        setLayout(new GridLayout(5, 4));
        t = new TextField(10);
        for (int i = 0; i < 10; i++) {
            b[i] = new Button("" + i);
            b[i].addActionListener(this);
        }
        bPlus = new Button("+");
        bMinus = new Button("-");
        bMultiply = new Button("*");
        bDivide = new Button("/");
        bEquals = new Button("=");
        bClear = new Button("CE");

        bPlus.addActionListener(this);
        bMinus.addActionListener(this);
        bMultiply.addActionListener(this);
        bDivide.addActionListener(this);
        bEquals.addActionListener(this);
        bClear.addActionListener(this);

        add(t);
        for (int i = 0; i < 10; i++) 
            add(b[i]);
      
        add(bPlus);
        add(bMinus);
        add(bMultiply);
        add(bDivide);
        add(bEquals);
        add(bClear);
       }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
	z=s.charAt(0);
        if (f==1&&Character.isDigit(z)) 
            t.setText("");
	if(Character.isDigit(z))
	   t.setText(t.getText()+z);
	if(s.equals("+"))
	{
	a=a+Integer.parseInt(t.getText());
	 p='+';
	f=0;
	t.setText("");
	}
	else if(s.equals("-"))
	{
	a=Integer.parseInt(t.getText())-a;
	 p='-';
	f=0;
	t.setText("");
	}
	else if(s.equals("*"))
	{
	v=v*Integer.parseInt(t.getText());
	 p='*';
	f=0;
	t.setText("");
	}
	else if(s.equals("/"))
	{
	v=Integer.parseInt(t.getText())/v;
	 p='/';
	f=0;
	t.setText("");
	}
	else if(s.equals("="))
	{
	d=Integer.parseInt(t.getText());
	 switch(p){
		case '+':r=a+d;
			      t.setText(""+r);
			     break;
		case '-':r=a-d;
			      t.setText(""+r);
			     break;
		case '*':r=v*d;
			      t.setText(""+r);
			     break;
		case '/':r=v/d;
			      t.setText(""+r);
			     break;

	}
	a=0;
	v=1;
	f=1;
	}
	if(s.equals("CE")){
	t.setText("");
	f=0;
	}
}
/*
<applet code="ArithmeticCalculator.class" width=30 height=30>
</applet>
*/




            