//Aaron Tesler
//Homework 10
import java.util.Scanner;
public class FindDuplicates{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    int num[]=new int[10];//num is the array
    String answer="";
    do{
      System.out.print("Enter 10 ints- ");
      for(int j=0;j<10;j++){
        num[j]=scan.nextInt();
      }
      String out="The array ";
      out+=listArray(num); //return a string of the form "{2, 3, -9}"   
      if(hasDups(num)){//calling if it has duplicates
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="duplicates.";
      System.out.println(out);
      out="The array ";
      out+=listArray(num);    
      if(exactlyOneDup(num)){
        out+="has ";
      }
      else{
        out+="does not have ";
      }
      out+="exactly one duplicate.";
      System.out.println(out);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
      answer=scan.next();
    }while(answer.equals("Y") || answer.equals("y"));
  }

  public static String listArray(int num[]){//lists out the numbers in a string
    String out="{";
    for(int j=0;j<num.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=num[j];
    }
    out+="} ";
    return out;
  }
  public static boolean hasDups(int num[]){
      int p;
      int z;
      for (p=0;p<num.length;p++){
        for (z=0;z<num.length;z++){
          if (num[p]==num[z]){
              if(z==p){
                  continue;
              }else{
                  return true;
              }
          }
      }
      }
      return false;
  }
  public static boolean exactlyOneDup(int zed[]){
      int g;
      int h;
      int i;
      int z=0;
      for (g=0;g<zed.length;g++){
          for (h=g;h<zed.length;h++){
              if (zed[g]==zed[h]){
                  if (g!=h){
                      for(i=h+1;i<zed.length;i++){
                          if (zed[g]==zed[i]){
                              return false;
                          }
                      }
                  z++;}
              }
          }
      }
      if((hasDups(zed))&&(z<=1)){
          return true;
      }else{
          return false;
      }
  }
  
}
