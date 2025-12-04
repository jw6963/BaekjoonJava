package DataStructure;

import java.util.*;

public class p_2164_카드2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            st.addLast(i);
        }
        while (st.size() > 1) {
            st.removeFirst();
            st.addLast(st.removeFirst());
        }
        System.out.println(st.getFirst());
    }
}
