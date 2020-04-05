import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static String[] reverse(String[] words) {
        // write your code here

        String[] arr = new String[words.length];
        int j = 0;
        for (int i = words.length - 1; i >= 0; i--) {
            arr[j] = words[i];
            j++;
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split("\\s+");
        String[] reversed = reverse(words);
        Arrays.stream(reversed).forEach(e -> System.out.print(e + " "));
    }
}