public class ArrTest7 {
    public static void main(String[] args) {
        //需求：定义一个数组，将数组中0索引和最大索引的值进行调换
        int[] arr ={1,2,3,4,5};
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
