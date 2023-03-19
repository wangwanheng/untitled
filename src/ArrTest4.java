
public class ArrTest4 {
    public static void main(String[] args) {
        //定义数组求最大值：33,5,22,44,55

        //定义数组
        int[] arr = {33,5,22,44,55};
        //定义一个变量max用来存储最大值
        //临时认为0索引的数据是最大的
        int max = arr[0];
        //循环获取数组中的每一个元素
        //拿着每一个元素跟max进行比较
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
