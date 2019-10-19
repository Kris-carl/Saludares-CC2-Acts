import java.util.*;
  public class numbers{
    public static void main(String [] args){
    try{
    Scanner sc= new Scanner(System.in);
    int num1, num2, num3, num4, num5, num6;
    System.out.print("Enter a number from 0-9: ");
    num1= sc.nextInt();num2= sc.nextInt();num3= sc.nextInt();num4= sc.nextInt();num5= sc.nextInt();
    num6= sc.nextInt();
    if(num1 >=0 && num1 <=9 && num2 >=0 && num2 <=9 && num3 >=0 && num3 <=9 && num4 >=0 && num4 <=9 &&num5 >=0 && num5 <=9 &&num6 >=0 && num6 <=9){
     for(int i= 11; i<100; i++){
     int tens=i/10;
     int ones=i%10; 
      if(num1==tens || num2==tens || num3==tens || num4==tens || num5==tens || num6==tens || num1==ones || num2==ones || num3==ones || num4==ones || num5==ones || num6==ones){
        continue;
     }else{
      System.out.println(i);            
         }
       }
    }else{
     System.out.print("Error");
           }
       }catch(Exception e){
    System.out.print("Invalid Input");
      }
   }
}
    