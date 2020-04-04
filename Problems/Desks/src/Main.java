import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int sum = (a + b + c);
        if (sum % 2 == 0)
            System.out.println(sum / 2);
        else
            System.out.println((sum / 2) + 1);
    }
}