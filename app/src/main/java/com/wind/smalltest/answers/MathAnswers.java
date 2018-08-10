package com.wind.smalltest.answers;

import com.wind.smalltest.utils.ArrayUtils;

/**
 * Created by Gracefulwind Wang on 2018/8/6.
 * Email : Gracefulwindbigwang@gmail.com
 *
 * @author : Gracefulwind
 */
public class MathAnswers {
    /**
     *
     //解:
     连续的正数、负数实际上为一个正数、负数，从第一个正数开始，如果后面的一个负数小于后面的正数，则和增加
     //===整合完是正/交替的。
     //1.假设某段值A2加上前面的值A1的和最大，那么A1的值必然大于等于0
     //2.所以从某个正值开始累加，如果和S1>=0，那么：如果后面的S2是最大值，那么S1+S2必然是最大值，那么S1必然是最大值的一部分
     //3.记录角标
     需要：
     1.当前最大值
     2.当前计数值
     * */
    public static int[] doQuestion1(int[] arr) {
        if (arr == null || arr.length < 1) {
            throw new IllegalArgumentException("Array must contain an element");
        }
        //记录最大的子数组和，开始时是最小的整数
        int max = Integer.MIN_VALUE;
        //当前的和
        int curMax = 0;
        //起始角标
        int startIndex = 0;
        //结束角标
        int endIndex = 0;
        //当前数段的起始角标
        int startTemp = 0;
        //当前数段的结束角标
        int endTemp = 0;
        //计数器
        int index = 0;
        // 数组遍历
        for (int i : arr) {
            // 如果当前和小于等于0，就重新设置当前和
            if (curMax <= 0) {
                curMax = i;
                startTemp = index;
                endTemp = index;
            // 如果当前和大于0，累加当前和
            }else {
                curMax += i;
                endTemp = index;
            }
            // 更新记录到的最在的子数组和
            if (max < curMax) {
                max = curMax;
                startIndex = startTemp;
                endIndex = endTemp;
            }
            index++;
        }
        int length = endIndex - startIndex + 1;
        int[] result = new int[length];
        System.arraycopy(arr, startIndex, result, 0, length);
        String resultToString = ArrayUtils.arrayToString(result);
        System.out.println("当前数组的最大值为: " + max);
        System.out.println("起始角标:start=" + startIndex + ",结束角标:end=" + endIndex);
        System.out.println(resultToString);
        return result;
    }
}
