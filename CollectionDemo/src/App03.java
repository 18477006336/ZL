import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class App03 {
    public static void main(String[] args) {
        //zhuhan huangzhenyi liaojiaye
        Set set=new TreeSet();
        set.add("zhuhan");
        set.add("huangzhenyi");
        set.add("liaojiaye");

        Iterator iter=set.iterator();//先得到迭代器
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
