package DataStructure;

import java.util.*;

public class p_1764_듣보잡 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();

        HashSet<String> set = new HashSet<>();
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            set.add(s);
        }
        for (int i = 0; i < M; i++) {
            String s = sc.nextLine();
            if (set.contains(s)) {
                result.add(s);
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }

    }
}
