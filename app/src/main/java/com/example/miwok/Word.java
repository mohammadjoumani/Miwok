package com.example.miwok;

        import android.media.MediaPlayer;

public class Word {
    // dfault translation
    private String mDefaultTranslation;
    // miwok Translation
    private String mMiwokTranslation;

    private int mImage = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mmusic;

    public Word(String DefaultTranslation, String MiwokTranslation, int image, int music) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImage = image;
        mmusic = music;
    }

    public Word(String DefaultTranslation, String MiwokTranslation, int music) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mmusic = music;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public int getMmusic() {
        return mmusic;
    }

    public int getImage() {
        return mImage;
    }

    public boolean hasImage() {
        return mImage != NO_IMAGE_PROVIDED;
    }

}
