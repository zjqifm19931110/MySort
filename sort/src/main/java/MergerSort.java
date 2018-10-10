import java.util.Arrays;

/**
 * Created by bjzhaojianqiang on 2018/10/10.
 * 参考链接地址：https://www.cnblogs.com/chengxiao/p/6194356.html
 */
public class MergerSort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        if(arr == null || arr.length <2)
            return;
        sort(arr, 0, arr.length -1);
    }

    public static void sort(int[] arr, int left, int right){
        if(left< right){
            int mid = (left+right)/2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] tmp = new int[arr.length];
        int t = 0;
        int i = left;
        int j = mid + 1;
        while(i<=mid && j<=right){
            if(arr[i] < arr[j]){
                tmp[t++] = arr[i++];
            }
            else{
                tmp[t++] = arr[j++];
            }
        }

        while(i<=mid){
            tmp[t++] = arr[i++];
        }
        while(j<=right){
            tmp[t++] = arr[j++];
        }
        t =0;
        while(left <= right){
            arr[left++] =tmp[t++];
        }
    }
}
