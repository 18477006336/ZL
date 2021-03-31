public class APP01 implements Runnable{
    Thread thread1;
    Thread thread2;
    int ticketNum=1;
    public APP01(){
        thread1=new Thread(this,"线程1");
        thread2=new Thread(this,"线程2");
        thread1.start();
        thread2.start();
        System.out.println("线程2的默认优先级:" + thread2.getPriority());//查看线程2的优先级
    }
    public static void main(String[] args){new APP01();}

    //如果有票，网点卖票只能一个个来
    @Override
    public void run() {
        if (ticketNum>0){
            synchronized (this){
                ticketNum--;
                System.out.println(Thread.currentThread().getName() + "+" + ticketNum);
            }
        }
    }
}
