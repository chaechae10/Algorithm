import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        for (int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            String m = st.nextToken();
            if (m.equals("push")) {
                int c = Integer.parseInt(st.nextToken());
                stack.push(c);

            } else if (m.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else
                    System.out.println(stack.pop());

            } else if (m.equals("size")) {
                System.out.println(stack.size());
            } else if (m.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println("1");

                } else {
                    System.out.println("0");
                }
            } else if (m.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println("-1");
                } else
                    System.out.println(stack.peek());
            }

        }
    }
}