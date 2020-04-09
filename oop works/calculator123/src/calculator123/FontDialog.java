package calculator123;

import java.awt.*;
import javax.swing.* ;
import java.awt.event.* ;

public class FontDialog extends JDialog
{
  private Calculator parent;
  private JButton btnOK, btnCancel;
  private JPanel top,bottom;
  private JComboBox fontSize,fontFamily,fontStyle;
  private JLabel fontSample;
  String sizes[]= {"10","12","14","16","18","20"};
  String styles[]={"Plain","Bold","Italic"};
  String families[] = {"Dialog","Arial","Courier New","Times New Roman"};
  
  public FontDialog(Frame f , Calculator tmpParent)
  {
    super(f,true);
    final Calculator calcu = tmpParent;
    this.parent=tmpParent;
    
     bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
     top = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
     btnOK = new JButton("OK");
     btnCancel = new JButton("Cancel");
    
     fontSample = new JLabel("This is a sample text");
     setTitle(fontSample.getFont().getFamily().toString());
     
     fontSize = new JComboBox(sizes);
     fontSize.setSelectedIndex(1);
     fontFamily = new JComboBox(families);
     fontStyle = new JComboBox(styles);
     fontStyle.setSelectedIndex(1);
    
     btnOK.addActionListener(new ActionListener()
      {
        public void actionPerformed (ActionEvent e)
        {
          parent.updateFont(fontSample.getFont());
          setVisible(false);
        }
    
      }
    
     );//end of addActionListener  btnOK
    
    
     fontSize.addItemListener(new ItemListener()
      {
       public void itemStateChanged(ItemEvent e)
        {
          updateFont();
          }
    
      }
     );//end of fontSize Item Listener
    
    
    fontStyle.addItemListener(new ItemListener()
      {
       public void itemStateChanged(ItemEvent e)
        {
          updateFont();
          }
    
      }
     );//end of fontStyle Item Listener
    
    
    fontFamily.addItemListener(new ItemListener()
      {
       public void itemStateChanged(ItemEvent e)
        {
          updateFont();
          }
    
      }
     );//end of fontFamily Item Listener
    
     btnCancel.addActionListener(new ActionListener()
      {
        public void actionPerformed (ActionEvent e)
        {
          parent.cancelled(true);
          setVisible(false);
        }
    
      }
    
     );//end of addActionListener  btnCancel
    
    
    
    
     getContentPane().setLayout(new BorderLayout());
    
     bottom.add(btnOK);
     bottom.add(btnCancel);
    
     top.add(fontFamily);
     top.add(fontStyle);
     top.add(fontSize);
    
     getContentPane().add(top,BorderLayout.NORTH);
     getContentPane().add(bottom,BorderLayout.SOUTH);
     getContentPane().add(fontSample,BorderLayout.CENTER);
    
    
     setSize(300,200);
    
    
    }//end of constructor
  
    public void updateFont()
    {
      int size = fontSize.getSelectedIndex();
      int family = fontFamily.getSelectedIndex();
      int style = fontStyle.getSelectedIndex();
    
    switch (style) {
      case 0 :  
          style=Font.PLAIN;
        break;
      case  1:  
           style=Font.BOLD;
        break;
      case  2: 
        style=Font.ITALIC;
        break; 
        
    } // end of switch
    
      Font f =new Font(families[family],style,Integer.parseInt(sizes[size]));
      fontSample.setFont(f);
    
     }//end of updateFont



  }//end of FontDialog class
