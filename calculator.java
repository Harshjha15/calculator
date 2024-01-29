import javax.swing.*;
import java.awt.event.*;

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


l1.setBounds(250,00,300,100);
l2.setBounds(50,100,200,50);
l3.setBounds(50,165,200,50);
l4.setBounds(250,420,300,100);
t1.setBounds(200,100,300,50);
t2.setBounds(200,165,300,50);
b1.setBounds(200,250,100,50);
b2.setBounds(300,250,100,50);
b3.setBounds(400,250,100,50);
b4.setBounds(200,300,100,50);
b5.setBounds(300,300,100,50);
b6.setBounds(400,300,100,50);
b7.setBounds(200,350,100,50);
b8.setBounds(300,350,100,50);
b9.setBounds(400,350,100,50);



b1.addActionListener(new add());
b2.addActionListener(new sub());
b3.addActionListener(new mul());
b4.addActionListener(new div());
b5.addActionListener(new rem());
b6.addActionListener(new sqrt());
b7.addActionListener(new sqr());
b8.addActionListener(new rev());
b9.addActionListener(new clr());

}

public static void main (String args[]){
calculator c1=new calculator("DEVELOPED BY HARSH JHA");
c1.setVisible(true);
c1.setSize(600,600);
c1.setcomponents();
c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}


class  add implements ActionListener{
public void actionPerformed(ActionEvent e1){
try{
double s1=Double.parseDouble(t1.getText());
double s2=Double.parseDouble(t2.getText());
double s3=s1+s2;
t1.setText("");
t2.setText("");
l4.setText("ADDIDITION IS =    "+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setText("WRONG INPUT");
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
l4.setText("SUBTRACTION IS =    "+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setText("WRONG INPUT");
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
l4.setText("Multiplication IS =    "+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setText("WRONG INPUT");
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
l4.setText("DIVISION IS =    "+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setText("WRONG INPUT");
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
l4.setText("REMAINDER IS =    "+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setText("WRONG INPUT");
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
l4.setText("SQUARE IS =    "+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setText("WRONG INPUT");
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
l4.setText("SQUAREROOT IS =    "+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setText("WRONG INPUT");
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
l4.setText(" =    "+s3);
}
catch(Exception e){
t1.setText("");
t2.setText("");
l4.setText("WRONG INPUT");
}
}
}

}