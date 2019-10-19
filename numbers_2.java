import java.util.*;
public class numbers_2{
  public static void main(String []args){
   try{
   Scanner in= new Scanner(System.in);
   int num1=in.nextInt();
   int num2=in.nextInt();
   int num3=in.nextInt();
   int num4=in.nextInt();
   int num5=in.nextInt();
   int num6=in.nextInt();
   
   int num=11;
   while(num<=99){  
      int tens=num/10;
      int ones= num%10;
      boolean ten= tens == num1|| tens == num2|| tens == num3|| tens == num4|| tens == num5|| tens == num6;
      boolean one= ones == num1|| ones == num2|| ones == num3|| ones == num4|| ones == num5|| ones == num6;
      if(ten==true || one==true){
      num++;
      }else{
       System.out.println(num);
       num++;
       }
     } 
   }
    catch(Exception e){
    System.out.print("Error");
      }
    }  
  }     
  