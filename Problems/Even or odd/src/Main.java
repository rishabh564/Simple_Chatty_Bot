import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            if (n % 2 == 0) {
                System.out.println("even");
            }
            if ((n % 2) != 0) {
                System.out.println("odd");
            }
        }
    }
}