package DataStructure;

import java.util.*;

public class p_10828_스택 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        sc.nextLine();
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            if (line.startsWith("push")) {
                int num = Integer.parseInt(line.split(" ")[1]);
                st.push(num);
            } else if (line.equals("pop")) {
                if (st.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(st.pop());
                }
            } else if (line.equals("size")) {
                System.out.println(st.size());
            } else if (line.equals("empty")) {
                if (st.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (line.equals("top")) {
                if (st.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(st.peek());
                }
            }
        }
    }
}
