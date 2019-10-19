public class VariablesAndDataTypes{
  public static void main(String [] args){
    char a = 'A';
    long hour = 24;
    short day = 7;
    byte week = 4;
    int month = 12;
    float temp = 16;
    double celc = 23.5;
    String  Temp = " The temperature in Baguio City has warmed throughout the years.";
    boolean hi= true;
    if(hi==true){ 
    System.out.print( Temp  +"\n   " + 
                            a  +  " recent news article stated that the City has been averaging " + temp + 
                       " degrees celsuis at dawn and "  + celc +  " at noon. " + "\n"+
                       "         Regardless, lowlanders still feel cold " + hour +  " hours a day, "  + day +
                       " days a week, "  + week +  " weeks per month and " + month + " months each year. ");
                      }
                      else {
                      System.out.println("The boolean was changed to a FALSE value");
                      }
                      
              }
    }

