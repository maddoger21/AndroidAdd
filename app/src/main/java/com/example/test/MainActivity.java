package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextTextPersonName;
    private EditText editTextTextPersonName2    ;
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
                // Объявим числовые переменные
                double a, b, c;

// Считаем с editText и editText2 текстовые значения
                String s1 = editTextTextPersonName.getText().toString();
                String s2 = editTextTextPersonName2.getText().toString();

// Преобразуем текстовые переменные в числовые значения
                a = Double.parseDouble(s1);
                b = Double.parseDouble(s2);

// Проведем с числовыми переменными нужные  действия
                c = a + b;

// Преобразуем ответ в число
                String s = Double.toString(c);

// Выведем текст в textView
                textView.setText(s);
        }
    });
    }
}