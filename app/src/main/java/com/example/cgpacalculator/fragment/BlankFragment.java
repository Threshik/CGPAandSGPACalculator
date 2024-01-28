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
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cgpacalculator.R;
import com.google.android.material.textfield.TextInputEditText;

import java.text.NumberFormat;

public class BlankFragment extends Fragment {
    EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15, e16;
    TextInputEditText how;
    AppCompatButton button;
    AppCompatButton buttonclear;
    TextView tt1, result;
    CardView cardView,next;

    LinearLayout l1,lay1,lay2,lay3,lay4,lay5,lay6,lay7,lay8,lay9,lay10;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        e1 = view.findViewById(R.id.t2);
        e2 = view.findViewById(R.id.ed1);
        e3 = view.findViewById(R.id.t4);
        e4 = view.findViewById(R.id.ed2);
        e5 = view.findViewById(R.id.t6);
        e6 = view.findViewById(R.id.ed3);
        e7 = view.findViewById(R.id.t8);
        e8 = view.findViewById(R.id.ed4);
        e9 = view.findViewById(R.id.t10);
        e10 = view.findViewById(R.id.ed5);
        e11 = view.findViewById(R.id.t12);
        e12 = view.findViewById(R.id.ed6);
        e13 = view.findViewById(R.id.t14);
        e14 = view.findViewById(R.id.ed7);
        e15 = view.findViewById(R.id.t16);
        e16 = view.findViewById(R.id.ed8);
        result = view.findViewById(R.id.result);
        button = view.findViewById(R.id.button);
        buttonclear = view.findViewById(R.id.buttonclear);
        l1 = view.findViewById(R.id.l1);
        tt1 = view.findViewById(R.id.tt1);
        cardView = view.findViewById(R.id.card_visible);
        next = view.findViewById(R.id.next);
        how = view.findViewById(R.id.how);
        lay1 = view.findViewById(R.id.layout1);
        lay2 = view.findViewById(R.id.layout2);
        lay3 = view.findViewById(R.id.layout3);
        lay4 = view.findViewById(R.id.layout4);
        lay5 = view.findViewById(R.id.layout5);
        lay6 = view.findViewById(R.id.layout6);
        lay7 = view.findViewById(R.id.layout7);
        lay8 = view.findViewById(R.id.layout8);
        lay9 = view.findViewById(R.id.layout9);
        lay10 = view.findViewById(R.id.layout10);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = how.getText().toString().trim();
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(button.getWindowToken(), 0);
                if(s.isEmpty())
                {
                    Toast.makeText(getActivity(), "Fill the no of subjects", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(s.equals("1"))
                    {
                        lay1.setVisibility(View.VISIBLE);
                        lay2.setVisibility(View.VISIBLE);
                        lay10.setVisibility(View.VISIBLE);
                        lay3.setVisibility(View.GONE);
                        lay4.setVisibility(View.GONE);
                        lay5.setVisibility(View.GONE);
                        lay6.setVisibility(View.GONE);
                        lay7.setVisibility(View.GONE);
                        lay8.setVisibility(View.GONE);
                        lay9.setVisibility(View.GONE);
                        e1.setText("");
                        e2.setText("");


                    }
                   else if(s.equals("2"))
                    {
                        lay1.setVisibility(View.VISIBLE);
                        lay2.setVisibility(View.VISIBLE);
                        lay3.setVisibility(View.VISIBLE);
                        lay10.setVisibility(View.VISIBLE);

                        lay4.setVisibility(View.GONE);
                        lay5.setVisibility(View.GONE);
                        lay6.setVisibility(View.GONE);
                        lay7.setVisibility(View.GONE);
                        lay8.setVisibility(View.GONE);
                        lay9.setVisibility(View.GONE);
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");



                    }
                     else if(s.equals("3"))
                    {
                        lay1.setVisibility(View.VISIBLE);
                        lay2.setVisibility(View.VISIBLE);
                        lay3.setVisibility(View.VISIBLE);
                        lay4.setVisibility(View.VISIBLE);
                        lay10.setVisibility(View.VISIBLE);
                        lay5.setVisibility(View.GONE);
                        lay6.setVisibility(View.GONE);
                        lay7.setVisibility(View.GONE);
                        lay8.setVisibility(View.GONE);
                        lay9.setVisibility(View.GONE);
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");


                    }
                    else if(s.equals("4"))
                    {
                        lay1.setVisibility(View.VISIBLE);
                        lay2.setVisibility(View.VISIBLE);
                        lay3.setVisibility(View.VISIBLE);
                        lay4.setVisibility(View.VISIBLE);
                        lay5.setVisibility(View.VISIBLE);
                        lay10.setVisibility(View.VISIBLE);
                        lay6.setVisibility(View.GONE);
                        lay7.setVisibility(View.GONE);
                        lay8.setVisibility(View.GONE);
                        lay9.setVisibility(View.GONE);
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");
                        e7.setText("");
                        e8.setText("");


                    }
                    else if(s.equals("5"))
                    {
                        lay1.setVisibility(View.VISIBLE);
                        lay2.setVisibility(View.VISIBLE);
                        lay3.setVisibility(View.VISIBLE);
                        lay4.setVisibility(View.VISIBLE);
                        lay5.setVisibility(View.VISIBLE);
                        lay6.setVisibility(View.VISIBLE);
                        lay10.setVisibility(View.VISIBLE);
                        lay7.setVisibility(View.GONE);
                        lay8.setVisibility(View.GONE);
                        lay9.setVisibility(View.GONE);
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");
                        e7.setText("");
                        e8.setText("");
                        e9.setText("");
                        e10.setText("");


                    }
                    else if(s.equals("6"))
                    {
                        lay1.setVisibility(View.VISIBLE);
                        lay2.setVisibility(View.VISIBLE);
                        lay3.setVisibility(View.VISIBLE);
                        lay4.setVisibility(View.VISIBLE);
                        lay5.setVisibility(View.VISIBLE);
                        lay6.setVisibility(View.VISIBLE);
                        lay7.setVisibility(View.VISIBLE);
                        lay10.setVisibility(View.VISIBLE);
                        lay8.setVisibility(View.GONE);
                        lay9.setVisibility(View.GONE);
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");
                        e7.setText("");
                        e8.setText("");
                        e9.setText("");
                        e10.setText("");
                        e11.setText("");
                        e12.setText("");


                    }
                    else if(s.equals("7"))
                    {
                        lay1.setVisibility(View.VISIBLE);
                        lay2.setVisibility(View.VISIBLE);
                        lay3.setVisibility(View.VISIBLE);
                        lay4.setVisibility(View.VISIBLE);
                        lay5.setVisibility(View.VISIBLE);
                        lay6.setVisibility(View.VISIBLE);
                        lay7.setVisibility(View.VISIBLE);
                        lay8.setVisibility(View.VISIBLE);
                        lay10.setVisibility(View.VISIBLE);
                        lay9.setVisibility(View.GONE);
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");
                        e7.setText("");
                        e8.setText("");
                        e9.setText("");
                        e10.setText("");
                        e11.setText("");
                        e12.setText("");
                        e13.setText("");
                        e14.setText("");


                    }
                   else if(s.equals("8"))
                    {
                        lay1.setVisibility(View.VISIBLE);
                        lay2.setVisibility(View.VISIBLE);
                        lay3.setVisibility(View.VISIBLE);
                        lay4.setVisibility(View.VISIBLE);
                        lay5.setVisibility(View.VISIBLE);
                        lay6.setVisibility(View.VISIBLE);
                        lay7.setVisibility(View.VISIBLE);
                        lay8.setVisibility(View.VISIBLE);
                        lay9.setVisibility(View.VISIBLE);
                        lay10.setVisibility(View.VISIBLE);
                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");
                        e7.setText("");
                        e8.setText("");
                        e9.setText("");
                        e10.setText("");
                        e11.setText("");
                        e12.setText("");
                        e13.setText("");
                        e14.setText("");
                        e15.setText("");
                        e16.setText("");


                    }
                }

            }
        });





        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputMethodManager imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(button.getWindowToken(), 0);

                String s1 = e1.getText().toString().trim();
                String s2 = e2.getText().toString().trim();
                String s3 = e3.getText().toString().trim();
                String s4 = e4.getText().toString().trim();
                String s5 = e5.getText().toString().trim();
                String s6 = e6.getText().toString().trim();
                String s7 = e7.getText().toString().trim();
                String s8 = e8.getText().toString().trim();
                String s9 = e9.getText().toString().trim();
                String s10 = e10.getText().toString().trim();
                String s11 = e11.getText().toString().trim();
                String s12 = e12.getText().toString().trim();
                String s13 = e13.getText().toString().trim();
                String s14 = e14.getText().toString().trim();
                String s15 = e15.getText().toString().trim();
                String s16 = e16.getText().toString().trim();

                if(!s1.isEmpty()&&!s2.isEmpty())
                {
                    int num1 = Integer.parseInt(s1);
                    int num2 = Integer.parseInt(s2);
                    double mul1 = num1*num2;
                    double res1 = mul1/num1;
                    NumberFormat nm = NumberFormat.getNumberInstance();
                    String finalresult = nm.format(res1);
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    tt1.setText(finalresult);


                }

                if (!s1.isEmpty() && !s2.isEmpty()&&!s3.isEmpty()&&!s4.isEmpty()) {
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);

                    double sgpa = ((num1 * num2) + (num3 * num4)) / (num1 + num3);

                    NumberFormat nm = NumberFormat.getNumberInstance();
                    nm.setMaximumFractionDigits(2);  // Set maximum number of decimal places to 2
                    String finalresult = nm.format(sgpa);
                    tt1.setText(finalresult);
                }
                if (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty() && !s4.isEmpty() && !s5.isEmpty() && !s6.isEmpty()) {
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);
                    double num5 = Double.parseDouble(s5);
                    double num6 = Double.parseDouble(s6);

                    double sgpa = ((num1 * num2) + (num3 * num4) + (num5 * num6)) / (num1 + num3 + num5);

                    NumberFormat nm = NumberFormat.getNumberInstance();
                    nm.setMaximumFractionDigits(2);  // Set maximum number of decimal places to 2
                    String finalresult = nm.format(sgpa);
                    tt1.setText(finalresult);
                }

                if (!s1.isEmpty() && !s2.isEmpty()&&!s3.isEmpty()&&!s4.isEmpty()&&!s5.isEmpty()&&!s6.isEmpty()&&!s7.isEmpty()&&!s8.isEmpty()) {
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);
                    double num5 = Double.parseDouble(s5);
                    double num6 = Double.parseDouble(s6);
                    double num7 = Double.parseDouble(s7);
                    double num8 = Double.parseDouble(s8);

                    double sgpa = ((num1 * num2) + (num3 * num4) + (num5 * num6) + (num7 * num8)) / (num1 + num3 + num5 + num7);

                    NumberFormat nm = NumberFormat.getNumberInstance();
                    nm.setMaximumFractionDigits(2);  // Set maximum number of decimal places to 2
                    String finalresult = nm.format(sgpa);
                    tt1.setText(finalresult);


                }
                 if (!s1.isEmpty() && !s2.isEmpty()&&!s3.isEmpty()&&!s4.isEmpty()&&!s5.isEmpty()&&!s6.isEmpty()&&!s7.isEmpty()&&!s8.isEmpty()&&!s9.isEmpty()&&!s10.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);
                    double num5 = Double.parseDouble(s5);
                    double num6 = Double.parseDouble(s6);
                    double num7 = Double.parseDouble(s7);
                    double num8 = Double.parseDouble(s8);
                    double num9 = Double.parseDouble(s9);
                    double num10 = Double.parseDouble(s10);

                     double sgpa = ((num1 * num2) + (num3 * num4) + (num5 * num6) + (num7 * num8)+(num9*num10)) / (num1 + num3 + num5 + num7+num9);

                     NumberFormat nm = NumberFormat.getNumberInstance();
                     nm.setMaximumFractionDigits(2);  // Set maximum number of decimal places to 2
                     String finalresult = nm.format(sgpa);
                     tt1.setText(finalresult);


                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);

                }
                 if (!s1.isEmpty() && !s2.isEmpty()&&!s3.isEmpty()&&!s4.isEmpty()&&!s5.isEmpty()&&!s6.isEmpty()&&!s7.isEmpty()&&!s8.isEmpty()&&!s9.isEmpty()&&!s10.isEmpty()&&!s11.isEmpty()&&!s12.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);
                    double num5 = Double.parseDouble(s5);
                    double num6 = Double.parseDouble(s6);
                    double num7 = Double.parseDouble(s7);
                    double num8 = Double.parseDouble(s8);
                    double num9 = Double.parseDouble(s9);
                    double num10 = Double.parseDouble(s10);
                    double num11 = Double.parseDouble(s11);
                    double num12 = Double.parseDouble(s12);
                     double sgpa = ((num1 * num2) + (num3 * num4) + (num5 * num6) + (num7 * num8)+(num9*num10)+(num11*num12)) / (num1 + num3 + num5 + num7+num9+num11);

                     NumberFormat nm = NumberFormat.getNumberInstance();
                     nm.setMaximumFractionDigits(2);  // Set maximum number of decimal places to 2
                     String finalresult = nm.format(sgpa);
                     tt1.setText(finalresult);

                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);

                }
                 if (!s1.isEmpty() && !s2.isEmpty()&&!s3.isEmpty()&&!s4.isEmpty()&&!s5.isEmpty()&&!s6.isEmpty()&&!s7.isEmpty()&&!s8.isEmpty()&&!s9.isEmpty()&&!s10.isEmpty()&&!s11.isEmpty()&&!s12.isEmpty()&&!s13.isEmpty()&&!s14.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);
                    double num5 = Double.parseDouble(s5);
                    double num6 = Double.parseDouble(s6);
                    double num7 = Double.parseDouble(s7);
                    double num8 = Double.parseDouble(s8);
                    double num9 = Double.parseDouble(s9);
                    double num10 = Double.parseDouble(s10);
                    double num11 = Double.parseDouble(s11);
                    double num12 = Double.parseDouble(s12);
                    double num13 = Double.parseDouble(s13);
                    double num14 = Double.parseDouble(s14);

                     double sgpa = ((num1 * num2) + (num3 * num4) + (num5 * num6) + (num7 * num8)+(num9*num10)+(num11*num12)+(num13*num14)) / (num1 + num3 + num5 + num7+num9+num11+num13);

                     NumberFormat nm = NumberFormat.getNumberInstance();
                     nm.setMaximumFractionDigits(2);  // Set maximum number of decimal places to 2
                     String finalresult = nm.format(sgpa);
                     tt1.setText(finalresult);
                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);

                }
                 if (!s1.isEmpty() && !s2.isEmpty()&&!s3.isEmpty()&&!s4.isEmpty()&&!s5.isEmpty()&&!s6.isEmpty()&&!s7.isEmpty()&&!s8.isEmpty()&&!s11.isEmpty()&&!s12.isEmpty()&&!s13.isEmpty()&&!s14.isEmpty()&&!s15.isEmpty()&&!s16.isEmpty()) {
                    double num1 = Double.parseDouble(s1);
                    double num2 = Double.parseDouble(s2);
                    double num3 = Double.parseDouble(s3);
                    double num4 = Double.parseDouble(s4);
                    double num5 = Double.parseDouble(s5);
                    double num6 = Double.parseDouble(s6);
                    double num7 = Double.parseDouble(s7);
                    double num8 = Double.parseDouble(s8);
                    double num9 = Double.parseDouble(s9);
                    double num10 = Double.parseDouble(s10);
                    double num11 = Double.parseDouble(s11);
                    double num12 = Double.parseDouble(s12);
                    double num13 = Double.parseDouble(s13);
                    double num14 = Double.parseDouble(s14);
                    double num15 = Double.parseDouble(s15);
                    double num16 = Double.parseDouble(s16);

                    cardView.setVisibility(View.VISIBLE);
                    l1.setVisibility(View.VISIBLE);
                     double sgpa = ((num1 * num2) + (num3 * num4) + (num5 * num6) + (num7 * num8)+(num9*num10)+(num11*num12)+(num13*num14)+(num15*num16)) / (num1 + num3 + num5 + num7+num9+num11+num13+num15);

                     NumberFormat nm = NumberFormat.getNumberInstance();
                     nm.setMaximumFractionDigits(2);  // Set maximum number of decimal places to 2
                     String finalresult = nm.format(sgpa);
                     tt1.setText(finalresult);

                }

                else {
                    System.out.println("More than 8 subjects");
                }



            }

        });





        buttonclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearmethod();
            }

            private void clearmethod() {
                e1.setText("");
                e2.setText("");
                e3.setText("");
                e4.setText("");
                e5.setText("");
                e6.setText("");
                e7.setText("");
                e8.setText("");
                e9.setText("");
                e10.setText("");
                e11.setText("");
                e12.setText("");
                e13.setText("");
                e14.setText("");
                e15.setText("");
                e16.setText("");
                tt1.setText("0");
                how.setText("");

            }
        });
return view;

    }

}