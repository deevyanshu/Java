import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockCounter {

    private int count=0;

    private final ReadWriteLock lock=new ReentrantReadWriteLock();

    private final Lock readlock=lock.readLock();

    private final Lock writelock=lock.writeLock();

    public void increment(){
        writelock.lock();
        try{
            count++;
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            writelock.unlock();
        }
    }

    public int getCount()
    {
        readlock.lock();// multiple threads can access this lock
        try {
            return count;
        }finally {
            readlock.unlock();
        }
    }

}
