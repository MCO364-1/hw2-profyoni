package mco364;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author yrobi
 */
public class SummationThreadTest {

    @Test
    public void SummationThreadTest() {
        List<SummationThread> threads = Main.computeSums();
        for (SummationThread t : threads) {
            assertEquals(SummationThread.LOOP_MAX, t.instanceCounter);
        }

       // assertEquals(SummationThread.LOOP_MAX * threads.size(), SummationThread.sharedCounter);
    }

}
