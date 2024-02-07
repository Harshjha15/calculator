import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class calculator extends JFrame{
calculator(String s1){
super(s1);
}
calculator(){}

JLabel l1,l2,l3,l4;
JTextField t1,t2;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;

void setcomponents(){

setLayout(null);
Cursor c1= new Cursor(Cursor.HAND_CURSOR);
Font f1=new Font("Times New Roman",Font.BOLD,28);
Font f2=new Font("Times New Roman",Font.BOLD,22);
Font f3=new Font("Times New Roman",Font.BOLD,16);

l1=new JLabel("CALCULATOR");
l2=new JLabel("FIRST NUMBER");
l3=new JLabel("SECOND NUMBER");
l4=new JLabel();
t1=new JTextField();
t2=new JTextField();
b1=new JButton("+");
b2=new JButton("-");
b3=new JButton("*");
b4=new JButton("/");
b5=new JButton("%");
b6=new JButton("Sqrt");
b7=new JButton("Sqr");
b8=new JButton("1/x");
b9=new JButton("CLEAR");


b1.setCursor(c1);
b2.setCursor(c1);
b3.setCursor(c1);
b4.setCursor(c1);
b5.setCursor(c1);
b6.setCursor(c1);
b7.setCursor(c1);
b8.setCursor(c1);
b9.setCursor(c1);
t1.setCursor(c1);
t2.setCursor(c1);

l1.setFont(f1);
l2.setFont(f3);
l3.setFont(f3);
l4.setFont(f1);
t1.setFont(f2);
t2.setFont(f2);
b1.setFont(f1);
b2.setFont(f1);
b3.setFont(f1);
b4.setFont(f1);
b5.setFont(f1);
b6.setFont(f2);
b7.setFont(f2);
b8.setFont(f1);
b9.setFont(f3);

Color yg =new Color(205,136,7);
l4.setForeground(yg);
t1.setForeground(Color.BLUE);
t2.setForeground(Color.BLUE);
l1.setForeground(Color.GREEN);
l2.setForeground(Color.black);
l3.setForeground(Color.black);
b1.setForeground(Color.white);
b2.setForeground(Color.white);
b3.setForeground(Color.white);
b4.setForeground(Color.white);
b5.setForeground(Color.white);
b6.setForeground(Color.white);
b7.setForeground(Color.white);
b8.setForeground(Color.white);
b9.setForeground(Color.black);

Color bac =new Color(85,90,85);
t1.setBackground(Color.GRAY);
t2.setBackground(Color.GRAY);
b1.setBackground(bac);
b2.setBackground(bac);
b3.setBackground(bac);
b4.setBackground(bac);
b5.setBackground(bac);
b6.setBackground(bac);
b7.setBackground(bac);
b8.setBackground(bac);
b9.setBackground(bac);

add(l1);
add(l2);
add(l3);
add(l4);
add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);

l1.setBounds(200,00,300,100);
l2.setBounds(50,100,200,50);
l3.setBounds(50,165,200,50);
l4.setBounds(200,450,400,100);
t1.setBounds(200,100,300,50);
t2.setBounds(200,165,300,50);
b1.setBounds(180,250,100,50);
b2.setBounds(300,250,100,50);
b3.setBounds(420,250,100,50);
b4.setBounds(180,320,100,50);
b5.setBounds(300,320,100,50);
b6.setBounds(420,320,100,50);
b7.setBounds(180,390,100,50);
b8.setBounds(300,390,100,50);
b9.setBounds(420,390,100,50);



b1.addActionListener(new add());
b2.addActionListener(new sub());
b3.addActionListener(new mul());
b4.addActionListener(new div());
b5.addActionListener(new rem());
b6.addActionListener(new sqrt());
b7.addActionListener(new sqr());
b8.addActionListener(new rev());
b9.addActionListener(new clr());

l1.addMouseListener(new m1());
b1.addMouseListener(new m2());
t1.addMouseListener(new m3());
t2.addMouseListener(new m4());

b2.addMouseListener(new m5());
b3.addMouseListener(new m6());
b4.addMouseListener(new m7());
b5.addMouseListener(new m8());
b6.addMouseListener(new m9());
b7.addMouseListener(new m10());
b8.addMouseListener(new m11());
b9.addMouseListener(new m12());

}


