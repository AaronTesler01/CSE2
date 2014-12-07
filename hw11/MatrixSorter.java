//Aaron Tesler
//Homework 11
public class MatrixSorter {
  public static void main(String arg[]) {
    int mat3d[][][];
    mat3d = buildMat3d();
    show(mat3d);
    System.out.println("The smallest entry in the 3D matrix is " +
      findMin(mat3d));
    System.out.println("After sorting the 3rd matrix we get");
    sort(mat3d[2]);
    show(mat3d);
  }
  public static int[][][] buildMat3d() {
    int[][][] mat3d = new int[3][][]; {
    for (int z = 0; z < mat3d.length; z++) {
      mat3d[z]=new int[3+(2*z)][];
      for (int y = 0; y < (3 + (2 * z)); y++) {
        mat3d[z][y]=new int[z+y+1];
        for (int x = 0; x < (z + y + 1); x++) {
          
          mat3d[z][y][x] = ((int)(Math.random() * 98) + 1);
        }
      }
    }
    return mat3d;
  }
  }
  public static void show(int[][][] array) {
    for (int z = 0; z < array.length; z++) {
      System.out.println("Slab " + (z + 1) + "-----------");
      for (int y = 0; y < array[z].length; y++) {
        for (int x = 0; x < array[z][y].length; x++) {
          System.out.print(array[z][y][x] + " ");
        }
        System.out.println();
      }
    }
  }
  public static int findMin(int[][][] sorter) {
    int min = sorter[0][0][0];
    for (int z = 0; z < 3; z++) {
      for (int y = 0; y < (3 + (2 * z)); y++) {
        for (int x = 0; x < (z + y + 1); x++) {
          if (sorter[z][y][x] < min) {
            min = sorter[z][y][x];
          }
        }
      }
    }
    return min;
  }
  public static void sort(int[][] third) { //unsure
    
      sortrow(third);
      
    int minimum=third[0][0];//starting minimum
    for(int p=1;p<third.length;p++){//starting outside number
      int mini=third[p][0];//temp variable for comparison
      int h=p-1;
      
      System.out.println(third[p][0]);//help for debugging
      System.out.println(third[h][0]);//help for debugging
      for(h=p-1;(h>=0)&&(third[h][0]>mini);h--){//if h>0 or if value is less than other will swap
          
          int [] temp=third[h+1];
          third[h+1]=third[h];
          third[h]=temp;
        
      }
    }
    }
  public static void sortrow(int array[][]){//using both sorts
    for (int i=0;i<array.length;i++){
    for (int x = 0; x < array[i].length; x++) {
        int minimum = array[i][x]; //unsure
        int index = x;

        for (int n = x + 1; n < array[i].length; n++) {
          if (minimum > array[i][n]) {
            minimum = array[i][n];
            index = n;
          }
        }
        if (index != x) {
          array[i][index] = array[i][x];
          array[i][x] = minimum;
        }
      }
      
  }
  }
}
