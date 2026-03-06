import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private final Lock lock=new ReentrantLock();

    private int balance=100;

    public void withdraw(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+" attempting to withdraw "+ amount);

        if(lock.tryLock(1000, TimeUnit.MILLISECONDS))
        {
            if(balance>=amount)
            {
                try {
                    System.out.println(Thread.currentThread().getName()+" proceeding with withdrawal ");
                    Thread.sleep(3000);
                    balance-=amount;
                    System.out.println(Thread.currentThread().getName()+" Completed withdrawal "+ "remaining balance:"+ balance);
                }catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }finally {
                    lock.unlock();
                }
            }else
            {
                System.out.println(Thread.currentThread().getName()+" insufficient balance");
            }
        }else{
            System.out.println(Thread.currentThread().getName()+" could not acquire the lock");
        }


    }
}
