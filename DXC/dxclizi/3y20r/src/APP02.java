/*
由于线程有不确定性，同时启动2个线程，不知道哪个线程会先启动，加入synchronized可以只允许一个线程启动
 */
public class APP02 implements Runnable{
    Thread thread1;
    Thread thread2;
    int ticketNum=1;

    public APP02(){
        thread1=new Thread(this,"售票网点1");
        thread2=new Thread(this,"售票网点2");
        thread1.start();
        thread2.start();
    }

    public static void main(String[] args){new APP02();}

    @Override
    public void run() {
            synchronized (this){
                ticketNum--;
                System.out.println(Thread.currentThread().getName() + "+" + ticketNum);
            }
    }
}
