import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < T;i++){
            sb.append(solve(br.readLine())).append('\n');
        }
        System.out.println(sb);
    }

    public static String solve(String s) {
            Stack<Character> stack = new Stack<>();
            for(int i = 0 ; i < s.length(); i++){
                char c = s.charAt(i);
                
                //여는 괄호의 경우 스택에 넣기 
                if(c == '('){
                    stack.push(c);
                }else if(stack.isEmpty()){
                    return "NO";
                }else{
                    stack.pop();
                }
            }
            //검사 마친 후 스택에 잔여 요소 있으면 여는 괄호가 많은 경우는 "NO" 
        //스택이 비어있으면 완전한 수식이므로 YES
        if(stack.isEmpty()){
            return "YES";
        }else{
            return "NO";
        }
    }
}
