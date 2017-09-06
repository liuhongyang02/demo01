package com.example.liuhongyang.demo01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    EditText sname,spassword;
    TextView txv;
    Button button1,button2;


    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sname = (EditText)findViewById(R.id.name);
        spassword = (EditText)findViewById(R.id.password);
        button1 =(Button)findViewById(R.id.button1);
        button2 =(Button)findViewById(R.id.button2);



        button1.setOnClickListener(new Button.OnClickListener() {

            public void onClick(View v) {

                String str1 = sname.getText().toString();
                String str2 = spassword.getText().toString();

                boolean flag = str1.equals("abc")&&str2.equals("123");
                if(flag)
                {
                    Toast.makeText(MainActivity.this, "密码正确", Toast.LENGTH_LONG).show();
                }
                if(!flag)
                {
                    Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_LONG).show();
                }

            }


    });

        //setContentView(button1);

        //首先提交该事件
        //验证是否正确
        //若不正确，则输出错误；否则正确

        //提示对话框

    }


}
