import java.util.Arrays;

/**
 * Created by bjzhaojianqiang on 2018/9/28.
 */
public class CountSort {

    public static void countSort1(int[] arr){
        if(arr == null || arr.length<=1){
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        //构造计数数组
        int[] help = new int[max-min+1];
        for(int i=0; i<arr.length; i++){
            help[arr[i]-min]++; //help[index]; index = arr[i]
        }

        int i=0;
        for(int j=0; j<help.length; j++){
            while(help[j]-->0){
                arr[i++] = j+min;
            }
        }
    }

    //标准的计数排序
    public static int[] countSort2(int[] arr){
        if(arr == null || arr.length<=1){
            return arr;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        int[] help = new int[max-min+1];
        for (int i = 0; i < arr.length; i++) {
            help[arr[i]-min]++;
        }
        //多此一举
        for (int i = 1; i < help.length; i++) {
            help[i] = help[i-1] + help[i];
        }

        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           int pos = --help[arr[i]-min];
           tmp[pos] = arr[i];
        }
        return tmp;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        countSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
