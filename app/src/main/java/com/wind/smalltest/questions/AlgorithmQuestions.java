package com.wind.smalltest.questions;

import android.text.TextUtils;

import com.wind.smalltest.answers.AlgorithmAnswers;

import java.util.ArrayList;
import java.util.HashMap;

import static com.wind.smalltest.answers.AlgorithmAnswers.getAnswer;

/**
 * Created by Gracefulwind Wang on 2018/8/10.
 * Email : Gracefulwindbigwang@gmail.com
 *
 * @author : Gracefulwind
 */
public class AlgorithmQuestions {

//    static {
//        new AlgorithmAnswers(). new testA() {
//            @Override
//            public boolean test() {
//                return false;
//            }
//        };
//        new AlgorithmAnswers.testB() {
//            @Override
//            public boolean test() {
//                return false;
//            }
//        };
//        new AlgorithmAnswers.test1() {
//            @Override
//            public boolean test() {
//                return false;
//            }
//        };
//        new AlgorithmAnswers.test2() {
//            @Override
//            public boolean test() {
//                return false;
//            }
//        };
//    }

    /**
     * 2018刑侦科推理试题
     *
     * 实现自动化，只需要在list中添加问题的判断逻辑即可。解决方案封装
     *
     * */
    public static void question1(){
        ArrayList<AlgorithmAnswers.LogicAnswer> answersList = new ArrayList<AlgorithmAnswers.LogicAnswer>();
        //第一题
        answersList.add(new AlgorithmAnswers.LogicAnswer() {
            @Override
            public boolean answerLogic(ArrayList<String> answers) {
                return true;
            }
        });
        //第2题:第五题的答案是
        answersList.add(new AlgorithmAnswers.LogicAnswer() {
            @Override
            public boolean answerLogic(ArrayList<String> answers) {
                String answer5 = getAnswer(answers, 5);
                String answer2 = getAnswer(answers, 2);
                String answer2From5 = null;
                switch (answer5){
                    case "A":
                        answer2From5 = "C";
                        break;
                    case "B":
                        answer2From5 = "D";
                        break;
                    case "C":
                        answer2From5 = "A";
                        break;
                    case "D":
                        answer2From5 = "B";
                        break;
                    default:
                        break;
                }
                return TextUtils.equals(answer2From5, answer2);
            }
        });
        //第3题:以下哪一题的答案与其他三项不一样
        answersList.add(new AlgorithmAnswers.LogicAnswer() {
            @Override
            public boolean answerLogic(ArrayList<String> answers) {
                //虽然这个answer3在后面也获了，但是他们的意义是不一样的，一个是本题的答案，一个是答案中的答案，就是不爱用一个变量
                String answer3 = getAnswer(answers, 3);
                switch (answer3){
                    case "A":
                        return TextUtils.equals(getAnswer(answers, 6), getAnswer(answers, 2))
                            && TextUtils.equals(getAnswer(answers, 2), getAnswer(answers, 4))
                            && !TextUtils.equals(getAnswer(answers, 4), getAnswer(answers, 3));
                    case "B":
                        return TextUtils.equals(getAnswer(answers, 3), getAnswer(answers, 2))
                                && TextUtils.equals(getAnswer(answers, 2), getAnswer(answers, 4))
                                && !TextUtils.equals(getAnswer(answers, 4), getAnswer(answers, 6));
                    case "C":
                        return TextUtils.equals(getAnswer(answers, 3), getAnswer(answers, 6))
                                && TextUtils.equals(getAnswer(answers, 6), getAnswer(answers, 4))
                                && !TextUtils.equals(getAnswer(answers, 4), getAnswer(answers, 2));
                    case "D":
                        return TextUtils.equals(getAnswer(answers, 3), getAnswer(answers, 6))
                                && TextUtils.equals(getAnswer(answers, 6), getAnswer(answers, 2))
                                && !TextUtils.equals(getAnswer(answers, 2), getAnswer(answers, 4));
                    default:
                        return true;
                }
            }
        });
        //第4题:答案相同的2项
        answersList.add(new AlgorithmAnswers.LogicAnswer() {
            @Override
            public boolean answerLogic(ArrayList<String> answers) {
                switch (getAnswer(answers, 4)){
                    case "A":
                        return TextUtils.equals(getAnswer(answers, 1), getAnswer(answers, 5));
                    case "B":
                        return TextUtils.equals(getAnswer(answers, 2), getAnswer(answers, 7));
                    case "C":
                        return TextUtils.equals(getAnswer(answers, 1), getAnswer(answers, 9));
                    case "D":
                        return TextUtils.equals(getAnswer(answers, 6), getAnswer(answers, 10));
                    default:
                        return true;
                }
            }
        });
        //第5题：哪项与当前项一样
        answersList.add(new AlgorithmAnswers.LogicAnswer() {
            @Override
            public boolean answerLogic(ArrayList<String> answers) {
                switch (getAnswer(answers, 5)){
                    case "A":
                        return TextUtils.equals(getAnswer(answers, 5), getAnswer(answers, 8));
                    case "B":
                        return TextUtils.equals(getAnswer(answers, 5), getAnswer(answers, 4));
                    case "C":
                        return TextUtils.equals(getAnswer(answers, 5), getAnswer(answers, 9));
                    case "D":
                        return TextUtils.equals(getAnswer(answers, 5), getAnswer(answers, 7));
                    default:
                        return true;
                }
            }
        });
        //第6题：哪2项与当前项一样
        answersList.add(new AlgorithmAnswers.LogicAnswer() {
            @Override
            public boolean answerLogic(ArrayList<String> answers) {
                switch (getAnswer(answers, 6)){
                    case "A":
                        return TextUtils.equals(getAnswer(answers, 2), getAnswer(answers, 8))
                            && TextUtils.equals(getAnswer(answers, 4), getAnswer(answers, 8));
                    case "B":
                        return TextUtils.equals(getAnswer(answers, 1), getAnswer(answers, 8))
                            && TextUtils.equals(getAnswer(answers, 6), getAnswer(answers, 8));
                    case "C":
                        return TextUtils.equals(getAnswer(answers, 3), getAnswer(answers, 8))
                            && TextUtils.equals(getAnswer(answers, 10), getAnswer(answers, 8));
                    case "D":
                        return TextUtils.equals(getAnswer(answers, 5), getAnswer(answers, 8))
                            && TextUtils.equals(getAnswer(answers, 9), getAnswer(answers, 8));
                    default:
                        return true;
                }
            }
        });
        //第7题：哪项被选择次数最少
        answersList.add(new AlgorithmAnswers.LogicAnswer() {
            @Override
            public boolean answerLogic(ArrayList<String> answers) {
                String answer7 = getAnswer(answers, 7);
                int countA = 0,countB = 0,countC = 0,countD = 0;
                for(String eachAns : answers){
                    switch (eachAns){
                        case "A":
                            countA++;
                            break;
                        case "B":
                            countB++;
                            break;
                        case "C":
                            countC++;
                            break;
                        case "D":
                            countD++;
                            break;
                        default:
                            break;
                    }
                }
                String ans = "";
                ans = Math.max(countA, countB) < Math.max(countC, countD) ? countA < countB ? "A" : "B" : countC < countD ? "C" : "D";
                return TextUtils.equals(ans, answer7);
            }
        });
        //第8题：哪项不相邻
        answersList.add(new AlgorithmAnswers.LogicAnswer() {
            @Override
            public boolean answerLogic(ArrayList<String> answers) {
                String answer8 = getAnswer(answers, 8);
                int an1 = transformStr2Int(getAnswer(answers, 1));

                int an7 = transformStr2Int(getAnswer(answers, 7));
                int an5 = transformStr2Int(getAnswer(answers, 5));
                int an2 = transformStr2Int(getAnswer(answers, 2));
                int an10 = transformStr2Int(getAnswer(answers, 10));
                switch (answer8){
                    case "A":
                        return 1 < Math.abs(an1 - an7);
                    case "B":
                        return 1 < Math.abs(an1 - an5);
                    case "C":
                        return 1 < Math.abs(an1 - an2);
                    case "D":
                        return 1 < Math.abs(an1 - an10);
                    default:
                        return true;
                }
            }
        });
        //第9题：真假性
        answersList.add(new AlgorithmAnswers.LogicAnswer() {
            @Override
            public boolean answerLogic(ArrayList<String> answers) {
                String answer9 = getAnswer(answers, 9);

                boolean equal0 = TextUtils.equals(getAnswer(answers, 1), getAnswer(answers, 6));
                String answer5 = getAnswer(answers, 5);

                switch (answer9){
                    case "A":
                        return equal0 != TextUtils.equals(answer5, getAnswer(answers, 6));
                    case "B":
                        return equal0 != TextUtils.equals(answer5, getAnswer(answers, 10));
                    case "C":
                        return equal0 != TextUtils.equals(answer5, getAnswer(answers, 2));
                    case "D":
                        return equal0 != TextUtils.equals(answer5, getAnswer(answers, 9));
                    default:
                        return true;
                }
            }
        });
        //第10题：最多减最少
        answersList.add(new AlgorithmAnswers.LogicAnswer() {
            @Override
            public boolean answerLogic(ArrayList<String> answers) {
                int countA = 0,countB = 0,countC = 0,countD = 0;
                for(String eachAns : answers){
                    switch (eachAns){
                        case "A":
                            countA++;
                            break;
                        case "B":
                            countB++;
                            break;
                        case "C":
                            countC++;
                            break;
                        case "D":
                            countD++;
                            break;
                        default:
                            break;
                    }
                }
                int min = min(countA, countB, countC, countD);
                int max = max(countA, countB, countC, countD);
                int dif = max - min;
                switch (getAnswer(answers, 10)){
                    case "A":
                        return 3 == dif;
                    case "B":
                        return 2 == dif;
                    case "C":
                        return 4 == dif;
                    case "D":
                        return 1 == dif;
                    default:
                        return true;
                }
            }
        });
        //===========
        AlgorithmAnswers.doQuestion1(answersList);
    }

    public static int min(int... counts) {
        int min = 10;
        for(int temp : counts){
            if(temp < min){
                min = temp;
            }
        }
        return min;
    }

    public static int max(int... counts) {
        int max = 0;
        for(int temp : counts){
            if(temp > max){
                max = temp;
            }
        }
        return max;
    }

    public static int transformStr2Int(String str){
        switch (str){
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            default:
                return -1;
        }
    }

}
