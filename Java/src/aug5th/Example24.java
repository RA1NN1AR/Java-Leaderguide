//instanceof关键字
package aug5th;
public class Example24{
    public static void main(String[] args){
        C c = new C();
        z(c);
    }
    public static void z(A i){
        if(i instanceof B){ //使用了instanceof判断i是否为B的类/接口的实例或子类实例.
        //👆确保了对象类型与转换类型的一致性
        B b=(B) i;
        b.x();
        b.y();
        }else{
            System.out.println("调用的不是B类");
            //👆在对象类型与要转换的类型不同的时候执行
        }
    }
}
//instanceof是一个关键字,也是一个运算符.其用法与逻辑运算符相同.
//instanceof用于判断左边的对象是否为右边对象的某个类/接口的实例或子类实例.
//判断完成后,instanceof最终会计算出 true 或 false 的结果
//基于这种特性,instanceof常常被用于条件判断语句,循环语句的条件部分.
//格式:
// 对象(或对象引用的变量) instanceof 类/接口