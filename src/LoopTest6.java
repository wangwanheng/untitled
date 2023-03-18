import java.util.Random;
import java.util.Scanner;

public class LoopTest6 {
    public static void main(String[] args) {
        //需求：程序自动生成一个1~100之间的随机数字，使用程序实现猜出这个数字是多少

        //注意点
        //生成随机数的代码int number = r.nextInt(100)+1;
        //不能写在循环的里面，否则每一次都会产生一个新的随机数

        //分析
        //1、生成一个1~100之间的随机数字
        Random r =new Random();
        int number = r.nextInt(100)+1;
        //2、猜这个数字是多少
        Scanner sc =new Scanner(System.in);
        while(true){
            System.out.println("请输入你要猜的数字");
            int guessNumber = sc.nextInt();
            //3、判断两个数字给不同的提示
            //猜的数字太大了，提示  大了
            //猜的数字太小了，提示  小了
            //猜的数字一样，提示  猜中了
            if (guessNumber > number){
                System.out.println("大了");
            } else if (guessNumber < number) {
                System.out.println("小了");
            }else {
                System.out.println("猜中了");
                break;
            }
        }
    }
}
