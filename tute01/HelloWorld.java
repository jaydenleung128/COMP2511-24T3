import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Prints "Hello World" to the console.
 */
public class HelloWorld {
    public static <T extends Integer> Integer endAverage(Deque<T> dq) {
        Integer frontVal = dq.peek();
        Integer backVal = dq.peek();
        return (frontVal + backVal) / 2;
    }
    
    public static void main(String[] args) {
        Deque<Integer> myDq = new ArrayDeque<>();
        endAverage(myDq);
    }
}