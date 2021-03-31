public class APP02 implements Runnable{//只有一个run方法，具体怎么做，看while(true){}

    public APP02(){//构造方法，如何调用？new即可
        Thread thread=new Thread("this");
        thread.start();
    }
    public static void main(String[] args) {
        new APP02();//创建了一个对象
    }

    @Override
    public void run() {
        while (true){
            System.out.println("要做的事情");
        }
    }
}
