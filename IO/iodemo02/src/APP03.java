import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//复制D盘的wmv(视频)到E盘
public class APP03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fir=new FileInputStream("D:\\aaa.wmv");
        FileOutputStream fow=new FileOutputStream("E:\\李伟.wmv");
        int a=0;
        byte buff[]=new byte[1024];//一次读取1024字节（1KB）
        while ((a=fir.read(buff))!=-1){//a的值是一次读取的字节数
            fow.write(buff,0,a);//buff中的才是真正的数据，a只是表示读取的字节数而已
            //0:从数组下标0开始
            //a:原文件比复制的文件多了387个字节（按1024整除），所以a是最后读取的387字节
        }
        fir.close();
        fow.close();
    }
}
