package exam;

import java.util.Scanner;

public class InfiniteSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string S: ");
        String S = scanner.nextLine();
        System.out.print("Enter string A: ");
        String A = scanner.nextLine();

        if (isSubstringInfinite(S, A)==1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int isSubstringInfinite(String S, String A) {
        String INF = "";
        int len = S.length();

        // Generate the infinite string INF
        while (INF.length() < A.length()) {
            INF += S;
        }

        // Check if A is a substring of INF
        //INF-->hellopooja
        //A-->hellpooojahello
        if (INF.contains(A)) {
            return 1;
        }

        return 0;
    }
}
