package DataStructure;

import java.util.*;

public class p_10773_제로 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        sc.nextLine();
        Stack<Integer> st = new Stack<Integer>();

        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            if (a != 0) {
                st.push(a);
            } else {
                st.pop();
            }
        }
        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }
        System.out.println(sum);
    }
}
