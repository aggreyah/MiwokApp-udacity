package com.example.android.miwok;

public class Word{
    /**Default translation for the word.*/
    private String mDefaultTranslation;

    /**class variable*/
    private static final int HAS_AN_IMAGE = -1;

    /**Miwok translation for the word.*/
    private String mMiwokTranslation;

    /**Default translation for the word.*/
    private int mImageResourceId = HAS_AN_IMAGE;

    /**Audio resource file for the word.*/
    private int mAudioResourceId;

    /**Create a new Word object.
     * @param defaultTranslation is the word in a language the user is already familiar with.
     * @param  miwokTranslation is the miwok translation of the word.
     * @param audioResourceId is the audio file with a pronunciation of the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**Create a new Word object.
     * @param defaultTranslation is the word in a language the user is already familiar with.
     * @param  miwokTranslation is the miwok translation of the word.
     * @param  imageResourceId is the image resource id of the image associated with word.
     * @param audioResourceId is the audio file with a pronunciation of the word
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**Get default translation of the word.*/
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    /**Get miwok translation of the word.*/
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    /**Get miwok translation of the word.*/
    public int getmImageResourceId(){return mImageResourceId;}

    /**check if Word has an image**/
    public boolean hasImage(){
        return mImageResourceId != HAS_AN_IMAGE;
    }

    /**Get audio file resource id of the word.*/
    public int getmAudioResourceId(){return mAudioResourceId;}
}
