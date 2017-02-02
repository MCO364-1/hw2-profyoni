//package edu.touro.mco364;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MyThread extends Thread
{    // the entry point of a thread is run
    @Override
    public void run(){
        for(int i=0;i<10;i++)
        {
            System.out.println("T2: " + i);
            Main.threadSleep(100);
        }
    }   

}

// Write a program that has 10 threads running simlatenously and each will count from 1 to 1000000
// and add 1 to a  local  variable (no sleeping) and output the total. It should equal 1,000,000
// Then have them also add 1 to a shared static variable. it should be 10,000,000.
public class Main {

    public static void threadSleep(int ms){        
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        Thread t = new MyThread();
        t.start();
        
        for(int i=0;i<10;i++)
        {
            System.out.println("Main thread: " + i);
            Main.threadSleep(100);
        }
    }
}
