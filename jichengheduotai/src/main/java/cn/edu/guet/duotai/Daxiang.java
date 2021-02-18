package cn.edu.guet.duotai;
/*
*继承：extends，Daxiang继承Dongwu
* 在子类中可以实现具体化，因为可以确定了是大象这种动物；
      光标放在红线处，出现提示后点击Implement methods,点击back:()void再点击即可
 */

public class Daxiang extends Dongwu {
    @Override
    void back() {
        System.out.println("eng...");
    }
}
