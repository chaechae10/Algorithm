import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tCase = Integer.parseInt(br.readLine()); // 테스트케이스 개수
        
        for (int i = 0; i < tCase; i++) {
            // 각 테스트 케이스마다 새로운 StringTokenizer를 생성하여 문서 개수와 타겟 인덱스를 읽음
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서의 개수
            int M = Integer.parseInt(st.nextToken()); // 타겟 문서의 인덱스

            Queue<int[]> q = new LinkedList<int[]>(); // 원래 위치와 우선순위를 저장할 큐

            // 문서들의 우선순위를 읽고 큐에 저장
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int num = Integer.parseInt(st.nextToken());
                q.add(new int[]{j, num}); // 문서의 인덱스와 우선순위를 큐에 추가
            }

            int cnt = 0;
            while (true) {
                int[] cur = q.poll(); // 큐에서 첫 번째 문서를 가져옴
                boolean chk = true; // 해당 문서가 가장 높은 우선순위라고 가정

                // 더 높은 우선순위의 문서가 있는지 확인
                for (int[] curQ : q) {
                    if (curQ[1] > cur[1]) { // 현재 문서보다 높은 우선순위의 문서를 발견하면
                        chk = false; // 현재 문서는 출력되지 않음
                        break; // 확인 중단
                    }
                }

                if (chk) { // 현재 문서가 가장 높은 우선순위일 경우
                    cnt++; // 출력된 문서 수 증가
                    if (cur[0] == M) break; // 출력된 문서가 타겟 문서일 경우 루프 종료
                } else {
                    q.add(cur); // 현재 문서를 큐의 끝에 다시 추가
                }
            }

            // 타겟 문서가 몇 번째로 출력되는지 출력
            System.out.println(cnt);
        }
    }
}
