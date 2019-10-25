//线程休眠
package aug20th;
public class Example33{
    public static void main(String[] args) throws Exception{
                                        // 👆此处抛出了异常.
        new Thread(new SleepThread()).start();
        for(int i =1;i<=10;i++){
            if(i==8){
                Thread.sleep(2000);
            }
            System.out.println("来自主线程的输出:"+i);
            Thread.sleep(500);
        }
    }
}
/*
sleep(long millis)方法可用于控制线程,让当前正在执行的线程暂停一段时间,进入休眠等待状态.将CPU让给其他线程.
        |    👆要休眠的时间(单位毫秒)
        👆给出了参数类型

此外,由于sleep()方法还会声明抛出InterruptedException异常,所以在调用时还应捕获异常或是像SleepThread.java那样抛出异常
还应注意,sleep()是静态方法,只能控制当前正在运行的线程休眠,而不能控制其他线程休眠.
当休眠时间结束后,线程就会返回到就绪状态,等待CPU的调度而不是立即开始运行.
*/