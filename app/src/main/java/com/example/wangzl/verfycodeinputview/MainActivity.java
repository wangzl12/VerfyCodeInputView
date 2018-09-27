package com.example.wangzl.verfycodeinputview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wangzl.verfycodeinputview.util.KeyboardHelper;
import com.example.wangzl.verfycodeinputview.view.VerfyCodeInputView;

public class MainActivity extends AppCompatActivity {
    private VerfyCodeInputView inputView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        inputView = findViewById(R.id.verfy_code);
        KeyboardHelper.getInstance().openKeyBoard(MainActivity.this,inputView);
    }
}
