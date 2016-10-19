package com.liupeng.example12array;

import com.alibaba.fastjson.JSON;

/**
 * Created by liupeng on 2016/9/5.
 */
public class TwoDimentianArrayTest {
    public static void main(String[] args) {
        //java中没有三维数组，二维数组的本质是一个一位数组，每个数组的元素都是一个一维数组
        Object[][] twoDimentionArray = new Object[2][];
        for(int i=0; i<twoDimentionArray.length; i++){
            twoDimentionArray[i] = new Object[]{1,3,5,7};
            System.out.println("----"+twoDimentionArray);
        }
        System.out.println("----"+ JSON.toJSONString(twoDimentionArray));
    }
}
