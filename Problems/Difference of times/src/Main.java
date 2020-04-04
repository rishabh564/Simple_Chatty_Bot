import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h1 = scanner.nextInt();
        int m1 = scanner.nextInt();
        int s1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int m2 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int sec1 = (h2 - h1) * 3600;
        int sec2 = (m2 - m1) * 60;
        int sec3 = (s2 - s1);
        System.out.println(sec1 + sec2 + sec3);

    }
}