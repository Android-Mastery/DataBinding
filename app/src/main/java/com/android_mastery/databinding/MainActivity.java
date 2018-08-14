/*
 * Copyright (c) 2018.
 * Gilang Ramadhan (gilang@imastudio.co.id)
 */

package com.android_mastery.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android_mastery.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        /*
        TextView textView = findViewById(R.id.textView);
        textView.setText("Android-Mastery");
        */

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserModel model = new UserModel("Android", "Mastery");

        MyClickHandlers handlers = new MyClickHandlers(this);
        binding.setUser(model);
        binding.setHendlers(handlers);
        binding.setHallo("Hallo World");
    }
    
    public class MyClickHandlers{
        Context context;

        public MyClickHandlers(Context context) {
            this.context = context;
        }
        
        public void onClicked(View view){
            Toast.makeText(context, "On Clicked", Toast.LENGTH_SHORT).show();
        }
    }
}
