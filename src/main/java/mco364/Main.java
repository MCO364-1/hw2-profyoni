package mco364;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;



public class Main {

    public static void threadSleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public static ArrayList<SummationThread>  computeSums() {
        ArrayList<SummationThread> threadList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            SummationThread t = new SummationThread();
            threadList.add(t);
            t.start();
        }
        for (Thread t : threadList) {
            try {
                t.join();
            } catch (InterruptedException ex) {
            }
        }
        return threadList;
    }
    

    public static void main(String[] args) {
 
        ArrayList<SummationThread>  threadList = computeSums();
        for (SummationThread t : threadList) {
            System.out.println(t.instanceCounter + ", " + t.sharedCounter);
        }
    }
}
