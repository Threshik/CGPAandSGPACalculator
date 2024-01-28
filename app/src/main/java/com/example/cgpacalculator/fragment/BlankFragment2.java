package com.example.cgpacalculator.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cgpacalculator.R;
import com.google.android.material.textfield.TextInputEditText;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;


public class BlankFragment2 extends Fragment {
    EditText ed1,ed2,ed3,ed4,ed5,ed6,ed7,ed8;

    TextInputEditText how;
    AppCompatButton button1;
    AppCompatButton buttonclear;
    TextView tt1, result,title;
    CardView cardView,next;

    LinearLayout l1,layout_calculate_clear,ll1,ll2,ll3,ll4,ll5,ll6,ll7,ll8;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blank2, container, false);
        ed1 = view.findViewById(R.id.ed1);
        ed2 = view.findViewById(R.id.ed2);
        ed2 = view.findViewById(R.id.ed2);
        ed3 = view.findViewById(R.id.ed3);
        ed4 = view.findViewById(R.id.ed4);
        ed5 = view.findViewById(R.id.ed5);
        ed6 = view.findViewById(R.id.ed6);
        ed7 = view.findViewById(R.id.ed7);
        ed8 = view.findViewById(R.id.ed8);
        how = view.findViewById(R.id.how);
        button1 = view.findViewById(R.id.button1);
        buttonclear = view.findViewById(R.id.buttonclear);
        cardView = view.findViewById(R.id.card_visible);
        l1 = view.findViewById(R.id.l1);
        result = view.findViewById(R.id.result);
        tt1 = view.findViewById(R.id.tt1);
        next = view.findViewById(R.id.next);
        layout_calculate_clear = view.findViewById(R.id.layout_calculate_clear);
        title = view.findViewById(R.id.title);
        ll1 = view.findViewById(R.id.ll1);
        ll2 = view.findViewById(R.id.ll2);
        ll3 = view.findViewById(R.id.ll3);
        ll4 = view.findViewById(R.id.ll4);
        ll5 = view.findViewById(R.id.ll5);
        ll6 = view.findViewById(R.id.ll6);
        ll7 = view.findViewById(R.id.ll7);
        ll8 = view.findViewById(R.id.ll8);




