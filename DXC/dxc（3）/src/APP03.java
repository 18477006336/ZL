public class APP03 {
    //匿名内部类启动多线程
    public static void main(String[] args) {
        new Thread(new a()).start();
    }
    static class a implements Runnable{
        @Override
        public void run() {
            System.out.println("启动多线程");
        }
    }
}
