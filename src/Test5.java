import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //需求：在唱歌比赛中，有六名评委给选手打分，分数范围是[0 ~ 100]之间的整数
        //选手最后得分为：去掉最高分，最低分后4个评委的平均分，请完成上述过程并计算出选手的得分

        //分析：
        //1、定义一个数组，用来存储6名评委的打分（0~100）

        //2、求出数组中的最大值

        //3、求出数组中的最小值

        //4、求出数组中6个分数的总和

        //5、（总和 - 最大值 - 最小值 ） / 4

    }

    public static int[] getScores() {
        //定义数组
        int[] scores = new int[6];
        //使用键盘录入的形式，输入分数：0~100
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100){
                scores[i] = score;
            }

        }
        return scores;
    }
}
