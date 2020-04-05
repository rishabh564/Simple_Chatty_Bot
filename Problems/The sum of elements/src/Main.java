import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int sum = 0;
        while (sc.hasNextInt()) {
            a = sc.nextInt();
            if (a == 0)
                break;
            sum += a;
        }

    }
}