import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数 x，判断该函数是否为一个质数。

        //质数：
        //如果一个整数只能被 1 和本身整除，那么这个数就是质数，否则这个数是合数

        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();

        //定义一个变量，表示标记
        //标记着number是否为一个质数
        //true： 是一个质数
        //false：不是一个质数

        //表示最初就认为number是一个质数
        boolean flag =true;

        //判断：
        //写一个循环，从 2 开始判断，一直判断到 number-1 为止
        //看这个范围之内有没有数字可以被number整除
        for (int i = 2; i < number ; i++){
            // i 依次表示这个范围之内的每一个数字
            //看number是否能被1整除就可以了
            if (number % i ==0){
                flag = false;
                //System.out.println(number +"不是一个质数");
                break;
            }/*else{
               System.out.println(number +" 是一个质数");
            }*/
        }
        //只有当这个循环结束了，表示这个范围之内所有发数字都判断完毕了
        //此时才能断定number是一个质数
        if (flag){
            System.out.println(number +" 是一个质数");
        }else{
            System.out.println(number +"不是一个质数");
        }
    }
}
