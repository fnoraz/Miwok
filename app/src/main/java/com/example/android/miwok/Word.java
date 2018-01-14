package com.example.android.miwok;

import java.util.ArrayList;

public class Word {
    public String mDefaultTranslation;
    public String mMiwokTranslation;

    public Word (String DefaultTranslation, String MiwokTranslation) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public String getMiwokTranslation() {
        return  mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }
}
