class X implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println("/tThreadX " + i);
        System.out.println("End Of threadX");
    }
}

public class RunnableTest {
    public static void main(String k[]) {
        X runnable = new X();
        Thread threadX = new Thread(runnable);
        threadX.start();
        System.out.println("End Of Main Thread");
    }
}