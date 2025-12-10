package DataStructure;

import java.util.*;

public class p_11866_요세푸스문제0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            q.addLast(i);
        }

        ArrayList<Integer> result = new ArrayList<>();

        while (!q.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                q.addLast(q.removeFirst());
            }
            int removed = q.removeFirst();
            result.add(removed);
        }
        System.out.print("<");
        for (int i = 0; i < result.size(); i++) {
            if (i == result.size() - 1) {
                System.out.print(result.get(i));
            } else {
                System.out.print(result.get(i) + ", ");
            }
        }
        System.out.print(">");
    }
}
