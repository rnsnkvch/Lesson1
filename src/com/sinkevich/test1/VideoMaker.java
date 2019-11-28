package com.sinkevich.test1;

public class VideoMaker extends Person implements Video {
    private String video;

    @Override
    public String getVideo() {
        return video;
    }

    @Override
    public void doVideo() {
        video=mp4;
        int number=0;

    }
}
