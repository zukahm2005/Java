package ss13;

public class HiThread extends Thread{
    //Viet code trong game run() se dc thuc thi khi thread nay chay (start)
    @Override
    public void run()  {
        int index = 1;
        for(int i = 0; i<5 ; i++){
            System.out.println("Hi Thread running ... "+ index++);
            try {
                Thread.sleep(2024);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        System.out.println("Hi Thread stop");
    }
    
    
}
