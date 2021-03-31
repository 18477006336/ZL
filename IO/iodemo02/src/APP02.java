import java.io.*;

//用字节流复制D盘aaa到E盘xxx
public class APP02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fir=new FileInputStream("D:\\aaa.txt");
        FileOutputStream fow=new FileOutputStream("E:\\xxx.txt");
        int a=0;
        while ((a=fir.read())!=-1){
            fow.write(a);//一边读一边写
        }
        fir.close();
        fow.close();
    }
}
