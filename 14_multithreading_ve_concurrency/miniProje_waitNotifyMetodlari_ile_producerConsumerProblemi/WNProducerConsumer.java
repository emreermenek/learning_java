import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class WNProducerConsumer {

    Random random = new Random();
    Queue<Integer> queue = new LinkedList<>();
    private final int limit = 10;
    Object lock = new Object();


    public void produce(){

        while (true) { 
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Uyku bolundu!");
            }

            synchronized(lock){
                
                if(queue.size()==limit){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Bekleme bolundu");
                    }
                }
                int value = random.nextInt(100);
                queue.offer(value);
                System.out.println("Producer uretiyor : " + value);
                lock.notify(); //uyuyan consumer varsa uyandir.
            }
        }
    }

    public void consume(){
        while (true) { 
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Uyku bolundu!");
            }

            synchronized (lock) {

                if(queue.isEmpty()){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        System.out.println("Bekleme bolundu");
                    }
                }

                int value = queue.poll();
                System.out.println("Consumer tuketiyor : " + value);
                System.out.println("Queue size : "+ queue.size());
                lock.notify();

                
            }

        }
    }
}
