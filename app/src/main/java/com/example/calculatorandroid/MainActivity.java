package com.example.calculatorandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12;
    TextView ext, extt;
    String operation = "";
    ArrayList<String> inputData = new ArrayList<String>(0);
    MethodProtector methodProtector = new MethodProtector();

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("keyCalculate", ext.getText().toString());
        outState.putString("keyCalculateFirstPart", extt.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        ext.setText(savedInstanceState.getString("keyCalculate"));
        extt.setText(savedInstanceState.getString("keyCalculateFirstPart"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);
        ext = findViewById(R.id.eText);
        extt = findViewById(R.id.eTexto);


        //String total2 = String.valueOf(total);
        //double value = Double.parseDouble(text);

        //Digits;
        btn1.setOnClickListener(view ->
                ext.setText(String.valueOf(methodProtector.Count((String) btn1.getText(), Double.parseDouble((String) ext.getText())))));

        btn2.setOnClickListener(view ->
                ext.setText(String.valueOf(methodProtector.Count((String) btn2.getText(), Double.parseDouble((String) ext.getText())))));

        btn3.setOnClickListener(view ->
                ext.setText(String.valueOf(methodProtector.Count((String) btn3.getText(), Double.parseDouble((String) ext.getText())))));

        btn4.setOnClickListener(view ->
                ext.setText(String.valueOf(methodProtector.Count((String) btn4.getText(), Double.parseDouble((String) ext.getText())))));

        btn5.setOnClickListener(view ->
                ext.setText(String.valueOf(methodProtector.Count((String) btn5.getText(), Double.parseDouble((String) ext.getText())))));

        btn6.setOnClickListener(view ->
                ext.setText(String.valueOf(methodProtector.Count((String) btn6.getText(), Double.parseDouble((String) ext.getText())))));

        btn7.setOnClickListener(view ->
                ext.setText(String.valueOf(methodProtector.Count((String) btn7.getText(), Double.parseDouble((String) ext.getText())))));

        btn8.setOnClickListener(view ->
                ext.setText(String.valueOf(methodProtector.Count((String) btn8.getText(), Double.parseDouble((String) ext.getText())))));

        btn9.setOnClickListener(view ->
                ext.setText(String.valueOf(methodProtector.Count((String) btn9.getText(), Double.parseDouble((String) ext.getText())))));

        //Digits;

        btn10.setOnClickListener(view ->
        {
            inputData = methodProtector.Switch(Double.parseDouble((String)ext.getText()), Double.parseDouble((String)extt.getText()), "-", operation);
            ext.setText(inputData.get(0));
            extt.setText(inputData.get(1));
            operation = inputData.get(2);
        });

        btn11.setOnClickListener(view ->
                ext.setText(String.valueOf(methodProtector.Count((String) btn11.getText(), Double.parseDouble((String) ext.getText())))));

        btn12.setOnClickListener(view ->
        {
            inputData = methodProtector.Switch(Double.parseDouble((String)ext.getText()), Double.parseDouble((String)extt.getText()), "+", operation);
            ext.setText(inputData.get(0));
            extt.setText(inputData.get(1));
            operation = inputData.get(2);
        });
    }

    public void asd(View view) {
        inputData = methodProtector.Switch(Double.parseDouble((String)ext.getText()), Double.parseDouble((String)extt.getText()), "*", operation);
        ext.setText(inputData.get(0));
        extt.setText(inputData.get(1));
        operation = inputData.get(2);
    }

    public void asdf(View view) {
        inputData = methodProtector.Switch(Double.parseDouble((String)ext.getText()), Double.parseDouble((String)extt.getText()), "/", operation);
        ext.setText(inputData.get(0));
        extt.setText(inputData.get(1));
        operation = inputData.get(2);
    }

    public void asdfg(View view) {
        inputData = methodProtector.Switch(Double.parseDouble((String)ext.getText()), Double.parseDouble((String)extt.getText()), "=", operation);
        ext.setText(inputData.get(0));
        extt.setText(inputData.get(1));
        operation = inputData.get(2);
    }
}