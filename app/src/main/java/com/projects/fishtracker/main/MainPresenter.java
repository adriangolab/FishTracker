package com.projects.fishtracker.main;

public class MainPresenter implements  MainContract.Presenter{
    private MainContract.MvpView mView;

    MainPresenter(MainContract.MvpView view){
        mView = view;
    }
}
