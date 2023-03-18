import java.util.Scanner;

public class LoopTest2 {
    public static void main(String[] args) {
        /*需求：键盘录入一个大于等于2的整数 x ；计算并返回 x的平方根。
        结果只保留整数部位，小数部位将被舍去*/

        //分析：
        //平方根  16 的平方根 4
        //       4 的平方根 2

        //在代码当中
        //从1开始循环，拿着数字的平方跟原来的数字进行比较
        // 如果小于的，那么继续往后判断
        //如果相等，那么当前数字就是平方根
        //如果打于的，那么前一个数字就是平方根的整数部分

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        for (int i = 1;i <= number; i++){
            if (i * i == number){
                System.out.println(i + "就是" + number + "的平方根");
                //一旦找到了，循环就可以停止了，后面的数字就不需要再找了，提高代码的运行速率。
                break;
            }else if(i * i >number){
                System.out.println((i-1) + "就是" + number + "平方根的整数部分");
                break;
            }
        }


    }
}
