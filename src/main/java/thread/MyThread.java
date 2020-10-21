package thread;

/**
 * @author dreamFly
 * @date 22:25 2020/9/9
 * @className MyThread
 * @description 多线程实现方式一:继承Thread类
 */

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("打印"+i);
        }
    }


    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
