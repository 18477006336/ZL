package cn.edu.guet.jicheng;
/*
extends:继承
Laoshi和Xuesheng共同继承Yonghu里的id\password\phone\name，
因为这些都是老师和学生的共同部分，为了使代码简洁
 */
public class Laoshi extends Yonghu{
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
