package com.example.android3lrsson1;

public class CounterContracts {

    interface CounterView{
       void updateCounter(int counter);
        void greenText();


    }

    interface Presenter{
        void icrement();
        void decrement();
        void attachView(CounterView counterView);
        void change();
    }
}

