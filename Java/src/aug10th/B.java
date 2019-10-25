//import语句
package aug10th;
import july17th.Student;
public class B{
    public static void main(String[] args) {
        Student a = new Student();
        a.intoducing();
    }
}
//import用于位于不同包中的类的互相调用.
//将某个指定包下的类一次导入后,就无需在调用到该类时给出完整类名了.
//格式:
/*
package a;
import 包名.类名;
👆导入时应写在package下一行.(非java系统包)
public class a1{}
*/

//如果需要用到一个包中的多个甚至所有类,可以在类名的位置使用"*"代替.
//调用java系统中的包时,应写在package上一行.
//这些包位于安装的JDK中,并可按需调用.
//HINT:要想使用导入的类中的方法和成员,还需调整访问权限.