public class SimpleMultiThread {
    static class MyRunnable implements Runnable{
    
        private String message;

        public MyRunnable(String message)
        {
            this.message = message;
        }
        public void run()
        {
            for(int i=0;i<5;i++)
            {
                System.out.println(message);
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e)
                {
                    System.err.println("Thread was interrupted:"+e.getMessage());

                }
            }
        }

    }

    public static void main(String[] args) 
    {
    MyRunnable runnable1 = new MyRunnable("Hello from Thread 1!");
    MyRunnable runnable2 = new MyRunnable("Hello from Thread 2!");

    Thread thread1 = new Thread(runnable1);
    Thread thread2 = new Thread(runnable2);

    thread1.start();
    thread2.start();

    try {
           thread1.join();
           thread2.join();
        } 
        catch (InterruptedException e) 
        {
           System.err.println("Main thread was interrupted: " + e.getMessage());
        }

    System.out.println("Both threads have completed execution.");
    }
}