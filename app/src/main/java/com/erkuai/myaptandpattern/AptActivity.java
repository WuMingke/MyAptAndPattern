package com.erkuai.myaptandpattern;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.erkuai.lib_reflection.Binding;
import com.erkuai.lib_reflection.BindingView;

public class AptActivity extends AppCompatActivity {

    @BindingView(id = R.id.textView)
    public TextView textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Binding.Companion.bind(this);

        textView.setText("1111111222");

    }
}
