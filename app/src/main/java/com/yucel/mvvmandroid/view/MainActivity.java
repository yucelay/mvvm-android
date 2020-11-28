package com.yucel.mvvmandroid.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yucel.mvvmandroid.R;
import com.yucel.mvvmandroid.databinding.ActivityMainBinding;
import com.yucel.mvvmandroid.viewmodel.ViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new ViewModel());
        activityMainBinding.executePendingBindings();
    }

    @BindingAdapter({"messageBind"})
    public static void messageView(View view, String message){
        if (message!=null){
            Toast.makeText(view.getContext(),message,Toast.LENGTH_SHORT).show();
        }
    }
}