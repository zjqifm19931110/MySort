import java.util.Arrays;

/**
 * Created by bjzhaojianqiang on 2018/9/28.
 */
public class BubbleSort {
    public static void bubbleSort1(int[] arr){
        if(arr == null && arr.length <=1){
            return;
        }

        int tmp;
        for(int i=0; i < arr.length-1; i++){
            for(int j=1; j < arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }

    public static void bubbleSort2(int[] arr){
        if(arr == null && arr.length <=1){
            return;
        }

        int tmp;
        boolean flag = true;
        int len = arr.length;
        while(flag){
            flag = false;
            for(int j=1; j < len; j++){
                if(arr[j-1]>arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                    flag = true;
                }
            }
            len--;
        }
    }

    public static void bubbleSort3(int[] arr){
        if(arr == null && arr.length <=1){
            return;
        }

        int tmp,k=arr.length;
        int flag = k;
        while(flag>1){
            k = flag;
            flag = 1;
            for(int j=1; j<k; j++){
                if(arr[j-1] > arr[j]){
                    tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = arr[j];
                    flag = j;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        bubbleSort2(arr);
        System.out.println(Arrays.toString(arr));
    }
}
