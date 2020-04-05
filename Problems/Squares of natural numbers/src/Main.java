import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int n1 = i * i;
            if (n1 <= n) {
                System.out.println(n1);
                continue;
            } else {
                break;
            }
        }
    }
}