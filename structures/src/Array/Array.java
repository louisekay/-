package Array;

//数组折半查找
//冒泡排序
//选择排序
//希尔排序
//堆排序
//二路归并排序
//桶式排序
//基数排序
//合并排序
//快速排序


//递归
//非递归


import java.util.Random;

//数组
public class Array {
    private static int[] array = new int[10];
    private Random random = new Random();
    void changeArry(){
        //刷新数组
        for (int i = 0; i < 10; i++) {
            array[i] =  random.nextInt(100);
        }
        System.out.println("刷新完的数组："+array);
    }


    public static void main(String[] args) {

    }
}
