public class RLMain {
    public static void main(String[] args) {
        ReentrantLockOrnegi rl = new ReentrantLockOrnegi();

        Thread thread1 = new Thread(new Runnable(){
            @Override
            public void run(){
                rl.thread1Fonksiyonu();
            }
        });
        Thread thread2 = new Thread(new Runnable(){
            @Override
            public void run(){
                rl.thread2Fonksiyonu();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Islem kesintiye ugradi!");
        }

        rl.threadOver();
    }
}
