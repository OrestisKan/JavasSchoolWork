package calculator123;

import java.awt.*;
import javax.swing.* ;
import java.awt.event.* ;


public class Calculator extends JFrame
{
  
  private JFrame calcFrame;
  private int fontSize;
  private JButton btn1;
  private JButton btn2;
  private JButton btn3;
  private JButton btn4;
  private JButton btn5;
  private JButton btn6;
  private JButton btn7;
  private JButton btn8;
  private JButton btn9;
  private JButton btn10;
  private JButton btn11;
  private JButton btn12;
  private JButton btn13;
  private JButton btn14;
  private JButton btn15;
  private JButton btn16;
  private JButton btnMC;
  private JButton btnMR;
  private JButton btnM;
  private JButton btnC;
  private JTextField txf;
  private JPanel buttons,top ,west;
  private JMenu menuFile, menuSettings,menuMode;
  private JMenuItem miExit,miFont,miColour;
  private JRadioButtonMenuItem rmiSimple,rmiScientific;
  private JMenuBar bar;
  private ButtonGroup group;
  private Boolean cancel;
  private Font font;
  private Color colorBtnBg,colorBtnFg,colorOp,colorOpBg,colorOpFg;
  private String[] names = {"Sin","Cos","Tan","x^y","10^x","Log","x^2","Sqrt","+/-","MOD","n!","DEL"};
  private JButton[] btns =new JButton[12];
  private int choice;    

  
  public Calculator()
  {
    super ("ORESTIS K. CALCULATOR");
    
    calcFrame = this;
    
    btn1 = new JButton("1");
    btn2 = new JButton("2");
    btn3 = new JButton("3");
    btn4 = new JButton("4");
    btn5 = new JButton("5");
    btn6 = new JButton("6");
    btn7 = new JButton("7");
    btn8 = new JButton("8");
    btn9 = new JButton("9");
    btn10 = new JButton("0");
    btn11 = new JButton("/");
    btn12 = new JButton("*");
    btn13 = new JButton("-");
    btn14 = new JButton("+");
    btn15 = new JButton(".");
    btn16 = new JButton("=");
    btnMR = new JButton("MR");
    btnMC = new JButton("MC");
    btnM = new JButton ("M");
    btnC = new JButton ("C");
  
    
    txf = new JTextField(15);
    txf.setEditable(false);
    
    buttons = new JPanel(new GridLayout(4,5));
    buttons.add(btnMC);
    buttons.add(btn7);
    buttons.add(btn8);
    buttons.add(btn9);
    buttons.add(btn11);
    buttons.add(btnMR);
    buttons.add(btn4);
    buttons.add(btn5);
    buttons.add(btn6);
    buttons.add(btn12);
    buttons.add(btnM);
    buttons.add(btn1);
    buttons.add(btn2);
    buttons.add(btn3);
    buttons.add(btn13);
    buttons.add(btnC);
    buttons.add(btn10);
    buttons.add(btn15);
    buttons.add(btn16);
    buttons.add(btn14); 
    
    top = new JPanel();
    top.add(txf);
    
    west =new JPanel(new GridLayout(4,3));
    for (int i=0;i<12 ;i++ ) {
       btns[i]=new JButton(names[i]);
       west.add(btns[i]);
    } // end of for
    west.setVisible(false);
    
    add(top,BorderLayout.NORTH); 
    add(buttons,BorderLayout.CENTER);
    add(west,BorderLayout.WEST);
        
    
    MyNumberHandler mnh = new MyNumberHandler();
    
    btn1.addActionListener(mnh);
    btn2.addActionListener(mnh);
    btn3.addActionListener(mnh);
    btn4.addActionListener(mnh);
    btn5.addActionListener(mnh);
    btn6.addActionListener(mnh);
    btn7.addActionListener(mnh);
    btn8.addActionListener(mnh);
    btn9.addActionListener(mnh);
    btn10.addActionListener(mnh);
    btn15.addActionListener(mnh);
    
    MyOperatorHandler moh = new MyOperatorHandler();
    
    btn11.addActionListener(moh);
    btn12.addActionListener(moh);
    btn13.addActionListener(moh);
    btn14.addActionListener(moh);
    
    MyEqual me = new MyEqual();
    
    btn16.addActionListener(me);
    
    miExit = new JMenuItem("Exit") ;
    miExit.setMnemonic('x');
    miExit.addActionListener(new ActionListener()
    {
    public void actionPerformed (ActionEvent e)
    {
    System.exit(0);
    }
    
    }
    
    );//end of addActionListener  exit
    
    
    miFont = new JMenuItem("Font") ;
    miFont.setMnemonic('F');
    miFont.addActionListener(new ActionListener()
    {
    public void actionPerformed (ActionEvent e)
    {
    //show the dialog for the font
          FontDialog cd = new FontDialog(calcFrame,(Calculator)calcFrame);
          cd.setLocationRelativeTo(calcFrame);
          cancel=false;
          cd.setVisible(true);
          cd = null ;
          if (!cancel) 
            {
              btn11.setFont(font);
              btn12.setFont(font);
              btn13.setFont(font);
              btn14.setFont(font);
               
              
            } // end of if-else
    }
    
    }
    
    );//end of addActionListener font
    
    
    
    miColour = new JMenuItem("Colour") ;
    miColour.setMnemonic('C');
    miColour.addActionListener(new ActionListener()
    {
    public void actionPerformed (ActionEvent e)
        {
          //show the dialog for the Colour 
          ColourDialog cd = new ColourDialog(calcFrame,(Calculator)calcFrame);
          cd.setLocationRelativeTo(calcFrame);
          cancel=false;
          cd.setVisible(true);
          cd = null ;
          if (!cancel) 
            {
                if (choice==1) {
                   //numbers
                  btn1.setBackground(colorBtnBg);
                  btn1.setForeground(colorBtnFg);
                  btn2.setBackground(colorBtnBg);
                  btn2.setForeground(colorBtnFg);
                  btn3.setBackground(colorBtnBg);
                  btn3.setForeground(colorBtnFg);
                  btn4.setBackground(colorBtnBg);
                  btn4.setForeground(colorBtnFg);
                  btn5.setBackground(colorBtnBg);
                  btn5.setForeground(colorBtnFg);
                  btn6.setBackground(colorBtnBg);
                  btn6.setForeground(colorBtnFg);
                  btn7.setBackground(colorBtnBg);
                  btn7.setForeground(colorBtnFg);
                  btn8.setBackground(colorBtnBg);
                  btn8.setForeground(colorBtnFg);
                  btn9.setBackground(colorBtnBg);
                  btn9.setForeground(colorBtnFg);
                  btn10.setBackground(colorBtnBg);
                  btn10.setForeground(colorBtnFg);
                  btn15.setBackground(colorBtnBg);
                  btn15.setForeground(colorBtnFg);
                  btn16.setBackground(colorBtnBg);
                  btn16.setForeground(colorBtnFg);
        
                  //operators
                  btn11.setBackground(colorOpBg);
                  btn11.setForeground(colorOpFg);
                  btn12.setBackground(colorOpBg);
                  btn12.setForeground(colorOpFg);
                  btn13.setBackground(colorOpBg);
                  btn13.setForeground(colorOpFg);
                  btn14.setBackground(colorOpBg);
                  btn14.setForeground(colorOpFg);
    
                } else {
    
                  btn1.setBackground(colorBtnBg);
                  btn1.setForeground(colorBtnFg);
                  btn2.setBackground(colorBtnBg);
                  btn2.setForeground(colorBtnFg);
                  btn3.setBackground(colorBtnBg);
                  btn3.setForeground(colorBtnFg);
                  btn4.setBackground(colorBtnBg);
                  btn4.setForeground(colorBtnFg);
                  btn5.setBackground(colorBtnBg);
                  btn5.setForeground(colorBtnFg);
                  btn6.setBackground(colorBtnBg);
                  btn6.setForeground(colorBtnFg);
                  btn7.setBackground(colorBtnBg);
                  btn7.setForeground(colorBtnFg);
                  btn8.setBackground(colorBtnBg);
                  btn8.setForeground(colorBtnFg);
                  btn9.setBackground(colorBtnBg);
                  btn9.setForeground(colorBtnFg);
                  btn10.setBackground(colorBtnBg);
                  btn10.setForeground(colorBtnFg);
                  btn15.setBackground(colorBtnBg);
                  btn15.setForeground(colorBtnFg);
                  btn16.setBackground(colorBtnBg);
                  btn16.setForeground(colorBtnFg);
                  btn11.setBackground(colorBtnBg);
                  btn11.setForeground(colorBtnFg);
                  btn12.setBackground(colorBtnBg);
                  btn12.setForeground(colorBtnFg);
                  btn13.setBackground(colorBtnBg);
                  btn13.setForeground(colorBtnFg);
                  btn14.setBackground(colorBtnBg);
                  btn14.setForeground(colorBtnFg);
    
                } // end of if-else
              
              
            } // end of if-else
          
          
        }
        
    }
        
        );//end of addActionListener Colour
    
    
    rmiSimple=new JRadioButtonMenuItem("Simple",true);
    rmiSimple.setMnemonic('M');
    rmiSimple.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
                 {
                   west.setVisible(false);
                   Calculator.this.setSize(300,275);
                   }
          }
           );//end of addActionListener rmiSimple
    
    
    rmiScientific = new JRadioButtonMenuItem("Scientific",false);
    rmiScientific.setMnemonic('S');
    rmiScientific.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent e)
                 {
                   west.setVisible(true);
                   Calculator.this.setSize(500,275);
                   }
          }
           );//end of addActionListener rmiScientific
    
      group = new ButtonGroup();
      group.add(rmiSimple);
      group.add(rmiScientific);
    
    
    
    
    menuFile = new JMenu("File");
    menuSettings = new JMenu("Settings");
    menuMode = new JMenu("Mode");
    
    menuSettings.setMnemonic('S');
    menuFile.setMnemonic('F');
    menuMode.setMnemonic('M');
    
    menuSettings.add(miFont);
    menuSettings.add(miColour);
    
    menuFile.add(miExit);
    
    menuMode.add(rmiSimple);
    menuMode.add(rmiScientific);
    
    bar = new JMenuBar();
    
    
    setJMenuBar(bar);
    
    bar.add(menuFile);
    bar.add(menuSettings);
    bar.add(menuMode);
    
    
    
    
    
    
    
    setSize(300,275);
    setLocation(400,400);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
  }//end of calculator() (constructor)
    
  private class MyNumberHandler implements ActionListener
     {
    public void actionPerformed(ActionEvent e)
    {
      JButton tmp = (JButton)e.getSource();
      String text = tmp.getText();
      if (!text.equals(".")) {
        txf.setText(txf.getText()+text);
        
        
      } else {
        String screen = txf.getText();
        if (screen.indexOf(" ")!=-1) {
          //has spaces so has operator
          int spaceAt=screen.lastIndexOf(" ");
          String rhs = screen.substring(spaceAt + 1);
          if (rhs.indexOf(".")!=-1) {
            JOptionPane.showMessageDialog(null,"Error noob");
          } else {
            txf.setText(txf.getText()+text);
          } // end of if-else
          
          
        } else {
          //no spaces no operators
          if (screen.indexOf(".")!=-1) {
            JOptionPane.showMessageDialog(null,"Error noob");
            
          } else {
            txf.setText(txf.getText()+text);
            
          } // end of if-else
          
          
        } // end of if-else
        
        
      } // end of if-else
      
      
    }   // end of ActionPerformed
    

  }// end of MyNumberHandler
  
  public class MyOperatorHandler implements ActionListener
     {
    public void actionPerformed(ActionEvent e)
    {
      JButton tmp = (JButton)e.getSource();
      String text = tmp.getText();
      String screen = txf.getText();
      if (screen.indexOf(" ")!=-1) {
        JOptionPane.showMessageDialog(null," can't have 2 operators");
      } else {
        if (screen.length()!=0){
          
          txf.setText(txf.getText()+" "+text+" ");
        }else{
          JOptionPane.showMessageDialog(null," can't start with operator");
        } //end of if-else
      } // end of if-else
      
    }//end of actionPerformed
  
  }//end of MyOperatorHandler
  
  private class MyEqual implements ActionListener
       {
    public void actionPerformed (ActionEvent e)
    {
      String screen = txf.getText();
      if (screen.length()>0) {
        if(screen.indexOf(" ")!=-1){
          if(screen.length() > screen.lastIndexOf(" ")){
            String lhs = screen.substring(0,screen.indexOf(" "));
            String op = screen.substring(screen.indexOf(" ")+1, screen.indexOf(" ")+2);
            String rhs = screen.substring(screen.lastIndexOf(" ")+1);
            
            double lhsD = Double.parseDouble(lhs);
            double rhsD = Double.parseDouble(rhs);
            double result=0 ;
            if (op.equals("+")) {
              result = lhsD + rhsD;
            } else if (op.equals("-")) {
              result = lhsD - rhsD;
              
            } else if (op.equals("*")) {
              result = lhsD * rhsD;
              
            } else if (op.equals("/")) {
              result = lhsD / rhsD;
            }
            
            JOptionPane.showMessageDialog(null,"the result is : "+ result);       
          }
        }
      } // end of if
      
      
    }//end of actionPerformed
    
    
  }//end of  MyEqual
  
  
  
    
  

  
  
  public static void main (String[] args)
  {
    Calculator calc = new Calculator();
  }//end of psvm
  
  
   public void setFontSize(int x)
   {
     fontSize = x;
     }
  
    public int getFontSize()
    {
      return fontSize;
    
      }
    
    public void cancelled (Boolean x)
    {
      cancel =x;
      }
    
  
    public void updateFont(Font x)
    {
      font=x;
      }
  
  
    public void  updateBtnColor(JButton x)
      {
        colorBtnBg=x.getBackground();
        colorBtnFg=x.getForeground();
        }
    
    public void updateOpColor(JButton x)
           {
                colorOpBg=x.getBackground();
                colorOpFg=x.getForeground();
             }
    
    public void sameColour(int x)
           {
              choice=x;
             }

}//end of Calculator class   (main class)
