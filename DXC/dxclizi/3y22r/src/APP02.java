public class APP02 implements Runnable {

    Thread t;
    public APP02(){
        t=new Thread(this,"线程1");//传参，this——>APP02——>Runnable
        t.start();
    }

    public static void main(String[] args) {
        new APP02();
    }
    @Override
    public void run() {
        for (int i=0;i<10;i++){
            try {
                Thread.sleep(300);//1000,每隔一秒输出
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
            //输出线程名字，该类中没有显示getName方法，但又能调用，是因为继承的Thread里有该方法
        }
    }
}
