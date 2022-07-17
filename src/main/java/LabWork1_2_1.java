public class LabWork1_2_1 {

    public static void main(String[] args) {
        Thread t0 = new Thread(new MyParametricThread(1, 50));
        Thread t1 = new Thread(new MyParametricThread(51, 100));
        t0.start();
        t1.start();
    }
}

class MyParametricThread implements Runnable{
    int startInt;
    int endInt;

    public MyParametricThread(int startInt, int endInt) {
        this.startInt = startInt;
        this.endInt = endInt;
    }

    @Override
    public void run() {
        for(; startInt <= endInt; startInt++) {
            System.out.printf("%s : %d\n", Thread.currentThread().getName(), startInt);
        }
    }
}
