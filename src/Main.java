import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        boolean end = false;

        while (!end) {
            System.out.println("Enter Base:");
            long b = console.nextLong();
            System.out.println("Enter Exponent:");
            long n = console.nextLong();
            System.out.println("Enter Modulus:");
            long m = console.nextLong();

            BinaryModularExpo bme = new BinaryModularExpo(b, n, m);

            System.out.println("Result is: " + bme.binModExpo());

            System.out.println("Again? Y/N");

            if (console.next().equalsIgnoreCase("N")) {
                end = true;
            }

        }
        console.close();
    }
}
