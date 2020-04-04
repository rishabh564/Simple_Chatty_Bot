import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hbus = sc.nextInt();
        int bridgeno = sc.nextInt();
        int[] arr = new int[bridgeno];

        for (int i = 0; i < bridgeno; i++)
            arr[i] = sc.nextInt();

        int p = 0;
        int bridgecrashno = 0;

        for (int i = 0; i < arr.length; i++) {
            if (hbus >= arr[i]) {
                p = 1;
                bridgecrashno = i + 1;
                break;
            }
        }

        if (p == 0)
            System.out.println("Will not crash");
        else
            System.out.println("Will crash on bridge " + bridgecrashno);
    }
}