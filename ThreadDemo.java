package Yt_Multithreading_resource;

class ExtendThread extends  Thread{
    @Override
    public void run() {
        System.out.println("Thread with extending thread class");    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        ExtendThread extendThread=new ExtendThread();
        extendThread.start();
    }
}
