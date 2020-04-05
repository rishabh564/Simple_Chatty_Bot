import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        if ((n1 + n2 <= n3) || (n1 + n3 <= n2) || (n2 + n3 <= n1))
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}