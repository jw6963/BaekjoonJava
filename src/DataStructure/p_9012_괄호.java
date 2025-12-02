package DataStructure;

import java.util.*;

public class p_9012_괄호 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> st = new Stack<>();
        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            String word = sc.nextLine();
            boolean isValid = true;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == '(') {
                    st.push(word.charAt(j));
                } else if (word.charAt(j) == ')') {
                    if (st.isEmpty()) {
                        isValid = false;
                        break;
                    } else {
                        st.pop();
                    }
                }
            }
            if (!st.isEmpty()) {
                isValid = false;
            }
            System.out.println(isValid ? "YES" : "NO");
            st.clear();
        }
    }
}