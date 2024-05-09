package ss13;

public class TheardDemo { 

    public static void main(String[] args)  throws InterruptedException{
        
        int idx = 1;
        for (int i = 0; i <2; i++ ){
            System.out.println("Main the theard : " + idx++);
            Thread.sleep(2024);
        }
        HiThread hiThread = new HiThread();
        hiThread.start();

        for(int i = 0; i < 2; i++ ){
            System.out.println(":Main thread running : " + idx);
            Thread.sleep(1050);
        }
        System.out.println("Main thread stopped");
    }
}
