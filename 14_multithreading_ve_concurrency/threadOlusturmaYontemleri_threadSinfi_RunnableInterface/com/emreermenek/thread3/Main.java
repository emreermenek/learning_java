package com.emreermenek.thread3;

//anonim class icinde thread olusturup kullanma
public class Main {
    public static void main(String[] args) {
        // Thread printer1 = new Thread(new Runnable(){

        //     @Override
        //     public void run() {
        //         System.out.println("thread1 Calisiyor...");

        //         for(int i = 1; i <= 10; i++){
        //             System.out.println("thread1" + " Yaziyor : "+ i);
        //             try {
        //                 Thread.sleep(1000);
        //             } catch (InterruptedException e) {
        //                 System.out.println("Thread kesintiye ugradi!");
        //             }
        //         }
        //         System.out.println("thread1"  + " isini bitirdi.");
        //     }
        // });

        // printer1.start();

        //veya:

        new Thread(new Runnable(){
                @Override
                public void run() {
                    System.out.println("thread1 Calisiyor...");
    
                    for(int i = 1; i <= 10; i++){
                        System.out.println("thread1" + " Yaziyor : "+ i);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("Thread kesintiye ugradi!");
                        }
                    }
                    System.out.println("thread1"  + " isini bitirdi.");
                }
            }).start();
    }
}
