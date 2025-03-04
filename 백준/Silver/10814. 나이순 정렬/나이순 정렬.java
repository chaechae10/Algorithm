import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        // 입력을 저장할 리스트
        List<String[]> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            people.add(br.readLine().split(" "));
        }

        // 정렬 (나이순 정렬, 같은 나이면 입력 순서 유지)
        people.sort(Comparator.comparingInt(p -> Integer.parseInt(p[0])));

        // 결과 출력
        for (String[] person : people) {
            sb.append(person[0]).append(" ").append(person[1]).append("\n");
        }

        System.out.print(sb);
    }
}