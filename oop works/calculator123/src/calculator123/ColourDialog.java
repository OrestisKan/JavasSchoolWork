package calculator123;

import java.awt.*;
import javax.swing.* ;
import java.awt.event.* ;


public class ColourDialog extends JDialog
{
  private Calculator parent;
  private JButton btnOK,btnCancel , btnSelectOpCol,btnSelectBtnCol,btnSampleBtn,btnSampleOp ;
  private JPanel top,middle ,bottom;
  private JComboBox cbChange;
  String choices[] ={"Same colours everywhere","Operators use other colours"};
  private int choice,combo; 
  private Color colorBtn,colorOp;
   
  
  public ColourDialog(Frame f , Calculator tmpParent)
  {
    super(f,true);
    final Calculator calcu = tmpParent;
    this.parent=tmpParent;
    
    
    
    //declare buttons
    btnOK = new JButton("OK");
    btnCancel = new JButton("Cancel");
    btnSelectBtnCol = new JButton("Select Colour");
    btnSelectOpCol = new JButton("Select Colour ");
    btnSampleBtn = new JButton("Sample Button");
    btnSampleOp = new JButton(" Sample Operators");
    
    //declare Panels
    top = new JPanel(new FlowLayout(FlowLayout.CENTER));
    middle = new JPanel(new FlowLayout(FlowLayout.CENTER));
    bottom = new JPanel(new FlowLayout(FlowLayout.CENTER));
    
    //declare ComboBox
    cbChange = new JComboBox(choices);
    cbChange.setSelectedIndex(0);
    
    btnSelectOpCol.setVisible(false);
    btnSampleOp.setVisible(false);
    
     
    
     btnCancel.addActionListener(new ActionListener()
      {
        public void actionPerformed (ActionEvent e)
        {
          setVisible(false);
        }
    
      }
    
     );//end of addActionListener  btnCancel
     
     
      btnOK.addActionListener(new ActionListener()
      {
        public void actionPerformed (ActionEvent e)
        {
          parent.updateBtnColor(btnSampleBtn);
          parent.updateOpColor(btnSampleOp);
          parent.sameColour(combo);
    
          setVisible(false);
        }
    
      }
    
     );//end of addActionListener  btnOK
    
    
     cbChange.addItemListener(new ItemListener()
      {
       public void itemStateChanged(ItemEvent e)
        {
             choice=cbChange.getSelectedIndex();
            switch (choice) {
            case 0 :  
                btnSelectOpCol.setVisible(false);
                btnSampleOp.setVisible(false);
                updateSize(true);
                combo=0;
                
              break;
            case  1:  
                 btnSelectOpCol.setVisible(true);
                 btnSampleOp.setVisible(true);
                 updateSize(false);
                 combo=1;
              break;
              }
    
            }
       
       
      }
     );//end of cbChange Item Listener
    
    
    btnSelectBtnCol.addActionListener(new ActionListener()
      {
       public void actionPerformed(ActionEvent e)
        {
    
              colorBtn = JColorChooser.showDialog(ColourDialog.this,"Choose a Color", colorBtn);
              if (colorBtn.getRed()<103&&colorBtn.getBlue()<103&&colorBtn.getGreen()<103) {
                  btnSampleBtn.setForeground(Color.WHITE);
              }  else {
                btnSampleBtn.setForeground(Color.BLACK);
                } 
              btnSampleBtn.setBackground(colorBtn);
              
          }
    
    
      }
     );//end of btnSelectBtnCol Item Listener
    
    
    btnSelectOpCol.addActionListener(new ActionListener()
      {
       public void actionPerformed(ActionEvent e)
        {
    
              colorOp = JColorChooser.showDialog(ColourDialog.this,"Choose a Color", colorOp);
              if (colorOp.getRed()<103&&colorOp.getBlue()<103&&colorOp.getGreen()<103) {
                  btnSampleOp.setForeground(Color.WHITE);
              }  else {
                btnSampleOp.setForeground(Color.BLACK);
                } 
              btnSampleOp.setBackground(colorOp);
              
          }
    
    
      }
     );//end of btnSelectOpCol Item Listener
    
    
    
    
    
    
     //Controll of Layout
     getContentPane().setLayout(new BorderLayout());
    
     bottom.add(btnOK);
     bottom.add(btnCancel);
    
     top.add(cbChange);
  
     middle.add(btnSampleBtn);
     middle.add(btnSampleOp);
     middle.add(btnSelectBtnCol);
     middle.add(btnSelectOpCol);
     
  
     getContentPane().add(top,BorderLayout.NORTH);
     getContentPane().add(bottom,BorderLayout.SOUTH);
     getContentPane().add(middle,BorderLayout.CENTER);
    
    
     
    
     updateSize(true);
    
    
    }//end of constructor
  

  private void updateSize(boolean small)
  {
    if(small)
      ColourDialog.this.setSize(250, 200);
    else
      ColourDialog.this.setSize(330, 200);
  }    
  

  }//end of ColourDialog class
