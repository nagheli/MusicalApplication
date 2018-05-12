package com.example.ioana.musicalapplication;

public class Albums {
    //the name of the album
    private String mAlbumName;

    //description of the album
    private String mAlbumDescription;

    //image resource ID for the albums
    private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param albumName        is the album name
     * @param albumDescription is the album description
     * //@param albumImage is the album image
     */
    public Albums(String albumName, String albumDescription, int albumImage) {
        mAlbumName = albumName;
        mAlbumDescription = albumDescription;
        mImageResourceId = albumImage;

    }

    /**
     * Get the album name.
     */
    public String getmAlbumName() {
        return mAlbumName;
    }

    /**
     * Get the album description.
     */
    public String getmAlbumDescription() {
        return mAlbumDescription;
    }

    /**
     * Get the album image.
     */
    public int getImageResourceId() { return mImageResourceId; }
}
