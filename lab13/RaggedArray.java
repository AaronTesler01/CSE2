//Aaron Tesler
//Lab 13
import java.util.Random;
public class RaggedArray{
    public static void main(String [] args){
        int [][] array;
        array =new int[17][5];
        for(int a=0;a<5;a++){
            for(int x=0;x<((a*3)+5);x++){
                array[x][a]=(int) (Math.random()*40);
            }
        }
        for(int x=0;x<5;x++){
            for(int v=0;v<((x*3)+5);v++){
                System.out.print(array[v][x]+",");
            }
            System.out.println();
        }
        int c=0;
        int x=0;
        int min=array[0][0];
        for(int z=0;z<5;z++){
            for(int v=0;v<((z*3)+5-1);v++){
                min=array[v][z];
                int index=v;
                for(int j=v+1;j<((z*3)+5);j++){
                    if(min>array[j][z]){
                        min=array[j][z];
                        index=j;
                    }
                }
                if(index!=v){
                    array[index][z]=array[v][z];
                    array[v][z]=min;
                }
                
            }
            min= array[0][z];
        }
        for(int z=0;z<5;z++){
            for(int v=0;v<((z*3)+5);v++){
                System.out.print(array[v][z]+",");
            }
            System.out.println();
        }
    }
}