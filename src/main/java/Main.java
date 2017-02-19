
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MyThread extends Thread {    // the entry point of a thread is run

    final int LOOP_MAX = 10_000_000;
    int instanceCounter;
    static int sharedCounter;

    @Override
    public void run() {
        for (int i = 0; i < LOOP_MAX; i++) {
            instanceCounter++;
            //   synchronized ("lock") { // with no locking protecting the critical section, we have a race condition
            MyThread.sharedCounter++;
        }
    }
}


public class Main {

    public static void threadSleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public static ArrayList<MyThread>  computeSums() {
        ArrayList<MyThread> threadList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MyThread t = new MyThread();
            threadList.add(t);
            t.start();
        }
        for (MyThread t : threadList) {
            try {
                t.join();
            } catch (InterruptedException ex) {
            }
        }
        return threadList;
    }
    

    public static void main(String[] args) {
 
        ArrayList<MyThread>  threadList = computeSums();
        for (MyThread t : threadList) {
            System.out.println(t.instanceCounter + ", " + t.sharedCounter);
        }
    }
}
