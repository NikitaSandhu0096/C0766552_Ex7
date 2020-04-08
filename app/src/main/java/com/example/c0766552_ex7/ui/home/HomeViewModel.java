package com.example.c0766552_ex7.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("The Google Pixel 3 XL is a smartphone that was tested with the Android 9 operating system. This model weighs 6.5 ounces, has a 6.3 inch touch screen display, 12.2-megapixel main camera, and 8-megapixel selfie camera. It comes with 4GB of RAM. It was tested with 64GB of storage.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}