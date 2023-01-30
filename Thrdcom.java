class Circle {
    float radius = 0.0f;

    synchronized void output() {
        System.out.println("Output Method Invoked For Displaying areas of Circle..");
        if (radius == 0.0) {
            System.out.println("Waiting For Input Radius..");
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.println("Area= " + 3.14 * radius * radius);
    }

    synchronized void input(float r) {
        System.out.println("Inputting Radius...");
        radius = r;
        System.out.println("Radius Value Received.. ");
        notify();
    }
}

public class Thrdcom {
    public static void main(String k[]) {
        final Circle c = new Circle();
        new Thread() {
            public void run() {
                c.output();
            }
        }.start();
        new Thread() {
            public void run() {
                c.input(2.5f);
            }
        }.start();
    }
}
