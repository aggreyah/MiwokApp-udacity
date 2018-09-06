package com.example.android.miwok;

public class Word{
    /**Default translation for the word.*/
    private String mDefaultTranslation;

    /**Miwok translation for the word.*/
    private String mMiwokTranslation;

    /**Create a new Word object.
     * @param defaultTranslation is the word in a language the user is already familiar with.
     * @param  miwokTranslation is the miwok translation of the word.
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**Get default translation of the word.*/
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**Get miwok translation of the word.*/
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }
}
