//Aaron Tesler

public class ArrayMath{
  public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }
  public static double [] addArrays(double [] test ,double [] test2){
      
      int z;
      int w;
      if (test.length<test2.length){
          z=test.length;
          w=test2.length;
      }else{
          z=test2.length;
          w=test.length;
      }
      double []t=new double[w];
      for(int e=0;e<z;e++){
          t[e]=test[e]+test2[e];
      }
      if(test.length>z){
          for(int k=z;k<w;k++){
              t[k]=test[k];
          }
      }
      return t;
  }
  public static boolean equals(double [] puzzle, double [] solved){
      if (puzzle.length==solved.length){
          for(int n=0;n<puzzle.length;n++){
              if(puzzle [n]!=solved[n]){
                  return false;
              }
          }
          return true;
      }else{
          return false;
      }
  }
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
}
