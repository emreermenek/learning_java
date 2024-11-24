import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumer {
    
    Random random = new Random();

    BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

    public void produce(){
        while (true) { 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Surec kesintiye ugradi!");
            }   

            try {
                int value = random.nextInt(100);
                queue.put(value);
                System.out.println("Producer uretiyor: "+ value);
            } catch (InterruptedException e) {
                System.out.println("Veri uretilirken soru olustu!");
            }
        }
    }

    public void consume(){
        while (true) { 
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Surec kesintiye ugradi!");
            }   
            try {
                int value = queue.take();
                System.out.println("Consumer tuketiyor: "+value);

                System.out.println("Queue size: "+ queue.size());
            } catch (InterruptedException e) {
                System.out.println("Veri tuketilirken soru olustu!");
            }
        }
    }
    
}
