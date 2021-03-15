package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickOK();
        clickCancel();
    }
    private void clickOK(){
        Button button = findViewById(R.id.buttonOK);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView = findViewById(R.id.Out);
                TextView Email = findViewById(R.id.Email);
                TextView Password = findViewById(R.id.Password);
                textView.setText("Подписка на рассылку успешно оформлена для пользователя " + Email.getText() + " на электронный адрес " + Password.getText());
            }
        });
    }

    private void clickCancel(){
        Button Cancel = findViewById(R.id.buttonCancel);
        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}