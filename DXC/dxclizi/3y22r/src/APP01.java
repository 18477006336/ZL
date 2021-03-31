public class APP01 {
    public static void main(String[] args) {
        MyThread mythread1=new MyThread("线程1");
        mythread1.start();
        //MyThread mythread2=new MyThread("线程2");
        //mythread2.start();
    }
}
class MyThread extends Thread{
    public MyThread(String threadName){
        super(threadName);//给线程赋值，用构造方法赋值
    }
    public void run(){

        for (int i=0;i<10;i++){
            try {
                Thread.sleep(300);//1000,每隔一秒输出
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName());
            //输出线程名字，该类中没有显示getName方法，但又能调用，是因为继承的Thread里有该方法
        }
    }
}