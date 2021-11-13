import com.naver.gp.interview.problem1.DagSolution;
import com.naver.gp.interview.problem1.node.Node;
import org.junit.Test;

public class p1 {
    @Test
    public void test() {
        Node<String> hNode = new Node<String>("H");
        Node<String> cNode = new Node<String>("C");
        Node<String> aNode = new Node<String>("A");
        Node<String> dNode = new Node<String>("D");
        Node<String> fNode = new Node<String>("F");
        final Node<String> bNode = new Node<String>("B");
        Node<String> gNode = new Node<String>("G");
        Node<String> eNode = new Node<String>("E");
        hNode.next(cNode);
        cNode.next(aNode);
        aNode.next(dNode);
        dNode.next(fNode);
        DagSolution.printAllNode(hNode);
        bNode.next(gNode);
        bNode.subNext(eNode);
        gNode.next(aNode);
        gNode.subNext(eNode);
        eNode.next(fNode);

        new Thread(new Runnable() {
            public void run() {
                System.out.print("1_");
                DagSolution.printAllNode(bNode);
            }
        }).start();
    }
}
