import java.util.Arrays;

/**
 * Created by bjzhaojianqiang on 2018/9/28.
 * 参考：https://blog.csdn.net/www_wangjun/article/details/73291502
 *
 */
public class ShellSort {

    public static void shellSort(int[] arr){
        if(arr == null || arr.length<=1){
            return;
        }

        int tmp;
        int gap = arr.length/2;
        while(gap>0){
            for(int i=gap; i<arr.length; i++){
                int j = i - gap;
                while(j>=0 && arr[j]>arr[j+gap]){
                    tmp = arr[j];
                    arr[j] = arr[j+gap];
                    arr[j+gap] = tmp;
                    j = j - gap;  //每次交换后都得往前走
                }
            }
            gap = gap/2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,1};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
