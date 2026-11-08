package com.orangekeyboard;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("Orange Keyboard (Material You)\n\n1. Включи клавиатуру в настройках\n2. Выбери её при вводе\n\nКнопка 'АВТОПЕРЕВОД' для быстрого доступа");
        tv.setTextSize(16);
        tv.setPadding(80, 200, 80, 80);
        setContentView(tv);
    }
}
