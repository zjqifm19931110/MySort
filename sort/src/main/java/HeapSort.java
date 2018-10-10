import java.util.Arrays;

/**
 *堆排序
 * 参考：https://www.cnblogs.com/chengxiao/p/6129630.html
 * 堆：每个节点的值，大于或等于左右节点的值，称为大顶堆。
 */
public class HeapSort {
    public static void main(String[] args) {
        int []arr = {9,8,7,6,5,4,3,2,1,1};
        heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        if(arr == null || arr.length <2){
            return;
        }

        //构造最大堆
        for(int i=((arr.length/2)-1); i>=0; i--){
            adjustHeap(arr, i, arr.length);
        }
        //根节点和最后一个节点交换数据
        for(int j=arr.length-1; j>0; j--){
            swap(arr, 0, j);
            adjustHeap(arr, 0, j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void adjustHeap(int[] arr, int i, int length) {
        int tmp = arr[i];
        for(int k=2*i+1; k<length; k = 2*k+1){
            if(k+1<length && arr[k]<arr[k+1]){
                k++;
            }
            if(arr[i]<arr[k]){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        arr[i] = tmp;
    }
}


