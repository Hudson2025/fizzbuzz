
public class fizzzbuzzz
{
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if ( (i/15) * 15 == i) {
                System.out.println("fizzbuzz");
            }
            else if ( (i/3) * 3 == i) {
                System.out.println("fizz");
            }
            else if ( (i/5) * 5 == i) {
                System.out.println("buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}