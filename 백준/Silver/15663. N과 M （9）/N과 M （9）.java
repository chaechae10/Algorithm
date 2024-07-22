import java.util.*;

public class Main{
    static int A[], arr[], N, M;
    static boolean visited[];
    static Set<String> set;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        visited = new boolean[N];
        arr = new int[M];
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        set = new LinkedHashSet<>();
        dfs(0);
        set.forEach(System.out::println);
        sc.close();
    }

    private static void dfs(int depth) {
        if (depth == M) {
            StringBuilder temp = new StringBuilder();
            for (int num : arr) {
                temp.append(num).append(" ");
            }
            set.add(temp.toString());
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                // 중복된 값을 건너뛰는 조건
                if (i > 0 && A[i] == A[i - 1] && !visited[i - 1]) {
                    continue;
                }
                visited[i] = true;
                arr[depth] = A[i];
                dfs(depth + 1);
                visited[i] = false;
            }
        }
    }
}