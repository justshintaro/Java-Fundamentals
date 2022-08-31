package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 2:
 *
 *      Create an application that creates a Thread using the Thread class
 */
class MyThread2 extends Thread {

    MyThread2(String name) {
        super(name);
        start();
    }

    public void run(){
        System.out.println(getName() + " starting. ");
        try {
            for(int count=0; count<10; count++){
                Thread.sleep(400);
                System.out.println(getName() +" - "+count);
            }
        }catch(InterruptedException exc){
            System.out.println(getName());
        }

        System.out.println(getName());
    }
}

class ExtendThread{
    public static void main(String[] args) {
        System.out.println("main thread starting.");
        MyThread2 mt1 = new MyThread2("Child #1");
        for(int i = 0; i<50; i++){
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException exc){
                System.out.println("main thread interrupted");
            }
        }

        System.out.println("main thread ending.");
    }
}