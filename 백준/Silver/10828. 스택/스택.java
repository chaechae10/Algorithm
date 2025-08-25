import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String m = st.nextToken();
            
            if(m.equals("push")){
                int c = Integer.parseInt(st.nextToken());
                stack.push(c);
            } else if (m.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (m.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if (m.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (m.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
