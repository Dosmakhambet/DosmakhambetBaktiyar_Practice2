package main.java;

public class MyThread3 implements Runnable{
    Foo foo;
    Thread thread;
    MyThread3(Foo foo){
        this.foo = foo;
        thread = new Thread(this);
    }

    public void run(){
        foo.third();
    }
}