class  add implements ActionListener{
public void actionPerformed(ActionEvent e1){
try{
double s1=Double.parseDouble(t1.getText());
double s2=Double.parseDouble(t2.getText());
double s3=s1+s2;
t1.setText("");
t2.setText("");
l4.setText(""+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setBounds(100,450,500,100);
l4.setText("PLEASE ENTER NUMBER ONLY");
}
}
}
class  sub implements ActionListener{
public void actionPerformed(ActionEvent e1){
try{
double s1=Double.parseDouble(t1.getText());
double s2=Double.parseDouble(t2.getText());
double s3=s1-s2;
t1.setText("");
t2.setText("");
l4.setText(""+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setBounds(100,450,500,100);
l4.setText("PLEASE ENTER NUMBER ONLY");
}
}
}
class  mul implements ActionListener{
public void actionPerformed(ActionEvent e1){
try{
double s1=Double.parseDouble(t1.getText());
double s2=Double.parseDouble(t2.getText());
double s3=s1*s2;
t1.setText("");
t2.setText("");
l4.setText(""+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setBounds(100,450,500,100);
l4.setText("PLEASE ENTER NUMBER ONLY");
}
}
}
class  div implements ActionListener{
public void actionPerformed(ActionEvent e1){
try{
double s1=Double.parseDouble(t1.getText());
double s2=Double.parseDouble(t2.getText());
double s3=s1/s2;
t1.setText("");
t2.setText("");
l4.setText(""+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setBounds(100,450,500,100);
l4.setText("PLEASE ENTER NUMBER ONLY");
}
}
}
class  rem implements ActionListener{
public void actionPerformed(ActionEvent e1){
try{
double s1=Double.parseDouble(t1.getText());
double s2=Double.parseDouble(t2.getText());
double s3=s1%s2;
t1.setText("");
t2.setText("");
l4.setText(""+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setBounds(100,450,500,100);
l4.setText("PLEASE ENTER NUMBER ONLY");
}
}
}
class  clr implements ActionListener{
public void actionPerformed(ActionEvent e1){
t1.setText("");
t2.setText("");
l4.setText("");
}
}
class  sqr implements ActionListener{
public void actionPerformed(ActionEvent e1){
try{
double s1=Double.parseDouble(t1.getText());
double s3=s1*s1;
t1.setText("");
t2.setText("");
l4.setText(""+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setBounds(100,450,500,100);
l4.setText("PLEASE ENTER NUMBER ONLY");
}
}
}

class  sqrt implements ActionListener{
public void actionPerformed(ActionEvent e1) {
try{
double s1=Double.parseDouble(t1.getText());
double s3=Math.sqrt(s1);
t1.setText("");
t2.setText("");
l4.setText(""+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setBounds(100,450,500,100);
l4.setText("PLEASE ENTER NUMBER ONLY");
}
}
}

class  rev implements ActionListener{
public void actionPerformed(ActionEvent e1){
try{
double s1=Double.parseDouble(t1.getText());
double s3=1/s1;
t1.setText("");
t2.setText("");
l4.setText(""+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setBounds(100,450,500,100);
l4.setText("PLEASE ENTER NUMBER ONLY");
}
}
}

public static void main (String args[]){
calculator c1=new calculator("DEVELOPED BY HARSH JHA");
c1.setVisible(true);
c1.setSize(600,600);
c1.setcomponents();
c1.getContentPane().setBackground(new Color(70,80,70));
c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


}

//          WORKING BUTTON COLORS
class m1 implements MouseListener{
public void mouseClicked(MouseEvent e1){
l1.setForeground(Color.BLUE);
}
public void mouseEntered(MouseEvent e1){
l1.setForeground(Color.RED);
}
public void mouseExited(MouseEvent e1){
l1.setForeground(Color.GREEN);
}
public void mousePressed(MouseEvent e1){
l1.setForeground(Color.BLUE);
}
public void mouseReleased(MouseEvent e1){
l1.setForeground(Color.GREEN);
}
}



class m3 implements MouseListener{
Color  blu   = new Color(178,102,255);
public void mouseClicked(MouseEvent e1){
l2.setForeground(blu);

}
public void mouseEntered(MouseEvent e1){
l2.setForeground(blu);
}

public void mouseExited(MouseEvent e1){
l2.setForeground(Color.black);
}
public void mousePressed(MouseEvent e1){
l2.setForeground(blu);

}
public void mouseReleased(MouseEvent e1){
l2.setForeground(Color.black);
}
}

class m4 implements MouseListener{
Color  blu   = new Color(153,51,255);
public void mouseClicked(MouseEvent e1){
l3.setForeground(blu);

}
public void mouseEntered(MouseEvent e1){
l3.setForeground(blu);
}

public void mouseExited(MouseEvent e1){
l3.setForeground(Color.black);
}
public void mousePressed(MouseEvent e1){
l3.setForeground(blu);

}
public void mouseReleased(MouseEvent e1){
l3.setForeground(Color.black);
}
}

class m2 implements MouseListener{
Color  blu   = new Color(10,182,199);
Color bac =new Color(85,90,85);
public void mouseClicked(MouseEvent e1){
b1.setForeground(blu);
b1.setBackground(Color.white);
}
public void mouseEntered(MouseEvent e1){
b1.setForeground(Color.black);
b1.setBackground(Color.white);
}

public void mouseExited(MouseEvent e1){
b1.setForeground(Color.white);
b1.setBackground(bac);
}
public void mousePressed(MouseEvent e1){
b1.setForeground(blu);
b1.setBackground(Color.white);
}
public void mouseReleased(MouseEvent e1){
b1.setForeground(Color.white);
b1.setBackground(bac);
}
}


class m5 implements MouseListener{
Color  blu   = new Color(10,182,199);
Color bac =new Color(85,90,85);
public void mouseClicked(MouseEvent e1){
b2.setForeground(blu);
b2.setBackground(Color.white);
}
public void mouseEntered(MouseEvent e1){
b2.setForeground(Color.black);
b2.setBackground(Color.white);
}

public void mouseExited(MouseEvent e1){
b2.setForeground(Color.white);
b2.setBackground(bac);
}
public void mousePressed(MouseEvent e1){
b2.setForeground(blu);
b2.setBackground(Color.white);
}
public void mouseReleased(MouseEvent e1){
b2.setForeground(Color.white);
b2.setBackground(bac);
}
}

class m6 implements MouseListener{
Color  blu   = new Color(10,182,199);
Color bac =new Color(85,90,85);
public void mouseClicked(MouseEvent e1){
b3.setForeground(blu);
b3.setBackground(Color.white);
}
public void mouseEntered(MouseEvent e1){
b3.setForeground(Color.black);
b3.setBackground(Color.white);
}
public void mouseExited(MouseEvent e1){
b3.setForeground(Color.white);
b3.setBackground(bac);
}
public void mousePressed(MouseEvent e1){
b3.setForeground(blu);
b3.setBackground(Color.white);
}
public void mouseReleased(MouseEvent e1){
b3.setForeground(Color.white);
b3.setBackground(bac);
}
}

class m7 implements MouseListener{
Color  blu   = new Color(10,182,199);
Color bac =new Color(85,90,85);
public void mouseClicked(MouseEvent e1){
b4.setForeground(blu);
b4.setBackground(Color.white);
}
public void mouseEntered(MouseEvent e1){
b4.setForeground(Color.black);
b4.setBackground(Color.white);
}
public void mouseExited(MouseEvent e1){
b4.setForeground(Color.white);
b4.setBackground(bac);
}
public void mousePressed(MouseEvent e1){
b4.setForeground(blu);
b4.setBackground(Color.white);
}
public void mouseReleased(MouseEvent e1){
b4.setForeground(Color.white);
b4.setBackground(bac);
}
}


class m8 implements MouseListener{
Color  blu   = new Color(10,182,199);
Color bac =new Color(85,90,85);
public void mouseClicked(MouseEvent e1){
b5.setForeground(blu);
b5.setBackground(Color.white);
}
public void mouseEntered(MouseEvent e1){
b5.setForeground(Color.black);
b5.setBackground(Color.white);
}
public void mouseExited(MouseEvent e1){
b5.setForeground(Color.white);
b5.setBackground(bac);
}
public void mousePressed(MouseEvent e1){
b5.setForeground(blu);
b5.setBackground(Color.white);
}
public void mouseReleased(MouseEvent e1){
b5.setForeground(Color.white);
b5.setBackground(bac);
}
}

class m9 implements MouseListener{
Color  blu   = new Color(10,182,199);
Color bac =new Color(85,90,85);
public void mouseClicked(MouseEvent e1){
b6.setForeground(blu);
b6.setBackground(Color.white);
}
public void mouseEntered(MouseEvent e1){
b6.setForeground(Color.black);
b6.setBackground(Color.white);
}
public void mouseExited(MouseEvent e1){
b6.setForeground(Color.white);
b6.setBackground(bac);
}
public void mousePressed(MouseEvent e1){
b6.setForeground(blu);
b6.setBackground(Color.white);
}
public void mouseReleased(MouseEvent e1){
b6.setForeground(Color.white);
b6.setBackground(bac);
}
}

class m10 implements MouseListener{
Color  blu   = new Color(10,182,199);
Color bac =new Color(85,90,85);
public void mouseClicked(MouseEvent e1){
b7.setForeground(blu);
b7.setBackground(Color.white);
}
public void mouseEntered(MouseEvent e1){
b7.setForeground(Color.black);
b7.setBackground(Color.white);
}
public void mouseExited(MouseEvent e1){
b7.setForeground(Color.white);
b7.setBackground(bac);
}
public void mousePressed(MouseEvent e1){
b7.setForeground(blu);
b7.setBackground(Color.white);
}
public void mouseReleased(MouseEvent e1){
b7.setForeground(Color.white);
b7.setBackground(bac);
}
}

class m11 implements MouseListener{
Color  blu   = new Color(10,182,199);
Color bac =new Color(85,90,85);
public void mouseClicked(MouseEvent e1){
b8.setForeground(blu);
b8.setBackground(Color.white);
}
public void mouseEntered(MouseEvent e1){
b8.setForeground(Color.black);
b8.setBackground(Color.white);
}
public void mouseExited(MouseEvent e1){
b8.setForeground(Color.white);
b8.setBackground(bac);
}
public void mousePressed(MouseEvent e1){
b8.setForeground(blu);
b8.setBackground(Color.white);
}
public void mouseReleased(MouseEvent e1){
b8.setForeground(Color.white);
b8.setBackground(bac);
}
}
  
class m12 implements MouseListener{
Color  blu   = new Color(10,182,199);
Color bac =new Color(85,90,85);
public void mouseClicked(MouseEvent e1){
b9.setForeground(blu);
b9.setBackground(Color.white);
}
public void mouseEntered(MouseEvent e1){
b9.setForeground(Color.white);
b9.setBackground(Color.BLACK);
}
public void mouseExited(MouseEvent e1){
b9.setForeground(Color.black);
b9.setBackground(bac);
}
public void mousePressed(MouseEvent e1){
b9.setForeground(blu);
b9.setBackground(Color.BLACK);
}
public void mouseReleased(MouseEvent e1){
b9.setForeground(Color.black);
b9.setBackground(bac);
}
}

  
}
