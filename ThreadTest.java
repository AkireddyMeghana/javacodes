public class ThreadTest {
    public static void main(String []args) {
        new ThreadTest();
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("main thread:" + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main thread exiting....");
    }
}
