import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int[][] arr;
    static boolean[] check;//탐색했던 노드인지 검사 위한 배열
    static int N,M,V;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        arr =new int[N+1][N+1];
        check = new boolean[N+1];

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a][b] = arr[b][a] = 1;
        }
        dfs(V);
        sb.append("\n");
        check = new boolean[N+1];

        bfs(V);
        System.out.println(sb);

    }
    static void dfs(int start){
        check[start] = true;
        sb.append(start+" ");
        for(int i = 1;i <= N;i++){
            if(arr[start][i] == 1 &&!check[i]){
                //현재 정점과 연결된 모든 정점 확인 후 ,아직 방문하지 않은 정점에 대해 재귀적으로 dfs호출
                dfs(i);
            }
        }
    }

    static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        check[start] = true;

        while(!q.isEmpty()){
            start = q.poll();
            sb.append(start+" ");

            for(int i = 1;i <= N;i++){
                if(arr[start][i] == 1 &&!check[i]){
                    //현재 정점과 연결된 모든 정점 확인 후, 아직 방문하지 않은 정점을 큐에 추가하고 방문처리한다.
                    q.add(i);
                    check[i] = true;
                }
            }
        }
    }
}
