package a16042.com.new2java;

import android.provider.Settings;

public class y0919 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setName("wangyang");;
        s1.setAge(-21);
        s1.introduce();
    }
}
//类的设计
//类的封装
class Student{
    //私有制
    private  String name;
    private int age;
    //公有的方法set get

    //获取名字值
    public String getName(){
        return name;
    }

    //设置属性值条件
    public void setName(String stuName) {
        name=stuName;
    }
    //获取年龄
    public int getAge(){
        return age;
    }
    //设置年龄的条件
    public void setAge(int stuage){
        if (stuage<0){
            System.out.println("年龄不对啊");
        }else {
            age=stuage;
        }
    }
    public void introduce(){
        //方法中打印属性的值
        System.out.println("大家好，我叫"+name+"我今年"+age);
    }
}
//抽象类与方法
abstract class dongwu{
    abstract void stout();
}
//抽象类的所有方法都是抽象的------出现了接口m
interface dongwu1{
}
class a implements dongwu1{

}
//接口继承接口（并且可以继承多个） 类可以继续接口 类也可以同时继承接口跟类

//多态（）  变参数 实现不同状态
//instanceof关键字 判断对象是否为某个对象的实例或者子类实例

//object类（所有类的父类）

//匿名内部类实现接口(在main方法里面)



