package cn.edu.guet.duotai;

public class App {
    public static void main(String[] args) {
        /*Mao mao=new Mao();
        mao.back();//面向具体

        Daxiang daxiang=new Daxiang();
        daxiang.back();

        Gou gou=new Gou();
        gou.back();*/
        /*
        *利用【面向对象】实现OCP原则：Open Close Principle(开闭原则或闭合原则：对修改闭合、对扩展开放)
        * 对修改闭合：将来系统新增需求或修改需求的时候，不用修改原来的代码
        * 对扩展开放：只需要新增相应的类或配置文件来满足新的需求
        * 增强可维护性、可扩展性
         */
        Dongwu dongwu=new Mao();//向上转型：猫是动物；特定：父类的引用（Dongwu）指向子类的对象(new Mao()等)
        dongwu.back();/*该代码不变，只变上面的对象(猫、狗、大象)，即出现多态，
                   多态：同一种行为，作用在不同的对象上，有不同的结果*/
    }
}
