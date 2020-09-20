package 知识点.内部类;

/*
内部类可以声明的位置:
    1. 作为外部类的成员变量声明在类的内部（成员内部类）
    2. 声明在构造起的内部(局部内部类)
    3. 声明在成员方法的内部（局部内部类）
    4. 声明在代码块内部（局部内部类）

成员内部类
    成员内部类可以使用的修饰符有：public，private，protected，默认，其他修饰符有final，static,abstract
    1.内部类对外部类方法属性的调用
        使用static修饰的内部类只能访问外部类用static修饰的属性和方法
        非静态内部类可以使用的外部类非静态结构，和静态结构(所有成员）
    2.内部类可以定义的方法属性的权限
           和类的规则一样
           但是内部类如果不使用static修饰时，内部类中使用static变量
    3.外部类对内部类方法属性的调用
         外部类调用内部类需要使用内部类对象.属性的方式调用，而且可以调用内部类的私有变量



局部内部类
    局部内部类可以使用的修饰符 只有默认缺省的（public 也不能用），和final（static不能用）,abstract(抽象的）

 */
 class Outter {
    public static void main(String[] args) {

    }
    private String name;
    public int age;
   // age = 1 成员变量不能这样初始化
    static String id;//静态成员变量
    //静态成员方法
    static void xys(){
        System.out.println("hello world");
    }
    //成员方法
    void mothod1(){
        inner1 in = new inner1();//new一个内部类对象
        int s = in.a;//有内部类对象调用内部类的私有成员
        in.xys();
//        in.b;
        in.xys1();
    }
//    public Outter(){
//
//    }
    //静态内部类
    static class innerStatic extends Outter{
        int s ;
        private int a;
        protected int b = 0;
        //static int c;只有内部类用static修饰是才可以定义static修饰的变量
        final int d = 0;
        private void xys1(){

        }
        //内部类中的成员方法访问外部类成员变量，及内部类成员变量
        public static void xys(){
//            System.out.println(age);静态内部类只能访问外部类静态成员变量
            Outter.xys();


        }

    }

    //声明一个成员内部类
    class inner1{
        int s ;
        private int a;
        protected int b = 0;
        //static int c;只有内部类用static修饰是才可以定义static修饰的变量
        final int d = 0;
        private void xys1(){

        }
        //内部类中的成员方法访问外部类成员变量，及内部类成员变量
        public void xys(){
            System.out.println(age);
            Outter.xys();
            s = 1;
            a = 2;
            b = 3;

        }

        //public abstract void ys();
    }

    public Outter(){
        //在构造器声明一个内部类
        abstract class inner2{

        }
    }
    public void mothod(){
        //在成员方法的内部声明一个内部类
        abstract class inner3{

        }
    }

    {
        //在代码块声明一个内部类
        abstract class inner4{

        }
    }
}



