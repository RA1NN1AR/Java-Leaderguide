//Runtime类
package sept6th;
public class Example49{
    public static void main(String[] args){
        Runtime rt=Runtime.getRuntime();
        System.out.printf("处理器的个数:%d个\n",rt.availableProcessors());
                                                //👆返回可用处理器个数(int)
        System.out.printf("空闲内存数量:%d兆字节(MB)\n",rt.freeMemory()/1024/1024);
                                                        //👆可用内存,单位字节(int)
        System.out.printf("最大可用内存数量:%d兆字节(MB)\n",rt.maxMemory()/1024/1024);
                                                            //👆最大内存,单位字节(int)
    }
}
//Runtime类用于表示虚拟机运行时的状态,它用于java系统进程.
//每次使用控制台调用java命令都会对应一个且只有一个Runtime实例,
//因此,该类采用了单例模式进行设计,其中的对象不可以直接实例化.
//若想在程序中获得一个Runtime实例,只能通过以下方式:
//  Runtime run=Runtime.getRuntime();
//由于Runtime类封装了虚拟机进程,籍此就可以在程序中通过该类的实例对象来获取有关当前java系统的信息.