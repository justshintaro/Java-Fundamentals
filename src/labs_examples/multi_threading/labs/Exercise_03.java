package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 3:
 *
 *      In one of the previous exercises, demonstrate changing the priority of a thread
 */
class Priority implements Runnable {
    int count;
    Thread thrd;

    static boolean stop = false;
    static String currentName;


    Priority(String name) {
        thrd = new Thread(this, name);
        count = 0;
        currentName = name;
    }

    @Override
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        do{
            count++;

            if(currentName.compareTo(thrd.getName()) != 0){
                currentName = thrd.getName();
                System.out.println(currentName);
            }
        } while(stop == false && count < 100000);
        stop = true;

        System.out.println(thrd.getName() + " terminating.");
    }
}

class UseThread3 {
    public static void main(String[] args) {
        System.out.println("main thread starting.");

        Priority mt1 = new Priority("child #1 : Low Priority");
        Priority mt2 = new Priority("child #2 : High Priority");
        Priority mt3 = new Priority("child #3 : Middle Priority");

        mt1.thrd.setPriority(Thread.MIN_PRIORITY);
        mt2.thrd.setPriority(Thread.MAX_PRIORITY);
        mt3.thrd.setPriority(Thread.NORM_PRIORITY);

        mt1.thrd.start();
        mt2.thrd.start();
        mt3.thrd.start();

        try {
            mt1.thrd.join();
            mt2.thrd.join();
            mt3.thrd.join();
        } catch(InterruptedException exc){
            System.out.println("main thread interrupted");
        }

        System.out.println("child #1 : "+mt1.count);
        System.out.println("child #2 : "+mt2.count);
        System.out.println("child #3 : "+mt3.count);

    }
}
