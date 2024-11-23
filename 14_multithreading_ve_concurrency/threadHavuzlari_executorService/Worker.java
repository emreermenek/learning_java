public class Worker implements Runnable{

    private String isim;
    private int taskID;

    public Worker(String isim, int taskID) {
        this.isim = isim;
        this.taskID = taskID;
    }

    @Override
    public void run() {
        System.out.println("Worker "+ isim + " " + taskID + ". ise basladi..");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
           System.out.println("Surec kesildi!");
        }
        System.out.println("Worker "+ isim + " " + taskID + ". isi bitirdi!");
    }
    
}
