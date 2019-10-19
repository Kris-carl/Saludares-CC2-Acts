import java.util.Scanner;
 public class operations{
    public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    String operation;
    int a,b;
    
    System.out.print("Enter # of operations: ");
    int num=sc.nextInt();
    
    if(num >=1 & num <=100){
     System.out.print("Enter all operations in one line: ");
       for(int i= 1;num >= i;i++){
       operation= sc.next();
       if(operation.equals("negate")){
          a=sc.nextInt();
          System.out.println(-a);
      }else if (operation.equals("add")){
          a=sc.nextInt();
          b=sc.nextInt();
          System.out.println(a+b); 
      }else if(operation.equals("max")){
          a=sc.nextInt();
          b=sc.nextInt();
         if(a>b)
            System.out.print(a);
         else
            System.out.print(b);
      }else{
       System.out.println("Invalid Input");
               }
         } 
    }
     else {
     System.out.println("Invalid Input");
               }   
         }
    }