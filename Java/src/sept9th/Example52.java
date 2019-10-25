//Random类
package sept9th;
import java.util.Random;
//👆使用Random类之前,需要进行导入.
public class Example52{
    public static void main(String[] args){
         Random r=new Random();
         for(int x=0;x<10;x++){
             System.out.println(r.nextInt(100));
                                //👆返回对象r中随机数序列的下一个数.
         }
    }
}
//Random类来自Java系统的util系列包,它可以在指定的取值范围随机产生数字.
//在Random类中提供了两个构造方法:
//  Random()                无参数构造方法,创建一个伪随机数生成器,其种子也是按照系统当前时间产生的.
//  Random(long seed)       使用一个long型的seed种子创建伪随机数生成器
//                                              👆种子会影响到对象所产生的随机数,
//                                                如果某些对象中的种子相同,那么这些对象将会产生相同序列的随机数.
//有关Random类中的更多方法,请参阅Example53.