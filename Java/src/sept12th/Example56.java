//Date类
package sept12th;
import java.util.Date;
//👆使用前不要忘记导入
public class Example56{
    public static void main(String[] args){
        Date a=new Date();
        Date b=new Date(966666666666L);
    //  👆初始化格式
        System.out.println(a);
        System.out.println(b);
    }
}
/* Date类也属于java系统的util包,用于在代码中提供与日期和时间相关的功能.
Date中的大部分构造方法都已过时,因为Date类在设计之初没有考虑到国际化的问题;
自从JDK1.1开始,Calendar类取代了Date类的大部分功能,只剩下两个还算常用的构造方法.
一个是无参数的构造方法Date(),用来创建当前日期时间的Date对象.
另一个是有参构造方法Date(long date),用于创建指定时间的Date对象,
                            👆表示自1970年1月1日 00:00:00以来的时间(单位毫秒)
*/