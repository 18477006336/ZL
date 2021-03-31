/*
两线程同时启动，但只会运行一个，等待20秒之后程序结束
 */
public class APP04 implements Runnable{
    Thread thread1;
    Thread thread2;
    int ticketNum=1;

    public APP04(){
        thread1=new Thread(this,"售票网点1");
        thread2=new Thread(this,"售票网点2");
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args){new APP04();}
    //Java中任何一个对象都有一把锁（Monitor）
    @Override
    public void run() {
            synchronized (this){
                ticketNum--;
                System.out.println(Thread.currentThread().getName() + "+" + ticketNum);
                try{
                    wait(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
