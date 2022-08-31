package labs_examples.multi_threading.labs;

/**
 * Multithreading Exercise 4:
 *
 *      Demonstrate the use of a synchronized block and a synchronized method - ensure that the synchronization is
 *      working as expected
 */
class MultiplyArray {
    private int sum;

    synchronized int multipleArray(int nums[]) {
        sum = 0; // reset sum

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            System.out.println("Running total for " +
                    Thread.currentThread().getName() +
                    " is " + sum);
            try {
                Thread.sleep(10); // allow task-switch
            }
            catch(InterruptedException exc) {
                System.out.println("Thread interrupted.");
            }
        }
        return sum;
    }
}

class MyThread4 implements Runnable {
    Thread thrd;
    static MultiplyArray ma = new MultiplyArray();
    int a[];
    int answer;

    // Construct a new thread.
    MyThread4(String name, int nums[]) {
        thrd = new Thread(this, name);
        a = nums;
        thrd.start(); // start the thread
    }

    // Begin execution of new thread.
    public void run() {
        int sum;

        System.out.println(thrd.getName() + " starting.");

        answer = ma.multipleArray(a);
        System.out.println("Sum for " + thrd.getName() +
                " is " + answer);

        System.out.println(thrd.getName() + " terminating.");
    }
}

class Sync {
    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4, 5};

        MyThread4 mt1 = new MyThread4("Child #1", a);
        MyThread4 mt2 = new MyThread4("Child #2", a);

        try {
            mt1.thrd.join();
            mt2.thrd.join();
        }
        catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }

    }
}