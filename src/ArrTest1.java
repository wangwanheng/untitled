public class ArrTest1 {
    public static void main(String[] args) {
        //定义一个数组：存储1，2，3，4，5
        //遍历数组得到每一个元素，求数组里面所以数据和

        //分析
        //定义数组
        int[] arr ={1,2,3,4,5};
        //遍历数组得到每一个元素，累加求和
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            // i 依次表示数组里面的每日一个索引
            //arr[i] 依次表示数组里的每一个元素
            sum = sum +arr[i];
        }
        //当循环结束之后，sum的值就是累加之后的结果
        System.out.println(sum);
    }
}
