import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOApp01 {
    public static void main(String[] args) {
        //用Java程序读取1111.txt文档内容，并输出到console中
        FileReader fr=null;
        try {
            fr=new FileReader("C:\\Users\\f\\Desktop\\1111.txt");//读取数据，地址+文件名
            int a=0;//读到 txt 第一个ASCLL值104
            long StartTime=System.currentTimeMillis();//开始时间
            while ((a=fr.read())!= -1) {
                System.out.print((char) a);//把读到的ASCLL值转换成字符h
            }
            long EndTime=System.currentTimeMillis();//结束时间
            long Time=(StartTime-EndTime)/1000;//运行时间（计算出来的是毫秒要除以1000）
            System.out.println("花费时间" + Time + "秒");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }//关闭IO流
    }
}
