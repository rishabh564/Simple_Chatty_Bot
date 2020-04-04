import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int c = 0;
        int c1 = 0;
        int c2 = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] == 0) {
                c++;
            } else if (arr[j] == -1) {
                c1++;
            } else {
                c2++;
            }
        }