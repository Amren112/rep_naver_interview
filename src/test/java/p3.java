import com.naver.gp.interview.problem1.DagSolution;
import com.naver.gp.interview.problem1.node.Node;
import com.naver.gp.interview.problem3.ArrayQueue;
import com.naver.gp.interview.problem3.StackQueue;
import org.junit.Test;

public class p3 {
    @Test
    public void testStackQueue() {
        StackQueue s = new StackQueue();
        s.push(1);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        s.push(5);
        System.out.println(s.pop());
    }
    @Test
    public void testArrayQueue() {
        ArrayQueue arrayQueue = new ArrayQueue();
        arrayQueue.init();
        arrayQueue.push(3);
        arrayQueue.push(1);
        arrayQueue.push(4);
        arrayQueue.push(5);
        arrayQueue.push(8);
        arrayQueue.push(7);
        Integer s = arrayQueue.getSize();
        for (Integer integer = 0; integer < s; integer++) {
            System.out.println(arrayQueue.pop());
        }
    }
}
