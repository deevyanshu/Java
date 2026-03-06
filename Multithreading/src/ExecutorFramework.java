import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorFramework {

    public static void main(String[] args) throws InterruptedException {
        long startTime=System.currentTimeMillis();
        ExecutorService executor= Executors.newFixedThreadPool(9);
        for(int i=1;i<=5;i++)
        {
            int finalI=i;
            executor.submit(()->{
               long res=fact(finalI);
                System.out.println(res);
            });
        }
        executor.shutdown();
        executor.awaitTermination(100, TimeUnit.SECONDS);
        System.out.println("Total time: "+(System.currentTimeMillis()-startTime));
    }

    private static long fact(int num)
    {
        long res=1;

        for(int i=1;i<=num;i++)
        {
            res*=i;
        }
        return res;
    }
}
