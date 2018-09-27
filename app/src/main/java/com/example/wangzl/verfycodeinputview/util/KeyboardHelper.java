package com.example.wangzl.verfycodeinputview.util;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author wangzl
 * @date 2018/9/27
 */
public class KeyboardHelper {
    static KeyboardHelper instance;

    private KeyboardHelper() {
        // construct
    }

    public static KeyboardHelper getInstance() {
        if (instance == null) {
            instance = new KeyboardHelper();
        }
        return instance;
    }

    /**
     * 隐藏软键盘
     *
     * @param editText
     */
    public void hideKeyBoard(Context context, EditText editText) {
        InputMethodManager imm =
                (InputMethodManager)
                        context
                                .getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    /**
     * 弹起软键盘
     *
     * @param editText
     */
    public void openKeyBoard(final Context context, final EditText editText) {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                InputMethodManager imm =
                        (InputMethodManager)
                                context
                                        .getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.showSoftInput(editText, 0);
                editText.setSelection(editText.getText().length());
            }
        }, 200);


    }
}
