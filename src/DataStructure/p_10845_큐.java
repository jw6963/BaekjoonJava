package DataStructure;

import java.util.*;

public class p_10845_큐 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            if (s.startsWith("push")) {
                int num = Integer.parseInt(s.split(" ")[1]);
                queue.addLast(num);
            } else if (s.equals("pop")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.removeFirst());
                }
            } else if (s.equals("size")) {
                System.out.println(queue.size());
            } else if (s.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (s.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.getFirst());
                }
            } else if (s.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.getLast());
                }
            }
        }
    }
}
