import java.io.*;
/*
拆分和合并mp3，自己做音乐串烧或铃声
先截取喜欢的铃声，先读再写
读取不了wav文件，因为没有文件头，每种类型的文件都有一个固定的文件头
 */
public class APP04 {
    public static void main(String[] args) throws IOException {

        FileInputStream fir=new FileInputStream("D:\\大海.mp3");//读

        fir.skip(56678);//截取掉从0到56678个字节
        byte buff[]=new byte[56678];
        fir.read(buff);//从第56678个字节开始读取

        FileOutputStream fow=new FileOutputStream("E:\\ring.mp3");//写
        fow.write(buff);
        fir.close();
        fow.close();
    }
}
