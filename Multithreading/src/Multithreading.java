public class Multithreading{


    public static void main(String[] args) throws InterruptedException {
//        MyThread t1=new MyThread();
//
//        t1.start();
////        t1.join();// below print will only work after 5 seconds because main thread will wait for t1 to complete
////        //and after t1 completion the main thread will start again.
////        System.out.println("Hello");
//
//        t1.interrupt();// this will interrupt t1 and stop t1 to execute its task.
//
//        //daemon thread are background thread which runs continuously like garbage collector.
//        //main thread does not wait for daemon thread to finish as it runs in background. main thread only
//        //wait for user thread to finish.

        // here we are using same counter object in both thread so if one thread change the value of counter
        // the other thread will take that value. the answer will not always 2000 it will be random.
//        Counter counter=new Counter();
//        MyThread t1=new MyThread(counter);
//        MyThread t2=new MyThread(counter);
//        t1.start();
//        t2.start();
//        try{
//            t1.join();
//            t2.join();
//        }catch (Exception e){
//            System.out.println(e.getCause());
//        }
//        System.out.println(counter.getCount());

        // here we have added synchronized keyword to our increment method in counter class so now the
        // threads are synchronized and output will be 2000 always.
//        Counter counter=new Counter();
//        MyThread t1=new MyThread(counter);
//        MyThread t2=new MyThread(counter);
//        t1.start();
//        t2.start();
//        try{
//            t1.join();
//            t2.join();
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        System.out.println(counter.getCount());

        //implementing lock instead of synchronization
//        BankAccount bankAccount=new BankAccount();
//
//        Runnable task=new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    bankAccount.withdraw(50);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        };
//
//        Thread t1 =new Thread(task,"thread 1");
//        Thread t2 =new Thread(task,"thread 2");
//        t1.start();
//        t2.start();

        //readwrite lock example
//        ReadWriteLockCounter counter=new ReadWriteLockCounter();
//
//        Runnable readTask=new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<=10;i++)
//                {
//                    System.out.println(Thread.currentThread().getName()+" read: "+counter.getCount());
//                }
//            }
//        };
//
//        Runnable writeTask=new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0;i<=10;i++)
//                {
//                    counter.increment();
//                    System.out.println(Thread.currentThread().getName()+" incremented ");
//                }
//            }
//        };
//
//        Thread writerThread= new Thread(writeTask);
//        Thread readerThread1=new Thread(readTask);
//        Thread readerThread2=new Thread(readTask);
//
//        writerThread.start();
//        readerThread1.start();
//        readerThread2.start();
//
//        writerThread.join();
//        readerThread2.join();
//        readerThread1.join();
//
//        System.out.println("Final count:"+ counter.getCount());

        //Thread Communication in different class

        //Executor framework in different class

    }
}
