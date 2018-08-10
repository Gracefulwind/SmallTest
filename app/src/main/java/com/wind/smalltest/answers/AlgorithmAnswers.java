package com.wind.smalltest.answers;

import android.util.Log;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by Gracefulwind Wang on 2018/8/10.
 * Email : Gracefulwindbigwang@gmail.com
 *
 * @author : Gracefulwind
 */
public class AlgorithmAnswers {

    /**
     * 2018刑侦科推理试题
     *
     *
     * @param answersList*/
    public static final int OPTION_COUNT = 4;
    public static void doQuestion1(ArrayList<LogicAnswer> answersList){
        Date startDate = new Date();
        Log.e("ans","startTime == " + startDate);
        //method1在遍历时只用了一次大for循环，没有很深的栈层，内存容易释放,但是费时(3.25S)
        do1Mthod1(answersList);
        //method用递归遍历，在可读性上更强，但是不利于堆内存的释放,但是较快(1.2S)
//        do1Mthod2(answersList);
        Date endDate = new Date();
        Log.e("ans","endTime == " + endDate);
        long useTime = endDate.getTime() - startDate.getTime();
        Log.e("ans","useTime == " + useTime);
    }

    private static void do1Mthod2(ArrayList<LogicAnswer> answersList){
        getAnsList(answersList, new ArrayList<String>());
        Log.e("ans", "测试完成===========================");
    }
    private static void getAnsList(ArrayList<LogicAnswer> answersList,ArrayList<String> ansList) {
        if(ansList.size() < answersList.size()){
            for(int x = 0;x <OPTION_COUNT; x++){
                ArrayList<String> tempList = new ArrayList<>();
                tempList.addAll(ansList);
                String result;
                switch (x){
                    case 0:
                        result = "A";
                        break;
                    case 1:
                        result = "B";
                        break;
                    case 2:
                        result = "C";
                        break;
                    case 3:
                        result = "D";
                        break;
                    default:
                        result = "";
                        break;
                }
                tempList.add(result);
                getAnsList(answersList, tempList);
            }
        }else {
            boolean b = compareAnswers(answersList, ansList);
            if(b){
                Log.e("ans", "答案为：" + ansList);
//                break;
            }
        }
    }


    private static void do1Mthod1(ArrayList<LogicAnswer> answersList) {
        int questionSize = answersList.size();
        for(int index = 0; index < Math.pow(OPTION_COUNT, questionSize); index++){
            ArrayList<String> ans = new ArrayList<>();
            //得到10个值
            for(int x = 1; x <= questionSize; x++){
                int temp = (int) (index / Math.pow(OPTION_COUNT, x - 1) % OPTION_COUNT);
                String result;
                switch (temp){
                    case 0:
                        result = "A";
                        break;
                    case 1:
                        result = "B";
                        break;
                    case 2:
                        result = "C";
                        break;
                    case 3:
                        result = "D";
                        break;
                    default:
                        result = "";
                        break;
                }
                ans.add(result);
            }
            boolean b = compareAnswers(answersList, ans);
            if(b){
                Log.e("ans", "答案为：" + ans);
//                break;
            }
        }
        Log.e("ans", "测试完成===========================");
    }

    private static boolean compareAnswers(ArrayList<LogicAnswer> answersList, ArrayList<String> ans) {
        for(LogicAnswer logicAnswer : answersList){
            if(null == logicAnswer){
                continue;
            }
            if(!logicAnswer.answerLogic(ans)){
                return false;
            }
        }
        return true;
    }

    public interface LogicAnswer{
        boolean answerLogic(ArrayList<String> answers);
    }

    public static String getAnswer(ArrayList<String> answers, int questionNo){
        return answers.get(questionNo - 1);
    }

//    public abstract class testA{
//        static String str1 = "1";
//        public abstract boolean test();
//    }
//
//    public static abstract class testB {
//        static String str1 = "1";
//        public abstract boolean test();
//    }
//
//    public interface test1{
//        static String str1 = "1";
//        boolean test();
//    }
//
//    public static interface test2{
//        static String str1 = "1";
//        boolean test();
//    }
}
