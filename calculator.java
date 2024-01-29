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

l4.setForeground(Color.RED);
t1.setForeground(Color.BLUE);
t2.setForeground(Color.BLUE);
l1.setForeground(Color.GREEN);
b1.setForeground(Color.GRAY);
b2.setForeground(Color.GRAY);
b3.setForeground(Color.GRAY);
b4.setForeground(Color.GRAY);
b5.setForeground(Color.GRAY);
b6.setForeground(Color.GRAY);
b7.setForeground(Color.GRAY);
b8.setForeground(Color.GRAY);

t1.setBackground(Color.GRAY);
t2.setBackground(Color.GRAY);

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
l4.setBounds(200,420,400,100);
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
l4.setBounds(100,420,500,100);
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
l4.setBounds(100,420,500,100);
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
l4.setBounds(100,420,500,100);
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
l4.setBounds(100,420,500,100);
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
l4.setBounds(100,420,500,100);
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
l4.setBounds(100,420,500,100);
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
l4.setBounds(100,420,500,100);
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
l4.setBounds(100,420,500,100);
l4.setText("PLEASE ENTER NUMBER ONLY");
}
}
}

public static void main (String args[]){
calculator c1=new calculator("DEVELOPED BY HARSH JHA");
c1.setVisible(true);
c1.setSize(600,600);
c1.setcomponents();
c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}
