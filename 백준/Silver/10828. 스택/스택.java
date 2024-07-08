import java.util.Scanner;

public class Main {
    public static int[] stack;
    public static int size = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        stack = new int[N];

        for(int i = 0; i < N ;i++){
            String str = sc.next();

            switch(str){
                case "push":
                    push(sc.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb.toString());
    }

    private static int top() {
        if(size == 0){
            return -1;
        }else{
            return stack[size - 1];
        }
    }

    private static int empty() {
        if(size == 0){
            return 1;
        }else{
            return 0;
        }
    }

    private static int size() {
        return size;
    }

    private static int pop() {
        if(size == 0){
            return -1;
        }else{
            int res = stack[size - 1];
            stack[size - 1] = 0;
            size--;
            return res;
        }
    }

    private static void push(int i) {
        stack[size] = i;
        size++;
    }
}