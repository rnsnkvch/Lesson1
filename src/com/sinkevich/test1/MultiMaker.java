package com.sinkevich.test1;

abstract class MultiMaker implements Photo, Video {

    @Override
    public String getVideo() {
        return null;
    }

    @Override
    public void doVideo() {

    }
}
