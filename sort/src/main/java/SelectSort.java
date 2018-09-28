import java.util.Arrays;

/**
 * Created by bjzhaojianqiang on 2018/9/28.
 */
public class SelectSort {
    public static void selectSort(int[] arr){
        if(arr == null || arr.length <=1){
            return;
        }

        int tmp;
        for(int i=0; i<arr.length-1; i++){
            int mindex = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[mindex]>arr[j]){
                    mindex = j;
                }
            }
            if(mindex != i){
                tmp = arr[mindex];
                arr[mindex] = arr[i];
                arr[i] = tmp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
