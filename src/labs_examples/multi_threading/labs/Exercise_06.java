package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 6:
 *
 *      Write a program that will print 1-100 sequentially from at least two distinct threads. For instance, thread1 will
 *      print "1", then thread2 will print "2", then thread1 will print "3", then thread2 will print "4" and so on.
 */
class Thread6 implements Runnable{

    public int printNumberUpTo=100;
    static int  number=1;
    int remainder;
    static Object lock=new Object();

    Thread6(int remainder)
    {
        this.remainder=remainder;
    }

    @Override
    public void run() {
        while (number < printNumberUpTo-1) {
            synchronized (lock) {
                while (number % 3 != remainder) { // wait for numbers other than remainder
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + number);
                number++;
                lock.notifyAll();
            }
        }
    }
}


class PrintThreadsSequentiallyMain {

    public static void main(String[] args) {

        Thread6 runnable1 = new Thread6(1);
        Thread6 runnable2 = new Thread6(2);
        Thread6 runnable3 = new Thread6(0);

        Thread t1 = new Thread(runnable1,"Thread1");
        Thread t2 = new Thread(runnable2,"Thread2");
        Thread t3 = new Thread(runnable3,"Thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}
