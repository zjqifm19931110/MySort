import java.util.Arrays;

/**
 * Created by bjzhaojianqiang on 2018/9/28.
 */
public class InsertSort {

    public static void insertSort(int[] arr){
        if(arr == null || arr.length <=1){
            return;
        }

        int tmp;
        for(int i=1; i<arr.length; i++){
            //注意二次循环结束的条件
            for(int j=i; j>0 && arr[j-1] > arr[j]; j--){
                tmp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
