package labs_examples.multi_threading.labs;

import javax.swing.plaf.TableHeaderUI;

/**
 * Multithreading Exercise 1:
 *
 *      1: Create an application that starts a Thread by implementing the Runnable interface
 *      2: Demonstrate at least two distinct ways of initiating a Thread using the Runnable you just created
 *
 */

class MyThread1 implements Runnable {
    String thrdName;    

    MyThread1(String name) {
        thrdName = name;
    }

    @Override
    public void run() {
        System.out.println(thrdName + " starting.");
        try {
            for(int count=0; count<10; count++){
                Thread.sleep(400);
                System.out.println(thrdName+" - " + count);
            }
        }catch(InterruptedException exc) {
            System.out.println(thrdName +" interrupted.");
        }
        System.out.println(thrdName + " terminating.");
    }
}

class UseThread1 {
    public static void main(String[] args) {
        System.out.println("main thread starting.");

        MyThread1 mt1 = new MyThread1("child #1");
        Thread newThrd = new Thread(mt1);
        newThrd.start();

        for(int i = 0; i<50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException esc){
                System.out.println("main thread interrupted");
            }
        }

        System.out.println("main thread ending.");


    }
}
