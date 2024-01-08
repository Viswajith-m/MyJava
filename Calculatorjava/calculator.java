import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class calculator implements ActionListener{
    JLabel displayLabel;
    JButton but7,but8,but9,div;
    JButton but4,but5,but6,mul;
    JButton but1,but2,but3,sub;
    JButton but0,add,dot,clr;
    JButton equal;
    String oldVal,newVal;
    String operator;
    public calculator(){
        JFrame jf = new JFrame("Calculator.exe");
        jf.setLayout(null);
        jf.setSize(600,700);
        jf.setLocation(400, 100);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        displayLabel = new JLabel("");
        displayLabel.setBounds(350, 30, 250, 40);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.white);

        jf.add(displayLabel);

        but7 = new JButton("7");                        //button 7
        but7.setBounds(30, 130, 80, 80);
        but7.addActionListener(this);
        jf.add(but7);
        but8 = new JButton("8");                        //button8
        but8.setBounds(130, 130, 80, 80);
        but8.addActionListener(this);
        jf.add(but8);
        but9 = new JButton("9");                        //button9
        but9.setBounds(230, 130, 80, 80);
        but9.addActionListener(this);
        jf.add(but9);
        div = new JButton("/");                         //button division
        div.setBounds(330, 130, 80, 80);
        div.addActionListener(this);
        jf.add(div);
        
        but4 = new JButton("4");                        //button 4
        but4.setBounds(30, 230, 80, 80);
        but4.addActionListener(this);
        jf.add(but4);
        but5 = new JButton("5");                        //button 5
        but5.setBounds(130, 230, 80, 80);
        but5.addActionListener(this);
        jf.add(but5);
        but6 = new JButton("6");                        //button 6
        but6.setBounds(230, 230, 80, 80);
        but6.addActionListener(this);
        jf.add(but6);
        mul = new JButton("*");                         //button multiply
        mul.setBounds(330, 230, 80, 80);
        mul.addActionListener(this);
        jf.add(mul);

        but1 = new JButton("1");                        //button 1
        but1.setBounds(30, 330, 80, 80);
        but1.addActionListener(this);
        jf.add(but1);
        but2 = new JButton("2");                        //button 2
        but2.setBounds(130, 330, 80, 80);
        but2.addActionListener(this);
        jf.add(but2);
        but3 = new JButton("3");                        //button 3
        but3.setBounds(230, 330, 80, 80);
        but3.addActionListener(this);
        jf.add(but3);
        sub = new JButton("-");                         //button subtraction
        sub.setBounds(330, 330, 80, 80);
        sub.addActionListener(this);
        jf.add(sub);

        clr=new JButton("clear");                       //button clear
        clr.setBounds(30,430,80,80);
        clr.addActionListener(this);
        jf.add(clr);
        but0 = new JButton("0");                        //button 0
        but0.setBounds(130,430,80,80);
        but0.addActionListener(this);
        jf.add(but0);
        dot = new JButton(".");                         //button .
        dot.setBounds(230,430,80,80);
        dot.addActionListener(this);
        jf.add(dot);
        add = new JButton("+");                         //button addition
        add.setBounds(330,430,80,80);
        add.addActionListener(this);
        jf.add(add);

        equal = new JButton("=");                       //button equal to
        equal.setBounds(30,530,380,50);
        equal.addActionListener(this);
        jf.add(equal);
    }

    public static void main(String[] args) {
        new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object src = e.getSource();
        if (src==but7) {
            displayLabel.setText(displayLabel.getText()+"7");
        }
        else if (src==but8) {
            displayLabel.setText(displayLabel.getText()+"8");
        }
        else if (src==but9) {
            displayLabel.setText(displayLabel.getText()+"9");
        }
        else if (src==div) {//divide
            operator = "/";
            oldVal= displayLabel.getText();
            displayLabel.setText("");
        }

        else if (src==but4) {
            displayLabel.setText(displayLabel.getText()+"4");
        }
        else if (src==but5) {
            displayLabel.setText(displayLabel.getText()+"5");
        }
        else if (src==but6) {
            displayLabel.setText(displayLabel.getText()+"6");
        }
        else if (src==mul) {//multipy
            operator ="*";
            oldVal = displayLabel.getText(); 
            displayLabel.setText("");
        }
        else if (src==but1) {
            displayLabel.setText(displayLabel.getText()+"1");
        }
        else if (src==but2) {
            displayLabel.setText(displayLabel.getText()+"2");
        }
        else if (src==but3) {
            displayLabel.setText(displayLabel.getText()+"3");
        }
        else if (src==sub) {//subtract
            operator = "-";
            oldVal = displayLabel.getText(); 
            displayLabel.setText("");
        }
        else if (src==but0) {
            displayLabel.setText(displayLabel.getText()+"0");
        }
        else if (src==dot) {
            displayLabel.setText(displayLabel.getText()+".");
        }
        else if (src==add) {//addition
            operator="+";
            oldVal = displayLabel.getText(); 
            displayLabel.setText("");
        }
        else if(src==equal){
            newVal = displayLabel.getText();
            if(operator=="/")
            displayLabel.setText(Float.valueOf(oldVal)/Float.valueOf(newVal)+"");
            else if(operator =="+")
            displayLabel.setText(Float.valueOf(oldVal)+Float.valueOf(newVal)+"");
            else if(operator == "*")
            displayLabel.setText(Float.valueOf(oldVal)*Float.valueOf(newVal)+"");
            else
            displayLabel.setText(Float.valueOf(oldVal)-Float.valueOf(newVal)+"");
        }
        else{
            displayLabel.setText("");
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
