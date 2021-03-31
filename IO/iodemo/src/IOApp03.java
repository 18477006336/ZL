import java.io.*;
import java.util.Scanner;

public class IOApp03 {
    public static void main(String[] args) {
        //从console输入相应的字符，并把输入的字符写入到abd.txt中
        FileWriter fw = null;
        try {
            Scanner sc = new Scanner(System.in);//Scanner：从控制台写内容
            fw = new FileWriter("E://abd.txt");//创建文件

            System.out.println("请输入内容：");
            String word = sc.next();

            fw.write(word);
            //把内容写入txt中，但是在txt中又没有显示出来，因为没有保存
            // 为了提高效率，程序不会时刻写入硬盘，而是写入了 Buffer (缓冲区)

            fw.write('\r');//回车，=fw.write('\r');下面同理
            fw.write(10);//换行，若没有回车和换行，写入的内容会排在一行
            word = sc.next();
            fw.write(word);//写第二行内容

            fw.flush();//把缓冲区的内容清除，即内容存入硬盘

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

        }//关闭IO流
    }
}
