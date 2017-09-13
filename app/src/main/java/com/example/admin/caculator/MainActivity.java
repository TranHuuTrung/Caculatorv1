package com.example.admin.caculatorv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private Button cong, tru, nhan, chia;
    private TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);

        cong = (Button) findViewById(R.id.cong);
        tru = (Button) findViewById(R.id.tru);
        nhan = (Button) findViewById(R.id.nhan);
        chia = (Button) findViewById(R.id.chia);
    }
    public void Tong(View view){
        double a = Double.parseDouble(et1.getText()+"");
        double b = Double.parseDouble(et2.getText()+"");
        TextView result = (TextView) findViewById(R.id.result);
        result.setText((a+b)+"");

    }
    public void Hieu(View view){
        double a = Double.parseDouble(et1.getText()+"");
        double b = Double.parseDouble(et2.getText()+"");
        TextView result = (TextView) findViewById(R.id.result);
        result.setText((a-b)+"");
    }
    public void Tich(View view){
        double a = Double.parseDouble(et1.getText()+"");
        double b = Double.parseDouble(et2.getText()+"");
        TextView result = (TextView) findViewById(R.id.result);
        result.setText((a*b)+"");
    }
    public void Thuong(View view){
        double a = Double.parseDouble(et1.getText()+"");
        double b = Double.parseDouble(et2.getText()+"");
        TextView result = (TextView) findViewById(R.id.result);
        result.setText((a/b)+"");
    }
}
