//super关键字
package aug1st;
class Neko extends Animal{
    void printName(){
        name="旺财";
        sound="喵~";
        System.out.println("姓名:"+super.name); //访问父类的成员变量
    }
    void shout(){
        super.shout();  //调用父类的shout()方法
    }
}
//当子类重写父类方法后,子类对象将无法访问父类被重写的方法.
//此时,可以使用super关键字来访问父类的成员.
/*格式
 
super.成员变量;
super.成员方法(参数);
super(参数);
👆调用父类的构造方法

*/
// * super调用的父类构造方法的代码必须在子类构造方法中的第一行.
// * super调用的父类构造方法的代码只能出现一次.
//   建议:在定义一个类时,定义一个无参的构造方法,可以避免在继承时出现相关的编译错误.(偶有特殊情况)