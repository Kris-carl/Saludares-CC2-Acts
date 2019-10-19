import java.io.*;
import java.text.DecimalFormat;
 
public class Room {
   public static void main(String [] args) throws IOException{
    
    BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
    DecimalFormat df = new DecimalFormat("###,###.00");
     
     System.out.println("Enter Length");
        String inputString = a.readLine();
        double length = Double.parseDouble(inputString);
     System.out.println("Enter Width");
        String InputHi = b.readLine();
        double width = Double.parseDouble(InputHi);
        double area = length*width;
     System.out.println("The floor space of the room is "+ df.format(area) + " square units.");
        }
 }
      