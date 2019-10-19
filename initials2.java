import javax.swing.*;
 
public class initials2{
   public static void main(String [] args){
      
     String msg=JOptionPane.showInputDialog("Enter your first name's initials");
     char A= msg.charAt(0);
     String msg2=JOptionPane.showInputDialog("Enter your second name's initials");
     char B= msg2.charAt(0);
     String msg3=JOptionPane.showInputDialog("Enter your last name's initials");
     char C= msg3.charAt(0);
     JOptionPane.showMessageDialog(null,A+"."+B+"."+C+".");
     
         }
   }       
      
     