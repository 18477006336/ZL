import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//用字符流复制D盘aaa到E盘xxx
public class APP01 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("D:\\aaa.txt");
        FileWriter fw=new FileWriter("E:\\xxx.txt");
        int a=0;
        while ((a=fr.read())!=-1){
            fw.write(a);//一边读一边写
        }
        fr.close();
        fw.close();
    }
}
