package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 public Button Bc,Bdel,Bequals,B7,B8,B9,B1,B2,B3,B4,B5,B6,Badd,Bminus,Bmultiple,Bdivide,Bdecimal,B0;
 public TextView T1,T2,T3;
 private float f,sol;
  String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bc=findViewById(R.id.BC);
        Bdel=findViewById(R.id.BD);
        Bequals=findViewById(R.id.Bequals);
        Badd=findViewById(R.id.Badd);
        Bminus=findViewById(R.id.Bminus);
        Bmultiple=findViewById(R.id.Bmultiple);
        Bdivide=findViewById(R.id.Bdivide);
        Bdecimal=findViewById(R.id.Bdecimal);
        B1=findViewById(R.id.B1);
        B2=findViewById(R.id.B2);
        B3 =findViewById(R.id.B3);
        B4=findViewById(R.id.B4);
        B5=findViewById(R.id.B5);
        B6=findViewById(R.id.B6);
        B7=findViewById(R.id.B7);
        B8=findViewById(R.id.B8);
        B9=findViewById(R.id.B9);
        B0=findViewById(R.id.B0);
        T1=findViewById(R.id.P1);
        T2=findViewById(R.id.P2);
        T3=findViewById(R.id.P3);
        B1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s="1";
                digi();
            }
        });
        B2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s="2";
                digi();
            }
        });
        B3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s="3";
                digi();
            }
        });
        B4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s="4";
                digi();
            }
        });
        B5.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s="5";
                digi();
            }
        });
        B6.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s="6";
                digi();
            }
        });
        B7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s="7";
                digi();
            }
        });
        B8.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s="8";
                digi();
            }
        });
        B9.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s="9";
                digi();
            }
        });
        B0.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                s="0";
                digi();
            }
        });
        Bdecimal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String b=T2.getText().toString();
                int l=b.length();
                int c=0;
                for(int i=1;i<l;i++){
                    char ch=b.charAt(i);
                    if(ch=='.')
                        c++;
                }
                if(c<1)
                {
                    T2.append(".");
                }
            }
        });
        Bc.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                T1.setText("");
                T2.setText("0");
                T3.setText("");
            }
        });
        Bdel.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
               if(T2.getText().toString().length()>1){
                   String a=T2.getText().toString();
                   int l=a.length();
                   String b="";
                   for(int i=0;i<l-1;i++)
                   {
                       char c=a.charAt(i);
                       b=b+c;
                   }
                   T2.setText(b);
               } else if(T2.getText().toString().length()==1)
                   T2.setText("0");
            }
        });
        Badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(T3.getText().toString().charAt(0)==' '){
                    sol=(float)Double.parseDouble(T2.getText().toString());
                    T1.setText(T2.getText().toString());
                }
               else{ char ch=T3.getText().toString().charAt(0);
                Float a=Float.parseFloat(T2.getText().toString());
                    if(T1.getText().toString().length()<=50)
                        T1.setText(T1.getText().toString()+ T3.getText().toString() +T2.getText().toString());
                    else T1.setText(""+sol);
                switch (ch){
                    case '+': sol=sol+a;break;
                    case '-': sol -=a; break;
                    case '*': sol*=a;break;
                    case '/':sol/=a;break;
                }}

               T2.setText("0");
               T3.setText("+");
            }
        });
        Bminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(T3.getText().toString().charAt(0)==' '){
                    sol=(float)Double.parseDouble(T2.getText().toString());
                    T1.setText(T2.getText().toString());
                }
                else{ char ch=T3.getText().toString().charAt(0);
                    Float a=Float.parseFloat(T2.getText().toString());
                    if(T1.getText().toString().length()<=50)
                        T1.setText(T1.getText().toString()+ T3.getText().toString() +T2.getText().toString());
                    else T1.setText(""+sol);
                    switch (ch){
                        case '+': sol=sol+a;break;
                        case '-': sol -=a; break;
                        case '*': sol*=a;break;
                        case '/':sol/=a;break;
                    }}

                T2.setText("0");
                T3.setText("-");
            }
        });
        Bmultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (T3.getText().toString().charAt(0) == ' ') {
                    sol=(float)Double.parseDouble(T2.getText().toString());
                    T1.setText(T2.getText().toString() );
                } else {
                    char ch = T3.getText().toString().charAt(0);
                    Float a = (float)Double.parseDouble(T2.getText().toString());
                    if(T1.getText().toString().length()<=50)
                        T1.setText(T1.getText().toString()+ T3.getText().toString() +T2.getText().toString());
                    else T1.setText(""+sol);
                    switch (ch) {
                        case '+':
                            sol = sol + a;
                            break;
                        case '-':
                            sol -= a;
                            break;
                        case '*':
                            sol *= a;
                            break;
                        case '/':
                            sol /= a;
                            break;
                    }
                }

                T2.setText("0");
                T3.setText("*");
            }});
        Bdivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(T3.getText().toString().charAt(0)==' '){
                        sol=(float)Double.parseDouble(T2.getText().toString());
                        T1.setText(T2.getText().toString());
                    }
                    else{ char ch=T3.getText().toString().charAt(0);
                        Float a=Float.parseFloat(T2.getText().toString());
                        if(T1.getText().toString().length()<=50)
                        T1.setText(T1.getText().toString()+ T3.getText().toString() +T2.getText().toString());
                        else T1.setText(""+sol);
                        switch (ch){
                            case '+': sol=sol+a;break;
                            case '-': sol -=a; break;
                            case '*': sol*=a;break;
                            case '/':sol/=a;break;
                        }}

                    T2.setText("0");
                    T3.setText("/");
            }
        });
        Bequals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                char ch = T3.getText().toString().charAt(0);
                Float a = Float.parseFloat(T2.getText().toString());
                switch (ch) {
                    case '+':
                        sol = sol + a;
                        break;
                    case '-':
                        sol -= a;
                        break;
                    case '*':
                        sol *= a;
                        break;
                    case '/':
                        sol /= a;
                        break;
                    default:
                        sol = Float.parseFloat(T2.getText().toString());
                }
                T1.setText("");
                T2.setText("" + sol);
                T3.setText(" ");
            }
        });
    }
    private void digi(){
        int l =T2.getText().toString().length();
        char ch=T2.getText().toString().charAt(0);
        if (l>1||ch!='0' ){
            if(l<16)
            T2.setText(T2.getText()+s);
        }else T2.setText(s);
    }
}