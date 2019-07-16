package android.example.bollywoodtopten;

public class Songs {

    // The name of composer.
    private String mNameOfSinger;

    // The songTitle.
    private String mSongTitle;

    /**
     * Create a new songTitle object.
     *
     * @param nameOfSinger is the name of composer (in English).
     * @param songTitle is the name of songTitle.
     */
    public Songs (String nameOfSinger, String songTitle) {
        mNameOfSinger = nameOfSinger;
        mSongTitle = songTitle;
    }

    // Get the name of composer.
    public String getnameOfSinger() {
        return mNameOfSinger;
    }

    // Get the name of songTitle.
    public String getsongTitle() {
        return mSongTitle;
    }
}