public class APP01 {
    public static void main(String[] args) {
        /*
        多线程的实现：
        1、继承Thread类
        2、实现 Runnable接口
         */
        DownloadThread dt=new DownloadThread();
        dt.start();//启动一个线程
        //start启动线程后，run方法会自动运行，run运行结束，线程也就结束了
    }
}
class DownloadThread extends Thread {
    public void run() {
        int a=0;
        while (true){
            a++;
            //必须有break代码，break退出循环，如果文件下载完成，直接调用break推出循环即可
            //必须在合适的时机让while结束(break)
            System.out.println(a);
            if(a==10)break;
        }
    }
}

