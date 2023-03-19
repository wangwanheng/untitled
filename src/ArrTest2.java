public class ArrTest2 {
    public static void main(String[] args) {
        //定义一个数组，存储1，2，3，4，5，6，7，8，9，10
        //遍历数组得到每一个元素，统计里面一共有多少个人能被三整除的数字

        //分析
        //定义数组
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
         //定义一个变量用来统计次数
        int count = 0;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0){
                count++;
            }
        }
        System.out.println("数组中能被3整除的数字有" + count + "个");
    }
}
