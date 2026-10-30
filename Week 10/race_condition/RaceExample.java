/*
    Race Condition is an issue that can arise when using multiple threads where
    a program behaves unpredictably despite always being fed the same input.
    The sequence of events that lead to it are as follows:
        * Thread 1 loads some data, d1, from a shared variable
        * Thread 1 goes from Running to Runnable
        * Thread 2 goes from Runnable to Running
        * Thread 2 loads the same data, d1, from the shared variable
        * Thread 2 makes some change to the data, changing it to d1-1
        * Thread 2 saves the data back to the shared variable
        * Thread 2 goes from Running to Runnable
        * Thread 1 goes from Runnable to Running
        * THREAD 1 IS OPERATING ON OUTDATED INFORMATION because it loaded
            the data before Thread 2 made modifications to it
        * Thread 1 makes some change to the data, changing it to d1-2
            * If Thread 1 had loaded d1 AFTER Thread 2 had made modifications to
            it, the correct result would have been d1-3
        * Thread 1 saves the data back to the shared variable, erasing
            Thread 2's work

        In the best cases, Race Conditions causes your program to crash during
        development. In the worst cases, it leads to your program quietly
        outputting incorrect data. It is anyone's guess as to when the problem
        will be detected.


        For a Race Condition to occur, the following must happen:
            * Two or more agents (in our case, threads) are running at the same
                time
            * The agents have access to a shared resource
            * The shared resource is accessed by the agents at the same time
            * At least one of the agents can change the state of the resource

        Once it has been established that a piece of code has a Race Condition,
        it is possible to fix it. The exact fix will depend on the specific
        programming language. In Java, there are 2 ways to apply a fix:
            * Using a synchronized statement
            * Using a synchronized method

         Before the fix can be applied, the Critical Region needs to be
         identified. The Critical Region are the lines of code where the agent
         needs to have exclusive access to the shared resource. This is usually
         because the agent will read the resource's state, do some computation,
         and then update the resource's state. If the resource's state changes
         AFTER the agent has read the resource but BEFORE the agent updates the
         resource, the agent will have performed the computations on an outdated
         version of the resource.

         It is very important to keep the Critical Region is small as possible.
         Given that only one agent will be allowed to operate its Critical
         Region at a time, any other agents who try to enter their Critical
         Region while another agent is in theirs will be put to sleep,
         effectively performing no work and lessening the benefits of
         concurrency and parallelism.

         Once the Critical Region has been identified, the fix can be applied.
         In Java, all one must do is enclose the critical region with a
         synchronized statement:

            synchronized(lock){
                // Critical Region
            }

           The "lock" above is the shared resource, which can be any object.
           Note that only objects can be used as the lock; no primitive fields
           are allowed. A class can be used as a lock as well.

           The other solution is to use a synchronized method, which has the
           same result

           public synchronized void doesSomething(){
                // Critical Region
           }

           The method above can only be executed by one thread at a time.
*/

class Threaded extends Thread{
    int count;
    static int total = 0;

    public Threaded(int count){
        this.count = count;
    }

    @Override
    public void run(){
//        synchronized (Threaded.class) {
            for (int i = 0; i < count; i++) {
                synchronized (Threaded.class) {
                    int temp = total;
                    temp += 1;
                    total = temp;
                }
            }
//        }
    }
}

/*
    The example below illustrates a Race Condition. Multiple threads are being
    created and they are all counting up to some value, determined by the
    "countTo" variable below. "numOfThreads" specifies how many threads will
    count. Normally, the result of the computation should be:

        countTo * numOfThreads

    However, because the threads keep track of the running total using the
    static field in the Threaded class, the threads will constantly undo each
    other's work. The higher "countTo" and "numOfThreads" are, the more likely
    an incorrect result will be achieved. To fix this, uncomment lines 92 and
    96, thereby putting the Critical Zone behind a synchronized statement,
    guaranteeing that a thread will only read from, update, and write to the
    static field if no other thread is currently doing so.

    Note that uncommenting lines 90 and 98 also fix the problem, but completely
    prevent this program from running in parallel. If we consider the FOR loop
    which starts on line 91 to be our Critical Zone, the second thread will only
    be allowed to start the loop once the first thread finishes it; the third
    thread will only be allowed to start the loop once the second thread
    finishes it, and so on. Remember: the Critical Zone must be as small as
    possible to preserve parallelism, as threads which try to enter their
    Critical Zone while another thread is in theirs will be put to sleep.
 */

public class RaceExample {

    public static void main(String[] args) {

        int countTo = 10000; // 10000
        int numOfThreads = 20; // 20
        Threaded[] allThreads = new Threaded[numOfThreads];

        for (int i = 0; i < numOfThreads; i++) {
            allThreads[i] = new Threaded(countTo);
        }

        for (int i = 0; i < numOfThreads; i++) {
            allThreads[i].start();
        }

        try {
            for (int i = 0; i < numOfThreads; i++) {
                allThreads[i].join();
            }
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.println("Calculation complete. After running "
                + numOfThreads + " each counting up to " + countTo
                + " the total is " + Threaded.total + ".");
    }
}

