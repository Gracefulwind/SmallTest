package com.wind.smalltest.utils;

import android.support.annotation.NonNull;


/**
 * Created by Gracefulwind Wang on 2018/8/6.
 * Email : Gracefulwindbigwang@gmail.com
 *
 * @author : Gracefulwind
 */
public class ArrayUtils<T> {


//===通用数组赚===============================================================================================
    /**
     * 基本类型boolean数组toString
     * */
    @NonNull
    public static String arrayToString(boolean[] result) {
        StringBuilder resultToString = new StringBuilder();
        resultToString.append("数组为:[");
        for(int x = 0; x <= result.length - 1; x++){
            if(x == result.length - 1){
                resultToString.append(result[x]).append("]");
            }else {
                resultToString.append(result[x]).append(", ");
            }
        }
        return resultToString.toString();
    }

    /**
     * 基本类型char数组toString
     * */
    @NonNull
    public static String arrayToString(char[] result) {
        StringBuilder resultToString = new StringBuilder();
        resultToString.append("数组为:[");
        for(int x = 0; x <= result.length - 1; x++){
            if(x == result.length - 1){
                resultToString.append(result[x]).append("]");
            }else {
                resultToString.append(result[x]).append(", ");
            }
        }
        return resultToString.toString();
    }

    /**
     * 基本类型short数组toString
     * */
    @NonNull
    public static String arrayToString(short[] result) {
        StringBuilder resultToString = new StringBuilder();
        resultToString.append("数组为:[");
        for(int x = 0; x <= result.length - 1; x++){
            if(x ==result.length - 1){
                resultToString.append(result[x]).append("]");
            }else {
                resultToString.append(result[x]).append(", ");
            }
        }
        return resultToString.toString();
    }

    /**
     * 基本类型int数组toString
     * */
    @NonNull
    public static String arrayToString(int[] result) {
        StringBuilder resultToString = new StringBuilder();
        resultToString.append("数组为:[");
        for(int x = 0; x <= result.length - 1; x++){
            if(x == result.length - 1){
                resultToString.append(result[x]).append("]");
            }else {
                resultToString.append(result[x]).append(", ");
            }
        }
        return resultToString.toString();
    }

    /**
     * 基本类型long数组toString
     * */
    @NonNull
    public static String arrayToString(long[] result) {
        StringBuilder resultToString = new StringBuilder();
        resultToString.append("数组为:[");
        for(int x = 0; x <= result.length - 1; x++){
            if(x ==result.length - 1){
                resultToString.append(result[x]).append("]");
            }else {
                resultToString.append(result[x]).append(", ");
            }
        }
        return resultToString.toString();
    }

    /**
     * 基本类型float数组toString
     * */
    @NonNull
    public static String arrayToString(float[] result) {
        StringBuilder resultToString = new StringBuilder();
        resultToString.append("数组为:[");
        for(int x = 0; x <= result.length - 1; x++){
            if(x ==result.length - 1){
                resultToString.append(result[x]).append("]");
            }else {
                resultToString.append(result[x]).append(", ");
            }
        }
        return resultToString.toString();
    }

    /**
     * 基本类型double数组toString
     * */
    @NonNull
    public static String arrayToString(double[] result) {
        StringBuilder resultToString = new StringBuilder();
        resultToString.append("数组为:[");
        for(int x = 0; x <= result.length - 1; x++){
            if(x ==result.length - 1){
                resultToString.append(result[x]).append("]");
            }else {
                resultToString.append(result[x]).append(", ");
            }
        }
        return resultToString.toString();
    }

    /**
     * 泛型数组toString，需要泛型类本身实现toString方法，否则返回的是地址值
     * */
    @NonNull
    public static<T> String arrayToString(T[] result) {
        StringBuilder resultToString = new StringBuilder();
        resultToString.append("数组为:[");
        for(int x = 0; x < result.length; x++){
            if(x == result.length - 1){
                resultToString.append(result[x]).append("]");
            }else {
                resultToString.append(result[x]).append(", ");
            }
        }
        return resultToString.toString();
    }
}
