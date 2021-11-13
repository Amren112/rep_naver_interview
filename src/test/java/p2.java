import com.naver.gp.interview.problem1.DagSolution;
import com.naver.gp.interview.problem1.node.Node;
import com.naver.gp.interview.problem2.CachedData;
import org.junit.Test;

public class p2 {
    @Test
    public void test() {
        CachedData cachedData = new CachedData();
        try {
            cachedData.processCachedData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
