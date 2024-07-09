import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //큐 선언
        Queue<Integer> q = new LinkedList<>();

        int N = sc.nextInt();
        int K = sc.nextInt();

        //N번까지 큐에 offer
        for(int i = 1 ; i <= N ; i++){
            q.add(i);
        }

        StringBuilder sb =  new StringBuilder();
        sb.append('<');

        while(q.size() > 1){
            //k-1번 앞의 사람들을 다시 큐의 끝으로 이동
            for(int i = 0; i < K - 1;i++){
               int value = q.poll();
               q.offer(value);
            }
            //K번째 사람 제거하고 결과 추가
            sb.append(q.poll()).append(", ");
        }
        //마지막 남은 사람 출력 후 >로 종료
        sb.append(q.poll()).append('>');
        System.out.println(sb);
        }
    }
