package com.example.android3lrsson1;

public class CounterPresenter implements CounterContracts.Presenter {
    CounterModel counterModel;
    CounterContracts.CounterView counterView;


    public CounterPresenter() {
        counterModel = new CounterModel();
    }


    @Override
    public void icrement() {
        counterModel.incremetn();
        counterView.updateCounter(counterModel.getCount());
    }

    @Override
    public void decrement() {
        counterModel.indecrement();
        counterView.updateCounter(counterModel.getCount());
    }

    @Override
    public void attachView(CounterContracts.CounterView counterView) {
        this.counterView = counterView;
    }



    @Override
    public void change() {
        if (counterModel.getCount() == 10) {
            counterView.greenText();

        }
    }
}
