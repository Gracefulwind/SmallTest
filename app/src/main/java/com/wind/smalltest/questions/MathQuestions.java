package com.wind.smalltest.questions;

import com.wind.smalltest.answers.MathAnswers;

/**
 * Created by Gracefulwind Wang on 2018/8/6.
 * Email : Gracefulwindbigwang@gmail.com
 *
 * @author : Gracefulwind
 */
public class MathQuestions {
    /**
     * *
     * 输入一个整型数组，数组中有正数也有负数。数组中一个或多个整数形成一个子数组，求所有子数组的和的最大值，要求时间复杂度为 O(n)。
     比如输入 {1, -2, 3, 10, -4, 7, 2, -5}，能产生子数组最大和的子数组为 {3,10,-4,7,2}，最大和为 18。
     * */
    public static void question1() {
        int[] data1 = {-5, -6, 1, 3, -2, 3, 11, -4, 7, 2, -4};
        int[] data2 = {-2, -4, -1, -9, -9};
        int[] data3 = {1, 8, 1,11, 5, 9};
        int[] data4 = {-1,10,
                -1, -3,
                2,
                -1,-3, -2,
                3, 1,
                -2,
                10};
        System.out.println("====data1====");
        System.out.println(MathAnswers.doQuestion1(data1));
        System.out.println("====data2====");
        System.out.println(MathAnswers.doQuestion1(data2));
        System.out.println("====data3====");
        System.out.println(MathAnswers.doQuestion1(data3));
        System.out.println("====data4====");
        System.out.println(MathAnswers.doQuestion1(data4));
    }

}
