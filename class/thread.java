public class thread {

    // static class myThread extends Thread{
    //     public void run(){
    //         System.out.println("Thread is running.....");
    //     }
    //     public static void main(String[] args) {
    //         myThread t = new myThread();
    //         t.start();
    //     }
    // }


    // implement runnable thread

    // static class MyRunnable implements Runnable{
    //     public void run(){
    //         System.out.println("Thread using Runnable...");
    //     }
    //     public static void main(String[] args) {
    //         MyRunnable obj = new MyRunnable();
    //         Thread t = new Thread(obj);
    //         t.start();
    //     }
    // }

    // multiple threads

    // static class A extends Thread{
    //     public void run(){
    //         for(int i =1;i<=5;i++){
    //             System.out.println("Thread A:"+i);
    //         }
    //     }
    // }
    // static class B extends Thread{
    //     public void run(){
    //         for(int i = 1;i<=5;i++){
    //             System.out.println("Thread B"+i);
    //         }
    //     }
    // }

    // public class MultiThread{
    //     public static void main(String[] args) {
    //         A t1 = new A();
    //         B t2 = new B();
    //         t1.start();
    //         t2.start();
    //     }
    // }
    

    //thread priority
    // static class MyThread extends Thread{
    //     public void run(){
    //         System.out.println("Thread running" + Thread.currentThread().getName());
    //     }

    //     public static void main(String[] args) {
    //         MyThread t1 = new MyThread();
    //         MyThread t2 = new MyThread();

    //         t1.setPriority(Thread.MIN_PRIORITY);
    //         t2.setPriority(Thread.MAX_PRIORITY);
    //         t1.start();
    //         t2.start();
    //     }
    // }


    // running two method concurrently

    static class task1 extends Thread{
        public void run(){
            System.out.println("Task 1 is running");
        }
    }
    static class task2 extends Thread{
        public void run(){
            System.out.println("task 2 is running");
        }
    }

    public class Concurrent{
        public static void main(String[] args) {
            task1 t1 = new task1();
            task2 t2 = new task2();
            t1.start();
            t2.start();
        }
    }

    // synshronized thread

    static class Bank{
        synchronized void withdraw(int amount){
            System.out.println(Thread.currentThread().getName()+" is withdrawing" + amount);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("withdrawal completed");
            }
        }

        static class MyThread extends Thread{
            Bank b;
            MyThread(Bank b){
                this.b = b;
            }
            public void run(){
                b.withdraw(100);
            }
        }
        public class syncDemo{
            public static void main(String[] args) {
                Bank obj = new Bank();
                MyThread t1 = new MyThread(obj);
                MyThread t2 = new MyThread(obj);

                t1.setName("user1");
                t2.setName("User2");
                t1.start();
                t2.start();
            }
        }
    }
}
