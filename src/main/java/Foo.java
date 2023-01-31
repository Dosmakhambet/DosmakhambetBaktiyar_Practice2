package main.java;

import java.util.concurrent.Semaphore;

public class Foo {
    Semaphore semaphore1;
    Semaphore semaphore2;
    Foo(){
        semaphore1 = new Semaphore(0);
        semaphore2 = new Semaphore(0);
    }

     public  void first(){
         System.out.println("first");
         semaphore1.release();

     }

    public void second(){
        try{
            semaphore1.acquire();
        }catch (InterruptedException e){
            System.out.println("Second Intrrupted");
        }
        System.out.println("second");
        semaphore2.release();

    }

    public void third(){
        try{
            semaphore2.acquire();
        }catch (InterruptedException e){
            System.out.println("Second Intrrupted");
        }
        System.out.println("third");
        semaphore1.release();
        semaphore2.release();
    }
}
