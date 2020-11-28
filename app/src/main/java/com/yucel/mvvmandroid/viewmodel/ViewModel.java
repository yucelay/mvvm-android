package com.yucel.mvvmandroid.viewmodel;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;


import com.yucel.mvvmandroid.BR;
import com.yucel.mvvmandroid.model.User;

public class ViewModel extends BaseObservable {

    private User user;

    @Bindable
    private String message = null;


    public ViewModel() {
        user=new User("","");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
    }

    @Bindable
    public String getUserName(){
        return user.getName();
    }

    public void setUserName(String userName){
        user.setName(userName);
        notifyPropertyChanged(BR.userName);
    }


    @Bindable
    public String getUserSurname(){
        return user.getSurname();
    }

    public void setUserSurname(String userSurname){
        user.setSurname(userSurname);
        notifyPropertyChanged(BR.userSurname);
    }

    public void messageAdd(){
        setMessage(getUserName()+" "+getUserSurname());

    }


}
