import java.util.Scanner;

public class Main {
    static int[][] graph = new int[1001][1001];//그래프 인접 행렬
    static int V;//정점
    static int E;//간선
    static boolean[] visited = new boolean[1001];//방문 여부 배열

    public static void dfs(int index) {
        if (visited[index]) {//이미 방문한 정점
            return;
        }
        visited[index] = true;//방문 표시

        for (int i = 1; i <= V; i++) {
            if (graph[index][i] == 1 && !visited[i]) {//연결된 정점이고 방문하지 않았다면
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        V = sc.nextInt();//정점 수 입력
        E = sc.nextInt();//간선 수 입력

        int a, b;
        for (int i = 0; i < E; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            graph[a][b] = graph[b][a] = 1;//간선 연결(무방향 그래프)
        }

        int result = 0;
        // dfs 탐색
        for (int i = 1; i <= V; i++) {//모든 정점 탐색하며 연결된 컴포넌트 수 계산
            if (!visited[i]) {//방문하지 않은 정점
                dfs(i);
                result++;//연결된 컴포넌트 수 증가
            }
        }

        System.out.println(result);//결과 출력
        sc.close();
    }
}