package com.liupeng.example16permutation;

import com.alibaba.fastjson.JSON;

/**
 * Created by liupeng on 2016/9/29.
 */
public class PermutationTest {
    public static void main(String[] args) {
//        int[] arr = new int[]{1,2,3};
//        permutation(arr,0,3);
//        System.out.println(JSON.toJSONString(arr));
        permutation2();
    }

    public static void permutation(int[] arr, int start, int end) {
        if(start == end){
            for(int i = 0; i < end; i++){
                System.out.print(arr[i]);
            }
            System.out.println("");
        }else{
            for(int j = start; j < end; j++){
                int temp = arr[start];// 交换数组第一个元素与后续的元素
                arr[start] = arr[j];
                arr[j] = temp;
                permutation(arr, start + 1, end);
                int temp2 = arr[start];
                arr[start] = arr[j];
                arr[j] = temp2;
            }
        }
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = b;
        arr[b] = temp;
    }

    public static void permutation2(){
        int num = 0;
        int[] arr = new int[]{1,2,3,4};
        int largest = 4;
        for(int i=1;i<=largest;i++){
            for(int j=1;j<=largest;j++){
                if(j==i){
                    continue;
                }
                for(int k=1;k<=largest;k++){
                    if(k==i||k==j){
                        continue;
                    }
                    for(int m=1;m<=largest;m++){
                        if(m==k||m==j||m==i){
                            continue;
                        }else{
                            System.out.println(i+""+j+""+k+""+m);
                            num++;
                        }
                    }
                }
            }
        }
        System.out.println("-------------------------------");
        System.out.println(num);
    }
}
