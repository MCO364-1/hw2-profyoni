package mco364;

/**
 *
 * @author yrobi
 */
public class SummationThread extends Thread {
    
    // the entry point of a thread is run
    final int LOOP_MAX = 10_000_000;
    int instanceCounter;
    static int sharedCounter;

    @Override
    public void run() {
        for (int i = 0; i < LOOP_MAX; i++) {
            instanceCounter++;
            //   synchronized ("lock") { // with no locking protecting the critical section, we have a race condition
            SummationThread.sharedCounter++;
        }
    }
    
}
