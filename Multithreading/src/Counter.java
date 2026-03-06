public class Counter {

    private int count=0;

    public synchronized void increment(){
        //we can also make a block of code synchronized by removing sync keyword from method and adding like
        // this
//        synchronized (this){
//            count++;
//        }
        count++;
    }

    public int getCount() {
        return count;
    }
}
