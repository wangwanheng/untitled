import java.util.Random;

public class LoopTest4 {
    public static void main(String[] args) {
        //先获取一个随机数
        //范围：0~10

        //创建对象
        Random r = new Random();

        //生成随机数
        //判断技巧：
        //在小括号中，书写的是生成随机数的范围
        //这个范围一定是从0开始的
        //到这个数-1 结束
        //口诀：包头不包尾，包左不包右。
        for (int i =0 ;i < 100; i++){
            int number = r.nextInt(10);
            System.out.println(number);
        }
    }
}
