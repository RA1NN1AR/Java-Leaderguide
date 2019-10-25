//字符串的截取与分割
package sept1st;
public class Example44{
    public static void main(String[] args){
        String str="a---b-c";
        System.out.println("从第三个字符开始输出到结尾:"+str.substring(2));
        System.out.println("输出从第二个字符开始到第四个字符的结果:"+str.substring(1,4));
        System.out.print("分割后的字符串数组中的元素为:");
        String[] str2=str.split("-");
        //使用for遍历输出str2数组中的元素
        for(int i=0;i<str2.length;i++){
            if(i!=str2.length-1){
                System.out.print(str2[i]+",");
            }else{
                System.out.println(str2[i]);
            }
        }
    }
}
/* String类的常用方法:
        方法声明                                               |           功能描述
String      substring(int beginIndex,int endIndex)               截取从给定位置开始到给定位置结尾的字符串(其中endIndex可省略,即到结尾为止.)
String[]    split(String regex)                                  根据给定字符串将原来的字符串分割并重组为字符串数组
👆返回值类型 👆方法名称
    🔵使用substring方法时要注意字符串的第一位是从0开始的,要把实际的位置做减一处理.
    
    关于split方法的工作原理:
        将每个给定分割用字符左右两侧的字符串取出并依次存入代码中位于该方法等号左边的数组中,重复此步骤直到没有更多的分割用字符出现为止.
*/