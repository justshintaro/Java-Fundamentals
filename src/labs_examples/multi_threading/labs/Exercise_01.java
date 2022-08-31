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

    Thread newThrd;

    MyThread1(String name) {
        newThrd = new Thread(this, name);
        newThrd.start();
    }

    @Override
    public void run() {
        System.out.println(newThrd.getName() + " starting.");
        try {
            for(int count=0; count<10; count++){
                Thread.sleep(400);
                System.out.println(newThrd.getName()+" - " + count);
            }
        }catch(InterruptedException exc) {
            System.out.println(newThrd.getName() +" interrupted.");
        }
        System.out.println(newThrd.getName() + " terminating.");
    }
}

class UseThread1 {
    public static void main(String[] args) {
        System.out.println("main thread starting.");

        MyThread1 mt1 = new MyThread1("child #1");
        MyThread1 mt2 = new MyThread1("child #2");
        MyThread1 mt3 = new MyThread1("child #3");


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
