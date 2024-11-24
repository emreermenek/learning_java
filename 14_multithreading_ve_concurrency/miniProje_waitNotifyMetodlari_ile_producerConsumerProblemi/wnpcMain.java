
public class wnpcMain {

    public static void main(String[] args) {
        WNProducerConsumer pc = new WNProducerConsumer();

        Thread producer = new Thread(new Runnable(){
            @Override
            public void run() {
                pc.produce();
            }
        });

        Thread consumer = new Thread(new Runnable(){
            @Override
            public void run() {
                pc.consume();
            }
        });

        producer.start();
        consumer.start();

        try {
            producer.join();
            consumer.join();
        } catch (InterruptedException e) {
            System.out.println("Surec producer ve consumer bitirmeden tamamlandi!");
        }
    }
}
