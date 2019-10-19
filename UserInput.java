import java.util.Scanner;

public class UserInput {
  public static void main( String args[]){
    Scanner sc= new Scanner(System.in);
    String name="";
    System.out.println("Enter your name:");
    
    name= sc.nextLine();
    System.out.println("Hi "+ name);
    }
}
 
 import java.io.Scanner;

public class UserInput {
  public static void main( String args[]){
    
   BufferedREader br= new BufferedREader
    String name="";
    System.out.println("Enter your name:");
    
    name= br.readLine();
    System.out.println("Hi "+ name);
    }
}