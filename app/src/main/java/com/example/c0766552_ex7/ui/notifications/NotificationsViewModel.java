package com.example.c0766552_ex7.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NotificationsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Lambton College is a publicly funded college in Sarnia, Ontario, Canada with approximately 3,500 full-time students, 6,500 part-time students and 3,500 international students worldwide. Lambton College also has campuses in Mississauga and Toronto.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}