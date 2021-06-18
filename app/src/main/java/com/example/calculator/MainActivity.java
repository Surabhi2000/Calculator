package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one;
    Button two;
    Button three;
    Button four;
    Button five;
    Button six;
    Button seven;
    Button eight;
    Button nine;
    Button add;
    Button sub;
    Button mul;
    Button div;
    Button zero;
    Button equal;
    Button clear;
    TextView info;
    TextView result;
    final char ADDITION='+';
    final  char SUBTRACTION='-';
    final char MULTIPLICATION='*';
    final char DIVISON='/';
    final char EQU='0';
    double val1=Double.NaN;
    double val2;
    char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUIViews();
        zero.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {
                                        info.setText(info.getText().toString() + "0");
                                    }
                                });
         one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    info.setText(info.getText().toString()+"1");
                }
         });
         two.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        info.setText(info.getText().toString()+"2");
                    }
         });
         three.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            info.setText(info.getText().toString()+"3");
                        }
         });
         four.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                info.setText(info.getText().toString()+"4");
                            }
         });
          five.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    info.setText(info.getText().toString()+"5");
                                }
          });
         six.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View v) {
                         info.setText(info.getText().toString()+"6");
                     }
         });
         seven.setOnClickListener(new View.OnClickListener() {
                         @Override
                         public void onClick(View v) {
                             info.setText(info.getText().toString()+"7");
                         }
         });
         eight.setOnClickListener(new View.OnClickListener() {
                             @Override
                             public void onClick(View v) {
                                 info.setText(info.getText().toString()+"8");
                             }
         });
        nine.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     info.setText(info.getText().toString()+"9");
                                 }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=ADDITION;
                result.setText(String.valueOf(val1)+"+");
                info.setText(null);
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=SUBTRACTION;
                result.setText(String.valueOf(val1)+"-");
                info.setText(null);
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=MULTIPLICATION;
                result.setText(String.valueOf(val1)+"*");
                info.setText(null);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=DIVISON;
                result.setText(String.valueOf(val1)+"/");
                info.setText(null);
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION=EQU;
                result.setText(result.getText().toString()+String.valueOf(val2)+"="+String.valueOf(val1));
                //5+4=9
                //5 is value 1 is stored in result
                //value 2 is 4
                //result is stored in val1
                info.setText(null);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
            }
        });
    }
    private void setupUIViews(){
        zero=findViewById(R.id.btn0);
        one=findViewById(R.id.btn1);
        two=findViewById(R.id.btn2);
        three=findViewById(R.id.btn3);
        four=findViewById(R.id.btn4);
        five=findViewById(R.id.btn5);
        six=findViewById(R.id.btn6);
        seven=findViewById(R.id.btn7);
        eight=findViewById(R.id.btn8);
        nine=findViewById(R.id.btn9);
        add=findViewById(R.id.btnpl);
        sub=findViewById(R.id.btnsub);
        mul=findViewById(R.id.btnmul);
        div=findViewById(R.id.btndiv);
        clear=findViewById(R.id.btnclear);
        equal=findViewById(R.id.btneq);
        info=findViewById(R.id.textView2);
        result=findViewById(R.id.textView);
    }
    private void compute(){
        if(!Double.isNaN(val1)){
            val2=Double.parseDouble(info.getText().toString());
            switch(ACTION){
                case ADDITION:
                    val1+=val2;
                    break;
                case SUBTRACTION:
                    val1-=val2;
                    break;
                case MULTIPLICATION:
                    val1*=val2;
                    break;
                case DIVISON:
                    val1/=val2;
                    break;
                case EQU:
                    break;

            }
        }
        else{
            val1=Double.parseDouble(info.getText().toString());
        }
    }
}
