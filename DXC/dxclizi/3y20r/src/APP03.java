/*
让一个线程先启动，后面的线程沉睡20秒，再过20秒之后程序结束
 */
public class APP03 implements Runnable{
    Thread thread1;
    Thread thread2;
    int ticketNum=1;

    public APP03(){
        thread1=new Thread(this,"售票网点1");
        thread2=new Thread(this,"售票网点2");
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args){new APP03();}
    //Java中任何一个对象都有一把锁（Monitor）
    @Override
    public void run() {
            synchronized (this){
                ticketNum--;
                System.out.println(Thread.currentThread().getName() + "+" + ticketNum);
                try{
                    Thread.sleep(20000);//不会释放锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
