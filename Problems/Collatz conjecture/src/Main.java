import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(n + " ");
        while (true) {
            if (n == 1)
                break;
            else if (n % 2 == 0) {
                n = n / 2;
                System.out.print(n + " ");
            } else if (n % 2 != 0) {
                n = (n * 3) + 1;
                System.out.print(n + " ");
            }

        }
    }
}