import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while (true) {
            a = sc.nextInt();
            if (a == 0)
                break;
            arr.add(a);
        }

    }
}