package com.sinkevich.test1;

import java.util.function.Consumer;

public class MyConsumer implements Consumer <Photo> {
    @Override
    public void accept(Photo photo) {
        photo.doPhoto();
        System.out.println(photo.getPhoto());
    }
}
