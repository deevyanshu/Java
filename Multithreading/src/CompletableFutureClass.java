import java.util.concurrent.CompletableFuture;

public class CompletableFutureClass {
    public static void main(String[] args) {
        CompletableFuture<String> f1=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(1000);
                System.out.println("Worker");
            }catch (Exception e)
            {

            }
           return "ok";
        });

        CompletableFuture<String> f2=CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(1000);
                System.out.println("Worker");
            }catch (Exception e)
            {

            }
            return "ok";
        });

        CompletableFuture<Void> f=CompletableFuture.allOf(f1,f2);
        f.join();
        System.out.println("Main");
    }
}
