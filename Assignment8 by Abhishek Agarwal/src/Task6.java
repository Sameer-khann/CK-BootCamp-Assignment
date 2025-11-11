
//6. Write a Java program with two threads: Thread 1 prints table of number 2. Thread 2 prints table of number 4.
//Threads should be synced to print output one by one

class TablePrinter {
    private boolean isTwoTurn = true;

    public synchronized void printTableOf2() {
        for (int i = 1; i <= 10; i++) {
            while (!isTwoTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Table of 2 is Not following locking rule.");
                }
            }
            System.out.println("2 x " + i + " = " + (2 * i));
            isTwoTurn = false;
            notify();
        }
    }

    public synchronized void printTableOf4() {
        for (int i = 1; i <= 10; i++) {
            while (isTwoTurn) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    System.out.println("Tble of 4 is Not following locking rule.");
                }
            }
            System.out.println("4 x " + i + " = " + (4 * i));
            isTwoTurn = true;
            notify();
        }
    }
}

public class Task6 {
    public static void main(String[] args) {
        TablePrinter obj1 = new TablePrinter();

        Thread a1 = new Thread(() -> obj1.printTableOf2());
        new Thread(() -> obj1.printTableOf4()).start();

        a1.start();
    }
}
