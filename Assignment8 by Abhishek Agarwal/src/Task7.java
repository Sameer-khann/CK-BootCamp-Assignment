////7. Write a Java program with two threads: Thread 1 prints table of number 2. Thread 2 prints table of number 4.
////Threads should be synced to print output one by one.
////Write above program using ExecutorService
//
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//class TablePrinter2 {
//    private boolean runTow = true;
//
//    public synchronized void printTableOf2() {
//        for (int i = 1; i <= 10; i++) {
////            while (!runTow) {
////                try {
//////                    wait();
////                } catch (InterruptedException e) {
////                    Thread.currentThread().interrupt();
////                }
////            }
//            System.out.println("2 x " + i + " = " + (2 * i)+ " " + Thread.currentThread().getName());
//            runTow = false;
////            notify();
//        }
//    }
//
//    public synchronized void printTableOf4() {
//        for (int i = 1; i <= 10; i++) {
////            while (runTow) {
////                try {
////                    wait();
////                } catch (InterruptedException e) {
////                    Thread.currentThread().interrupt();
////                }
////            }
//            System.out.println("4 x " + i + " = " + (4 * i) + " " +Thread.currentThread().getName());
//            runTow = true;
////            notify();
//        }
//    }
//}
//
//public class Task7 {
//    public static void main(String[] args) {
//        TablePrinter2 tp = new TablePrinter2();
//
//        ExecutorService executor = Executors.newFixedThreadPool(1);
//
//        executor.submit(() -> tp.printTableOf2());
//        executor.submit(() -> tp.printTableOf4());
//
//        executor.shutdown();
//    }
//}


import java.util.concurrent.*;

class TablePrinter2 {
    private final BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

    public void printTableOf2() {
        try {
            for (int i = 1; i <= 10; i++) {
                queue.put("2"); // signal it's 2's turn
                System.out.println("2 x " + i + " = " + (2 * i));
                Thread.sleep(100); // just to simulate delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void printTableOf4() {
        try {
            for (int i = 1; i <= 10; i++) {
                queue.take(); // waits until 2's turn is printed
                System.out.println("4 x " + i + " = " + (4 * i));
                Thread.sleep(100); // small delay
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

public class Task7 {
    public static void main(String[] args) {
        TablePrinter2 tp = new TablePrinter2();
        ExecutorService executor = Executors.newFixedThreadPool(2);

        executor.submit(tp::printTableOf2);
        executor.submit(tp::printTableOf4);

        executor.shutdown();
    }
}
