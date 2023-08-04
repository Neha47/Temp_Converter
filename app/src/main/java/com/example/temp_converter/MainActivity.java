package com.example.temp_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button1 , button2 , button3 ;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editext);
        button1=findViewById(R.id.btn1);
        button2=findViewById(R.id.btn2);
        button3=findViewById(R.id.btn3);
        textView=findViewById(R.id.txtview);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double v = Double.parseDouble(editText.getText().toString());
                double o = ((1.8 * v) + 32);
//                editText.setText(String.format("%.2f",o1));
                textView.setText(String.valueOf(o));
                Toast.makeText(MainActivity.this,String.format("%.2f",o)+" ºF", Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double v = Double.parseDouble(editText.getText().toString());
                double o = ((v-32) * 5)/9;
//                editText.setText(String.format("%.2f",o2));
                textView.setText(String.valueOf(o));
                Toast.makeText(MainActivity.this,String.format("%.2f",o)+" ºC", Toast.LENGTH_SHORT).show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearAll();
            }
        });
    }
    private void clearAll() {
        // Clear the text in both EditText fields
        editText.setText("");
        textView.setText("");
    }
}