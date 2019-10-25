//static code block 静态代码块
package july26th;
class Scb{
    static String country;
    static{
        country="San Petersburg";
        System.out.printf("%s类中的静态代码块被执行了\n",Thread.currentThread().getStackTrace()[1].getClassName());
    }
    //使用一对大括号括起来的一段代码称为代码块
    /*比如:

    {
        💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩💩
    }
    
    */
    //用static修饰上述的代码块就变成了静态代码块

    //当类加载时,静态代码块会执行
    //***由于类只会加载一次,静态代码也只会执行一次***!important
    //在多数java程序开发时,通常会使用静态代码块来对类的成员变量初始化
}