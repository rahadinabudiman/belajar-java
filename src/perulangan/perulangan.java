package perulangan;

public class perulangan {
    public static void main(String[] args) {
        int x,y,z;
        
        for ( x = 11; x >= 2; x--) {
            for ( y = 11; y > x; y--) {
                System.out.print(" ");
            }
            for ( z = 1; z < (x * 1); z++) {
                System.out.print(z + " ");
            }
           System.out.println();
        }
    }
}
