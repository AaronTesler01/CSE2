public class Testing {

    public static void main(String args[]) {

        //using methods defined in a & b
        int input = 1;
for( i = 0; i < 3; i++){
X( input );
Y( input );
System.out.println( "input: " + input );
}

    }

    public static void X(int i) {
        i=i-2;
    }
    public static void Y(int z) {
        z=z/2;
    }

}