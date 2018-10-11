import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 
 */
public class BucketSort {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        bucketSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bucketSort(int[] arr) {
        if(arr == null || arr.length <2){
            return;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        //桶的个数
        int bucketNum = ((max-min)/arr.length) +1;
        //初始化桶数组
        ArrayList<ArrayList<Integer>> bucketArr = new ArrayList<ArrayList<Integer>>(bucketNum);
        for(int i=0; i<bucketNum; i++){
            bucketArr.add(new ArrayList<Integer>());
        }

        //将arr元素放入对应的桶中
        for(int i=0; i<arr.length; i++){
            int index = (arr[i]-min)/ arr.length;
            bucketArr.get(index).add(arr[i]);
        }

        //对桶中的元素分别排序
        int t=0;
        for(int i=0; i<bucketNum; i++){
            if(bucketArr.get(i).isEmpty()){
                continue;
            }
            Collections.sort(bucketArr.get(i));
            for(Integer var: bucketArr.get(i)){
                arr[t++] = var;
            }
        }
    }
}
