import java.util.Random;

public class ArrTest9 {
    public static void main(String[] args) {
        //需求：定义一个数组，存入1~5,要求打乱数组中所有数据的顺序

        /*int[] arr ={1,2,3,4,5};
        Random r =new Random();
        int randomIndex =r.nextInt(arr.length);
        System.out.println(randomIndex);*/

        //定义数组
        int [] arr ={1,2,3,4,5};
        //循环遍历数组，从0索引开始打乱数据的顺序
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            //生成一个随机索引
            int randomIndex = r.nextInt(arr.length);
            //拿着随机索引指向的元素 跟 i 指向的元素进行交换
            int temp =arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] =temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }

    }
}
