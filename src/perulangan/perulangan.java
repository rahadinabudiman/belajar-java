package perulangan;

public class perulangan {
    public static void main(String[] args) {
        int x,y,z;
        
        for ( x = 10; x >=1; x--) {
            for ( y = 10; y > x; y--) {
                System.out.print(" ");
            }
            for ( z = 1; z <= (x * 1); z++) {
                System.out.print(z % 10 + " ");
            }
           System.out.println();
        }
    }
}
