package com.wind.smalltest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.wind.smalltest.questions.AlgorithmQuestions;
import com.wind.smalltest.questions.MathQuestions;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.content)
    TextView content;
    @BindView(R.id.result)
    TextView result;
    @BindView(R.id.btn1)
    Button btn1;
    @BindView(R.id.btn2)
    Button btn2;
    @BindView(R.id.btn3)
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    /**
     * 用于纯javaAPI的demo
     * */
    public static void main(String[] args) {
//        MathQuestions.question1();
//        MathQuestions.question2();

//        System.out.println("=========");
////        int a = 3 ^ 4;
//        int a = (int) Math.pow(3, 4);
//        System.out.println(a);
        //        return;
//        BC AC AC DA BA 80009
//        int num = (int) (1 * Math.pow(4,0)
//                        + 2 * Math.pow(4,1)
//                        + 0 * Math.pow(4,2)
//                        + 2 * Math.pow(4,3)
//                        + 0 * Math.pow(4,4)
//                        + 2 * Math.pow(4,5)
//                        + 3 * Math.pow(4,6)
//                        + 0 * Math.pow(4,7)
//                        + 1 * Math.pow(4,8)
//                        + 0 * Math.pow(4,9));
//        System.out.println("num===" + num);

    }

    @OnClick({R.id.btn1, R.id.btn2, R.id.btn3})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn1:
//                MathQuestions.question1();
                //用了androidAPI的在这测。。。
                AlgorithmQuestions.question1();
                break;
            case R.id.btn2:
                break;
            case R.id.btn3:
                break;
        }
    }




}
