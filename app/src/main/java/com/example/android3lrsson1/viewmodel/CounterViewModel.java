package com.example.android3lrsson1.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {
   public MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
    int count = 0;


    public void incremetn(){
       mutableLiveData.postValue(++count);
    }

   public void  decrement(){
        mutableLiveData.postValue(--count);
    }


}
