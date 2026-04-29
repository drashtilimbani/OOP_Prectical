class NumberPrinter {
    int number = 1;

    synchronized void printRange(int start, int end) {
        while (number <= end) {
            while (number < start) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            if (number >= start && number <= end) {
                System.out.println(number++);
                notifyAll();
            }
        }
    }
}

class T1 extends Thread {
    NumberPrinter np;

    T1(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printRange(1, 100);
    }
}

class T2 extends Thread {
    NumberPrinter np;

    T2(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printRange(101, 200);
    }
}

class T3 extends Thread {
    NumberPrinter np;

    T3(NumberPrinter np) {
        this.np = np;
    }

    public void run() {
        np.printRange(201, 300);
    }
}

public class Main {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();

        T1 t1 = new T1(np);
        T2 t2 = new T2(np);
        T3 t3 = new T3(np);

        t1.start();
        t2.start();
        t3.start();
    }
}
