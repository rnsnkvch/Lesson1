package com.sinkevich.test1;

public class VideoMaker extends Person implements Video {
    private String video;
    private int vNumber=0;

    public VideoMaker(String userName) {
        super(userName);
    }

    public VideoMaker(int age, String userName, boolean m) {
        super(age, userName, m);
    }

    public VideoMaker(int age) {
        super(age);
    }

    @Override
    public String getVideo() {
        return video;
    }

    @Override
    public void doVideo() {
        video="video"+vNumber;
        vNumber=vNumber+1;

    }
}
