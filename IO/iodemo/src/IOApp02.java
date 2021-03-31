import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOApp02 {
    public static void main(String[] args) {
        //用Java程序读取1111.txt文档内容，并输出到console中
        FileReader fr=null;
        BufferedReader br=null;
        try {
            fr=new FileReader("C:\\Users\\f\\Desktop\\1111.txt");//地址+文件名，读取数据
            br= new BufferedReader(fr);//用BufferedReader把fr包起来
            String a="";
            int count=0;//统计行数
            long StartTime=System.currentTimeMillis();//开始时间
            while ((a=br.readLine())!= null) {
                System.out.println( a);
                count++;
            }
            long EndTime=System.currentTimeMillis();//结束时间
            long Time=(StartTime-EndTime)/1000;//运行时间
            System.out.println(count+"花费时间" + Time + "秒");
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
