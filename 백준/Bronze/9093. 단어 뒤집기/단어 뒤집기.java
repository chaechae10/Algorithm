import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int t = 1; t <= T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            while(st.hasMoreTokens()) {
                StringBuilder sb2 = new StringBuilder(st.nextToken());
                sb.append(sb2.reverse()).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}