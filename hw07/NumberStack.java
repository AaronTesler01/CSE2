//Aaron Tesler
//Homework 07
//AKA Tetris

import java.util.Scanner;

public class NumberStack{
    public static void main(String args[]){
        
        Scanner numberScanner;//importing scanner
        numberScanner = new Scanner(System.in);
        
        System.out.print("Enter an integer between 1 and 9:");
            int x=numberScanner.nextInt();
            int z=((2*x)-1);
        for(int n=1;n<=x;n++){//each number goes through here
            for(int r=1;r<=n;r++){//making sure of multiple rows
             System.out.println();
                for(int c=0;c<=z;c++){//calculating exact position
                    if (c<(x-(n-1))){
                        System.out.print(" ");
                    }else if (c>=(x-(n-1))&&(c<=(x+(n-1)))){
                        System.out.print(n);
                    }else if (c>(x+(n-1))){
                        System.out.print(" ");
                        }
                    
                    }
                
            System.out.println();
            if (r==n){
                 System.out.println();
                  for(int d=0;d<=z;d++){//calculating exact position
                    if (d<(x-(n-1))){
                        System.out.print(" ");
                    }else if (d>=(x-(n-1))&&(d<=(x+(n-1)))){
                        System.out.print("-");
                    }else if (d>(x+(n-1))){
                        System.out.print(" ");
                        } 
                    }
                  
                System.out.println();}
            }//final for loop for calculating position
            
            
                
             
            
        
            
        }
        System.out.println("Enter an integer between 1 and 9:");//while loop
            int d=numberScanner.nextInt();//d=x
            int e=((2*d)-1);//e=z
            int f=1;//r=f
            int g=1;//g=n
            int h=0;//c=h
        while(g<=d){//each number goes through here
            
            while(f<=g){//making sure of multiple rows
                System.out.println();
                
                while(h<=e){//calculating exact position
                    
                    if (h<(d-(g-1))){
                        System.out.print(" ");
                    }else if (h>=(d-(g-1))&&(h<=(d+(g-1)))){//STOPPED HERE RETURN HERE
                        System.out.print(g);
                    }else if (h>(d+(g-1))){
                        System.out.print(" ");
                        }
                    h++;}
                
            System.out.println();
            if (f==g){
                System.out.println();
                h=0;
                  while(h<=e){//calculating exact position
                    if (h<(d-(g-1))){
                        System.out.print(" ");
                    }else if (h>=(d-(g-1))&&(h<=(d+(g-1)))){
                        System.out.print("-");
                    }else if (h>(d+(g-1))){
                        System.out.print(" ");
                        } 
                    
                    h++;}
                    System.out.println();  
                    }
            f++;}//final for loop for calculating position
            
            
                
             
            
        
        h=0;    
        g++;}
        System.out.println("Enter an integer between 1 and 9:");//do while loop
            int i=numberScanner.nextInt();//i=d
            int j=((2*i)-1);//e=j
            int k=1;//f=k
            int l=1;//g=l
            int m=0;//h=m
        do{//each number goes through here
            
            do{//making sure of multiple rows
                System.out.println();
                
                do{//calculating exact position
                    
                    if (m<(i-(l-1))){
                        System.out.print(" ");
                    }else if (m>=(i-(l-1))&&(m<=(i+(l-1)))){//STOPPED HERE RETURN HERE
                        System.out.print(l);
                    }else if (m>(i+(l-1))){
                        System.out.print(" ");
                        }
                    m++;}while(m<=j);
                
            System.out.println();
            if (k==l){
                System.out.println();
                m=0;
                  while(m<=j){//calculating exact position
                    if (m<(i-(l-1))){
                        System.out.print(" ");
                    }else if (m>=(i-(l-1))&&(m<=(i+(l-1)))){
                        System.out.print("-");
                    }else if (m>(i+(l-1))){
                        System.out.print(" ");
                        } 
                    
                    m++;}
                    System.out.println();  
                    }
            k++;}while(k<=l);//final for loop for calculating position
            
            
                
             
            
        
        m=0;    
        l++;}while(l<=i);
        
        
    }//method
}//class