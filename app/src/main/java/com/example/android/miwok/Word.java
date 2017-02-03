package com.example.android.miwok;

/**
 * Created by Ali on 12/20/2016.
 * {@link Word} represent a vocabulary word that the user wants to learn.
 * It contains a default translation and Miwok translataion for the word.
 */

public class Word {
    /**
     * Default translation for the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation fro the word
     */
    private String mMiwokTranslation;

    /**
     * Image resorce ID for the word
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceId;

    /**
     * It is constructor
     * Create a new Word bject
     *
     * @param defaultTranslation is the word in english
     * @param miwokTranslation   is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * It is constructor
     * Create a new Word bject
     *
     * @param defaultTranslation is the word in english
     * @param miwokTranslation   is the word in the Miwok language
     * @param imageResourceId    is drawable resource ID for the image assets
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the default translation of the word
     * It is a method
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     * It is a method
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word
     *
     * @return
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

}
