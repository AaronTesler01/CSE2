//Aaron Tesler
//Homework 05 Part 1
//Hail to the King, baby.
import java.util.Scanner;//import Scanner

public class BurgerKing{//class
    public static void main(String args[]){//method
        
        Scanner BurgerScanner;//making the scanner
        BurgerScanner=new Scanner(System.in);
        System.out.print("Enter a letter to order Burger (b or B), Soda (S or s), Fries (F or f).");//Beginning the order
        String order=BurgerScanner.next();//inputting the scanner
            if (order.equals("b")){//using if then statements for master then switch within
                 System.out.print("Do you want all the fixins? (A or a), just cheese (c or C), or none of the above (n or N)?"); 
                
                    char b=BurgerScanner.next().charAt(0);//burger
                    switch (b){
                        case 'a': System.out.println("You ordered a burger with all the fixins.");
                                    break;
                        case 'A': System.out.println("You ordered a burger with all the fixins.");
                                    break;
                        case 'c': System.out.println("You ordered a burger with only cheese.");
                                    break;
                        case 'C': System.out.println("You ordered a burger with only cheese.");
                                    break;
                        case 'n': System.out.println("You ordered a burger with nothing on it.");
                                    break;
                        case 'N': System.out.println("You ordered a burger with nothing on it.");
                                    break;
                        default: System.out.println("Invalid response.");
                                    break;
                        }
            
                }else if(order.equals("B")){
                 System.out.print("Do you want all the fixins? (A or a), just cheese (c or C), or none of the above (n or N)?"); 
                
                    char b=BurgerScanner.next().charAt(0);//capital burger
                    switch (b){
                        case 'a': System.out.println("You ordered a burger with all the fixins.");
                                    break;
                        case 'A': System.out.println("You ordered a burger with all the fixins.");
                                    break;
                        case 'c': System.out.println("You ordered a burger with only cheese.");
                                    break;
                        case 'C': System.out.println("You ordered a burger with only cheese.");
                                    break;
                        case 'n': System.out.println("You ordered a burger with nothing on it.");
                                    break;
                        case 'N': System.out.println("You ordered a burger with nothing on it.");
                                    break;
                        default: System.out.println("Invalid response.");
                                    break;
                        }
                }else if (order.equals("s")){ System.out.print("Do you want Pepsi (p or P), Coke (c or C), Mountain Dew (m or M), or Sprite (s or S)?");
                    char s=BurgerScanner.next().charAt(0);//lowercase soda
                    switch (s){
                        case 'p': System.out.println("You ordered a Pepsi.");
                                    break;
                        case 'P': System.out.println("You ordered a Pepsi.");
                                    break;
                        case 'c': System.out.println("You ordered a Coke.");
                                    break;
                        case 'C': System.out.println("You ordered a Coke.");
                                    break;
                        case 'm': System.out.println("You ordered a Mountain Dew.");
                                    break;
                        case 'M': System.out.println("You ordered a Mountain Dew.");
                                    break;
                        case 's': System.out.println("You ordered a Sprite.");
                                    break;
                        case 'S': System.out.println("You ordered a Sprite.");
                                    break;
                        default: System.out.println("Invalid response.");
                                    break;
                         }
                }else if (order.equals("S")){ System.out.print("Do you want Pepsi (p or P), Coke (c or C), Mountain Dew (m or M), or Sprite (s or S)?");
                    char soda=BurgerScanner.next().charAt(0);//uppercase soda
                    switch (soda){
                        case 'p': System.out.println("You ordered a Pepsi.");
                                    break;
                        case 'P': System.out.println("You ordered a Pepsi.");
                                    break;
                        case 'c': System.out.println("You ordered a Coke.");
                                    break;
                        case 'C': System.out.println("You ordered a Coke.");
                                    break;
                        case 'm': System.out.println("You ordered a Mountain Dew.");
                                    break;
                        case 'M': System.out.println("You ordered a Mountain Dew.");
                                    break;
                        case 's': System.out.println("You ordered a Sprite.");
                                    break;
                        case 'S': System.out.println("You ordered a Sprite.");
                                    break;
                        default: System.out.println("Invalid response.");
                                    break;
                        
                        }
                    
                }else if (order.equals("f")){ System.out.print("Do you want your fries large (L or l) or small (s or S)?");
                    char f=BurgerScanner.next().charAt(0);//lowercase fries
                    switch (f){
                        case 's': System.out.println("You ordered some small fries.");
                                    break;
                        case 'S': System.out.println("You ordered some small fries.");
                                    break;
                        case 'l': System.out.println("You ordered some large fries.");
                                    break;
                        case 'L': System.out.println("You ordered some large fries.");
                                    break;
                        default: System.out.print("Invalid Response.");
                                    break;
                           }
                }else if (order.equals("F")){ System.out.print("Do you want your fries large (L or l) or small (s or S)?");
                    char fries=BurgerScanner.next().charAt(0);//uppercase fries
                    switch (fries){
                        case 's': System.out.println("You ordered some small fries.");
                                    break;
                        case 'S': System.out.println("You ordered some small fries.");
                                    break;
                        case 'l': System.out.println("You ordered some large fries.");
                                    break;
                        case 'L': System.out.println("You ordered some large fries.");
                                    break;
                        default: System.out.print("Invalid Response.");
                                    break;
                           }
            
                }else{//none of the above
                    System.out.println("Please enter a valid response.");
                }    
                    
                
                
                    
            
        
    }//method
    
}//class