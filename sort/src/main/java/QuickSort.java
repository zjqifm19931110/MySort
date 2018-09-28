import java.util.Arrays;

/**
 * Created by bjzhaojianqiang on 2018/9/28.
 * 参考备注：https://www.jianshu.com/p/de327b97a0de
 */
public class QuickSort {
    public static void quickSort(int[] arr){
        if(arr == null && arr.length <=1){
            return;
        }
        sort(arr, 0, arr.length-1);
    }
    public static void sort(int[] arr, int left, int right){
        if(left<right){
            int i = left;
            int j = right;
            int mid = arr[i];
            while(i<j){
                while(i<j && arr[j]>=mid){
                    j--;
                }
                if(i<j){
                    arr[i++] = arr[j];
                }
                while(i<j && arr[i]<=mid){
                    i++;
                }
                if(i<j){
                    arr[j--] = arr[i];
                }
            }
            //i=j,退出循环的条件
            arr[i] = mid;
            sort(arr, left, mid-1);
            sort(arr, mid+1, right);
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