next.setOnClickListener(
        new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ss = how.getText().toString().trim();
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(button1.getWindowToken(), 0);
                if(ss.isEmpty()){
                    Toast.makeText(getActivity(), "Fill the details", Toast.LENGTH_SHORT).show();
                }else{

                    switch (ss) {
                        case "1":
                            ll1.setVisibility(View.VISIBLE);
                            layout_calculate_clear.setVisibility(View.VISIBLE);
                            title.setVisibility(View.VISIBLE);
                            ll2.setVisibility(View.GONE);
                            ll3.setVisibility(View.GONE);
                            ll4.setVisibility(View.GONE);
                            ll5.setVisibility(View.GONE);
                            ll6.setVisibility(View.GONE);
                            ll7.setVisibility(View.GONE);
                            ll8.setVisibility(View.GONE);
                            ed1.setText("");
                            break;
                        case "2":
                            ll1.setVisibility(View.VISIBLE);
                            ll2.setVisibility(View.VISIBLE);
                            title.setVisibility(View.VISIBLE);
                            layout_calculate_clear.setVisibility(View.VISIBLE);
                            ll3.setVisibility(View.GONE);
                            ll4.setVisibility(View.GONE);
                            ll5.setVisibility(View.GONE);
                            ll6.setVisibility(View.GONE);
                            ll7.setVisibility(View.GONE);
                            ll8.setVisibility(View.GONE);
                            ed1.setText("");
                            ed2.setText("");

                            break;
                        case "3":
                            ll1.setVisibility(View.VISIBLE);
                            ll2.setVisibility(View.VISIBLE);
                            ll3.setVisibility(View.VISIBLE);
                            layout_calculate_clear.setVisibility(View.VISIBLE);
                            title.setVisibility(View.VISIBLE);
                            ll4.setVisibility(View.GONE);
                            ll5.setVisibility(View.GONE);
                            ll6.setVisibility(View.GONE);
                            ll7.setVisibility(View.GONE);
                            ll8.setVisibility(View.GONE);
                            ed1.setText("");
                            ed2.setText("");
                            ed3.setText("");

                            break;
                        case "4":
                            ll1.setVisibility(View.VISIBLE);
                            ll2.setVisibility(View.VISIBLE);
                            ll3.setVisibility(View.VISIBLE);
                            ll4.setVisibility(View.VISIBLE);
                            layout_calculate_clear.setVisibility(View.VISIBLE);
                            title.setVisibility(View.VISIBLE);
                            ll5.setVisibility(View.GONE);
                            ll6.setVisibility(View.GONE);
                            ll7.setVisibility(View.GONE);
                            ll8.setVisibility(View.GONE);
                            ed1.setText("");
                            ed2.setText("");
                            ed3.setText("");
                            ed4.setText("");


                            break;
                        case "5":
                            ll1.setVisibility(View.VISIBLE);
                            ll2.setVisibility(View.VISIBLE);
                            ll3.setVisibility(View.VISIBLE);
                            ll4.setVisibility(View.VISIBLE);
                            ll5.setVisibility(View.VISIBLE);
                            layout_calculate_clear.setVisibility(View.VISIBLE);
                            title.setVisibility(View.VISIBLE);
                            ll6.setVisibility(View.GONE);
                            ll7.setVisibility(View.GONE);
                            ll8.setVisibility(View.GONE);
                            ed1.setText("");
                            ed2.setText("");
                            ed3.setText("");
                            ed4.setText("");
                            ed5.setText("");

                            break;
                        case "6":
                            ll1.setVisibility(View.VISIBLE);
                            ll2.setVisibility(View.VISIBLE);
                            ll3.setVisibility(View.VISIBLE);
                            ll4.setVisibility(View.VISIBLE);
                            ll5.setVisibility(View.VISIBLE);
                            ll6.setVisibility(View.VISIBLE);
                            layout_calculate_clear.setVisibility(View.VISIBLE);
                            title.setVisibility(View.VISIBLE);
                            ll7.setVisibility(View.GONE);
                            ll8.setVisibility(View.GONE);
                            ed1.setText("");
                            ed2.setText("");
                            ed3.setText("");
                            ed4.setText("");
                            ed5.setText("");
                            ed6.setText("");

                            break;
                        case "7":
                            ll1.setVisibility(View.VISIBLE);
                            ll2.setVisibility(View.VISIBLE);
                            ll3.setVisibility(View.VISIBLE);
                            ll4.setVisibility(View.VISIBLE);
                            ll5.setVisibility(View.VISIBLE);
                            ll6.setVisibility(View.VISIBLE);
                            ll7.setVisibility(View.VISIBLE);
                            layout_calculate_clear.setVisibility(View.VISIBLE);
                            title.setVisibility(View.VISIBLE);
                            ll8.setVisibility(View.GONE);
                            ed1.setText("");
                            ed2.setText("");
                            ed3.setText("");
                            ed4.setText("");
                            ed5.setText("");
                            ed6.setText("");
                            ed7.setText("");

                            break;
                        case "8":
                            ll1.setVisibility(View.VISIBLE);
                            ll2.setVisibility(View.VISIBLE);
                            ll3.setVisibility(View.VISIBLE);
                            ll4.setVisibility(View.VISIBLE);
                            ll5.setVisibility(View.VISIBLE);
                            ll6.setVisibility(View.VISIBLE);
                            ll7.setVisibility(View.VISIBLE);
                            ll8.setVisibility(View.VISIBLE);
                            title.setVisibility(View.VISIBLE);
                            layout_calculate_clear.setVisibility(View.VISIBLE);
                            ed1.setText("");
                            ed2.setText("");
                            ed3.setText("");
                            ed4.setText("");
                            ed5.setText("");
                            ed6.setText("");
                            ed7.setText("");
                            ed8.setText("");

                            break;
                    }
                    /*else {
                        ed1.setVisibility(View.VISIBLE);
                        ed2.setVisibility(View.VISIBLE);
                        ed3.setVisibility(View.VISIBLE);
                        ed4.setVisibility(View.VISIBLE);
                        ed5.setVisibility(View.VISIBLE);
                        layout_calculate_clear.setVisibility(View.VISIBLE);
                        ed6.setVisibility(View.GONE);
                        ed7.setVisibility(View.GONE);
                        ed8.setVisibility(View.GONE);
                    }*/


                }
            }
        }
);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(button1.getWindowToken(), 0);

                String s1 = ed1.getText().toString().trim();
                String s2 = ed2.getText().toString().trim();
                String s3 = ed3.getText().toString().trim();
                String s4 = ed4.getText().toString().trim();
                String s5 = ed5.getText().toString().trim();
                String s6 = ed6.getText().toString().trim();
                String s7 = ed7.getText().toString().trim();
                String s8 = ed8.getText().toString().trim();


                if(!s1.isEmpty())
                {
                    double add1 = Double.parseDouble(s1);
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    String finalresult = nm.format(add1);
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    tt1.setText(finalresult);


                }

                if (!s1.isEmpty() && !s2.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double count = (num1 + num2);
                    double add2 = (double)  count/2;

                    NumberFormat nm = NumberFormat.getNumberInstance();
                    String finalresult = nm.format(add2);
                    tt1.setText(finalresult);
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);

                }
                if (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double count1 = num1 + num2 + num3;
                    double average = count1 / 3;

                    NumberFormat nm = NumberFormat.getNumberInstance();
                    String finalresult = nm.format(average);
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    tt1.setText(finalresult);
                }


                if (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty() && !s4.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);

                    double add2 = num1 + num2+num3+num4;
                    double res1 = add2 / 4;

                    NumberFormat nm = NumberFormat.getNumberInstance();
                    String finalresult = nm.format(res1);
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    tt1.setText(finalresult);
                }

                if (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty() && !s4.isEmpty() && !s5.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);
                    double num5 = Double.parseDouble(s5);

                    double add2 = num1 + num2+num3+num4+num5;
                    double res1 = add2 / 5;

                    NumberFormat nm = NumberFormat.getNumberInstance();
                    String finalresult = nm.format(res1);
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    tt1.setText(finalresult);
                }
                if (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty() && !s4.isEmpty() && !s5.isEmpty() && !s6.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);
                    double num5 = Double.parseDouble(s5);
                    double num6 = Double.parseDouble(s6);

                    double add2 = num1 + num2+num3+num4+num5+num6;
                    double res1 = add2 / 6;

                    NumberFormat nm = NumberFormat.getNumberInstance();
                    String finalresult = nm.format(res1);
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    tt1.setText(finalresult);
                }
                if (!s1.isEmpty() && !s2.isEmpty()&&!s3.isEmpty()&&!s4.isEmpty()&&!s5.isEmpty()&&!s6.isEmpty()&&!s7.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);
                    double num5 = Double.parseDouble(s5);
                    double num6 = Double.parseDouble(s6);
                    double num7 = Double.parseDouble(s7);

                    double add2 = num1 + num2+num3+num4+num5+num6+num7;
                    double res1 = add2 / 7;

                    NumberFormat nm = NumberFormat.getNumberInstance();
                    String finalresult = nm.format(res1);
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    tt1.setText(finalresult);
                }
                if (!s1.isEmpty() && !s2.isEmpty()&&!s3.isEmpty()&&!s4.isEmpty()&&!s5.isEmpty()&&!s6.isEmpty()&&!s7.isEmpty()&&!s8.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);
                    double num5 = Double.parseDouble(s5);
                    double num6 = Double.parseDouble(s6);
                    double num7 = Double.parseDouble(s7);
                    double num8 = Double.parseDouble(s8);


                    double add2 = num1 + num2+num3+num4+num5+num6+num7+num8;
                    double res1 = add2 / 8;

                    NumberFormat nm = NumberFormat.getNumberInstance();
                    String finalresult = nm.format(res1);
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    tt1.setText(finalresult);
                }

                else {
                    System.out.println("More than 8 subjects");
                }

               /* double add = w1 + w2 + w3 + w4 + w5 + w6 + w7 + w8;
                double finalres = add / 8;
                NumberFormat nm = NumberFormat.getNumberInstance();
                String finalresult = nm.format(finalres);
                tt1.setText(finalresult);*/



            }
        });
        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearmethod();
            }

            private void clearmethod() {
                ed1.setText("");
                ed2.setText("");
                ed3.setText("");
                ed4.setText("");
                ed5.setText("");
                ed6.setText("");
                ed7.setText("");
                ed8.setText("");
                tt1.setText("0");
                how.setText("");

            }
        });
        return view;

    }

   /* private void method_fill() {
        String ss = how.getText().toString().trim();
       //double ww = Double.parseDouble(ss);

        String s1 = ed1.getText().toString().trim();
        String s2 = ed2.getText().toString().trim();
        String s3 = ed3.getText().toString().trim();
        String s4 = ed4.getText().toString().trim();
        String s5 = ed5.getText().toString().trim();
        String s6 = ed6.getText().toString().trim();
        String s7 = ed7.getText().toString().trim();
        String s8 = ed8.getText().toString().trim();

        cardView.setVisibility(View.VISIBLE);
        l1.setVisibility(View.VISIBLE);
        result.setVisibility(View.VISIBLE);


        double w1 = Integer.parseInt(s1);
        double w2 = Integer.parseInt(s2);
        double w3 = Integer.parseInt(s3);
        double w4 = Integer.parseInt(s4);
        double w5 = Integer.parseInt(s5);
        double w6 = Integer.parseInt(s6);
        double w7 = Integer.parseInt(s7);
        double w8 = Integer.parseInt(s8);
        if(ss.equals("2"))
        {
            double add1 = w1 + w2;
            double res1 = add1/2;
            NumberFormat nm = NumberFormat.getNumberInstance();
            String finalresult = nm.format(res1);
            tt1.setText(finalresult);

        } else if (ss.equals("3")) {
            double add2 = w1+ w2+w3;
            double res2 = add2/3;
            NumberFormat nm = NumberFormat.getNumberInstance();
            String finalresult = nm.format(res2);
            tt1.setText(finalresult);

        }
        else if (ss.equals("4")) {
            double add3 = w1+ w2+w3+w4;
            double res3 = add3/4;
            NumberFormat nm = NumberFormat.getNumberInstance();
            String finalresult = nm.format(res3);
            tt1.setText(finalresult);

        }
      *//*  else if (ww == 5) {
            double add4 = w1+ w2+w3+w4+w5;
            double res4 = add4/5;
            NumberFormat nm = NumberFormat.getNumberInstance();
            String finalresult = nm.format(res4);
            tt1.setText(finalresult);

        }
        else if (ww == 6) {
            double add5 = w1+ w2+w3+w4+w5+w6;
            double res5 = add5/6;
            NumberFormat nm = NumberFormat.getNumberInstance();
            String finalresult = nm.format(res5);
            tt1.setText(finalresult);

        }
        else if (ww == 7) {
            double add6 = w1+ w2+w3+w4+w5+w6+w7;
            double res6 = add6/7;
            NumberFormat nm = NumberFormat.getNumberInstance();
            String finalresult = nm.format(res6);
            tt1.setText(finalresult);

        }
        else if (ww == 8) {
            double add7 = w1+ w2+w3+w4+w5+w6+w7+w8;
            double res7 = add7/3;
            NumberFormat nm = NumberFormat.getNumberInstance();
            String finalresult = nm.format(res7);
            tt1.setText(finalresult);

        }*//*

    }*/
}