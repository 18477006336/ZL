import java.util.*;

public class App05 {
    public static void main(String[] args) {
/*
        面向接口（抽象）的好处
         */
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();

        String string = "this is a test, and that is also a test!";
        String str[] = string.split(",|\\s|!");
        /*
        针对数组进行循环，把每个单词添加到map中
         */
        for (String s : str) {
            /*
            s：key
            如果取到的值是null，说明该单词从未被统计过，则把1作为value,put进去
            如果取到的值不是null，则说明该单词已经被统计过，则把已经统计的value拿出来，然后+1
             */
            //map.put(s,);
            /*
               Integer是int类的包装类：主要用于装箱拆箱和拆箱、数据类型转换
            */
            //Integer a = 1;//装箱：减少程序员的工作量
            if (s.length() != 0) {
                Integer count = map.get(s);
                if (count == null) {
                    map.put(s, 1);
                } else {
                    count++;
                    map.put(s, count);
                }
            }
        }
        /*
        最终遍历应该是从Map中去遍历
        1、先得到所有的key
        2、使用迭代器进行迭代
         */
        Set<String> set=map.keySet();//得到所有的key

        Iterator<String> iter=set.iterator();

        while(iter.hasNext()){
            String word=iter.next();//每次循环得到一个单词（单词是Map的key的部分）
            System.out.println(word+":"+map.get(word));
        }
    }
}